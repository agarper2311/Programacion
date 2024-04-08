package com.Programacion.Tema3;

import java.util.Scanner;

/**
 * Dado un DNI: 12345678A
 * Tenemos que crear un programa el cual nos diga si el dni es válido
 * o no, si el DNI es válido debe separar los números de la letra del DNI
 * y debe mostrar por pantalla lo siguiente
 * Los numeros del DNI son: xxxxxxxx
 * La letra del DNI es: x
 */

public class SepararPartesDni {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Pedir al usuario que introduzca un DNI
        System.out.println("Introduce el DNI (formato: 12345678A): ");
        String dni = scan.nextLine();

        // Verificar si el DNI es válido y mostrar los resultados
        if (esDNIValido(dni)) {
            String numerosDNI = dni.substring(0, 8);
            char letraDNI = dni.charAt(8);

            System.out.println("Los números del DNI son: " + numerosDNI);
            System.out.println("La letra del DNI es: " + letraDNI);
        } else {
            System.out.println("El DNI no es válido.");
        }
    }

    // Método para verificar si un DNI es válido
    public static boolean esDNIValido(String dni) {
        // Verificar la longitud del DNI
        if (dni.length() != 9) {
            return false;
        }

        // Verificar que los primeros 8 caracteres son dígitos
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                return false;
            }
        }

        // Verificar que el último carácter es una letra
        char letraDNI = dni.charAt(8);
        return Character.isLetter(letraDNI);


    }
}

