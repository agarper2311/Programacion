package com.es.programacion.tema2;

import java.util.Scanner;

public class EjercicioSumatoria {

    public static void main(String[] args) {


        // Realizar sumatoria de N
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Introduzca un número entero positivo: ");
        n = scan.nextInt();

        // Tenemos que usar el bucle correcto -> FOR ¿Por qué? -> porque sabemos
        // el nº de vueltas que vamos a dar.
        int sumatoria = 0;
        for (int i = 0; i<=n; i++) {
            sumatoria = sumatoria + i;
        }

        System.out.println("El resultado de la sumatoria es: "+sumatoria);



    }
}
