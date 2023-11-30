package com.Programacion.Tema1.Actividad02;
import java.util.Scanner;

public class Ejercicio5 { //Definición de la clase
    /*
   Nombre: Ángel
   Apellidos: García Pérez

   Uso de condiciones y operadores
    */
    public static void main(String[] args) {// Metodo principal
        //Creamos el objeto Scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);
        //Preguntamos al usuario a que año pertenece
        System.out.println("Introduza el año al que pertenece: ");
        //Creamos la variable donde almacenaremos el año del usuario
        int año = scann.nextInt();

        //Estructuramos la condición para saber a que generación pertenece
        if (año < 1930){
            System.out.println("No perteneces a ninguna generación");
        }
        else if (año >= 1946 && año <=1964){
            System.out.println("Baby Boomer");
        } else if (año >= 1965 && año <= 1980) {
            System.out.println("Generación X");
        } else if (año >= 1981 && año<=1996) {
            System.out.println("Millenial");
        } else if (año >= 1997) {
            System.out.println("Generación Z");
        }
        scann.close();
    }
}
