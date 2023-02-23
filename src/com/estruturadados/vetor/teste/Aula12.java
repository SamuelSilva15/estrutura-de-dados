package com.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");

        System.out.println(arrayList);

        System.out.println(arrayList.contains("A"));

        System.out.println(arrayList.indexOf("A "));
    }
}
