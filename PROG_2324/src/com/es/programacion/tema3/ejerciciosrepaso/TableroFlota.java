package com.es.programacion.tema3.ejerciciosrepaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TableroFlota {

    public static void main(String[] args) {

        char[][] tablero = new char[10][10];

        for(int i=0; i<tablero.length-1;i++){
            for (int j=0; j<=tablero[i].length-1;j++){
                tablero[i][j] = 'A';
            }
        }

        Scanner scan = new Scanner(System.in);
        int fila = 0;
        int col = 0;
        int nLanchasColocadas = 0;
        while (nLanchasColocadas<4){

            try {

                System.out.println("Indique la posicion donde colocar la lancha.");
                System.out.print("Fila: ");
                fila = scan.nextInt();

                System.out.print("Columna: ");
                col = scan.nextInt();

                if(tablero[fila][col] == 'A') {
                    tablero[fila][col] = 'L';
                    nLanchasColocadas++;
                    System.out.println("Lancha colocada en "+fila+"-"+col);
                } else {
                    System.out.println("Posicion ocupada, pruebe de nuevo");
                }

            } catch (InputMismatchException e) {
                System.out.println("Datos incorrectos... Pruebe de nuevo");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Posicion invalida... Pruebe de nuevo");
            } catch (Exception e){
                System.out.println("Fallo inesperado... Pruebe de nuevo");
            }

        }

        for(int i=0; i<tablero.length-1;i++){
            for (int j=0; j<=tablero[i].length-1;j++){
                System.out.print(tablero[i][j]+",");
            }
            System.out.println();
        }

    }

}
