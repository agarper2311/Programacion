package com.es.programacion.tema6.proyectoBanco;

import com.es.programacion.tema6.proyectoBanco.clases.CuentaAhorro;
import com.es.programacion.tema6.proyectoBanco.clases.CuentaBancaria;
import com.es.programacion.tema6.proyectoBanco.clases.CuentaCorriente;

import java.util.ArrayList;


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
    }
}

