package com.Programacion.Tema2.Actividad1;
/*
Realiza un programa que pida números por teclado al usuario de forma indefinida y que realice la sumatoria de los
números pares introducidos y de los números impares introducidos. Cuando se introduce un número negativo el programa
debe mostrar la sumatoria de los pares y los impares.
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Definimos las variables
        int num1, sumaPar, sumaImpar;
        int sumatoria;



        // Mostramos un mensaje por pantalla preguntando por los números
        System.out.println("Introduzca un número para iniciar el programa.");
        System.out.println("En caso de querer detenerlo, introduzca un numero negativo");



        //Igualamos la variable sumatoria a 0

        sumaPar = 0;
        sumaImpar = 0;

        // Creamos el objeto scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);


        //Condición do while para mostrar el bucle infinito hasta que el usuario introduzca un número negativo
        do {
            System.out.print("Número: ");
            num1 = scann.nextInt();

            // Verificar si el número es negativo para salir del bucle
            if (num1 >= 0) {
                if (num1 % 2 == 0) {
                    // Sumar el número a la sumatoria de pares si es par
                    sumaPar += num1;
                } else {
                    // Sumar el número a la sumatoria de impares si es impar
                    sumaImpar += num1;
                }
            }
        } while (num1 >= 0);

        // Mostrar la sumatoria de los números pares e impares ingresados
        System.out.println("La sumatoria de los números pares ingresados es: " + sumaPar);
        System.out.println("La sumatoria de los números impares ingresados es: " + sumaImpar);

        scann.close();
    }
}
