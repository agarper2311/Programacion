package com.es.programacion.tema3.ejerciciosrepaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDeMs {

    public static void main(String[] args) {

        try {
            // n -> tamanio del array
            int n = 0;
            // m -> lo que va a contener el array
            int m = 0;

            // Leo por teclado ambos datos
            Scanner scan = new Scanner(System.in);
            System.out.print("Introduzca el tamanio del array: ");
            n = scan.nextInt();

            System.out.println("Introduzca el valor a almacenar: ");
            m = scan.nextInt();

            // Creo un array de tamanio n
            int[] arrDeMs = new int[n];

            // Relleno el array con el valor m
            for (int i=0; i<=arrDeMs.length-1; i++) {
                arrDeMs[i] = m;
            }

            // Finalmente lo muestro por pantalla
            System.out.print("arrDeMs = [");
            for (int i=0; i<=arrDeMs.length-1; i++) {
                System.out.print(arrDeMs[i]+",");
            }
            System.out.print("]");

        } catch (InputMismatchException e){
            System.out.println("Error en el tipo de dato, saliendo...");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error al acceder a una posicion, saliendo...");
        }

    }
}
