package com.Programacion.Tema4.proyectoUbriBank.clases;
import com.Programacion.Tema4.proyectoUbriBank.cuentaBancaria;

import java.util.ArrayList;
import java.util.Scanner;
public class ubriBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el IBAN: ");
        String iban = scanner.nextLine();

        System.out.print("Ingrese el titular: ");
        String titular = scanner.nextLine();

        cuentaBancaria cuenta = new cuentaBancaria(iban, titular);

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarDatosCuenta(cuenta);
                    break;
                case 2:
                    ingresarDinero(scanner, cuenta);
                    break;
                case 3:
                    retirarDinero(scanner, cuenta);
                    break;
                case 4:
                    mostrarMovimientos(cuenta);
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Error: Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú Principal");
        System.out.println("1. Mostrar Datos de la Cuenta");
        System.out.println("2. Realizar Ingreso");
        System.out.println("3. Realizar Retirada");
        System.out.println("4. Mostrar Movimientos");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void mostrarDatosCuenta(cuentaBancaria cuenta) {
        System.out.println("\nDatos de la Cuenta");
        System.out.println("IBAN: " + cuenta.getIban());
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo: " + cuenta.getSaldo() + " euros");
    }

    private static void ingresarDinero(Scanner scanner, cuentaBancaria cuenta) {
        System.out.print("Ingrese la cantidad a ingresar: ");
        double cantidad = scanner.nextDouble();
        cuenta.ingresar(cantidad);
    }

    private static void retirarDinero(Scanner scanner, cuentaBancaria cuenta) {
        System.out.print("Ingrese la cantidad a retirar: ");
        double cantidad = scanner.nextDouble();
        cuenta.retirar(cantidad);
    }

    private static void mostrarMovimientos(cuentaBancaria cuenta) {
        System.out.println("\nHistorial de Movimientos");
        ArrayList<String> movimientos = cuenta.getMovimientos();
        if (movimientos.isEmpty()) {
            System.out.println("No hay movimientos registrados.");
        } else {
            for (String movimiento : movimientos) {
                System.out.println(movimiento);
            }
        }
    }
}
