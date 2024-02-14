package com.es.programacion.tema3;

public class TeoriaArrays {

    public static void main(String[] args) {


        // 1º Cómo declarar un array
        // tipoDeDato[] identificador;
        int[] arr;

        // 2º Inicializar
        // identificador = new tipoDeDato[longitudDelArray];
        arr = new int[5];

        // 3º Asignar valores
        // identificador[indice] = valor;
        arr[0] = 100;
        arr[1] = 2;
        arr[2] = 7;
        arr[3] = 4;
        arr[4] = 0;

        System.out.println("En la posicion 0 está el valor " + arr[0]);

        // ************* //
        // 1º Declarar e inicializar a la vez
        // tipoDeDato[] identificador = { valores separados por coma };
        char[] cArr = {'d', '%', '5', 't', 'x'};

        System.out.println("En la posición 4 está el valor " + cArr[4]);

        //************//

        // Cómo acceder a un elemento
        // identificador[index]

        // Para saber la longitud de un array
        // identificador.length

        System.out.print("El tamanio del array cArr es: " + cArr.length + " y el primer elemento del array es " + cArr[0]);

        /**
         * Declarar un array de String de tamaño "el nº de alumnos de esta clase".
         * Inicializar dicho String con los nombres de cada un@.
         */


        String[] estudiantes = new String[19];
        estudiantes[0] = "Angel";
        estudiantes[1] = "Angel";
        estudiantes[2] = "Angel";
        estudiantes[3] = "Angel";
        estudiantes[4] = "Angel";
        estudiantes[5] = "Angel";
        estudiantes[6] = "Angel";
        estudiantes[7] = "Angel";
        estudiantes[8] = "Angel";
        estudiantes[9] = "Angel";
        estudiantes[10] = "Angel";
        estudiantes[11] = "Angel";
        estudiantes[12] = "Angel";
        estudiantes[13] = "Angel";
        estudiantes[14] = "Angel";
        estudiantes[15] = "Angel";
        estudiantes[16] = "Angel";
        estudiantes[17] = "Angel";
        estudiantes[18] = "Angel";


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // Declarar un array de enteros de tamanio 6
        int[] intArr = {4,7,2,15,12,10};

        System.out.println("El tamanio es: "+ intArr.length);


        // Para recorrer el array, conocemos su longitud con intArr.length
        // Entonces, iríamos desde 0... hasta length - 1 (que es el último índice del array)
        //      i0      i1      i2      i3     i4     i5
        //      {4,     7,      2,      15,    12,    10}
        for(int i = 0; i <= intArr.length - 1; i++) {

            System.out.println("El elemento "+intArr[i]);

        }


        /**
         * Declarar un array de char de tamaño 1000.
         * Llenar TODAS los elementos con la letra "F"
         */
        char[] efes = new char[1000]; // array de char de tamanio 1000

        for(int i = 0; i<= efes.length - 1; i++) {
            efes[i] = 'F'; // Llenamos cada posicion con una f
            System.out.println(efes[i]);
        }


    }


}
