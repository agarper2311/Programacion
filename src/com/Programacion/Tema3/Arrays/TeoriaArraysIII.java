package com.Programacion.Tema3.Arrays;

public class TeoriaArraysIII {
    public static void main(String[] args) {
        //Filas x columnas
        int [][] matriz = new int[5][2];
        matriz[0][0] = 1;
        matriz[0][1] = 7;
        matriz[1][0] = 2;
        matriz[1][1] = 3;
        matriz[2][0] = 8;
        matriz[2][1] = 10;
        matriz[3][0] = 77;
        matriz[3][1] = 5;
        matriz[4][0] = 2;
        matriz[4][1] = 1;

        //Recorremos las filas con i
        for (int i = 0; i <= matriz.length-1; i++){

            //Ahora recorremos las columnas dentro de las filas
            for (int j = 0; j <=matriz[i].length -1; j++){

                //Mostramos el elemento de la posición i y j
                System.out.println(matriz[i][j]);
            }
        }
    }

}
