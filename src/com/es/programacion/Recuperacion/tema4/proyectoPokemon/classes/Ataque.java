package com.es.programacion.Recuperacion.tema4.proyectoPokemon.classes;

public class Ataque {
    public String nombre;
    public Tipo tipo;
    public int danio;
    public double recVida;

    public Ataque (String nombre, Tipo tipo, int danio, int recVida){


        this.danio = danio;
        this.nombre = nombre;
        this.tipo = tipo;
        this.recVida = recVida;

    }
}
