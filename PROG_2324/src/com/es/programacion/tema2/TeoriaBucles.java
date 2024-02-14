package com.es.programacion.tema2;

import java.util.Scanner;

public class TeoriaBucles {

    public static void main(String[] args) {

        // Estructura del bucle while
        /*
        while (condición) {

            *EL CUERPO se ejecuta*
            *mientras la condición sea true*

        } // Fin del while
         */

        /*
        Mostrar por pantalla los 20 primeros números (de 0 a 20)
         */
        int num = 0; // Declaro una variable de tipo entero con valor 0
        while (num <= 20) { // Mientras num sea menor o igual que 20
            System.out.println(num); // Muestro por pantalla num
            num = num + 1; // Incremento en 1 el valor de num
        } // Fin del while

        /*
        Mostrar por pantalla todos los números del 0 al -20
         */
        // Declarar otro numero que valga 0
        int num2 = 0;
        while (num2 >= -20) {
            System.out.println(num2);
            num2 = num2 - 1;
        }

        /*
        Mostrar por pantalla todos los números PARES positivos del 0 al 100
         */
        int num3 = 0;
        while (num3 <= 100) {

            if (num3 % 2 == 0) {
                System.out.println(num3);
            }
            num3 = num3 + 2; // num3 += 2;
        }

        /*
        Hacer un programa que pida un número por teclado y que muestre
        "Ahahá, no has dicho la palabra correcta"
        mientras el número sea distinto a 0
         */
        int num4 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Oye, introduce la contraseña: ");
        //num4 = scan.nextInt();

        while (num4 != 0) {
            System.out.println("Ahahá no has dicho la palabra mágica");

            System.out.println("Oye, intentalo de nuevo: ");
            num4 = scan.nextInt(); // Parte crítica.
        }


        /*
        Hacer un menú para seleccionar una opción.

        1. Programación
        2. Entornos
        3. Bases de datos
        4. Lenguajes de marcas
         */

        int opcion;
        do {
            System.out.println("Hola, en qué asignatura quiere matricularte?");
            System.out.println("1. Programacion");
            System.out.println("2. Entornos");
            System.out.println("3. Bases de datos");
            System.out.println("4. Lenguajes de marcas");
            opcion = scan.nextInt();

        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion!=4);
        /*
        Hacer
        1. Que muestre la asignatura en la que se ha matriculado
        2. Añadir una opción "0. Salir" -> y que muestre el mensaje correspondiente, claro.
         */


    }
}
