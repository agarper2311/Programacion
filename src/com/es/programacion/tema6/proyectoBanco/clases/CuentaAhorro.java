package com.es.programacion.tema6.proyectoBanco.clases;

public class CuentaAhorro extends CuentaBancaria {
    private static final double saldoMinimo = 1000; // Saldo mínimo para aplicar interés especial

    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    public void calcularIntereses() {
        double interes;
        if (saldo < saldoMinimo) {
            interes = saldo * (interesAnualBasico / 2);
        } else {
            interes = saldo * (interesAnualBasico * 2);
        }
        anadir(interes);
    }
}
