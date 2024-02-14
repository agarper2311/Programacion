package com.es.programacion.tema1;

import java.util.Scanner;

public class MayorMenor {

    /*
    EJERCICIO QUE LEE UN NÚMERO POR TECLADO Y DICE SI ES POSITIVO O NEGATIVO
     */
    public static void main(String[] args) {

        /*
        ¿Qué necesito?
        Leer 1 número por teclado
        ¿Cómo lo hago?
        "Cojo la hazada" -> Cojo la herramienta para leer por teclado
        Leo el valor 1
        Comparo ese número con 0... si es mayor que 0 -> Positivo, si es menor -> Negativo
        Muestro por pantalla el mensaje correspondiente
         */
        Scanner scan = new Scanner(System.in);
        int a; // Creamos la caja "a"
        System.out.println("Oye, dime un número: ");
        a = scan.nextInt(); // Almacena lo que el user mete por teclado en la variable a

        if ( a >= 0 ) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }

    }

}
