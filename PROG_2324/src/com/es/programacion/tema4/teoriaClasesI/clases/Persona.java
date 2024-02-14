package com.es.programacion.tema4.teoriaClasesI.clases;

public class Persona {

    public String nombre, apellidos;
    public String nacionalidad;
    public int edad;

    public void establecerDatosPersona(String nombreAPoner, String apellidosAPoner,
                                       String nacionalidadAPoner, int edadAPoner) {
        this.nombre = nombreAPoner;
        this.apellidos = apellidosAPoner;
        this.nacionalidad = nacionalidadAPoner;
        this.edad = edadAPoner;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es "
                +this.nombre+" "
                +this.apellidos+" y tengo "+this.edad+" anios");
    }
}
