package com.Programacion.Tema1.Actividad00;

import java.util.Scanner;

/*
Implemente un programa que pida 2 números y diga sin son iguales o no. En caso de que no lo sean
debe indicar cuál es mayor
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        // Declaramos las variables
        double num1, num2;

        //Creamos el objeto escanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        // Mostramos por pantalla el mensaje para que introduzca el primer número
        System.out.print("Introduzca el primer número: ");

        // Almacenamos la variable num1
        num1 = scann.nextDouble();

        // Preguntamos por el segundo número
        System.out.print("Introduzca el segundo número: ");

        // Almacenamos la variable num2
        num2 = scann.nextDouble();

        // Condición para comparar si son los números iguales o no
        if (num1 == num2){
            System.out.println("Los números introducidos son iguales");
        } else if (num1 > num2) {
            System.out.println("El número "+num1+" es mayor que "+num2);
        }else {
            System.out.println("El número "+num2+" es mayor que "+num1);
        }

    }
}
