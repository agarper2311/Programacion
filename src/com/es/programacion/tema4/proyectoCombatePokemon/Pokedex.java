package com.Programacion.Tema4.proyectoCombatePokemon;

import java.util.Arrays;

public class Pokedex {
    private String[] tiposEfectivos;

    public Pokedex(String[] tiposEfectivos) {
        this.tiposEfectivos = tiposEfectivos;
    }

    public String checkEfectividad(Tipo ataqueTipo, Tipo defensorTipo) {
        if (Arrays.asList(tiposEfectivos).contains(ataqueTipo.getNombre())) {
            if (Arrays.asList(tiposEfectivos).contains(defensorTipo.getNombre())) {
                return "No es muy efectivo";
            } else {
                return "Super efectivo";
            }
        } else {
            if (Arrays.asList(tiposEfectivos).contains(defensorTipo.getNombre())) {
                return "No efectivo";
            } else {
                return "Neutral";
            }
        }
    }
}
