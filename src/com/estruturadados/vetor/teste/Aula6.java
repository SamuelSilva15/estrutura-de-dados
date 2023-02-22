package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Vetor;
import com.estruturadados.vetor.VetorObjetos;

public class Aula6 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.busca("elemento 2"));
    }
}
