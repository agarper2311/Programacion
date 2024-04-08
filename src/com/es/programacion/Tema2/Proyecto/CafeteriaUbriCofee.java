package com.Programacion.Tema2.Proyecto;
/*
Programa relaizado por Angel García Pérez

1ºDAW I.E.S Ntra. Sra. de los Remedios
 */
import java.util.Scanner;
import java.time.LocalTime; //Biblioteca para obtener la hora en tiempo real, info sacado de StackOveflow


public class CafeteriaUbriCofee {
    public static void main(String[] args) {
        // Definición de variables
        String usuario = "usuario";
        String contrasenia = "1234";
        String inputUsuario;
        String inputContrasenia;
        int opcionProducto;
        int subopcion = 0;
        String cesta = "";
        double totalPagar = 0;
        boolean Loggin = false;
        Scanner scann = new Scanner(System.in);

        // Obtener la hora actual
        LocalTime horaActual = LocalTime.now();
        String saludo;

        if (horaActual.getHour() >= 6 && horaActual.getHour() < 12) {
            saludo = "Buenos días";
        } else if (horaActual.getHour() >= 12 && horaActual.getHour() < 18) {
            saludo = "Buenas tardes";
        } else {
            saludo = "Buenas noches";
        }

        System.out.println(saludo + ". Bienvenid@ a Cafetería UbriCofee");

        // Menú principal y lógica del programa
        while (true) {
            System.out.println("Elija una opción: ");
            System.out.println("1. Login.");
            System.out.println("2. Menú.");
            System.out.println("3. Pasar por caja.");
            System.out.println("0. Salir.");
            System.out.print("Opción: ");
            int opcionUsuario = scann.nextInt();

            if (opcionUsuario == 1 && !Loggin) {
                while (true) {
                    System.out.print("Nombre de Usuario: ");
                    inputUsuario = scann.next();
                    System.out.print("Contraseña: ");
                    inputContrasenia = scann.next();
                    if (usuario.equals(inputUsuario) && contrasenia.equals(inputContrasenia)) {
                        System.out.println("Bienvenid@ " + usuario + "!!\n");
                        Loggin = true;
                        break; // Rompe el bucle de login si las credenciales son correctas
                    } else {
                        System.err.println("Usuario y/o contraseña incorrectos\n");
                    }
                }
            } else if (opcionUsuario == 2 && Loggin) {
                // Lógica del menú
                System.out.println("Bienvenido " + usuario + ", aquí tienes el menú.");
                System.out.println("1. Café");
                System.out.println("2. Agua");
                System.out.println("3. Tostada");
                System.out.println("4. Zumo");
                System.out.println("0. Terminar / Volver al Menú");

                // Bucle para seleccionar múltiples productos/subproductos
                do {
                    System.out.print("Elija una opción por favor: ");
                    opcionProducto = scann.nextInt();

                    if (opcionProducto == 0) {
                        break; // Salir del bucle y volver al menú principal
                    }

                    // Lógica para seleccionar subproductos
                    String producto = "";
                    double precio = 0;
                    if (opcionProducto == 1) {
                        System.out.println("Seleccione tipo de café:");
                        System.out.println("1. Café con leche (1.50€)");
                        System.out.println("2. Café solo (1€)");
                        System.out.println("3. Café cortado (1.20€)");
                        subopcion = scann.nextInt();
                        if (subopcion == 1) {
                            producto = "Café con leche";
                            precio = 1.50;
                        } else if (subopcion == 2) {
                            producto = "Café solo";
                            precio = 1;
                        } else if (subopcion == 3) {
                            producto = "Café cortado";
                            precio = 1.20;
                        } else {
                            System.err.println("Opción inválida, intentelo de nuevo");
                            continue; // Vuelve al inicio del bucle para seleccionar subproductos
                        }
                    } else if (opcionProducto == 3) {
                        System.out.println("Seleccione tipo de tostada:");
                        System.out.println("1. Tostada con tomate (1.80€)");
                        System.out.println("2. Tostada con jamón (2€)");
                        System.out.println("3. Tostada con mantequilla y mermelada (1.50€)");
                        subopcion = scann.nextInt();
                        if (subopcion == 1) {
                            producto = "Tostada con tomate";
                            precio = 1.80;
                        } else if (subopcion == 2) {
                            producto = "Tostada con jamón";
                            precio = 2;
                        } else if (subopcion == 3) {
                            producto = "Tostada con mantequilla y mermelada";
                            precio = 1.50;
                        } else {
                            System.err.println("Opción inválida, intentelo de nuevo");
                            continue; // Vuelve al inicio del bucle para seleccionar subproductos
                        }
                    } else if (opcionProducto == 2) {
                        producto = "Agua";
                        precio = 0.50;
                    } else if (opcionProducto == 4) {
                        System.out.println("Seleccione tipo de zumo:");
                        System.out.println("1. Zumo de naranja (1.50€)");
                        System.out.println("2. Zumo de piña (1.80€)");
                        subopcion = scann.nextInt();
                        if (subopcion == 1) {
                            producto = "Zumo de naranja";
                            precio = 1.50;
                        } else if (subopcion == 2) {
                            producto = "Zumo de piña";
                            precio = 1.80;
                        } else {
                            System.err.println("Opción inválida, intentelo de nuevo");
                            continue; // Vuelve al inicio del bucle para seleccionar subproductos
                        }
                    } else {
                        System.err.println("Opción inválida, intentelo de nuevo");
                        continue; // Vuelve al inicio del bucle para seleccionar productos
                    }

                    // Agregar producto seleccionado a la cesta
                    cesta += producto + ", ";
                    totalPagar += precio;

                    // Preguntar al usuario si desea seleccionar más productos
                    System.out.print("¿Desea seleccionar más productos? (1: Sí, 0: No): ");
                    int seleccionarMas = scann.nextInt();
                    if (seleccionarMas == 0) {
                        break; // Salir del bucle de selección de subproductos
                    }
                } while (true);
            } else if (opcionUsuario == 3 && Loggin) {
                // Lógica de paso por caja
                System.out.println("Productos seleccionados:");
                System.out.println(cesta);
                System.out.println("Total a pagar: " + totalPagar + "€");
            } else if (opcionUsuario == 0) {
                // Mensaje de despedida al salir del programa
                System.out.println("Gracias por visitar UbriCofee. ¡Hasta luego!");
                break;
            } else {
                System.err.println("Opción inválida, intentelo de nuevo");
            }
        }

        // Cierre del escáner
        scann.close();
    }
}


/*
PREGUNTAS


a. La parte más compleja al trabajar con bucles en este código es gestionar las selecciones de productos y subproductos
del usuario.
Específicamente, el bucle do-while que permite al usuario seleccionar múltiples subproductos hasta que decida volver
al menú principal.
La gestión de las diferentes opciones de productos y subproductos dentro del bucle puede ser complicada para asegurar
una experiencia de usuario fluida y sin errores.

b. He decidido utilizar un bucle do-while para la selección de productos y subproductos del usuario. La razón detrás de
esta elección es que queremos asegurarnos de que el usuario pueda seleccionar al menos un producto (o subproducto) antes
de tener la opción de salir del bucle y volver al menú principal. Utilizar un bucle do-while garantiza que el bloque de
código dentro del bucle se ejecute al menos una vez antes de que se evalúe la condición de salida del bucle.

c. La parte más compleja de la práctica probablemente sea gestionar las diferentes opciones de productos y subproductos,
así como la lógica asociada para calcular el total a pagar. Además, la implementación de la estructura de control para
permitir al usuario seleccionar múltiples productos y subproductos, y poder volver al menú principal,
puede ser desafiante para garantizar una experiencia de usuario intuitiva y sin errores
 */

