package com.es.programacion.Recuperacion.tema3.arrayDeMeInverso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDeM {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Introduce el valor de N (tamaño del array, no mayor que 100): ");
            int N = scan.nextInt();
            if (N > 100) {
                throw new IllegalArgumentException("El valor de N no puede ser mayor que 100.");
            }

            System.out.println("Introduce el valor de M: ");
            int M = scan.nextInt();

            // Crear el primer array con valores desde M hasta 100
            int[] arrayM = new int[N];
            for (int i = 0; i < N; i++) {
                arrayM[i] = Math.min(M + i, 100);
            }

            // Crear el segundo array con los valores del primero en orden inverso
            int[] arrayMInverso = new int[N];
            for (int i = 0; i < N; i++) {
                arrayMInverso[i] = arrayM[N - 1 - i];
            }

            // Mostrar ambos arrays
            System.out.println("Array original: ");
            for (int valor : arrayM) {
                System.out.print(valor + " ");
            }
            System.out.println("\nArray inverso: ");
            for (int valor : arrayMInverso) {
                System.out.print(valor + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Se ha producido una excepción: InputMismatchException. Debes introducir un valor numérico.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

