package com.estruturadados.vetor.teste;

import com.estruturadados.vetor.Contato;
import com.estruturadados.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(10);

        Contato c1 = new Contato("Samuel", "2522523", "dfsdfga@email.com");
        Contato c2 = new Contato("Rafael", "2522523", "dfsdfga@email.com");
        Contato c3 = new Contato("Leandro", "2522523", "dfsdfga@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
        System.out.println("Tamanho: " + vetor.tamanho());
    }
}
