package com.Programacion.Tema1.Actividad02;
import java.util.Scanner;

public class Ejercicio5 { //Definición de la clase
    /*
   Nombre: Angel
   Apellidos: Garcia Perez

   Uso de condiciones y operadores
    */
    public static void main(String[] args) {// Metodo principal
        //Creamos el objeto Scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);
        //Preguntamos al usuario a que año pertenece
        System.out.println("Introduza el año al que pertenece: ");
        //Creamos la variable donde almacenaremos el año del usuario
        int anio = scann.nextInt();

        //Estructuramos la condición para saber a que generación pertenece
        if (anio < 1930){
            System.out.println("No perteneces a ninguna generación");
        }
        else if (anio >= 1946 && anio <=1964){
            System.out.println("Baby Boomer");
        } else if (anio >= 1965 && anio <= 1980) {
            System.out.println("Generación X");
        } else if (anio >= 1981 && anio<=1996) {
            System.out.println("Millenial");
        } else if (anio >= 1997) {
            System.out.println("Generación Z");
        }
        scann.close();
    }
}
