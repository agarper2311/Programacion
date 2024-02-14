package com.es.programacion.tema6.proyectoBanco;

import com.es.programacion.tema6.proyectoBanco.clases.CuentaAhorro;
import com.es.programacion.tema6.proyectoBanco.clases.CuentaBancaria;
import com.es.programacion.tema6.proyectoBanco.clases.CuentaCorriente;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
        cuentas.add(new CuentaCorriente("ES7620770024003102575766", 1500));
        cuentas.add(new CuentaAhorro("ES9420805801101234567891", 3000));

        // Mostrar datos, realizar operaciones y calcular intereses
        for (CuentaBancaria cuenta : cuentas) {
            cuenta.mostrarDatos();
        }

        cuentas.get(0).ingresarDinero(500);
        cuentas.get(1).retirarDinero(1000);
        cuentas.get(0).traspasarDinero(cuentas.get(1), 1000);

        for (CuentaBancaria cuenta : cuentas) {
            cuenta.calcularIntereses();
            cuenta.mostrarDatos();
        }

        Scanner scan = new Scanner(System.in);
        int opc;
        do {

            System.out.println("Bienvenido/a al Banco");
            System.out.println("\t1. Ingresar dinero a su cuenta.");
            System.out.println("\t2. Retirar dinero de su cuenta.");
            System.out.println("\t3. Traspasar dinero de una cuenta a otra");
            System.out.println("Introduzca su opción: ");
            opc = scan.nextInt();


            switch (opc) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;
            }
        } while (opc != 0);


    }
}

