package com.Programacion.Tema4.proyectoCombatePokemon;

import java.util.ArrayList;
import java.util.Random;

public class Jugador {

    private String nombre;
    private ArrayList<Pokemon> equipo;

    public Jugador(String nombre) {
        this.nombre = nombre;
        equipo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pokemon> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Pokemon> equipo) {
        this.equipo = equipo;
    }

    public void agregarPokemon(Pokemon pokemon) {
        equipo.add(pokemon);
    }

    public void eliminarPokemon(Pokemon pokemon) {
        equipo.remove(pokemon);
    }

    public Pokemon elegirPokemon() {
        return equipo.get(new Random().nextInt(equipo.size()));
    }
}

