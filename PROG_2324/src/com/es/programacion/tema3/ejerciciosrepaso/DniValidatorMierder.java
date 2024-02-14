package com.es.programacion.tema3.ejerciciosrepaso;

import java.util.Scanner;

public class DniValidatorMierder {

    public static void main(String[] args) {

        String dni = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduzca un dni valido: ");
        dni = scan.next();

        boolean dniEsValido = true;

        // Primero compruebo que la longitud es valida
        // La longitud del dni debe ser 9
        if (dni.length() == 9) {

            // Segundo compruebo que las primeras 8 posiciones del dni son un numero
            // Código ASCII para los numeros -> Entre 48 y 57, ambos inclusive
            // ASCII 48 -> 0
            // ASCII 49 -> 1
            // ASCII 50 -> 2
            // ASCII 51 -> 3
            // ASCII 52 -> 4
            // ASCII 53 -> 5
            // ASCII 54 -> 6
            // ASCII 55 -> 7
            // ASCII 56 -> 8
            // ASCII 57 -> 9
            for (int i=0; i<=dni.length()-2; i++) {
                if (dni.charAt(i) < 48 || dni.charAt(i) > 57) {
                    dniEsValido = false;
                    break;
                }
            }

            // Tercero y ultimo, compruebo que la ultima posicion es una letra
            // Almaceno la ultima letra del dni en una variable auxiliar por comodidad
            char ultimaLetra = dni.charAt(dni.length()-1);
            // Si el codigo ASCII del caracter esta fuera del rango de las letras, entonces dniEsValido lo pongo a false
            // Si esta fuera del rango de las letras significa que la letra en la ultima posicion del dni NO es una letra
            if ( (ultimaLetra < 65 || ultimaLetra > 90) && (ultimaLetra < 95 || ultimaLetra > 122) ) {
                dniEsValido = false;
            }
        } else {
            dniEsValido = false;
        }

        // Imprimo por pantalla los resultados
        if (dniEsValido) {
            System.out.println("El dni "+dni+" es valido");
        } else {
            System.out.println("El dni "+dni+" no es valido");
        }
    }
}
