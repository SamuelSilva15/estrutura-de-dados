package com.estruturadados.fila.teste;

import com.estruturadados.fila.Fila;

public class Aula22 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfilheira(1);
        fila.enfilheira(2);
        fila.enfilheira(3);
        System.out.println(fila);
        fila.desenfileira();
        System.out.println(fila);
    }
}
