package com.sdacademy.recursivity;

import java.sql.Array;
import java.util.Scanner;

//Creați o metodă care va însuma toate elementele dintr-o listă folosind recursivitatea.
public class sumaLista {

    public static int adunare (int x, int y){
            return x+y;

    }

    public static int suma2(int a){
        int suma = 0;
        return  adunare (suma,suma2(a))
        ;
    }

    public static void main(String[] args) {
    Scanner lista = new Scanner(System.in);
         int[] nr = lista.nextInt();
         for (int i = 0; i < nr.length; i++){
            System.out.println(suma2(nr[i]));
        }
    }

}
