package com.es.programacion.tema2;

import java.util.Scanner;

public class ActividadClase {

    public static void main(String[] args) {

        /**
         * DOS PROGRAMAS. Debéis hacer uso del bucle correcto.
         * 1. Hacer un programa que pida números y los muestre por pantalla
         * hasta que el usuario introduzca un número negativo.
         * WHILE -> ¿Por qué? -> Porque no sabemos cuántos números va a introducir el user
         *
         * EJEMPLO
         * -> introduce 5
         * -> muestro "Numero introducido: 5"
         * -> introduce -1 (o cualquier otro num negativo)
         * -> muestra "Adiosito"
         *
         * 2. Hacer un programa que pida un número (positivo) y muestre los
         * valores pares desde 0 hasta ese número.
         * Si el usuario no introduce un número correcto, el programa debe seguir pidiéndole
         * que introduzca un número correcto.
         *
         * EJEMPLO
         * -> Programa pide un numero
         * -> Usuario introduce -> -5
         * -> Programa muestra -> Error, pruebe de nuevo
         * -> Usuario introduce -> -10
         * -> Programa muestra -> Error, pruebe de nuevo
         * -> Usuario introduce -> 4
         * -> Programa muestra -> 0, 2, 4
         * -> Fin
         */


        // ***************EJER 1***********
        // Lo necesitamos para poder pedir algo por teclado
        Scanner scan = new Scanner(System.in);

        // Declarar la variable para almacenar lo que el user introduzca
        int numero;
        // Mensaje por pantalla
        System.out.println("Introduce un número: ");
        // Leo lo que el user introduzca
        numero = scan.nextInt();

        while (numero >= 0) {
            System.out.println("Correcto, numero introducido: "+numero);

            System.out.println("Introduce otro número: ");
            numero = scan.nextInt();

            // Si el user introduce un numero negativo -> La condición no se cumple
        }

        System.out.println("Adiosito");


        //****EJER 2****
        // DO-WHILE
        // FOR

        // Declarar las variables y pedir al user un número
        // Scanner scan = new Scanner(System.in);
        int numero2;

        do {
            System.out.println("Introduce un número positivo (0 incluído): ");
            numero2 = scan.nextInt();
        } while (numero2 < 0); // Se queda dando vueltas mientras numero2 es negativo

        // Como sabemos que vamos a mostrar desde 0 hasta numero2 -> Un FOR
        for(int i=0;i<=numero2;i++){
            if(i%2 == 0){
                System.out.println("Numero par: "+i);
            }
        }



    }
}
