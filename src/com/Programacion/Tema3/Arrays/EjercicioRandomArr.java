package com.Programacion.Tema3.Arrays;

import java.util.Scanner;

public class EjercicioRandomArr {
    public static void main(String[] args) {
        /**
         * Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 0.99
         * utilizando Math.random(), y luego le pida al usuaio un valor real R. Por último, cuantos
         * valores del array son igual o superiores a R
         */
        double sumatoria = 0.0;
        double[] arrDoub = new double[100];

        // Rellenar el array
        for (int i=0; i <= arrDoub.length-1; i++){

            arrDoub[i] = Math.random();
        }

        // Ahora mostramos todos los elementos del array
        for (int i=0; i<= arrDoub.length-1; i++){
            System.out.println(arrDoub[i]+", ");
        }
        // Leer por teclado un num real
        double numReal= 0.0;
        Scanner scann = new Scanner(System.in);
        System.out.println("Dime un número real: ");
        numReal = scann.nextDouble();

        // Declaramos una variable que va a servir para contar cuántos números del array
        // son mayores a numReal
        int cantidad = 0;

        for (int i=0; i<= arrDoub.length-1; i++){
            if (arrDoub[i] >= numReal){
                cantidad++;
            }
        }
        System.out.println("El nº de elementos mayores de "+numReal+" es "+cantidad);
    }
}
