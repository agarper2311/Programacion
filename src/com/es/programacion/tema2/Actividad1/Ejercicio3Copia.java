package com.Programacion.Tema2.Actividad1;
import java.util.Scanner;
import java.math.BigInteger;
public class Ejercicio3Copia {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Pedir al usuario que ingrese un número
            System.out.print("Ingrese un número para calcular su factorial: ");
            int numero = scanner.nextInt();

            // Verificar si el número es negativo
            if (numero < 0) {
                System.out.println("El factorial de un número negativo no está definido.");
            } else {
                // Calcular el factorial del número usando BigInteger
                BigInteger factorial = BigInteger.ONE;
                for (int i = 1; i <= numero; i++) {
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                }

                // Mostrar el resultado
                System.out.println("El factorial de " + numero + " es: " + factorial);
            }

            scanner.close();
        }
    }


