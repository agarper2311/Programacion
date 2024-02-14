package com.es.programacion.tema2;

import java.util.Scanner;

public class EjercicioTienda {

    public static void main(String[] args) throws InterruptedException {

        /**
         * Ejercicio que muestre un menú.
         * 1. Login
         * 2. Ver Productos
         * 3. Salir
         *
         * Mientras no se introduzca una opción correcta, sigue preguntando
         * Si 3. Salir -> Termina el programa
         * Si 1. Login -> Sistema de Logueo:
         *
         * ***** LOGIN *****
         * usuarioSistema = "admin"
         * passwdSistema = "passwd"
         *
         * El usuario debe introducir el usuario y la contraseña. Si las introduce incorrectamente, debe seguir preguntando.
         *
         */

        // Declaro dos variables, una con el usuario y otra con la password
        String userRegistrado = "admin";
        String passwdRegristrado = "passwd";

        // Declaro el objeto scan de la clase Scanner
        Scanner scan = new Scanner(System.in);

        // Muestro el menú de bienvenida a la tienda
        System.out.print("BIENVENID@ A LA TIENDA DEL BARRIO");

        // Declaro una variable de control para el do-while
        int opc = 0;
        do {

            System.out.print("" +
                    "\n" +
                    "  1. Login" +
                    "  2. Ver productos" +
                    "  3. Salir" +
                    "\n");
            System.out.print("Introduzca la opción deseada: ");
            opc = scan.nextInt();

            if (opc!=1 && opc!=2 && opc!=3) {
                System.out.println("Error en la opción. Vuelva a intentarlo");
            }

        } while(opc!=1 && opc!=2 && opc!=3);


        // Cuando salgo del primer do-while, es que se ha seleccionado una opción (1, 2 o 3)
        // Para la opción 1... gestión del login
        if (opc == 1) {
            String userInput = "";
            String passwdInput = "";

            do {
                System.out.print("user:");
                userInput = scan.next();

                System.out.print("passwd:");
                passwdInput = scan.next();


                if (!userInput.equals(userRegistrado) || !passwdInput.equals(passwdRegristrado)) {
                    System.out.println("Credenciales incorrectas");
                }

            } while (!userInput.equals(userRegistrado) || !passwdInput.equals(passwdRegristrado));

            Thread.sleep(1000);
            System.out.print("*****************");
            Thread.sleep(1000);
            System.out.print("**BIENVENID@**");
            Thread.sleep(1000);
            System.out.print("*****************");
            Thread.sleep(1000);


        // Para la opción 2... Gestión de productos
        } else if (opc == 2) {

            String carrito = "\s\s\sCarrito:\n";

            do {

                System.out.print("" +
                        "\n" +
                        "  1. Seguir durmiendo\n" +
                        "  2. Agua\n" +
                        "  3. Café\n" +
                        "  4. Monster\n" +
                        "  0. Salir" +
                        "\n");

                System.out.print("Elija su producto: ");
                opc = scan.nextInt();

                if ( opc == 1) {
                    System.out.println("Ha elegido usted seguir durmiendo");
                    carrito = carrito + "- Seguir durmiendo\n";
                } else if ( opc == 2 ) {
                    System.out.println("Ha elegido usted un agua");
                    carrito = carrito + "- Agua\n";
                } else if ( opc == 3 ) {
                    System.out.println("Ha elegido usted un café");
                    carrito = carrito + "- Café\n";
                } else if ( opc == 4) {
                    System.out.println("Ha elegido usted un Monster");
                    carrito = carrito + "- Monster\n";
                } else if ( opc == 0 ) {
                    System.out.println("Ha elegido salir de la aplicación");
                } else {
                    System.out.println("Error en la opción");
                }

            } while (opc != 0);

            System.out.println(carrito);

        // Opción 3... salir
        } else {
            System.out.print("\nHasta pronto");
        }
    }
}
