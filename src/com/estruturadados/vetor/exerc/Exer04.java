package com.estruturadados.vetor.exerc;

import com.estruturadados.vetor.Lista;

public class Exer04 {

    /*
        Melhore a classe Lista e implemente o método obtem(int posicao), onde sera
        possível obter o elemento dada uma posição do vetor. Esse método é semelhante ao método
        get(int posicao) da classe ArrayList
     */

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("A");

        System.out.println(lista.obtem(2));
    }
}
