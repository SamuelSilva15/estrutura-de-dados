package com.estruturadados.pilha.teste;

import com.estruturadados.pilha.Pilha;

public class Aula16 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        System.out.println(pilha.topo());

        pilha.empilha(11);
        pilha.empilha(2);
        pilha.empilha(15);
        System.out.println(pilha.topo());
    }
}
