package com.es.programacion.tema1;

import java.util.Scanner;

public class NotaClase {

    /**
     * Programa que muestra un mensaje según la nota del alumno
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Variable scan para poder leer por teclado

        System.out.print("Introduzca su nota: ");// Imprimo por pantalla un mensaje para ayudar al usuario
        double nota = scan.nextDouble();        // Leemos por teclado un número y lo almacenamos en la "caja" nota

        if(nota >= 0 && nota < 4){              // Si la nota está entre 0 y 4 -> 0 incluído, 4 no incluído
            System.out.println("Keep trying");
        } else if(nota >= 4 && nota < 5){       // Si la nota está entre 4 y 5 -> 4 incluído, 5 no incluído
            System.out.println("Casi");
        } else if (nota >= 5 && nota < 7) {     // Si la nota está entre 5 y 7 -> 5 incluído, 7 no incluído
            System.out.println("Bien");
        } else if (nota >= 7 && nota < 9) {     // Si la nota está entre 7 y 9 -> 7 incluído, 9 no incluído
            System.out.println("Notable");
        } else if (nota >= 9 && nota < 10) {    // Si la nota está entre 9 y 10 -> 9 incluído, 10 no incluído
            System.out.println("Sobresaliente");
        } else if (nota == 10) {
            System.out.println("Matricula");    // Si la nota es 10
        } else {
            System.out.println("Dato introducido erróneo"); // Si se introduce cualquier otro dato numérico
        }


    }

}
