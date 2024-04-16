package com.es.programacion.Tema7.proyectoUbriCine.model;

import java.util.Objects;

public class Butaca {
    // Atributos de clase
    private int fila;
    private int asiento;
    private String idUser;

    /**
     * Constructor que recibe por parámetros:
     * @param fila
     * @param asiento
     * @param idUser
     */
    public Butaca(int fila, int asiento, String idUser){
        this.fila = fila;
        this.asiento = asiento;
        this.idUser = idUser;
    }

    // Getters y setters


    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString();
    }

    // Método equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Butaca butaca = (Butaca) o;
        return fila == butaca.fila && asiento == butaca.asiento && Objects.equals(idUser, butaca.idUser);
    }

    // Método hashCode
    @Override
    public int hashCode() {
        return Objects.hash(fila, asiento, idUser);
    }
}
