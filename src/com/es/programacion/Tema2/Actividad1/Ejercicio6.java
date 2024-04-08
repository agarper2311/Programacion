package com.Programacion.Tema2.Actividad1;

import java.util.Scanner;

/*
Implemente un algoritmo en el que dado un entero n > 1 leído por teclado, calcule e imprima los elementos correspondientes
a la conjetura de Ullman. La conjetura consiste en lo siguiente:
Empieza con cualquier entero positivo
Si es par, se divide entre 2; si es impar se multiplica por 3 y se agrega 1
Se itera hasta obtener el número 1

Al final se obtendrá el número 1, independientemente del entero inicial. Por ejemplo, cuando el entero inicial
es 26, la secuencia será:
26, 13, 40, 20, 10, 5, 16, 6, 4, 2, 1
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        //Creamos el objeto Scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        // Pedir al usuario que ingrese un número mayor que 1
        System.out.print("Ingrese un número entero mayor que 1: ");
        int n = scann.nextInt();

        // Validar si el número ingresado es mayor que 1
        if (n <= 1) {
            System.out.println("Por favor, ingrese un número mayor que 1.");
        } else {
            // Aplicar la conjetura de Ullman
            System.out.print("Secuencia de Ullman para " + n + ": ");
            while (n != 1) {
                System.out.print(n + ", ");
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }
            }
            System.out.println(1); // Agregar el 1 al final de la secuencia
        }

        scann.close();
    }
}
