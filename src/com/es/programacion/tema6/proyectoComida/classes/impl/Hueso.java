package com.es.programacion.tema6.proyectoComida.classes.impl;

import com.es.programacion.tema6.proyectoComida.classes.api.Comida;

public class Hueso implements Comida {

    private int cantEnergia = 5;
    @Override
    public int addNutricion() {
        System.out.println("Te doy 5 de energia");
        return this.cantEnergia;
    }
}
