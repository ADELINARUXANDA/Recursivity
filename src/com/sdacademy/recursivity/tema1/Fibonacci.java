package com.sdacademy.recursivity.tema1;
//Metoda de implementare care va returna al nouălea element al secvenței Fibonacci folosind recursivitate
public class Fibonacci {

    public static int adunare(int a, int b) {
        return (a + b);
    }

    public static int suma(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n >= 2) {
            //int fib = 0;
            // fib = fib + (adunare(suma(n - 1), suma(n - 2)));
            //return (adunare(suma(n - 1), suma(n - 2)));

        }

         int fib = (adunare(suma(n - 1), suma(n - 2)));
        System.out.println(fib);
        return fib
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println(suma(9));
    }

}