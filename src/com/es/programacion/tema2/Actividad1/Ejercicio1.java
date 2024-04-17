package com.Programacion.Tema2.Actividad1;
/*
Realiza un programa que pida números por teclado al usuario de forma indefinida hasta que el usuario introduzca
un número negativo y que realice la sumatoria de todos los números introducidos.
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Definimos las variables que vamos a usar
        double numUsuario; // Lo declaramos como real por si el usuario quiere introducir decimales
        double sumatoria;

        // Inicializamos sumatoria en 0 para que el cálculo sea más exacto
        sumatoria = 0;

        // Creamos el objeto Scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        /* Indicamos al usuario que introduzca un número para continuar con el programa y que con un número negativo
        cierra el programa*/
        System.out.println("Introduzca un número para continuar con el programa");
        System.out.println("De lo contrario introduzca un número negativo.");


        // Condición do while para crear el bucle infinito hasta que el usuario introduzca un número negativo y hacemos
        // la sumatoria
        do {
            System.out.print("Número: ");
            // Almacenamos la variable numUsuario.
            numUsuario = scann.nextDouble();

            // Verificamos si el número negativo para salir del bucle
            if (numUsuario >=0){
                sumatoria += (int)numUsuario; // Sumar el número de la sumatoria si no es negativo
            }
        }while (numUsuario >=0);
        // Mostramos la sumatoria de los números ingresados
        System.out.println("La sumatoria de los números ingresados es: "+sumatoria);

        //Cerramos el objeto scanner
        scann.close();
        }
}