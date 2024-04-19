package com.es.programacion.tema7.proyectoUbriCine.model;

/**
 * Clase que representa una butaca en el cine.
 */
public class Butaca {

    private int fila;
    private int asiento;
    private String idUsuario;

    // Constructor con parámetros
    public Butaca(int fila, int asiento, String idUsuario) {
        this.fila = fila;
        this.asiento = asiento;
        this.idUsuario = idUsuario;
    }

    // Método para obtener la fila
    public int getFila() {
        return fila;
    }

    // Método para obtener el asiento
    public int getAsiento() {
        return asiento;
    }

    // Método para obtener el ID del usuario
    public String getIdUsuario() {
        return idUsuario;
    }

    // Método para representar la butaca como una cadena de texto
    @Override
    public String toString() {
        return "Butaca{" +
                "fila=" + fila +
                ", asiento=" + asiento +
                ", idUsuario='" + idUsuario + '\'' +
                '}';
    }

    // Método para comparar dos butacas
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Butaca butaca = (Butaca) o;

        if (fila != butaca.fila) return false;
        return asiento == butaca.asiento;
    }
}
