package com.Programacion.Tema5.proyectoSeneca;

public class Modulo {

    private String nombre;
    private int horas;


    // Constructor
    public Modulo(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = Math.max(horas, 0); // Nos aseguramos de que las horas no sean negativas
    }


    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getHoras() { return horas; }
    public void setHoras(int horas) { this.horas = Math.max(horas, 0); }
}

