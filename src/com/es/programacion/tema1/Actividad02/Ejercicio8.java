package com.Programacion.Tema1.Actividad02;
import java.util.Scanner;

public class Ejercicio8 {// Definicion de la clase principal
    /*

       Uso de condiciones y operadores
        */
    public static void main(String[] args) {//Definición del método principaL
        //Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        //Solicitamos al usuario que introduzca la hora
        System.out.println("Introduzca la hora en el siguiente formato (0-23): ");
        //Creamos la variable hora para almacenar la información del usuario
        int hora = scann.nextInt();

        //Solicitamos al usuario que introduzca los minutos
        System.out.println("Introduzca los minutos (0-59): ");
        //Creamos la variable minutos para almacenar la información del usuario
        int minutos = scann.nextInt();

        //Solicitamos al usuario que introduzca los segundos
        System.out.println("Introduzca los segundos (0-59): ");
        //Creamos la variable segundos para almacenar la informacion del usuario
        int segundos = scann.nextInt();

        // Validamos que los valores ingresados estén dentro de los rangos válidos
        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            // Calculamos la hora, minutos y segundos después de transcurrir un segundo
            segundos++; // Incrementamos los segundos en uno

            // Si los segundos llegan a 60, ajustamos los minutos y los segundos
            if (segundos == 60) {
                segundos = 0;
                minutos++;

                // Si los minutos llegan a 60, ajustamos la hora y los minutos
                if (minutos == 60) {
                    minutos = 0;
                    hora++;

                    // Si la hora llega a 24, volvemos a medianoche (hora 0)
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }

            // Mostramos la hora, minutos y segundos resultantes
            System.out.println("Después de un segundo, la hora será: " + hora + " horas, " + minutos + " minutos, " + segundos + " segundos.");
        } else {
            System.out.println("Los valores ingresados no son válidos para representar una hora.");
        }

        scann.close(); // Cerramos el objeto Scanner al finalizar
    }
}
