package com.es.programacion.tema6.proyectoHerencia.clases;

public class Director extends Jefe {

    protected String asistente;


    public Director(String nombre, String dni, String sexo, String despacho, String asistente) {
        super(nombre, dni, sexo, despacho);

        this.asistente = asistente;
    }
}
