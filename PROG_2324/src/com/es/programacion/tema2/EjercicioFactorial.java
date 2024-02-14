package com.es.programacion.tema2;

import java.util.Scanner;

public class EjercicioFactorial {

    /**
     * Escriba un programa que calcule el factorial de un número (n)
     * leído por teclado (!n = 1*2*3*4*…*(n-1)*n)
     * @param args
     */
    public static void main(String[] args) {

        int n = 0;
        int factorial = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número para realizar el factorial: ");
        n = scan.nextInt();

        for (int i = 1; i<=n; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial = "+ factorial);

    }
}
