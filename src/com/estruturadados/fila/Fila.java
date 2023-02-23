package com.estruturadados.fila;

import com.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public void enfilheira(T elemento) {
        super.adiciona(elemento);
    }

    public void aumentaCapacidade() {
        super.aumentaCapacidade();
    }

    public boolean estaVazia() {
        return super.estaVazia();
    }

    public T espiar() {
        return super.elementos[0];
    }

    public T desenfileira() {
        return this.elementos[--tamanho];
    }

    public int tamanho() {
        return super.tamanho;
    }

    public String toString() {
        return super.toString();
    }

}
