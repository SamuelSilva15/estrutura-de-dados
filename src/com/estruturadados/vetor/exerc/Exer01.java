package com.estruturadados.vetor.exerc;

import com.estruturadados.vetor.Lista;

public class Exer01 {

    /*
        Melhore a classe Lista e implemente o método contém semelhando ao método constains da classe ArrayList
    */

    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("E"));
    }
}
