package com.es.programacion.Recuperacion.tema3.arrayRandoms;

// Importa las clases necesarias para leer la entrada del usuario y manejar excepciones específicas.
import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayDeRamdoms {
    public static void main(String[] args) {
        // Crea un arreglo para almacenar 100 números reales aleatorios.
        double[] randomNumbers = new double[100];

        // Llena el arreglo con números aleatorios generados por Math.random().
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = Math.random(); // Genera números aleatorios entre 0.0 y 1.0
        }

        // Prepara un escáner para leer la entrada del usuario.
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un valor real R: ");

        try {
            // Lee el valor real \(R\) introducido por el usuario.
            double R = scan.nextDouble();

            // Inicializa un contador para llevar la cuenta de cuántos números en el arreglo son iguales o superiores a \(R\).
            int count = 0;
            // Itera sobre cada número en el arreglo.
            for (double number : randomNumbers) {
                // Si el número actual es igual o superior a \(R\), incrementa el contador.
                if (number >= R) {
                    count++;
                }
            }

            // Muestra el resultado final al usuario.
            System.out.println("Hay " + count + " números en el array iguales o superiores a " + R + ".");
        } catch (InputMismatchException e) {
            // Maneja el caso en que el usuario no introduce un número real, mostrando un mensaje de error.
            System.out.println("Se ha producido una excepción: InputMismatchException. Debes introducir un valor numérico.");
        } catch (IndexOutOfBoundsException e) {
            // Este bloque de captura es redundante para este código específico, ya que no se accede a índices del arreglo de manera que pueda lanzar IndexOutOfBoundsException.
            System.out.println("Se ha producido una excepción: IndexOutOfBoundsException. Intentaste acceder a una posición del array que no existe.");
        }
    }
}
