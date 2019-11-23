package com.sdacademy.recursivity.tema2;//Detalii de implementatre
//Creati o Clasa numita CustomStack implementati metodele push peek pop conform specificatilor unei stive, in aceasta clasa veti avea un membru (stack[]) peste care veti implementa metodele push peek pop.
//Creati o Clasa numita StackReader . clasa StackReader are un membru de tip CustomStack. StackReader are metoda read(): void care va citi intr-o bucla while toate caracterele introduse de utilizator(folosind clasa Scanner),
//daca caracterul este "+" urmatoarea linie citita va fi adaugata in stack folosind customStack.push(line).
//dupa apelarea metodei customStack.push(line) vom apela metoda customStack.printCurentStack(); care va afisa in consola toate elementele stivei(ATENTIE pentru parcurgerea elementelor in afisare folositi peek nu pop)
//
//daca caracterul este "-" va fi afisata linia din stiva folosind customStack.pop().
//dupa apelarea metodei customStack.push(line) vom apela metoda customStack.printCurentStack(); care va afisa in consola toate elementele stivei

import com.sun.org.apache.bcel.internal.generic.PUSH;

import java.util.Scanner;
import java.util.Stack;

// counter  = 2;
// [1] [2] []
class CustomStack{
    private int[] stack =  new int[10];
    private int counter = 0;

    public void push(int i){
        stack[counter] = i;
        counter++;
    }
    public int pop(){
        int lastIndex = counter - 1;
        int popedNumber = stack[lastIndex];
        stack[lastIndex] = null;
        counter--;
        return  popedNumber;
    }
    public int peek(){
        int lastIndex = counter - 1;
        int peekNumber = stack[lastIndex];
        return  peekNumber;
    }

    public void printCurentStack(){
        for( i = 0 ; i < counter ; i++){
            System.out.println(stack[i]);
        }
    }

}
public class Stiva {


    public static void main(String[] args) {


         StackReader stackReader = new StackReader();
         stackReader.citesteStiva();

        CustomStack CustomStack = new CustomStack();
        Scanner caracter = new Scanner(System.in);
        String semn;
        while(semn !=  '.') {
            semn = caracter.next();
            if (semn == "+") {
                int numar = caracter.nextInt();
                CustomStack.push(numar);
                ;

            } else {
                if (semn == "-") {
                    CustomStack.pop();
                }
            }
            CustomStack.printCurentStack();
        }
    }
}






