package com.Programacion.Tema1.Actividad01;

import java.util.Scanner;
// Clase que representa el programa
public class CalculoPerimetroCirculo {
    public static void main (String[] args){
        // Crear un objeto Scaner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el radio del círculo
        System.out.println("Por favor, introduzca el radio del círculo: ");
        
        // Leer el radio del círculo desde la entrada del usuario
        double radio = scanner.nextDouble();
        
        // Calcular el perimetro del círculo usando la fórmula
        double perimetro = 2 * Math.PI * radio;
        
        // Muestra el resultado por pantalla
        System.out.println("El perimetro del círculo es: " + perimetro);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
