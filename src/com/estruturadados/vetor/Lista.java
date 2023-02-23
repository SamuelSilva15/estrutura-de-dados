package com.estruturadados.vetor;

import java.util.Arrays;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(T elemento) {
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = (T) elemento;
            this.tamanho++;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    public String toString() {
        return Arrays.toString(elementos);
    }

    public T busca(int posicao) {
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

        this.elementos[posicao] = (T) elemento;
        this.tamanho++;

        return false;
    }

    public void aumentaCapacidade() {
        if(this.tamanho == elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = (T[]) elementosNovos;
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

    //exer 01
    public boolean contem (T elemento) {
        return  busca(elemento) >= 0;
    }

    //exer 02
    public int lastIndexOf(T elemento) {
        int lastIndex = -1;
        for(int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)) {
                lastIndex = i;
            }
        }

        return lastIndex;
    }

    //exer 03
    public void remove(T elemento) {
        int pos = this.busca(elemento);
        if(pos > -1) {
            this.remove(pos);
        }
    }

    //exer 04
    public T obtem(int posicao) {
        return this.busca(posicao);
    }

    //exer 05
    public void limpar() {
        for(int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }
}
