package com.Programacion.Tema1.Actividad00;

import java.util.Scanner;

/*
Implemente un programa que pida 3 números y los muestre ordenados de menor a mayor
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        // Declaramos las variables como real (por si algún número lleva decimales)
        double num1, num2, num3;

        // Creamos el objeto scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        // Pedimos por pantalla al usuario que introduzca el primer número
        System.out.print("Introduzca el primer número: ");

        // Almacenamos la variable num1
        num1 = scann.nextDouble();

        // Pedimos al usuario que introduzca el segundo número
        System.out.print("Introduzca el segundo número: ");

        // Almacenamos la variable num2
        num2 = scann.nextDouble();

        // Pedimos al usuario que introduzca el tercer número
        System.out.print("Introduzca el tercer número: ");

        // Almacenamos la variable num3
        num3 = scann.nextDouble();

        //Condición para comparar que número es menor y cual es mayor
        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Números ordenados de menor a mayor: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("Números ordenados de menor a mayor: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Números ordenados de menor a mayor: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("Números ordenados de menor a mayor: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Números ordenados de menor a mayor: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("Números ordenados de menor a mayor: " + num3 + ", " + num2 + ", " + num1);
            }
        }

        scann.close();
    }
}
