package com.es.programacion.tema2;

import java.util.Scanner;

public class EjercicioSumaPersonalizado {

    /**
     * Realiza un programa que pida números por teclado al usuario de forma indefinida hasta que el
     * usuario introduzca un número negativo y que realice la suma de todos los números introducidos.
     * @param args
     */
    public static void main(String[] args) {
        int n = 0;
        int sumatoria = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Introduce un número (negativo para salir): ");
            n = scan.nextInt();

            if(n>=0){
                sumatoria = sumatoria + n;
            }
        } while (n>=0);

        System.out.println("Sumatoria: "+sumatoria);
    }
}
