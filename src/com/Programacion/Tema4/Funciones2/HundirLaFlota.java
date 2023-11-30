package com.Programacion.Tema4.Funciones2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Juego de hundir la flota con un tablero de 10x10
 * inicializando todos con "A" en todas las posiciones
 */

public class HundirLaFlota {

    public static void main(String[] args) {



        // Inicializar el array bidimensional de 10x10 con "A" en todas las posiciones
        String[][] tablero = new String[10][10];
        inicializarTablero(tablero);

        // Pedir al usuario las posiciones de las lanchas
        pedirPosiciones(tablero, 4);

        // Mostrar el tablero con las lanchas colocadas
        mostrarTablero(tablero);
    }

    /**
     * Método para inicializar el tablero con "A" en todas las posiciones
     * @param tablero
     */

    // Método para inicializar el tablero con "A" en todas las posiciones
    public static void inicializarTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "A";
            }
        }
    }

    /**
     * Método para pedir al usuario las posiciones de las lanchas
     * @param tablero
     * @param numLanchas
     */

    public static void pedirPosiciones(String[][] tablero, int numLanchas) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numLanchas; i++) {
            boolean posicionValida = false;

            while (!posicionValida) {

                try{
                    System.out.println("Introduce la posición de la lancha " + (i + 1) + " (fila y columna, separadas por espacio): ");
                    int fila = scanner.nextInt();
                    int columna = scanner.nextInt();
                    System.out.println("Lancha colocada en la fila: "+fila+" y columna: "+columna);

                    // Verificar si la posición está dentro del rango y no hay una lancha ya colocada
                    if (fila >= 0 && fila < 10 && columna >= 0 && columna < 10 && tablero[fila][columna].equals("A")) {
                        tablero[fila][columna] = "L";
                        posicionValida = true;
                    } else {
                        System.out.println("Posición inválida. Inténtalo de nuevo.");
                    }
                }catch (InputMismatchException e){
                    System.out.println("Tipo de dato incorrecto");
                }


            }
        }
    }

    /**
     * Método para mostrar el tablero
     * @param tablero donde se encontrarán las lanchas
     */

    // Método para mostrar el tablero
    public static void mostrarTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
