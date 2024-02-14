package com.es.programacion.tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetterSetter {

    public static void main(String[] args) {

        /**
         * Implementa un programa donde un usuario debe rellenar
         * un array de int de tamanio 10.
         *
         * Se ha de controlar mediante el uso de excepciones que no se introduzcan
         * más de 10 elementos.
         * **** Ayuda****
         * Hacéis un bucle while... do while ... para que el user vaya introduciendo
         * los datos.
         * Cuando se intente introducir un dato en una posición que no exista... pues controláis
         * esa excepción.
         *
         * Debéis implementar una función que compruebe que el número introducido
         * es positivo. Si NO ES POSITIVO... lanza una excepción.
         * **** Ayuda****
         * Una función que recibe 1 número entero por parámetros.
         * NO DEVUELVE NADA.
         * La función se llama comprobar
         *
         */

        // Variables generales del programa
        Scanner scan = new Scanner(System.in);
        int num = 0;

        // Variable del problema
        int[] numeros = new int[10];

        // Bucle while para introducir datos
        int i = 0;
        while (true) {

            System.out.println("Introduzca un numero para insertarlo: ");
            num = scan.nextInt();

            try {

                // Compruebo el numero
                checkPositivo(num);

                // Inserto el numero
                numeros[i] = num;
                i++;

            } catch (InputMismatchException e) {
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                System.err.println("No se pueden anadir mas numeros");
                break;
            }
        }
    }

    /**
     * Funcion que comprueba si un numero es positivo o no
     * @param num Numero a comprobar
     * @throws InputMismatchException Si el numero es negativo
     */
    public static void checkPositivo(int num) throws InputMismatchException {
        if (num < 0){
            throw new InputMismatchException("Numeros negativos no permitidos");
        }
    }


}
