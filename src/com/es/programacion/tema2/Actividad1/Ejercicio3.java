package com.Programacion.Tema2.Actividad1;

import java.util.Scanner;

/*
Escriba un programa que calcule el factorial de un número (n) leído por teclado
(!n = 1*2*3*4*...*(n-1)*n)
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        // Declaramos las variables que vamos a usar
        int num, factorial;

        // Creamos el objeto scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        // Pedimos al usuario que introduzca un número
        System.out.print("Introduzca un número para calcular su factorial: ");

        // Almacenamos la variable introducida por el usuario
        num = scann.nextInt();

        // Inicializamos la variable factorial en 1
        factorial = 1;

        // Condición para calcular el factorial de un número
        if (num < 0){
            System.out.println("El factorial de un número negativo no puede ser definido definido.");
        }else {
            //Calculamos el factorial del número
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            // Mostramos el resultado
            System.out.println("El factorial de "+num+" es: "+factorial);
            }
        //Cerramos el objeto scanner
        scann.close();
        }
    }