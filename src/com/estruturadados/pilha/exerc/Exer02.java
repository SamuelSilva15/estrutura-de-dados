package com.estruturadados.pilha.exerc;

import com.estruturadados.pilha.Pilha;

public class Exer02 {

    /*
        Escreva um programa que leia 10 números. Para cada número lido, verifique e codifique de acordo
        com as regras a seguir:
        1. Se for um número par, empilhe na pilha par;
        2. Se for um número ímpar, empilhe na pilha ímpar;
        3. Se o número for zero(0), desempilhe um elemento de cada pilha. Caso alguma pilha esteja vazia,
        mostre uma mensagem de erro.
     */

    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        for(int i = 1; i <= 10; i++) {
            if(i == 0) {
                par.desempilha();
                impar.desempilha();
            } else if(i % 2 == 0) {
                par.empilha(i);
            } else {
                impar.empilha(i);
            }
        }

        if(par.estaVazia() || impar.estaVazia()) {
            System.out.println("Listas estão vazia");
        } else {
            System.out.println(par);
            System.out.println(impar);
        }
    }
}
