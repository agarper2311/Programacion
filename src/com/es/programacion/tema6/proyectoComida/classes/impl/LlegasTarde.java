package com.es.programacion.tema6.proyectoComida.classes.impl;

import com.es.programacion.tema6.proyectoComida.classes.api.Reganiasion;

public class LlegasTarde implements Reganiasion {

    private boolean teQuedasEnLaPuerta;

    public LlegasTarde(boolean teQuedasEnLaPuerta){
        this.teQuedasEnLaPuerta = teQuedasEnLaPuerta;
    }

    @Override
    public int reduceEnergia() {
        return teQuedasEnLaPuerta ? 10 : -20;
    }
}
