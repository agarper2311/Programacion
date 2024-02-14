package com.es.programacion.tema2;

import java.util.Scanner;

public class TeoriaBuclesIII {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        // Declaramos una cadena de caracteres que se llame "mensajePresentacion"
        String mensajePresentacion = "";


        // Pedirle el nombre al usuario
        String nombre = "";
        System.out.println("Introduce tu nombre: ");
        nombre = scan.next();

        mensajePresentacion = "Hola mi nombre es "+nombre+".";
        System.out.println(mensajePresentacion);

        // Continuamos con la edad
        int edad = 0;
        System.out.println("Introduce tu edad: ");
        edad = scan.nextInt();

        mensajePresentacion = mensajePresentacion+" Tengo "+edad+" anios, ";
        System.out.println(mensajePresentacion);

        // Continuamos con la localizacion
        String localizacion = "";
        System.out.println("¿De dónde eres?");
        localizacion = scan.next();

        mensajePresentacion = mensajePresentacion+"y soy de "+localizacion+".";
        System.out.println(mensajePresentacion);

        // Declarar 2 variables de String
        String cadena1 = "Hola";
        String cadena2 = "Adios";

        if(cadena1.equals(cadena2)){ // Si son iguales, mostramos un mensaje que diga "Son iguales"
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }

        if(cadena1.equals("hola")){ // Si son iguales, mostramos un mensaje que diga "Son iguales"
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }

        if(cadena1.equals("Hola")){ // Si son iguales, mostramos un mensaje que diga "Son iguales"
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }






    }




    private static int contrasenia() {
        //// CONTRASENIA CIFRADA

        return 1151;
    }
}
