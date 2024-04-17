package com.Programacion.Tema1.Actividad02;
import java.util.Scanner;

public class Ejercicio4 {//Definición de la clase
    /*
        Nombre: Angel
        Apellidos: Garcia Perez

        Uso de condiciones y operadores
         */
    public static void main(String[] args) {//Metodo principal
        //Creamos el obejeto Scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        //Pedimos al usuario que introduzca la cantidad de Kms que desea convertir a millas
        System.out.print("Introduzca la cantidad de KMs que desea convertir a millas: ");

        //Creamos la variable para almacenarla
        double KMs_usuario = scann.nextDouble();

        //Hacemos la conversión de Kilometros a Millas. 1km es 0.621371 millas
        double millas = KMs_usuario * 0.621371;

        //Mostramos por pantalla el mensaje con la conversion de Km a Millas
        System.out.println(KMs_usuario + " kilometros son "+millas+" en millas");

    }
}
