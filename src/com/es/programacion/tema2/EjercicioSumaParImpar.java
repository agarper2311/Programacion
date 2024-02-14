package com.es.programacion.tema2;

import java.util.Scanner;

public class EjercicioSumaParImpar {

    public static void main(String[] args) {

        int n = 0;
        int sumatoriaPar = 0;
        int sumatoriaImpar = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Introduce un número (negativo para salir): ");
            n = scan.nextInt();

            // Controlamos que el número sea positivo para sumarlo
            if(n>=0){
                // Si es par se suma a los pares
                if(n % 2 == 0){
                    sumatoriaPar = sumatoriaPar + n;
                } else { // Si no, lo sumamos a los impares
                    sumatoriaImpar = sumatoriaImpar + n;
                }
            }

        } while (n>=0);

        System.out.println("Sumatoria pares: "+sumatoriaPar);
        System.out.println("Sumatoria impares: "+sumatoriaImpar);

    }
}
