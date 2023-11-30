package com.Programacion.Tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetterSetter {
    public static void main(String[] args) {
        /**
         * Implementa un programa donde un usuario debe rellenar
         * un array de int de tamanio 10.
         *
         * Se ha de controlar mediante el uso de excepciones cuando se introduzcan
         * más de 10 elementos.
         * **** Ayuda ****
         * Hacer uso de un bucle while... do while... para que el usuario vaya introduciendo
         * los datos.
         *
         * Cuando se intente introducir un dato en una posición que no exista, deberemos controlar
         * esa excepción
         *
         * Debeis implementar un función que compruebe que el numero introducido es positivo.
         * SI NO ES POSITIVO... lanza una excepción
         *
         *  **** Ayuda ****
         *  Una función que recibe 1 número entero por parámetros
         *  NO DEVUELVE NADA.
         *  La función se llama comprobar
         */

        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];
        int index = 0;
        int numUser;

        while (index < 10){
            try {
                System.out.println("Introduzca un número positivo: ");
                numUser = scan.nextInt();
                comprobar(numUser);
                numeros[index] = numUser;
                index+=1;
            }catch (InputMismatchException e){
                System.out.println("Error, el numero introducido no es valido ");
                scan.next(); // limpiar el bufer del scanner para que no se haga un bucle infinito

            }catch (IndexOutOfBoundsException e){
                System.out.println("Ya está completa la lista de los 10 números");
                break;
            }

        }
        System.out.println("Estos son los números introducidos: ");
        for (int i = 0; i< index; i+=1){
            System.out.println(numeros[i] + " ");
        }
    }
    public static void comprobar(int numUser){
        try {
            if (numUser <= 0){

            }
        }catch (InputMismatchException e){
            System.out.println("Tipo de dato incorrecto");
        }
    }
}
