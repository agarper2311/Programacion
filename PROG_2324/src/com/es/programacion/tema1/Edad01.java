package com.es.programacion.tema1;

import java.util.Scanner;

public class Edad01 {

    /*
        Vamos a hacer un programa que lea por teclado la edad de una persona y, que:
        -> Si tiene más de 100 años, que diga, "no veas soci@!!"
        -> Si tiene más de 150 años, que diga, "mentira!"
        -> Si tiene una edad negativa, que diga, "edad incorrecta"
        -> Si tiene una edad normal... es decir, de 0 a 100, que le diga "Tienes x años"
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Declaramos scan (que es de tipo Scanner)
        int edad;

        // Decirle al usuario que introduzca una edad
        // Leemos lo que el user escriba
        System.out.println("Introduce la edad: ");
        edad = scan.nextInt(); // Le asignamos a edad lo que el user nos diga por teclado

        if (edad > 100) {
            System.out.println("No veas sosi@");
        }
        if (edad > 150) {
            System.out.println("Mentira!");
        }
        if(edad < 0) {
            System.out.println("Edad incorrecta");
        }

        if (edad >= 0){
            if (edad <= 100){
                System.out.println("Tienes "+edad+" años");
            }
        }

        /****
        if ((edad >= 0)==(edad<=100)){
            System.out.println("Tienes "+edad+" años");
        }
         ***/
    }
}
