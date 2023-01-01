package com.company;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ArrayList names = new ArrayList(); //10 vende pe 10 objekte
//        names.add("Naim"); //0
//        names.add("Filan"); //1
//        names.add("Ardit");//2
//        names.add(100);//3
//        names.add(200);//4
//        names.add(true);//5
//        names.add('C');//6
//
//        Object emri = "naim";
//
//        //Prej OBJECT me kthy ne element te vetin duhet me cast - kastu-konvertu
//        Object x = names.get(0);
//        Object y = names.get(3);
//        Object z = names.get(4);
//        //miscasting
//        int numri1 = (int) names.get(0);
//
//        String naimi = (String) names.get(0);
//        String naimi1 = (String) emri;
//        int numri200 = (int) names.get(4); // prej objektit me kthy ne tip te vetin duhet me cast (kastu) (konvertu)
//        int numri100 = (int) names.get(3);
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(numri100 + numri200);


        ArrayList<String> listaEmrave = new ArrayList<String>();
        listaEmrave.add("Naim");
        listaEmrave.add("Ardit");

        String text= "[";
        for (String e: listaEmrave) {
            text+=e+", ";
        }
        text = text.substring(0,text.length()-2)+"]";

        System.out.println(text);
        System.out.println(listaEmrave);
        boolean exists = listaEmrave.contains("Naimi");
        int indexArdit = listaEmrave.indexOf("Arditi");
        System.out.println(exists);
        System.out.println(indexArdit);
        //listaEmrave.add(true);
        ArrayList<Integer> listaNumrave = new ArrayList<Integer>();
        listaNumrave.add(10);

    }
}


