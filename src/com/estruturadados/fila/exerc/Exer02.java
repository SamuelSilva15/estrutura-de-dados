package com.estruturadados.fila.exerc;

import com.estruturadados.fila.Fila;

public class Exer02 {

    /*
        Escreva um programa que simule a distribuição de senhas de atendimento a um grupo de pessoas. Cada
        pessoa pode receber uma senha prioritária ou uma senha normal. O programa deve obedecer os seguintes
        critérios:
        1. Existe apenas 1 atendente;
        2. 1 pessoa com senha normal deve ser atendida a cada 3 pessoas com senha prioritária;
        3. Não havendo prioridades, as pessoas com senha normal podem ser atendidas.
     */

    public static void main(String[] args) {
        Fila<String> regular = new Fila<>();
        Fila<String> prioridade = new Fila<>();

        final int MAX_PRIORIDADE = 3;

        regular.enfilheira("Pessoa 1");
        regular.enfilheira("Pessoa 2");
        regular.enfilheira("Pessoa 3");
        prioridade.enfilheira("Pessoa 1P");
        prioridade.enfilheira("Pessoa 2P");
        prioridade.enfilheira("Pessoa 3P");
        prioridade.enfilheira("Pessoa 4P");
        prioridade.enfilheira("Pessoa 5P");
        regular.enfilheira("Pessoa 4");
        regular.enfilheira("Pessoa 5");
        regular.enfilheira("Pessoa 6");
        regular.enfilheira("Pessoa 7");
        regular.enfilheira("Pessoa 8");

        while (!regular.estaVazia() || !prioridade.estaVazia()) {

            int cont = 0;

            while(!prioridade.estaVazia() && cont < MAX_PRIORIDADE) {
                atendePessoa(prioridade);
                cont++;
            }

            if (!regular.estaVazia()) {
                atendePessoa(regular);
            }

            if (prioridade.estaVazia()) {
                while (!regular.estaVazia()) {
                    atendePessoa(regular);
                }
            }
        }
    }

    public static void atendePessoa(Fila<String> fila) {
        String pessoaAtendida = fila.desenfileira();
        System.out.println(pessoaAtendida + " foi atendida.");
    }
}

