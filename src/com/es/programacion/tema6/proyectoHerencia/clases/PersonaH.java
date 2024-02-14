package com.es.programacion.tema6.proyectoHerencia.clases;

public class PersonaH {

    protected String nombre;
    protected String dni;
    protected String sexo;

    public PersonaH(String nombre, String dni, String sexo) {

        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
