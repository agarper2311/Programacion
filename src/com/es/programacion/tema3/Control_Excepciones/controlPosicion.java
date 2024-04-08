package com.Programacion.Tema3.Control_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Construye un programa que pida al usuario una cadena de texto.
 * Acto seguido, solicita la posición de un caracter de la cadena de texto
 * y lo imprime por pantalla. Controla las posibles excepciones producidas al
 * acceder a posiciones inválidas de la cadena.
 */
public class controlPosicion {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String texto = scann.nextLine();

        try {
            System.out.print("Introduce la posición del carácter que deseas acceder: ");
            int posicion = scann.nextInt();

            if (posicion >= 0 && posicion < texto.length()) {
                char caracter = texto.charAt(posicion);
                System.out.println("El carácter en la posición " + posicion + " es: " + caracter);
            } else {
                System.out.println("Posición inválida. La cadena tiene " + texto.length() + " caracteres.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: La posición está fuera del rango de la cadena.");
        }
    }
}
