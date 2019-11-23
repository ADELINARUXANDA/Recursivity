package com.sdacademy.recursivity.tema2;

import java.util.ArrayList;

import static java.nio.file.Files.size;

//Creați-vă propria implementare a ArrayList (Clasa nou numita CustomArrayList) cu capacitatea de a reține:
//1. Integer numere întregi,
//
//2. Implementați următoarele metode:
//1. add(element int) Adaugare unui nou element
//2. get(index index) // Returneaza elementul de la un index dat.
//3. isEmpty() // Verifica daca lista este goala
//4. size() // Numarul de lemente adaugate
//5. remove(index index) // sterge elementul de la un index
public class CustomArray {
    public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<Integer>();
    lista.add(1);
    lista.add(2);
    lista.add(3);
    lista.add(4);
    lista.add(8);
    System.out.println(lista);
    System.out.println(lista.get(2));
   lista.remove(4);
   System.out.println(lista);
        int nr = (int) size(lista);
        System.out.println(nr);
        isEmpty(lista);
}}
