package com.estruturadados.fila.teste;

import com.estruturadados.fila.Fila;

public class Aula21 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfilheira(1);
        fila.enfilheira(2);
        System.out.println(fila.espiar());
    }
}
