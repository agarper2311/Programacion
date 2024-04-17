package com.Programacion.Tema2.Actividad1;

import java.util.Scanner;

/*
Escriba un programa que devuelva si un número introducido por teclado es primo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        // Declaramos las variables que vamos a utilizar
        int num, i, divisible=0;

        // Creamos el objeto scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        // Pedimos al usuario que introduzca un número
        System.out.print("Introduzca un número: ");

        // Almacenamos la variable del valor que halla introducido el usuario
        num = scann.nextInt();

        // Verificamos si el número es primo
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisible++;
            }
        }

        // Condición para comprobar si el número introducido es primo o no
        if (divisible == 2) {
            System.out.println("El número introducido es primo");
        } else {
            System.out.println("El número introducido no es primo");
        }


    }
}
/*
Lista de los 20 primeros números primos:
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71.
 */