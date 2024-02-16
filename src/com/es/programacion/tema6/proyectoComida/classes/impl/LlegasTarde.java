package com.es.programacion.tema6.proyectoComida.classes.impl;

import com.es.programacion.tema6.proyectoComida.classes.api.Reganeta;

public class LlegasTarde implements Reganeta {

    private boolean teQuedasEnLaPuerta;

    public LlegasTarde(boolean teQuedasEnLaPuerta) {
        this.teQuedasEnLaPuerta = teQuedasEnLaPuerta;
    }

    @Override
    public int reduceEnergia() {
        return teQuedasEnLaPuerta ? 10 : -20;
    }
}
