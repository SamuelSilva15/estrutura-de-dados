package com.estruturadados.vetor.exerc;

import com.estruturadados.vetor.Lista;

public class Exer03 {
    /*
        Melhore a classe Lista e implemente o método remove(T elemento), onde será possível remover
        um elemento da lista passando o mesmo como parâmetro
    */

    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("A");

        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);
    }
}
