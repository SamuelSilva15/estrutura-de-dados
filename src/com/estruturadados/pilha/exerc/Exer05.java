package com.estruturadados.pilha.exerc;

import com.estruturadados.pilha.Pilha;

public class Exer05 {

    /*
        Escreve um programa que testa se uma sequência de caracteres fornecidas pelo usuário é um palindromo,
        ou seja, é uma palavra primeira metade é simétrica à segunda metade.
     */

    public static void main(String[] args) {

        imprimeResultado("ADA");

        imprimeResultado("ABCD");

        imprimeResultado("ABCCBA");

        imprimeResultado("Maria");
    }

    public static void imprimeResultado(String palavra){
        System.out.println(palavra + " é palindromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra){

        Pilha<Character> pilha = new Pilha<Character>();

        for (int i=0; i<palavra.length(); i++){
            pilha.empilha(palavra.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.estaVazia()){
            palavraInversa += pilha.desempilha();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)){
            return true;
        }

        return false;
    }
}
