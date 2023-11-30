package com.Programacion.Tema3;
import java.util.Scanner;

public class LoginMejoradoSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usuarios = {"usuario1", "usuario2", "usuario3", "usuario4", "usuario5"};
        String[] contrasenas = {"passwd1", "passwd2", "passwd3", "passwd4", "passwd5"};
        int usuariosRegistrados = 5;
        boolean sesionIniciada = false;
        boolean menuVisible = true;
        int opcion;

        do {
            if (menuVisible) {
                System.out.println("1. Login");
            } else {
                System.out.println("Sesión iniciada. ¡Bienvenido!");
            }
            System.out.println("2. Registro");
            System.out.println("3. Baja");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del teclado

            switch (opcion) {
                case 1:
                    if (!sesionIniciada) {
                        System.out.print("Usuario: ");
                        String usuarioLogin = scanner.nextLine();
                        System.out.print("Contraseña: ");
                        String contrasenaLogin = scanner.nextLine();
                        boolean loginExitoso = false;
                        for (int i = 0; i < usuariosRegistrados; i++) {
                            if (usuarios[i].equals(usuarioLogin) && contrasenas[i].equals(contrasenaLogin)) {
                                loginExitoso = true;
                                sesionIniciada = true;
                                break;
                            }
                        }
                        if (loginExitoso) {
                            System.out.println("Inicio de sesión exitoso.");
                        } else {
                            System.out.println("Credenciales incorrectas. Inténtalo de nuevo.");
                        }
                    } else {
                        System.out.println("Ya has iniciado sesión.");
                    }
                    break;
                case 2:
                    System.out.print("Nuevo usuario: ");
                    String nuevoUsuario = scanner.nextLine();

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
                        String nuevaContrasena = scanner.nextLine();
                        usuariosRegistrados++;
                        usuarios[usuariosRegistrados - 1] = nuevoUsuario;
                        contrasenas[usuariosRegistrados - 1] = nuevaContrasena;
                        System.out.println("Registro exitoso.");
                    }
                    break;
                case 3:
                    System.out.print("Usuario: ");
                    String usuarioBaja = scanner.nextLine();
                    System.out.print("Contraseña: ");
                    String contrasenaBaja = scanner.nextLine();
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
                    break;
                case 4:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);
    }
}
