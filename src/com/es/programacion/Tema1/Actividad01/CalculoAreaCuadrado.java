package com.Programacion.Tema1.Actividad01;

import java.util.Scanner;

// Clase que representa el programa
public class CalculoAreaCuadrado {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el lado del cuadrado
        System.out.print("Por favor, ingresa el lado del cuadrado: ");
        
        // Leer el lado del cuadrado desde la entrada del usuario
        double lado = scanner.nextDouble();

        // Calcula el área del cuadrado usando la fórmula
        double area = lado * lado;

        // Muestra el resultado por pantalla
        System.out.println("El área del cuadrado es: " + area);

        // Cierra el objeto Scanner
        scanner.close();
    }
}
