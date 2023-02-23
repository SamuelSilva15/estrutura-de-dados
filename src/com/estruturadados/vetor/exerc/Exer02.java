package com.estruturadados.vetor.exerc;

import com.estruturadados.vetor.Lista;

public class Exer02 {
    /*
        Melhore a classe Lista e implemente o método ultimoIndice, semelhante ao método lastIndexOf da classe
        ArrayList.
    */

    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("A");

        System.out.println(lista.lastIndexOf("A"));
    }
}
