package com.estruturadados.vetor.exerc;

import com.estruturadados.vetor.Lista;

public class Exer05 {
    /*
        Melhore a classe Lista e implemente o método limpar, onde todos os elementos da lista são removidos.
        Esse método é semelhante ao método clear da classe ArrayList.
     */

    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("A");

    }
}
