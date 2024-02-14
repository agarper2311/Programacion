package com.es.programacion.tema2;

import java.util.Scanner;

public class LoginContrasenia {

    public static void main(String[] args) {
        /**
         * Hacer un programa que lea una contraseña dada por el usuario
         * y que la compare con la contraseña en sí.
         *
         * La contraseña es: "pepe1234567890"
         *
         * Si esa contraseña coincide, se acepta el acceso
         * Si no coincide, poned un mensaje "Acceso denegado"
         */

        // 1º declarar variables contrasenia y user
        String usuarioSis = "admin";
        String intentoUser = "";

        String contraseniaSis = "pepe1234567890";
        String intentoPassw = "";

        // 2º Leer por teclado lo que introduce el user
        Scanner scan = new Scanner(System.in);

        do {

            System.out.print("Introduzca su usuario:");
            intentoUser = scan.next();

            System.out.print("Introduzca la password: ");
            intentoPassw = scan.next();

            if(!usuarioSis.equals(intentoUser) || !contraseniaSis.equals(intentoPassw)) {
                System.out.println("Credenciales incorrectas!! Intentalo de nuevo");
            }

        } while(!usuarioSis.equals(intentoUser) || !contraseniaSis.equals(intentoPassw));


        // Cuando sale del while, significa que se han introducido las credenciales correctas
        System.out.print("Bienvenid@ "+intentoUser);

    }
}
