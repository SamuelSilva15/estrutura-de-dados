package com.estruturadados.vetor;

import java.util.Arrays;

public class VetorObjetos {

    private Object[] elementos;
    private int tamanho;

    public VetorObjetos(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Object elemento) {
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public String toString() {
        return Arrays.toString(elementos);
    }

    public Object busca(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(Object elemento) {
        for(int i = 0; i < elementos.length; i++) {
            if(elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean adiciona(int posicao, Object elemento) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        //mover todos os elementos
        for(int i = this.tamanho-1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
        return false;
    }

    public void aumentaCapacidade() {
        if(this.tamanho == elementos.length) {
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remove(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i = posicao; i < this.tamanho-1; i++) {
            this.elementos[i] = elementos[i+1];
        }
        this.tamanho--;
    }
}
