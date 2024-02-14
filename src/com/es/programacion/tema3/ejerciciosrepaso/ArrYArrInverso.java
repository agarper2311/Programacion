package com.es.programacion.tema3.ejerciciosrepaso;

public class ArrYArrInverso {

    public static void main(String[] args) {

        try {
            // Declaro 2 arrays de tamaño 100
            int[] arr1 = new int[100];
            int[] arr2 = new int[100];

            // Declaro una variable auxiliar para poder meter valores empezando en 1 (no es la unica solucion... hay mas)
            int aux = 1;
            // Recorro el array
            for (int i=0; i<=arr1.length-1; i++) {
                arr1[i] = aux; // Meto en la posicion i el valor de aux
                aux++; // Incremento el valor de aux en 1
            }

            // Recorro el arr2
            for (int i=0; i<=arr2.length-1; i++){
                // Meto en la posicion i del arr2 lo que contiene el arr1 en la ultima posicion - i (i=0... i=1... i=2... etc)
                // arr[0] = arr1[100-1-0] -> arr1[99]
                // arr[1] = arr1[100-1-1] -> arr1[98]
                // arr[2] = arr1[100-1-2] -> arr1[97]
                // arr[3] = arr1[100-1-3] -> arr1[96]
                // ...
                arr2[i] = arr1[arr1.length-1-i];
            }

            System.out.print("arr1 = [");
            for (int i=0; i<=arr1.length-1; i++){
                System.out.print(arr1[i]+",");
            }
            System.out.println("]");

            System.out.print("arr2 = [");
            for (int i=0; i<=arr2.length-1; i++){
                System.out.print(arr2[i]+",");
            }
            System.out.println("]");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Se ha accedido a una posicion inexistente, saliendo...");
        }


    }

}
