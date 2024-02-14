package com.es.programacion.tema3.ejerciciosrepaso;

import java.util.Scanner;

public class CuantasLetras {

    public static void main(String[] args) {

        // Primero declaro un array que va a contener las letras posibles.
        // ¿Por qué 27? Porque se supone que son las letras del abecedario espaniol
        char[] letras = new char[27];

        // Declaro la cadena a leer
        String palabra = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca la palabra: ");
        palabra = scan.next();

        // Recorro la palabra
        for (int i=0; i<= palabra.length()-1; i++){

            // Obtengo cada uno de los caracteres (y para evitar posibles problemas, pongo cada caracter en minuscula)
            char letra = Character.toLowerCase(palabra.charAt(i));

            // Recorro el array letras que contiene las letras de la palabra para comprobar que la letra no ha sido metida ya
            boolean letraYaMetida = false;
            for (int j=0; j<=letras.length-1; j++) {
                if(letras[j] == letra) {
                    letraYaMetida = true; // Si encuentro esa letra, rompo el bucle, ya que esa letra ya está en el array y no la necesito meter de nuevo
                    break; // Rompo el for de j
                }
            }

            // Si la letra no ha sido metida en el array, procedo a meterla en la primera posicion libre que encuentre
            if (!letraYaMetida) {
                for(int k=0; k<= letras.length-1; k++){
                    if(letras[k] == 0) {
                        letras[k] = letra;
                        break;
                    }
                }
            }

        }


        System.out.print("[");
        for (int i=0; i<= letras.length-1;i++){
            System.out.print(letras[i] + ",");
        }
        System.out.println("]");


    }
}
