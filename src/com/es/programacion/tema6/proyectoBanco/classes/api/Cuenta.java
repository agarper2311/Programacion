package com.es.programacion.tema6.proyectoBanco.classes.api;

import com.es.programacion.tema6.proyectoBanco.classes.impl.CuentaBancaria;

public interface Cuenta {

    public boolean ingresar(double cantidadIngresar);
    public boolean retirar(double cantidadARetirar);
    public boolean transferir(CuentaBancaria otraCuenta, double cantidadTraspaso);
    public void calcularIntereses();

}
