package com.Programacion.Tema1.Actividad00;

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
public class Ejercicio9 {
    public static void main(String[] args) {
        //Creamos la variable temperatura y la declaramos como real
        double temperatura;

        //Creamos el objeto Scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        //Preguntamos al usuario que temperatura hace en ºC
        System.out.print("Introduzca la temperatura actual: ");

        // Almacenamos la variable temperatura
        temperatura = scann.nextDouble();

        // Condición para determinar el tipo de clima
        if (temperatura <=10){
            System.out.println("Clima frío.");
        } else if (temperatura >10 && temperatura <=20) {
            System.out.println("Clima templado.");
        } else if (temperatura >= 20 && temperatura <30) {
            System.out.println("Temperatura calurosa.");
        } else if (temperatura >= 30) {
            System.out.println("Temperatura tropical.");
        }
    }
}
