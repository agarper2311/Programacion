package com.Programacion.Tema1.Actividad00;

import java.util.Scanner;

/*
Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en calificación alfabética,
escribiendo el resultado:

a. de 0 a < 3 Muy deficiente
b. de 3 a < 5 Insuficiente
c. de 5 a < 6 Bien
d. de 6 a < 9 Notable
e. de 9 a 10 Sobresaliente
f. (otro) nota incorrecta
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // Creamos la variable nota como real
        double nota;

        // Creamos el objeto Scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        // Preguntamos por pantalla al usuario por la nota
        System.out.print("Introduzca la nota: ");

        //Almacenamos la variable nota
        nota = scann.nextDouble();

        // Condición if e else-if para mostrar el resultado de la nota
        if (nota >=0 && nota < 3){
            System.out.println("Muy deficiente :(");
        }else if (nota >= 3 && nota < 5) {
            System.out.println("Insuficiente :T");
        } else if (nota >=5 && nota < 6) {
            System.out.println("Bien :)");
        } else if (nota >=6 && nota < 9) {
            System.out.println("Notable ;)");
        } else if (nota >=9 && nota == 10) {
            System.out.println("Sobresaliente!!");
        }else {
            System.out.println("Nota incorrecta -_-");
        }
    }
}
