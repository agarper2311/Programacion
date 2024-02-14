package com.es.programacion.tema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TeoriaExcepciones {


    public static void main(String[] args) {

        /**
         * Construye un programa que pida al usuario una cadena de texto.
         * Acto seguido solicita la posición de un caracter de la cadena de texto
         * e imprime ese caracter por pantalla. Cntrola las posibles excepciones
         * que se puedan producir al acceder a posiciones inválidas de la cadena.
         */
        Scanner scan = new Scanner(System.in);

        String cadena = "";
        int posc = 0;

        try {

            System.out.println("Introduzca la cadena: ");
            cadena = scan.nextLine();

            System.out.println("¿Que posicion quieres mostrar?");
            posc = scan.nextInt();

            if(cadena.charAt(posc) == ' '){
                System.out.println("El caracter en la posicion "+ posc + " es: \\s");
            } else {
                System.out.println("El caracter en la posicion "+ posc + " es: "+ cadena.charAt(posc));
            }



        } catch (IndexOutOfBoundsException e) {

            System.out.println("Posición incorrecta");

        } finally {
            System.out.println("Saliendo del programa");
        }



    }

}
