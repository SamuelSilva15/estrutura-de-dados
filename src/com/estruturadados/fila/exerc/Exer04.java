package com.estruturadados.fila.exerc;

import com.estruturadados.fila.Fila;

import java.util.Random;

public class Exer04 {
    /*
        Escreva um programa usando Filas que simule a brincadeira da "Batata Quente". A brincadeira consiste
        de um grupo de crianças que fica em círculos, sentados ou em pé. Uma criança fica fora da roda, de costas
        ou com os olhos vendados, dizendo a frase: "Batata quente, quente... queimou!" Enquanto isso, os demais
        vão passando a bola de mão em mão até ouvirem "queimou". Quem estiver com a bola nesse momento sai da roda.
        Ganha o último que sobrar.
     */

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        for (int i=0; i<10; i++) {
            fila.enfilheira(i);
        }

        Random aleatorio = new Random();
        int num = 0;
        while (num == 0) {
            num = aleatorio.nextInt(10);
        }

        System.out.println("Número = " + num);

        while (fila.tamanho() > 1) {
            for (int i=0; i<num; i++) {
                fila.enfilheira(fila.desenfileira());
            }
            System.out.println("Eliminado = " + fila.desenfileira());
        }

        System.out.println("Ganhador: " + fila.desenfileira());
    }
}
