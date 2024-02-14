package com.es.programacion.tema6.proyectoHerencia.clases;

public class Jefe extends PersonaH{

    protected String despacho;

    public Jefe(String nombre, String dni, String sexo, String despacho) {
        super(nombre, dni, sexo);

        this.despacho = despacho;
    }
}
