package com.Programacion.Tema3.Arrays;

import java.util.Arrays;

/*
Declarar un array de tamaño 1000
llenar todas las posiciones con la letra F
 */
public class Array1 {
    public static void main(String[] args) {
        char[] efes = new char[1000]; // array de char de tamaño 1000

        for (int i = 0; i<= efes.length -1; i++){
            efes[i] = 'F';
        }
    }
}
