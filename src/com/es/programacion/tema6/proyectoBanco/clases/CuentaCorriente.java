package com.es.programacion.tema6.proyectoBanco.clases;

public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    public void calcularIntereses() {
        double intereses = saldo * interesAnualBasico;
        anadir(intereses);
    }
}
