package com.Programacion.Tema2.EjemplosClase;
/*
Crear un programa que realice las siguientes funciones
Bienvenid@ a (nombre del sitio)
1. Iniciar sesión
2. Ver productos
3. Salir
 */

import java.util.Scanner;

public class Loggin2 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String nombreSitio = "Mi Tienda Online";
        String passwd = "1234", user = "usuario";
        boolean sesionIniciada = false;
        String carrito = "";
        System.out.println("Bienvenid@ a " + nombreSitio);
        while (true) {
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Ver productos");
            System.out.println("3. Agregar al carrito");
            System.out.println("4. Ver carrito");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scann.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese su nombre de usuario: ");
                String username = scann.next();
                System.out.print("Ingrese su contraseña: ");
                String password = scann.next();
                if (username.equals(user) && password.equals(passwd)) {
                    System.out.println("Inicio de sesión exitoso, " + username + "!");
                    sesionIniciada = true;
                } else {
                    System.err.println("Usuario y/o contraseña incorrectos");
                }
            } else if (opcion == 2) {
                System.out.println("Lista de productos:");
                System.out.println("1. Agua");
                System.out.println("2. Leche");
                System.out.println("3. Cereales");
                System.out.println("4. Chocolate");
                System.out.println("5. Pan");
                System.out.println("6. Arroz");
                System.out.print("Elija un artículo para ver detalles: ");
                int producto = scann.nextInt();
                if (producto == 1) {
                    System.out.println("\nAgua Mineral 1,60€\n");
                } else if (producto == 2) {
                    System.out.println("\nLeche Semidesnatada 1 brick 1€\n");
                } else if (producto == 3) {
                    System.out.println("\nCereales de avena 500g 3€\n");
                } else if (producto == 4) {
                    System.out.println("\nChocolate con leche 70% 2,50€\n");
                } else if (producto == 5) {
                    System.out.println("\nPan integral barra 1€\n");
                } else if (producto == 6) {
                    System.out.println("\nArroz Bomba 1kg 2€\n");
                } else {
                    System.out.println("\nProducto no válido\n");
                }
            } else if (opcion == 3) {
                if (sesionIniciada) {
                    System.out.println("Agregar al carrito:");
                    System.out.println("1. Agua");
                    System.out.println("2. Leche");
                    System.out.println("3. Cereales");
                    System.out.println("4. Chocolate");
                    System.out.println("5. Pan");
                    System.out.println("6. Arroz");
                    System.out.print("Elija un artículo para agregar al carrito: ");
                    int producto = scann.nextInt();
                    if (producto >= 1 && producto <= 6) {
                        if (producto == 1) {
                            carrito += "Agua Mineral\n";
                        } else if (producto == 2) {
                            carrito += "Leche Semidesnatada\n";
                        } else if (producto == 3) {
                            carrito += "Cereales de avena\n";
                        } else if (producto == 4) {
                            carrito += "Chocolate con leche\n";
                        } else if (producto == 5) {
                            carrito += "Pan integral barra\n";
                        } else if (producto == 6) {
                            carrito += "Arroz Bomba\n";
                        }
                        System.out.println("\nProducto añadido al carrito.\n");
                    } else {
                        System.out.println("Producto no válido");
                    }
                } else {
                    System.out.println("Para agregar productos al carrito, inicia sesión primero.");
                }
            } else if (opcion == 4) {
                if (sesionIniciada) {
                    System.out.println("Productos en el carrito:");
                    System.out.println(carrito);
                } else {
                    System.out.println("Para ver el carrito, inicia sesión primero.");
                }
            } else if (opcion == 5) {
                System.out.println("Gracias por usar " + nombreSitio + ". ¡Hasta luego!");
                break;
            } else {
                System.err.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }

        scann.close();
    }
}