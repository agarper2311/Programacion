package com.es.programacion.tema3.ejerciciosrepaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDeRandoms {


    public static void main(String[] args) {

        try {

            // Crear un array de tamaño 100 con valores aleatorios
            double[] arrDeRand = new double[100];
            for (int i=0; i<=arrDeRand.length-1; i++){
                arrDeRand[i] = Math.random();
            }

            // Pedir un numero al usuario y controlar las posibles excepciones
            double numUser = 0.0;
            Scanner scan = new Scanner(System.in);
            System.out.print("Introduzca un valor: ");
            try {
                numUser = scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error en el valor...");
            }

            // Contar cuantos valores son iguales o superiores a ese numUser
            int contMayores = 0;
            for(int i=0; i<=arrDeRand.length-1; i++){
                contMayores += (numUser >= arrDeRand[i]) ? 1 : 0;
            }

            // Mostrar un mensaje con el resultado
            System.out.print("Hay "+contMayores+" mayor(es) que "+numUser);

        } catch (IndexOutOfBoundsException e){
            System.out.println("Se ha accedido a una posicion inexistente, saliendo...");
        } catch (Exception e) {
            System.out.println("Error desconocido, saliendo...");
        }

    }
}
