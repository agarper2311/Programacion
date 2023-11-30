package com.Programacion.Tema3.Arrays;

import java.util.Scanner;

public class EjerCadenaLetra {
    public static void main(String[] args) {
        /**
         * Vamos hacer un programa, que dado un String...
         * cuente cuántas vocales de cada tipo tiene.
         *
         * Ejemplo:
         * String cadena = "Hola mundo";
         *
         * ... código para calcular las vocales que tiene
         *
         * tiene 1 a
         * tiene 0 e
         * tiene 0 i
         * tiene 2 0
         * tiene 1 u
         */

        // Cadena de texto que vamos analizar
        String cadena = "abecedariO";

        // Contadores
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        // Recorremos la palabra de principio a fin
        for (int i = 0; i <= cadena.length() - 1; i++) {
            if (cadena.charAt(i) == 'a' | cadena.charAt(i)=='A') {
                contadorA++;
            } else if (cadena.charAt(i) == 'e' | cadena.charAt(i)=='E') {
                contadorE++;
            } else if (cadena.charAt(i) == 'i' | cadena.charAt(i)=='I') {
                contadorI++;
            } else if ((cadena.charAt(i) == 'o') | cadena.charAt(i)=='O') {
                contadorO++;
            } else if (cadena.charAt(i) == 'u' | cadena.charAt(i)=='U') {
                contadorU++;
            }
        }
        // Mostramos los resultados
        System.out.println("Tiene " + contadorA + " a");
        System.out.println("Tiene " + contadorE + " e");
        System.out.println("Tiene " + contadorI + " i");
        System.out.println("Tiene " + contadorO + " o");
        System.out.println("Tiene " + contadorU + " u");
    }

}
