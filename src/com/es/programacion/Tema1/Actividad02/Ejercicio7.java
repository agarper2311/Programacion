package com.Programacion.Tema1.Actividad02;
import java.util.Scanner;

public class Ejercicio7 {//Definición de la clase principal
    /*


       Uso de condiciones y operadores
        */
    public static void main(String[] args) {//Metodo principal
        //Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);
        //Solicitamos al usuario que ingrese el primer número
        System.out.print("Introduzca el primer número: ");
        //Creamos la variable del primer numero para almacenarlo
        double num1 = scann.nextDouble();

        //Solicitamos al usuario que ingrese el segundo numero
        System.out.print("Introduzca el segundo número: ");
        //Creamos la variable del segundo número para almacenarlo
        double num2 = scann.nextDouble();

        //Solicitamos al usuario que ingrese el tercer numero
        System.out.print("Introduzca el tercer número: ");
        //Creamos la variable para almacenar el tercer numero
        double num3 = scann.nextDouble();

        //Usamos una estructura condicional para determinar cual es el numero más grande
        if (num1 > num2 && num1 > num3) {
            System.out.println("El número " + num1 + " es el mayor.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número " + num2 + " es el mayor.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número " + num3 + " es el mayor.");
        } else {
            System.out.println("Los números son iguales.");
        }
    }
}
