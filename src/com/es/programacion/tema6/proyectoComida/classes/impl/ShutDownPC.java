package com.es.programacion.tema6.proyectoComida.classes.impl;

import com.es.programacion.tema6.proyectoComida.classes.api.Reganiasion;

public class ShutDownPC implements Reganiasion {


    @Override
    public int reduceEnergia() {
        return -20;
    }
}
