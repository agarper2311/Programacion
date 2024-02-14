package com.es.programacion.tema3.ejerciciosrepaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDeAlturas {

    public static void main(String[] args) {

        try {

            // Pedir el n de Alturas que queremos meter
            int nAlturas = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("Indique cuantas alturas quiere almacenar");
            nAlturas = scan.nextInt();

            // Metemos todas las alturas en el array
            double[] arrDeAlturas = new double[nAlturas];
            for (int i=0; i<=arrDeAlturas.length-1; i++) {

                System.out.print("Introduzca una altura en metros (hasta completar array)");
                double altura = 0.0;
                arrDeAlturas[i] = scan.nextDouble();

            }

            // Primero hallo la altura media
            double sumatoria = 0.0;
            for (int i=0; i<=arrDeAlturas.length-1; i++) {
                sumatoria += arrDeAlturas[i];
            }
            double alturaMedia = sumatoria / arrDeAlturas.length;


            // Ahora hallo el n de personas por debajo y por encima de la media
            int nAltos = 0;
            int nBajos = 0;
            double alturaMax = 0.0;
            double alturaMin = 0.0;
            for (int i=0; i<=arrDeAlturas.length-1; i++) {

                if(arrDeAlturas[i]>alturaMax) {
                    alturaMax = arrDeAlturas[i];
                }

                if(arrDeAlturas[i]<alturaMin) {
                    alturaMin = arrDeAlturas[i];
                }

                nAltos += arrDeAlturas[i] >= alturaMedia ? 1 : 0;
                nBajos += arrDeAlturas[i] < alturaMedia ? 1 : 0;
            }

            // Imprimo por pantalla los resultados
            System.out.print("" +
                    "\nLa altura media es: "+alturaMedia+
                    "\nHay "+nAltos+" por encima de "+alturaMedia+
                    "\nHay "+nBajos+" por debajo de "+alturaMedia+
                    "\nLa altura maxima es: "+alturaMax+
                    "\nLa altura minima es: "+alturaMin);




        } catch (IndexOutOfBoundsException e){
            System.out.println("Se ha accedido a una posicion inexistente, saliendo...");
        } catch (InputMismatchException e){
            System.out.println("Error en el tipo de dato, saliendo...");
        } catch (Exception e) {
            System.out.println("Error desconocido, saliendo...");
        }


    }
}
