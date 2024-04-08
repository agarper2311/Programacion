package com.Programacion.Tema4.proyectoDAWBank.clases;

import com.Programacion.Tema4.proyectoDAWBank.CuentaBancaria;
import com.Programacion.Tema4.proyectoDAWBank.utils.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UbriBank {
    public static void main(String[] args) {
        // Variables
        String IBAN;
        String Titular;
        int opcion;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Ingrese el IBAN (debe tener 24 caracteres y letras mayúsculas): ");
            IBAN = scan.nextLine();

            if (!utils.verificarLongitudIBAN(IBAN) || !utils.verificarMayusculasIBAN(IBAN)) {
                System.out.println("Error: IBAN no válido. Inténtelo de nuevo.");
            } else {
                break;
            }
        } while (true);

        System.out.print("Ingrese el titular: ");
        Titular = scan.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(IBAN, Titular);

        do {
            mostrarMenu();
            try {
                opcion = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número entero válido. Inténtelo de nuevo.");
                scan.nextLine();
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    mostrarDatosDeCuenta(cuenta);
                    break;
                case 2:
                    ingresarDinero(scan, cuenta);
                    break;
                case 3:
                    retirarDinero(scan, cuenta);
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

    private static void mostrarDatosDeCuenta(CuentaBancaria cuenta) {
        System.out.println("\nDatos de la Cuenta");
        mostrarIBAN(cuenta);
        mostrarTitular(cuenta);
        mostrarSaldo(cuenta);
    }

    private static void mostrarIBAN(CuentaBancaria cuenta) {
        System.out.println("IBAN: " + cuenta.obtenerIBAN());
    }

    private static void mostrarTitular(CuentaBancaria cuenta) {
        System.out.println("Titular: " + cuenta.obtenerTitular());
    }

    private static void mostrarSaldo(CuentaBancaria cuenta) {
        System.out.println("Saldo: " + cuenta.obtenerSaldo() + " euros");
    }

    private static void ingresarDinero(Scanner scanner, CuentaBancaria cuenta) {
        System.out.print("Ingrese la cantidad a ingresar: ");
        double cantidad = scanner.nextDouble();
        cuenta.ingresarDinero(cantidad);
    }

    private static void retirarDinero(Scanner scanner, CuentaBancaria cuenta) {
        System.out.print("Ingrese la cantidad a retirar: ");
        double cantidad = scanner.nextDouble();
        cuenta.retirarDinero(cantidad);
    }

    private static void mostrarMovimientos(CuentaBancaria cuenta) {
        System.out.println("\nHistorial de Movimientos");
        String[] movimientos = cuenta.obtenerMovimientos();

        if (movimientos == null || movimientos.length == 0) {
            System.out.println("No hay movimientos registrados.");
        } else {
            for (String movimiento : movimientos) {
                if (movimiento != null) {
                    System.out.println(movimiento);
                }
            }
        }
    }
}
