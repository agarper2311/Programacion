package com.es.programacion.tema3;

import java.util.Scanner;

public class EjercicioRandomArr {

    public static void main(String[] args) {

        /**
         * Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
         * utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
         * cuántos valores del array son igual o superiores a R.
         */

        double[] arrDoub = new double[100];

        // Rellenar el array.
        for(int i=0; i<=arrDoub.length-1; i++){
            arrDoub[i] = Math.random();
        }


        // Ahora quiero mostrar todos los elementos del array
        for (int i=0; i<=arrDoub.length-1; i++){
            System.out.println(arrDoub[i]+", ");
        }

        // Leer por teclado un num real
        double numReal = 0.0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime un numero real: ");
        numReal = scan.nextDouble();

        // Declaramos una variable que va a servir para CONTAR cuántos números
        // del array son mayores a numReal
        int cantidad = 0;
        for (int i=0; i<=arrDoub.length-1; i++){

            if(arrDoub[i]>=numReal){
                cantidad++;
            }
        }
        System.out.println("El nº de elementos mayores que "+numReal+" es "+cantidad);




    }
}
