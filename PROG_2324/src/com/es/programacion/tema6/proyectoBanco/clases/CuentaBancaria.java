package com.es.programacion.tema6.proyectoBanco.clases;

public abstract class CuentaBancaria {
    protected String iban;
    protected double saldo;
    protected static final double interesAnualBasico = 0.02; // 2% de interés anual básico

    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public String consultarIban() {
        return iban;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void ingresarDinero(double cantidad) {
        anadir(cantidad);
    }

    public void retirarDinero(double cantidad) {
        anadir(-cantidad);
    }

    public void traspasarDinero(CuentaBancaria cuentaDestino, double cantidad) {
        if (this.saldo >= cantidad) {
            this.retirarDinero(cantidad);
            cuentaDestino.ingresarDinero(cantidad);
        } else {
            System.out.println("Saldo insuficiente para realizar el traspaso.");
        }
    }

    void anadir(double cantidad) {
        saldo += cantidad;
    }

    public abstract void calcularIntereses();

    public void mostrarDatos() {
        System.out.println("IBAN: " + iban + ", Saldo: " + saldo);
    }

    public static String getIban() {

        return getIban();
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

