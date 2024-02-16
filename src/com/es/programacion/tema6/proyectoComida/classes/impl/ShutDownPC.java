package com.es.programacion.tema6.proyectoComida.classes.impl;

import com.es.programacion.tema6.proyectoComida.classes.api.Reganeta;

public class ShutDownPC implements Reganeta {
    @Override
    public int reduceEnergia() {
        return -20;
    }
}
