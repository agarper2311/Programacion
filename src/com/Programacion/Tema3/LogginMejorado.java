package com.Programacion.Tema3;

import java.util.Scanner;

/**
 * 1. Zona login mejorada.
 * Declara dos arrays unidimensionales de String para almacenar los
 * usuarios y las contraseñas de cada usuario. Estos arrays deben ser de
 * tamaño 10 (estableciendo así un máximo de usuarios y contraseñas
 * registrados).
 * Introduce manualmente 5 usuarios con sus 5 contraseñas.
 * Una vez tienes los usuarios con sus respectivas contraseñas, realiza
 * un sistema de login, registro y baja, donde:
 * a. Login. En el apartado de login el usuario podrá acceder a
 * su cuenta introduciendo sus credenciales correctamente.
 * b. Registro. Un usuario podrá registrarse en el sistema,
 * introduciendo un nombre de usuario y una contraseña.
 * c. Baja. Un usuario podrá darse de baja del sistema
 * introduciendo su nombre de usuario y, por seguridad, su
 * contraseña.
 * Nota*
 * Las posiciones de usuario y contraseña son equivalentes, es decir, el
 * usuario en la posición 0 tendrá su contraseña almacenada en la
 * posición 0; el usuario en posición 1 tendrá su contraseña en la
 * posición 1, etc.
 */

public class LogginMejorado {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String[] usuarios = new String[10];
        String[] contrasenas = new String[10];
        int usuariosRegistrados = 5;

        // Inicializar usuarios y contraseñas
        usuarios[0] = "usuario1";
        contrasenas[0] = "passwd1";
        usuarios[1] = "usuario2";
        contrasenas[1] = "passwd2";
        usuarios[2] = "usuario3";
        contrasenas[2] = "passwd3";
        usuarios[3] = "usuario4";
        contrasenas[3] = "passwd4";
        usuarios[4] = "usuario5";
        contrasenas[4] = "passwd5";

        int opcion;

        do {
            System.out.println("1. Login");
            System.out.println("2. Registro");
            System.out.println("3. Baja");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scann.nextInt();
            scann.nextLine(); // Limpiar el buffer del teclado

            if (opcion == 1) {
                System.out.print("Usuario: ");
                String usuarioLogin = scann.nextLine();
                System.out.print("Contraseña: ");
                String contrasenaLogin = scann.nextLine();
                boolean loginExitoso = false;
                for (int i = 0; i < usuariosRegistrados; i++) {
                    if (usuarios[i].equals(usuarioLogin) && contrasenas[i].equals(contrasenaLogin)) {
                        loginExitoso = true;
                        break;
                    }
                }
                if (loginExitoso) {
                    System.out.println("Inicio de sesión exitoso.");
                } else {
                    System.out.println("Credenciales incorrectas. Inténtalo de nuevo.");
                }
            } else if (opcion == 2) {
                System.out.print("Nuevo usuario: ");
                String nuevoUsuario = scann.nextLine();

                // Verificar si el usuario ya existe
                boolean usuarioExistente = false;
                for (int i = 0; i < usuariosRegistrados; i++) {
                    if (usuarios[i].equals(nuevoUsuario)) {
                        usuarioExistente = true;
                        break;
                    }
                }

                if (usuarioExistente) {
                    System.out.println("¡Error! Este usuario ya está registrado. Por favor, elija otro nombre de usuario.");
                } else {
                    System.out.print("Contraseña: ");
                    String nuevaContrasena = scann.nextLine();
                    usuarios[usuariosRegistrados] = nuevoUsuario;
                    contrasenas[usuariosRegistrados] = nuevaContrasena;
                    usuariosRegistrados++;
                    System.out.println("Registro exitoso.");
                }
            } else if (opcion == 3) {
                System.out.print("Usuario: ");
                String usuarioBaja = scann.nextLine();
                System.out.print("Contraseña: ");
                String contrasenaBaja = scann.nextLine();
                boolean bajaExitosa = false;
                for (int i = 0; i < usuariosRegistrados; i++) {
                    if (usuarios[i].equals(usuarioBaja) && contrasenas[i].equals(contrasenaBaja)) {
                        // Eliminar usuario y contraseña
                        for (int j = i; j < usuariosRegistrados - 1; j++) {
                            usuarios[j] = usuarios[j + 1];
                            contrasenas[j] = contrasenas[j + 1];
                        }
                        usuariosRegistrados--;
                        bajaExitosa = true;
                        break;
                    }
                }
                if (bajaExitosa) {
                    System.out.println("Baja de usuario exitosa.");
                } else {
                    System.out.println("Credenciales incorrectas. No se pudo realizar la baja.");
                }
            }  else if (opcion == 4) {
                System.out.println("Saliendo del sistema. ¡Hasta luego!");
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);
    }
}
