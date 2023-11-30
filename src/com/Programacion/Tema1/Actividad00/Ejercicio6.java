package com.Programacion.Tema1.Actividad00;

import java.util.Scanner;

/*
Implemente un programa que pida una hora (hora, minutos y
segundos) e indique si es correcta.
Ejemplo:
a. 76:15:89 -> incorrecta
b. 23:15:15 -> correcta
c. 00:00:00 -> correcta
d. 24:00:00 -> incorrecta
e. etc
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        // Creamos las variables hora, minuto y segundos
        int horas, minutos, segundos;
        // Creamos el objeto scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        // Pedimos por pantalla la hora
        System.out.print("Ingrese la hora (formato 24 horas): ");
        horas = scann.nextInt();

        //Pedimos por pantalla los minutos
        System.out.print("Ingrese los minutos: ");
        minutos = scann.nextInt();

        //Pedimos por pantalla los segundos
        System.out.print("Ingrese los segundos: ");
        segundos = scann.nextInt();

        // Condición para verificar si la hora ingresada es correcta
        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
                    System.out.println("La hora ingresada es correcta.");
                } else {
                    System.out.println("La hora ingresada es incorrecta.");
                }

        scann.close();
    }
}

