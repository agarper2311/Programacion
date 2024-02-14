package com.es.programacion.tema6.proyectoBanco.classes.impl;

import com.es.programacion.tema6.proyectoBanco.utils.api.GenericUtil;

public class CuentaAhorro extends CuentaBancaria {

    public static final double SALDO_MINIMO = 2000;

    public CuentaAhorro(String iban, GenericUtil util) throws IllegalArgumentException {
        super(iban, util);
    }

    @Override
    public void calcularIntereses() {

        double saldo = this.getSaldo();
        double nuevoInteresAnual = CuentaBancaria.INTERES_ANUAL_BASICO;

        if(saldo < CuentaAhorro.SALDO_MINIMO) {
            nuevoInteresAnual /= 2;
        } else {
            nuevoInteresAnual *= 2;
        }

        double nuevoSaldo = saldo + (saldo * (nuevoInteresAnual / 100));
        this.setSaldo(nuevoSaldo);
    }
}
