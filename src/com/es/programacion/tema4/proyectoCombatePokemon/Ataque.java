package com.Programacion.Tema4.proyectoCombatePokemon;

public class Ataque {
    private String nombre;
    private Tipo tipo;
    private int potencia;

    public Ataque(String nombre, Tipo tipo, int potencia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getPotencia() {
        return potencia;
    }
}