package com.es.programacion.tema3;

public class EjercicioTableroAjedrez {

    public static void main(String[] args) {

        /**
         * 1º Cuántas filasXcolumnas tiene un tablero de ajedrez
         * 2º Declarar un array bidimensional de 8X8 de char
         * 3º Llenar el tablero con las posiciones de cada ficha.
         * 4º Recorre el tablero Y que salga bien.
         */

        // 2º  Declarar un array bidimensional de 8X8 de char
        char[][] tablero = new char[8][8];

        // 3º Llenar el tablero con las posiciones de cada ficha
        tablero[0][0] = 'T';
        tablero[0][1] = 'C';
        tablero[0][2] = 'A';
        tablero[0][3] = 'Q';
        tablero[0][4] = 'K';
        tablero[0][5] = 'A';
        tablero[0][6] = 'C';
        tablero[0][7] = 'T';

        tablero[1][0] = 'P';
        tablero[1][1] = 'P';
        tablero[1][2] = 'P';
        tablero[1][3] = 'P';
        tablero[1][4] = 'P';
        tablero[1][5] = 'P';
        tablero[1][6] = 'P';
        tablero[1][7] = 'P';

    }
}
