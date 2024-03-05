package com.es.programacion.Recuperacion.tema3.mediayDesviacion;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MediaYDesviacion {

    public static void main(String[] args) {
        // Lista para almacenar los números introducidos por el usuario
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce números (escribe cualquier letra para terminar): ");

        // Bucle para leer números hasta que se introduzca un valor no numérico
        while (true) {
            try {
                double num = scan.nextDouble();
                numeros.add(num);
            } catch (InputMismatchException e) {
                System.out.println("Entrada finalizada.");
                break; // Salir del bucle al introducir un valor no numérico
            }
        }

        // Cálculo de la media
        double suma = 0;
        for (Double numero : numeros) {
            suma += numero;
        }
        double media = suma / numeros.size();

        // Cálculo de la desviación típica
        double sumaDesviacion = 0;
        for (Double numero : numeros) {
            sumaDesviacion += Math.pow(numero - media, 2);
        }
        double desviacionTipica = Math.sqrt(sumaDesviacion / numeros.size());

        // Mostrar resultados
        System.out.println("Media: " + media);
        System.out.println("Desviación Típica: " + desviacionTipica);
    }
}
