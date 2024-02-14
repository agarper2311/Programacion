package com.es.programacion.tema4.proyectoDAWBank.clases;

import com.es.programacion.tema4.proyectoDAWBank.utils.CuentaUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CuentaBancaria {

    private String iban;
    private double saldo;
    private String titular;
    private String[] movimientos;

    public CuentaBancaria(String iban, String titular) throws Exception {
        this.saldo = 0.0;
        this.movimientos = new String[100];
        Arrays.fill(this.movimientos, "");


        // FALTAN POR "SETEAR" EL IBAN Y EL TITULAR
        if(CuentaUtils.checkCuenta(iban)) {
            this.iban = iban;
            this.titular = titular;
        } else {
            throw new Exception("IBAN incorrecto");
        }



    }

    // MÉTODOS DE CLASE
    public void ingresar(double cantidadIngreso) throws Exception {

        // Comprobamos primer que la cantidad a ingresar es positiva
        if (cantidadIngreso < 0) {
            throw new Exception("La cantidad no puede ser negativa");
        } else {

            if(cantidadIngreso > 3000) {
                System.out.println("AVISO: Aviso a hacienda");
            }
            this.saldo += cantidadIngreso;
            registrarMovimiento("IN");
        }

    }

    public void retirar(double cantidadARetirar) throws Exception {

        if (cantidadARetirar < 0) {
            throw new Exception("La cantidad no puede ser negativa");
        } else {

            double saldoResultante = this.saldo - cantidadARetirar;
            if(saldoResultante < -50) {
                System.err.println("No se puede realizar la retirada");
            } else {
                if(cantidadARetirar > 3000) {
                    System.out.println("AVISO: Aviso a hacienda");
                }
                this.saldo -= cantidadARetirar;
                registrarMovimiento("RE");
            }
        }

    }

    public void mostrarDatosCuenta() {

    }

    public void mostrarIban() {

    }

    public void mostrarTitular() {

    }

    public void mostrarSaldo() {

    }

    public void mostrarMovimientos() {

        System.out.print("[");
        for(String movimiento : this.movimientos) {

            if(movimiento.equals("")){
                break;
            }

            System.out.print(movimiento+", ");
        }
        System.out.println("]");

    }

    /**
     * Método para registrar un movimiento nuevo dentro del array de movimientos
     * @param tipoMovimiento (String) tipo de movimiento realizado ("IN" -> Ingreso. "RE" -> Retirada)
     */
    private void registrarMovimiento(String tipoMovimiento) {

        for(int i=0; i<= this.movimientos.length-1; i++) {
            if(this.movimientos[i].equals("")) {
                this.movimientos[i] = tipoMovimiento+i;
                break;
            }
        }
    }


}
