package com.es.programacion.tema3;

public class PruebasConStrings {

    public static void main(String[] args) {

        /**
         * Que compare la longitud de dos Strings y nos diga el mayor
         */
        String cadena1 = "wsdfghjk";
        String cadena2 = "deuybcojenche";


        // cadena1.length() me devuelve un número entero 8
        // cadena2.length() me devuelve un número entero 13
        if(cadena1.length() > cadena2.length()){
            System.out.println(cadena1 +" es mayor");
        } else {
            System.out.println(cadena2 +" es mayor");
        }



    }
}
