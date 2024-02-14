package com.es.programacion.tema6.proyectoComida.classes.impl;

import com.es.programacion.tema6.proyectoComida.classes.api.Reganiasion;

public class Parte implements Reganiasion {

    private boolean esGrave;

    public Parte(boolean esGrave){
        this.esGrave = esGrave;
    }

    @Override
    public int reduceEnergia() {
        return esGrave ? 100 : -50;
    }
}
