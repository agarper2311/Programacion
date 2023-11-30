package com.Programacion.ExamenTema1;

import java.util.Scanner;

/*
Implemente un programa que pida dos números y diga si son
iguales o no. En caso de que no lo sean, debe indicar cuál es
mayor.
 */
public class EjercicioMayor {// Inicio del método main
    public static void main(String[] args) {
        /*
            Nombre: Ángel
            Apellidos: García Pérez
            Nombre Actividad: EjercicioMayor
         */
        // Declaramos como reales las variables que vamos a usar
        double num1, num2;

        //Creamos el objeto scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        //Preguntamos al usuario por el primer número
        System.out.print("Introduzca el primer número");

        // Almacenamos la variable num1
        num1 = scann.nextDouble();

        // Preguntamos al usuario por el segundo número
        num2 = scann.nextDouble();

        // Condición if para comparar los número y saber cual es mayor
        if (num1 > num2){
            System.out.println("El número "+num1+" es mayor que "+num2);
        }else {
            System.out.println("El número "+num2+" es mayor que "+num1);
        }
        scann.close();//Cerramos el objeto scann


    }// fin del método main
}
