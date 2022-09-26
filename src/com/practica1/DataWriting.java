package com.practica1;

import java.util.ArrayList;
import java.util.List;

public class DataWriting {
    public static void main(String[] args){
        //enteros
        byte number1 = 1; //1byte
        short number2 = 2; //2 byte
        int number3 = 3;  //4 byte
        long number4 = 4l;  //8 byte

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);

        //punto flotante
        float decimal = 4.9f;
        double decimal2 = 9.99d;

        System.out.println(decimal);
        System.out.println(decimal2);

        //Caracter
        char caracter = 'p';

        System.out.println(caracter);

        //booleanos
        boolean myTrue = true;
        boolean myFalse = false;

        System.out.println(myTrue);
        System.out.println(myFalse);

        // Cadenas de texto
        String nombre = "Daniel";

        System.out.println(nombre);

        String[] arrayStrings = new String[]{"hol", "gg", "rtrt"};
        List<String> listaStrings = new ArrayList<String>();
        listaStrings.add("Hola");
        listaStrings.add("Qué tal?");
        listaStrings.add("Adios");

        System.out.println(arrayStrings[0] + " - " + arrayStrings[1] + " - " + arrayStrings[2] + " - ");

        for(String palabra : listaStrings) {
            System.out.println(palabra);
        }



    }
}
