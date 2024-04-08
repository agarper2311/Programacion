package com.Programacion.Tema2.EjemplosClase;

import java.util.Scanner;

public class Loggin {
    public static void main(String[] args) {
        // Leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        // Declaramos las variables
        String NomLoggin = "usuario", passwd = "1234";
        String NomUser, passwdUser;

        // Usar un bucle para solicitar nombre de usuario y contraseña hasta que sean correctos
        while (true) {
            // Pedimos que introduzca el nombre de usuario
            System.out.println("Introduzca el nombre de usuario: ");
            NomUser = scann.next();

            // Pedimos que introduzca la contraseña
            System.out.println("Introduzca la contraseña: ");
            passwdUser = scann.next();

            // Verificar si el nombre de usuario y la contraseña son correctos
            if (NomUser.equals(NomLoggin) && passwdUser.equals(passwd)) {
                System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + NomUser + "!");
                break; // Salir del bucle si la información es correcta
            } else {
                System.err.println("Nombre de usuario y/o contraseña incorrectos. Por favor, inténtelo de nuevo.");
            }
        }
            scann.close();

    }
}