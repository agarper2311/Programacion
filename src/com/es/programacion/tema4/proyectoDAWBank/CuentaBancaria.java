package com.Programacion.Tema4.proyectoDAWBank;



public class CuentaBancaria {
    private String IBAN;
    private String Titular;
    private double saldo;
    private String[] movimientos;
    private int indiceMovimientos; // Indice para rastrear el último movimiento

    public CuentaBancaria(String IBAN, String titular) {
        this.IBAN = IBAN;
        this.Titular = titular;
        this.saldo = 0;
        this.movimientos = new String[100];
        this.indiceMovimientos = 0;
    }

    public String obtenerIBAN() {
        return IBAN;
    }

    public String obtenerTitular() {
        return Titular;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public String[] obtenerMovimientos() {
        return movimientos;
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            if (indiceMovimientos < movimientos.length) {
                movimientos[indiceMovimientos] = "Ingreso +" + cantidad + "€";
                indiceMovimientos++;
            } else {
                System.err.println("No hay espacio suficiente para más movimientos.\n");
            }
        }

        if (saldo < -50) {
            System.err.println("AVISO, SALDO NEGATIVO\n");
        }

        if (cantidad > 3000) {
            System.err.println("AVISO: Notificar a hacienda\n");
        }
    }

    public void retirarDinero(double cantidad) {
        if (cantidad > 0) {
            if (saldo - cantidad >= -50) {
                saldo -= cantidad;
                if (indiceMovimientos < movimientos.length) {
                    movimientos[indiceMovimientos] = "Retirada: -" + cantidad + " euros";
                    indiceMovimientos++;
                } else {
                    System.err.println("No hay espacio suficiente para más movimientos.");
                }

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


