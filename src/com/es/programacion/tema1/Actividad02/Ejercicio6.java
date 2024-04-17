package com.Programacion.Tema1.Actividad02;
import java.util.Scanner;

public class Ejercicio6 {//Definición de la clase
    /*


       Uso de condiciones y operadores
        */
    public static void main(String[] args) {//Metodo principal
        //Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);
        //Mostramos un mensaje por pantalla preguntando la edad del usuario
        System.out.print("Por favor, introduzca su edad: ");
        //Creamos la variable edad para almacenar la edad del usuario
        int edad = scann.nextInt();

        //Estructuramos la condición para para comparar si el usuario es mayor de edad y mostrar el mensaje correspondiente
        if (edad >= 0 && edad <=17){
            System.out.println("Eres menor de edad");
        } else{
            System.out.println("Eres mayor de edad");
        }
    }
}
