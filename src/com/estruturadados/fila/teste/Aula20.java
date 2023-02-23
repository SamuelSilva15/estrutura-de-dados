package com.estruturadados.fila.teste;

import com.estruturadados.fila.Fila;

public class Aula20 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfilheira(3);
        fila.enfilheira(4);
        fila.enfilheira(5);

        System.out.println(fila);
    }
}
