package com.sdacademy.recursivity.tema2;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

//Creați o metodă care va însuma toate elementele dintr-o listă folosind recursivitatea.
public class sumaLista {




    public static int suma(ArrayList<Integer> arList, int index) {

        if(index > arList.size() ) {
            return 0;
        }
        return arList.get(index) + suma(arList , index++);
    }
    //  2 + (3 + (4 + (7 + )) )

    private static int size(ArrayList<Integer> arlist) {
         return   size(arlist);
         //return sum;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arlist = new ArrayList<Integer>();
        arlist.add(2);
        arlist.add(3);
        arlist.add(4);
        arlist.add(7);
        arlist.add(9);
        arlist.add(10);
        arlist.add(11);
        System.out.println(arlist);


        int rezultat = suma(arlist, 0 )

       System.out.println(rezultat);

    }


}}







