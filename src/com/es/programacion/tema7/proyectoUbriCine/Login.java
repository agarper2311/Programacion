package com.es.programacion.tema7.proyectoUbriCine;

import com.es.programacion.tema7.proyectoUbriCine.model.User;
import com.es.programacion.tema7.proyectoUbriCine.services.impl.ServiceCines;
import com.es.programacion.tema7.proyectoUbriCine.services.impl.ServiceUser;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Suponiendo que estos servicios requieren parámetros en sus constructores
        ServiceUser serviceUser = new ServiceUser("users.txt"); // toma la ruta del archivo de usuarios
        ServiceCines serviceCine = new ServiceCines();

        boolean sesionIniciada = false;
        String userId; // Variable para almacenar el ID del usuario logueado

        while (!sesionIniciada) {
            try {
                System.out.println("----- MENÚ -----");
                System.out.println("1. Iniciar sesión");
                System.out.println("2. Registrar nuevo usuario");
                System.out.println("3. Salir");
                System.out.print("Selecciona una opción: ");

                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese ID de usuario: ");
                        String id = scanner.nextLine();
                        System.out.print("Ingrese contraseña: ");
                        String password = scanner.nextLine();
                        sesionIniciada = serviceUser.loginUsuario(id, password); // Corregido para pasar id y password

                        if (sesionIniciada) {
                            System.out.println("Inicio de sesión exitoso!");
                            serviceCine.cargarButacas(); // Asumiendo que este método prepara las butacas
                            boolean salirCine = false;
                            while (!salirCine) {
                                System.out.println("----- MENÚ CINE -----");
                                System.out.println("1. Mostrar butacas");
                                System.out.println("2. Comprar entrada");
                                System.out.println("3. Devolver entrada");
                                System.out.println("4. Salir");
                                System.out.print("Selecciona una opción: ");

                                int opcionMenu = Integer.parseInt(scanner.nextLine());

                                switch (opcionMenu) {
                                    case 1:
                                        serviceCine.mostrarButacas();
                                        break;
                                    case 2:
                                        serviceCine.comprarEntrada();
                                        break;
                                    case 3:
                                        serviceCine.devolverEntrada();
                                        break;
                                    case 4:
                                        salirCine = true;
                                        break;
                                    default:
                                        System.out.println("Opción no válida.");
                                        break;
                                }
                            }
                        } else {
                            System.out.println("Nombre de usuario o contraseña incorrectos.");
                        }
                        break;
                    case 2:
                        System.out.print("Ingrese ID de usuario: ");
                        id = scanner.nextLine();
                        System.out.print("Ingrese nombre: ");
                        String name = scanner.nextLine();
                        System.out.print("Ingrese contraseña: ");
                        password = scanner.nextLine();
                        serviceUser.altaUsuario(new User(id, name, password, false)); // crear un nuevo usuario
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        sesionIniciada = true; // Esto asegura que el bucle termine.
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida. Debes introducir un número.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}
