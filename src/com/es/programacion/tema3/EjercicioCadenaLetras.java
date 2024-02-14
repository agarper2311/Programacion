package com.es.programacion.tema3;

public class EjercicioCadenaLetras {

    public static void main(String[] args) {

        /**
         * Vamos a hacer un programa, que dado un String...
         * cuente cuántas vocales de cada tipo tiene.
         *
         * Ejemplo:
         * String cadena = "Hola Mundo";
         *
         * ... código súper tocho
         *
         * Tiene 1 a
         * Tiene 0 e
         * Tiene 0 i
         * Tiene 2 o
         * Tiene 1 u
         *
         * Ejemplo2:
         * String cadena = "Murcielago";
         *
         * ... código súper tocho
         *
         * Tiene 1 a
         * Tiene 1 e
         * Tiene 1 i
         * Tiene 1 o
         * Tiene 1 u
         */

        // Cadena de texto a analizar
        String cadena = "murcielagooOoOoO";

        // Contadores
        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;

        // Recorro la palabra de ppio a fin
        for (int i=0; i<=cadena.length()-1; i++){

            if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A'){
                contA++;
            } else if(cadena.charAt(i) == 'e' || cadena.charAt(i) == 'E'){
                contE++;
            } else if(cadena.charAt(i) == 'i' || cadena.charAt(i) == 'I'){
                contI++;
            } else if(cadena.charAt(i) == 'o' || cadena.charAt(i) == 'O'){
                contO++;
            } else if(cadena.charAt(i) == 'u' || cadena.charAt(i) == 'U'){
                contU++;
            }
        }

        System.out.println("La cantidad de aes es: "+contA);
        System.out.println("La cantidad de es es: "+contE);
        System.out.println("La cantidad de ies es: "+contI);
        System.out.println("La cantidad de oes es: "+contO);
        System.out.println("La cantidad de ues es: "+contU);

    }
}
