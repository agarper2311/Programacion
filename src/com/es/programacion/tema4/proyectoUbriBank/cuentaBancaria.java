package com.Programacion.Tema4.proyectoUbriBank;

import java.util.ArrayList;

public class cuentaBancaria {
    private final String iban;
    private final String titular;
    private double saldo;
    private final ArrayList <String> movimientos;

    public cuentaBancaria(String iban, String titular) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
        this.movimientos = new ArrayList<>();
    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<String> getMovimientos() {
        return movimientos;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            movimientos.add("Ingreso: +" + cantidad + " euros");
            if (saldo < -50) {
                System.out.println("AVISO: Saldo negativo");
            }
            if (cantidad > 3000) {
                System.out.println("AVISO: Notificar a hacienda");
            }
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (saldo - cantidad >= -50) {
                saldo -= cantidad;
                movimientos.add("Retirada: -" + cantidad + " euros");
                if (saldo < -50) {
                    System.out.println("AVISO: Saldo negativo");
                }
                if (cantidad > 3000) {
                    System.out.println("AVISO: Notificar a hacienda");
                }
            } else {
                System.out.println("Error: Saldo insuficiente para retirar esa cantidad.");
            }
        }
    }
}
