package com.Programacion.Tema2.Actividad1;
/*
Implemente un programa que calcule los N primeros términos de la serie de Fibonacci. El número de términos se leerá
por teclado. La sucessión de Fibonacci comienza con los números 0 y 1, y a partir de estos, cada término es la suma de
los dos anteriores:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...
 */

import java.util.Scanner;

/**

public class Ejercicio4 {
    public static void main(String[] args) {
        //Declaramos las variables que vamos a utilizar
        int numTerminos, primero, segundo, siguiente;

        // Creamos el objeto scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        // Pedir al usuario el número de términos de la serie de Fibonacci
        System.out.print("Ingrese el número de términos de la serie de Fibonacci: ");

        // Almacenamos la variable numTerminos ingresada por el usuario
         numTerminos = scann.nextInt();

         //Inicializamos primero en 0 (es el primer término de la serie que es 0) y segundo en 1 (es el segundo término
        // de la serie que es 1)
         primero = 0;
         segundo = 1;

         // Mostramos por pantalla los resultados
         System.out.println("Los primeros " + numTerminos + " términos de la serie de Fibonacci son:");
         System.out.print(primero + ", " + segundo);

        // Calcular y mostrar los siguientes términos de la serie de Fibonacci
        for (int i = 3; i <= numTerminos; i++){ // i es nuestro contador

            siguiente = primero + segundo;
            System.out.print(", " + siguiente);
            primero = segundo;
            segundo = siguiente;
        }

        scann.close();
    }
}
**/