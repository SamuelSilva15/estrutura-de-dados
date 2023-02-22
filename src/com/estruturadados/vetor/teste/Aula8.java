package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;
import com.estruturadados.vetor.VetorObjetos;

public class Aula8 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);
    }
}
