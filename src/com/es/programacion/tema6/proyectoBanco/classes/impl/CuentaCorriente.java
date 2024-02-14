package com.es.programacion.tema6.proyectoBanco.classes.impl;

import com.es.programacion.tema6.proyectoBanco.utils.api.GenericUtil;

public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(String iban, GenericUtil util) throws IllegalArgumentException {
        super(iban, util);
    }

    @Override
    public void calcularIntereses() {
        double nuevoSaldo = this.getSaldo() + (this.getSaldo() * (CuentaBancaria.INTERES_ANUAL_BASICO / 100));
        this.setSaldo(nuevoSaldo);
    }
}
