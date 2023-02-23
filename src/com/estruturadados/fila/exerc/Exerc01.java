package com.estruturadados.fila.exerc;

import com.estruturadados.fila.Fila;

import javax.print.Doc;

public class Exerc01 {

    /*
       Usando a estrutura de dados Fila, crie uma fila de documentos que precisam ser impressos.
       Cada documento é composto de um nome e quantidade folhas a serem impressas. O programa deve:
       1. Enfileira os documentos;
       2. E seguindo a ordem, o programa deve "imprimir" cada documento, desenfileirando da fila. Se
       desejar poder usar Threads para esperar a impressão de acordo com o número de folhas a serem impressos.
     */

    public static void main(String[] args) {
        Fila<Documento> documentos = new Fila<>();
        documentos.enfilheira(new Documento("A", 10));
        documentos.enfilheira(new Documento("B", 15));
        documentos.enfilheira(new Documento("C", 20));

        while (!documentos.estaVazia()) {
            Documento doc = documentos.desenfileira();
            System.out.println("Imprimindo documento " + doc.getNome());
            try {
                Thread.sleep(200 * doc.getNumeroDePaginas());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Todos os documentos foram impressos.");
    }
}
