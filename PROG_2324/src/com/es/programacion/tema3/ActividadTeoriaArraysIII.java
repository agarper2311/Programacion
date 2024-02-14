package com.es.programacion.tema3;

public class ActividadTeoriaArraysIII {

    public static void main(String[] args) {

        /**
         * Corregir los siguientes códigos para que hagan lo que dice el enunciado.
         */

        System.out.println("*******Actividad 1*************");

        /**
         * Actividad 1.
         * Recorrer el array desde el primer elemento hasta el último y mostrar por pantalla cada uno de los elementos
         */
        String[] arrDeSt = {"uno", "dos", "tres", "cuatro", "cinco"};
        for (int i=0; i<arrDeSt.length-1; i++) {
            System.out.println(i);
        }
        // Error en el menor estricto -> poner <=


        System.out.println("*******Actividad 2*************");

        /**
         * Actividad 2.
         * Recorrer el array desde el primer elemento hasta el último y mostrar por pantalla cada uno de los elementos
         */
        String[] equipoPokemon = {"Butterfly", "Pigeot", "Charizard", "Zapdos", "Gyarados"};
        for (int i=1; i<equipoPokemon.length; i++) {
            System.out.println(i);
        }

        // Error en int = 1 -> Poner int i = 0

        System.out.println("*******Actividad 3*************");
        /**
         * Actividad 3.
         * Dado un array de double, realizar la sumatoria de todos los elementos del array y sacar la media aritmética
         */
        int[] notas = {5, 7, 5, 6, 5, 8, 5, 5, 8, 6, 7, 8, 4, 8, 2, 9, 4, 5};
        int sumatoria = 0;
        for (int i=1; i < notas.length-1; i++) {
            sumatoria = notas[i];
        }
        double notaMedia = sumatoria / notas.length;
        System.out.println("La nota media es: " + notaMedia);

        // Error en int i = 1 -> Poner int i = 0
        // Error en menor estricto -> Poner <=
        // Error al hacer la sumatoria sumatoria = notas[i]; -> Poner sumatoria = sumatoria + notas[i]; ó sumatoria += notas[i];


        /**
         * Codifica tú mismo los siguientes programas
         */
        /**
         * Actividad 4.
         * Dado un String. Recorrer el String y mostrar cada uno de los carácteres de la siguiente forma:
         * {caracter0, caracter1, caracter2, ...}
         *
         * Ejemplo:
         * String cadena = "pikachu";
         *
         * El programa mostraría:
         * {p, i, k, a, c, h, u}
         *
         */
        // Solución planteada:
        String cadena = "pikachu";
        System.out.print("{");
        for (int i = 0; i<= cadena.length()-1;i++) {
            System.out.print(cadena.charAt(i)+", ");
        }
        System.out.println("}\n");



        /**
         * Actividad 5.
         * Hacer lo mismo que antes pero recorriendo la cadena al revés, es decir,
         * con el mismo formato que en el indicado en el ejercicio anterior, mostrar la cadena
         * al revés.
         *
         * Ejemplo:
         * String cadena = "pikachu";
         *
         * El programa mostraría:
         * {u, h, c, a, k, i, p}
         *
         */

        // Solución planteada:
        String cadena2 = "pikachu";
        System.out.print("{");
        for (int i = cadena2.length()-1; i >= 0;i--) {
            System.out.print(cadena2.charAt(i)+", ");
        }
        System.out.print("}\n");





    }

}
