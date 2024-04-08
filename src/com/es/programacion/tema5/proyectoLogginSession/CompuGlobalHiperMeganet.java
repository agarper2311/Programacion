package com.Programacion.Tema5.proyectoLogginSession;

import com.Programacion.Tema5.proyectoLogginSession.Services.UserSessionService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompuGlobalHiperMeganet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion = -1; // Inicializado a -1 para garantizar la entrada al bucle

        do {
            try {
                System.out.println("Bienvenido al sistema de acceso.");
                System.out.println("1. Iniciar sesión");
                System.out.println("2. Alta");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scan.nextInt();
                scan.nextLine(); // Limpiar el buffer del scanner

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese su nombre de usuario: ");
                        String username = scan.nextLine();

                        String password;
                        if (UserSessionService.checkIfSessionIsActive(username)) {
                            System.out.println("Bienvenido de nuevo al sistema, " + username + ". Tu sesión está activa.");
                        } else {
                            System.out.print("Ingrese su contraseña: ");
                            password = scan.nextLine();

                            if (UserSessionService.checkIfUserExists(username, password)) {
                                System.out.println("Bienvenido al sistema, " + username + ".");
                                UserSessionService.addSession(username);
                            } else {
                                System.out.println("Acceso denegado. Usuario o contraseña incorrectos.");
                            }
                        }
                        break;
                    case 2:
                        boolean userExists;
                        do {
                            System.out.print("Ingrese el nombre de usuario deseado: ");
                            username = scan.nextLine(); // Reutilizar la variable 'username'

                            userExists = UserSessionService.checkIfUserIsDuplicate(username);

                            if (userExists) {
                                System.out.println("El nombre de usuario ya está en uso. Por favor, elija otro.");
                            }
                        } while (userExists); // Repetir si el nombre de usuario ya existe

                        System.out.print("Ingrese su contraseña: ");
                        password = scan.nextLine(); // Reutilizar la variable 'password'

                        boolean userAdded = UserSessionService.addUser(username, password);
                        if (userAdded) {
                            System.out.println("Usuario registrado con éxito.");
                        } else {
                            System.out.println("No se pudo registrar el usuario.");
                        }
                        break;
                    case 0:
                        System.out.println("Gracias por utilizar el sistema de LoginSesion.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduzca un número válido para seleccionar una opción.");
                scan.nextLine(); // Limpiar el buffer del scanner para evitar un bucle infinito
            }
        } while (opcion != 0);


    }
}
