package com.es.programacion.tema2;

import java.util.Scanner;

public class EjercicioFibonacci {

    /**
     * Implemente un programa que calcule los N primeros términos de la serie de Fibonacci.
     * El número de términos se leerá por teclado.
     * La sucesión de Fibonacci comienza con los números 0 y 1, y a partir de estos,
     * cada término es la suma de los dos anteriores:
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377…
     * @param args
     */
    public static void main(String[] args) {


        String serieFibonacci = "0, 1";
        int fibo = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el índice de fibonacci: ");
        fibo = scan.nextInt();


        int n0 = 0;
        int n1 = 1;
        int n2;

        for(int i=0; i<fibo-2; i++){
            n2 = n0 + n1;
            serieFibonacci = serieFibonacci + ", "+n2;

            n0 = n1;
            n1 = n2;
        }
        System.out.println(serieFibonacci);
    }
}
