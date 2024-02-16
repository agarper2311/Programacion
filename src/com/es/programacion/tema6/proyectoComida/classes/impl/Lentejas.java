package com.es.programacion.tema6.proyectoComida.classes.impl;

import com.es.programacion.tema6.proyectoComida.classes.api.Comida;

public class Lentejas implements Comida {

    private boolean lasQuieres;

    public Lentejas(boolean lasQuieres) {
        this.lasQuieres = lasQuieres;
    }

    @Override
    public int addNutricion() {
        if(lasQuieres) {
            System.out.println("y te dan +15 de energia y +10 de hierro");
            return 25;
        } else {
            System.out.println("pero... las dejas");
            return 0;
        }
    }
}
