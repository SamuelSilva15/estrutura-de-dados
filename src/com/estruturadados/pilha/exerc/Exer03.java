package com.estruturadados.pilha.exerc;

import com.estruturadados.pilha.Livro;
import com.estruturadados.pilha.Pilha;

public class Exer03 {

    /*
        Utilize a classe Pilha (criada durante as aulas) e desenvolva os seguintes items:
        1. Crie uma pilha com capacidade para 20 livros
        2. Insira 6 livros na pilha; Cada livro contém nome, isbn, ano de lançamento e autor
        3. Crie um exemplo para utilizar cada método da classe Pilha
     */

    public static void main(String[] args) {
        Pilha<Livro> livros = new Pilha<Livro>(20);
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();
        Livro livro4 = new Livro();
        Livro livro5 = new Livro();
        Livro livro6 = new Livro();

        //empilha
        livros.empilha(livro1);
        livros.empilha(livro2);
        livros.empilha(livro3);
        livros.empilha(livro4);
        livros.empilha(livro5);
        livros.empilha(livro6);

        //desempilha o último elemento
        System.out.println(livros.desempilha());

        //mostra qual o último elemento da pilha
        System.out.println(livros.topo());

    }
}
