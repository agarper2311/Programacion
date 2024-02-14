package com.es.programacion.tema2;

public class TeoriaBuclesII {

    public static void main(String[] args) {
        /*
        Escribir un programa que muestre los 2000 primeros números enteros positivos.
        y los 2000 primeros números negativos
        EL 0 NO ES POSITIVO
         */
        //for (variable de control; condicion; incrementador )
        for (int i=1; i<=2000; i++) {
            System.out.println("Numero: "+i); // Recordamos que "literal"+numero -> Concatena
            // i sólo existe dentro del bucle for
        }

        for(int i=-1; i>=-2000; i--) {
            System.out.println("Numero n: "+i);
            // i sólo existe en este bucle for
        }

        /*
        Hacer un programa que muestre los números del 2000 al 1
         */
        // Antes empezábamos en 1... ahora debemos empezar desde 2000
        // La condición antes era -> mientras i <= 2000
        // Ahora la condición es -> mientras i ? 1
        // Antes incrementábamos i ... ahora debemos decrementarlo
        for(int i = 2000; i >= 1; i--) {
            System.out.println("Numero: "+i);
        }

    }



}
