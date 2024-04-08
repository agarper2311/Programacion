package com.Programacion.Tema1.Actividad01;
import java.util.Scanner;
// Clase que representa el programa
public class CalculoHipotenusa {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la longitud del cateto A
        System.out.print("Por favor, ingresa la longitud del cateto A: ");
        
        // Leer la longitud del cateto A desde la entrada del usuario
        double catetoA = scanner.nextDouble();

        // Solicitar al usuario que ingrese la longitud del cateto B
        System.out.print("Por favor, ingresa la longitud del cateto B: ");
        
        // Leer la longitud del cateto B desde la entrada del usuario
        double catetoB = scanner.nextDouble();

        // Calcula la hipotenusa usando el teorema de Pitágoras
        double hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);

        // Muestra el resultado por pantalla
        System.out.println("La hipotenusa del triángulo es: " + hipotenusa);

        // Cierra el objeto Scanner
        scanner.close();
    }
}
