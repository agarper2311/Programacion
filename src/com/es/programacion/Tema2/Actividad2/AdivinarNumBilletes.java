package com.Programacion.Tema2.Actividad2;

import java.util.Scanner;

/*
Dada una cantidad de dinero en múltiplos de 5
adivinar el número de billetes que habría que utilizar

500€, 200€, 100€, 50€, 20€, 10€ y 5€.
 */
public class AdivinarNumBilletes {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Introduce la cantidad de dinero (múltiplos de 5): ");
        int cantidadDinero = scann.nextInt();

        int billetes500 = cantidadDinero / 500;
        cantidadDinero %= 500;
        int billetes200 = cantidadDinero / 200;
        cantidadDinero %= 200;
        int billetes100 = cantidadDinero / 100;
        cantidadDinero %= 100;
        int billetes50 = cantidadDinero / 50;
        cantidadDinero %= 50;
        int billetes20 = cantidadDinero / 20;
        cantidadDinero %= 20;
        int billetes10 = cantidadDinero / 10;
        cantidadDinero %= 10;
        int billetes5 = cantidadDinero / 5;

        System.out.println("Número de billetes de 500€: " + billetes500);
        System.out.println("Número de billetes de 200€: " + billetes200);
        System.out.println("Número de billetes de 100€: " + billetes100);
        System.out.println("Número de billetes de 50€: " + billetes50);
        System.out.println("Número de billetes de 20€: " + billetes20);
        System.out.println("Número de billetes de 10€: " + billetes10);
        System.out.println("Número de billetes de 5€: " + billetes5);
    }
}
