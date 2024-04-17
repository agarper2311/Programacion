package com.Programacion.Tema2.EjemplosClase;

import java.util.Scanner;

public class LoginContrasenia {
    public static void main(String[] args) {
        /*
        Hacer un programa que lea una contraseña dada por el usuario
        y que la compare con la contraseña en si, si esa contraseña coincide
        se acepta el acceso.
        Si no coincide, poned un mensaje "Acceso denegado"

        La contraseña es "1234567890"
         */

        Scanner scann = new Scanner(System.in);

        String contrasenia = "1234567890";
        String passwUser = "";

        System.out.println("Introduzca la contraseña: ");
        passwUser = scann.next();

        if (passwUser.equals(contrasenia)){
            System.out.println("Contraseña correcta");
        }else {
            System.err.println("Acceso denegado");
        }
    }
}
