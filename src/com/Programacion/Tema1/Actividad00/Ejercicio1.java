package com.Programacion.Tema1.Actividad00;

import java.util.Scanner;

/*
Escribe un programa que lee dos numeros y nos dice cuál es el mayor o si son iguales
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        // Declaramos las variables
        int num1, num2;

        //creamos el objeto Scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        //Pedimos por pantalla al usuario que introduzca el primer número
        System.out.print("Introduzca el primer número: ");

        //Almacenamos el primer número en la variable num1
        num1 = scann.nextInt();

        //Pedimos por pantalla al usuario que introduzca el segundo número
        System.out.println("Introduzca el segundo número: ");

        // Almacenamos el segundo número en la variable num2
        num2 = scann.nextInt();

        // Condición if y else para mostrar por pantalla que número es mayor
        if (num1 > num2){
            System.out.println("El número mayor es "+num1);
        }else{
            System.out.println("El número mayor es "+num2);
        }
    }
}
