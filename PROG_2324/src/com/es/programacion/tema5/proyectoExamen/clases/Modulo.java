package com.es.programacion.tema5.proyectoExamen.clases;

public class Modulo {

    private String nombre;
    private int horas;

    public Modulo(String nombre, int horas) {
        this.nombre = nombre;
        setHoras(horas);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {

        if(horas >= 0) {
            this.horas = horas;
        }

    }
}
