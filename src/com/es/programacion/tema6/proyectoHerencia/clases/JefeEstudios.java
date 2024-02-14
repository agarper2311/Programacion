package com.es.programacion.tema6.proyectoHerencia.clases;

public class JefeEstudios extends Jefe {

    protected String zona;


    public JefeEstudios(String nombre, String dni, String sexo, String despacho, String zona) {
        super(nombre, dni, sexo, despacho);

        this.zona = zona;
    }
}
