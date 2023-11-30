package com.Programacion.ExamenTema1;

import java.util.Scanner;

/*
Implemente un programa que lea la temperatura en grados
centígrados del día e imprima el tipo de clima de acuerdo con la
siguiente tabla:
Temperatura Clima
≤10 Frío
10 - 20 Templado
20 - 30 Caluroso
> 30 Tropical
 */
public class EjercicioTemperatura {
    /*
            Nombre: Ángel
            Apellidos: García Pérez
            Nombre Actividad: EjercicioTemperatura
         */
    public static void main(String[] args) {// Inicio del método main

        //Creamos la variable temperatura y la declaramos como real
        double temperatura;

        //Creamos el objeto Scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        //Preguntamos al usuario que temperatura hace en ºC
        System.out.print("Introduzca la temperatura actual: ");

        // Almacenamos la variable temperatura
        temperatura = scann.nextDouble();

        // Condición if para determinar el tipo de clima
        if (temperatura <=10){
            System.out.println("Clima frío.");
        } else if (temperatura >10 && temperatura <=20) {
            System.out.println("Clima templado.");
        } else if (temperatura >= 20 && temperatura <30) {
            System.out.println("Temperatura calurosa.");
        } else if (temperatura >= 30) {
            System.out.println("Temperatura tropical.");
        }

        scann.close();//Cerramos el objeto scann

    }// Fin del método main
}