package com.es.programacion.tema4.proyectoDAWBank;

import com.es.programacion.tema4.proyectoDAWBank.clases.CuentaBancaria;

public class UbriBank {

    public static void main(String[] args) {




        try {

            CuentaBancaria cuenta1 = new CuentaBancaria("ES123", "Diego");

            cuenta1.ingresar(1000);

            cuenta1.retirar(50);

            cuenta1.retirar(5000);

            cuenta1.mostrarMovimientos();


        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
