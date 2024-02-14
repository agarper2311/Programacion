package com.es.programacion.tema3;

public class TeoriaArraysII {

    public static void main(String[] args) {


        /**
         * Ejercicio 1. Definir con lenguaje natural los siguientes arrays
         */
        // Ejemplos
        int[] arr;                  // -> Array de enteros con nombre arr
        int[] arr2 = new int[2];    // -> Array de enteros arr2, con tamaño 2
        arr2[0] = 1;                // -> Asigno el valor entero 1 a la posición 0 del array


        // Ahora tú
        int[] arr3 = {2,3,1};
        String[] sArr;
        boolean[] bArr = new boolean[5];
        char[] cArr = {'a'};

        cArr[0] = 'b';
        bArr[0] = true;
        bArr[2] = true;
        bArr[3] = false;
        bArr[4] = true;


        /**
         * Ejercicio 2. Definir en Java lo descrito en lenguaje natural
         */
        // Ejemplo
        // Array de Strings de tamaño 4 con nombre despedidas, que tenga en la primera posición "chao", en la segunda "adios", en la tercera "Hasta pronto", y en la última "Hasta nunca"
        String[] despedidas = {"chao", "adios", "hasta pronto", "hasta nunca"};

        // AHORA TÚ
        // Array de enteros de tamaño 11 con nombre notas

        // La primera posición de notas contiene el valor 0

        // La segunda posición de notas contiene el valor 1

        // La tercera posición de notas contiene el valor 2

        // La cuarta posición de notas contiene el valor 3

        // La quinta posición de notas contiene el valor 4

        // La sexta posición de notas contiene el valor 5

        // La septima posición de notas contiene el valor 6

        // La octava posición de notas contiene el valor 7

        // La novena posición de notas contiene el valor 8

        // La decima posición de notas contiene el valor 9

        // La onceava posición de notas contiene el valor 10

        // Array de Strings de tamaño 10 llamado users, inicializado pero vacío.

        // Array de booleans de tamaño 10 llamado bans, inicializados todos los elementos del array a false.

        // La primera posición de users es "xulito6969"

        // La primera posición de bans es true

        // La segunda posición de users es "userNormalYSimpatico"

        // La segunda posición de bans es true

        // La tercera posición de users es "lainezz"


        /**
         * Ejercicio 3
         * Declarar e inicializar un array de enteros de tamaño 10.
         * Llenar ese array con números aleatorios a vuestra elección.
         * Recorrer dicho array desde la posición 0 hasta la última y mostrar el contenido de cada uno de los elementos.
         * Ejemplo
         * "La posición 0 tiene un elemento con valor 17"
         * "La posición 1 tiene un elemento con valor 99"
         * ...
         */



        /**
         * Ejercicio 4
         * Declarar e inicializar un array de Strings de tamaño 10
         * Llenar dicho array con cadenas aleatorias a vuestra elección
         * Recorrer dicho array desde la última posición hasta la 0 (es decir, de atrás hacia delante)
         * Ejemplo:
         * "La posición 9 tiene un elemento con valor perro"
         * "La posición 8 tiene..."
         * ...
         */
        String[] arrSt = new String[10];
        arrSt[0] = "Bulbasaur";
        arrSt[1] = "Ivysaur";
        arrSt[2] = "Venusaur";
        arrSt[3] = "Charmander";
        arrSt[4] = "Charmeleon";
        arrSt[5] = "Charizard";
        arrSt[6] = "Squirtle";
        arrSt[7] = "Wartortle";
        arrSt[8] = "Blastoise";
        arrSt[9] = "Pikachu";

        for (int i = arrSt.length - 1; i>= 0 ; i--) {
            System.out.println(arrSt[i]+" te elijo a tí");
        }

    }

}
