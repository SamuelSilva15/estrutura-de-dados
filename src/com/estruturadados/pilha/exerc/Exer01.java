package com.estruturadados.pilha.exerc;

import com.estruturadados.pilha.Pilha;

public class Exer01 {

    /*
        Escreva um programa que leia 10 números. Para cada número lido, verifique e codifique
        de acordo com as regras a seguir:
        1. Se um número for par, empilhe na pilha;
        2. Se o número for ímpar, desempilhe um número de pilha. Caso a pilha esteja vazia, mostre uma
        mensagem
        3. Se ao final do programa a pilha não estiver vazia, desempilhe todos os elementos, imprimindo-os
        na tela
     */

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                pilha.empilha(i);
            } else {
                pilha.desempilha();
            }
        }

        if (pilha.estaVazia() == true) {
            System.out.println("Pilha está vazia");
        } else {
            System.out.println(pilha);
        }
    }
}
