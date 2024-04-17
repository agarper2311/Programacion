package com.Programacion.Tema1.Actividad02;
import java.util.Scanner;

public class Ejercicio2 {//Definición de la clase
    /*
        Nombre: angel
        Apellidos: Garcia Perez

        Uso de condiciones y operadores
         */
    public static void main(String[] args) {//Metodo principal
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);
        // Mostramos el mensaje por pantalla para que introduzca el primer numero
        System.out.print("Introduzca el primer número: ");
        //Declaramos la variable num1 para la entrada del primer número
        int num1 = scann.nextInt();

        // Mostramos el mensaje por pantalla para que introduzca el segundo número
        System.out.print("Introduzca el segundo número: ");
        // Declaramos la variable num2 para la entrada del segundo número
        int num2 = scann.nextInt();

        // Hacemos los cálculos de los números
       int resultado1 = num1 + num2;
       int resultado2 = num1 - num2;
       int resultado3 = num1 * num2;
       int resultado4 = num1 / num2;

        //Mostramos los resultados
        System.out.println("La suma de "+num1+ " y " + num2+ " es "+resultado1);
        System.out.println("La resta de "+num1+ " y " + num2+ " es "+resultado2);
        System.out.println("La multiplicación de "+num1+ " y " + num2+ " es "+resultado3);
        System.out.println("La división de "+num1+ " y " + num2+ " es "+resultado4);

    }
}
