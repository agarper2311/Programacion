package com.es.programacion.tema2;

import java.util.Scanner;

public class EjercicioHastaNegativo {

    /**
     * 2.	Realiza un programa que pida números por teclado al usuario de forma
     * indefinida hasta que el usuario introduzca un número negativo.
     * @param args
     */
    public static void main(String[] args) {


        int n = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Introduce un número (negativo para salir): ");
            n = scan.nextInt();
        } while (n>=0);

        System.out.println("Adios");
    }
}
