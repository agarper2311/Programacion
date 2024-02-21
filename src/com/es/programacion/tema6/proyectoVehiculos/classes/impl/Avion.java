package com.es.programacion.tema6.proyectoVehiculos.classes.impl;

import com.es.programacion.tema6.proyectoVehiculos.classes.api.Aereo;
import com.es.programacion.tema6.proyectoVehiculos.classes.api.Vehiculo;

public class Avion implements Aereo, Vehiculo {
    private String matricula;
    private String modelo;
    private int numeroDeAsientos;
    private int tiempoMaximoDeVuelo;

    public Avion(String matricula, String modelo, int numeroDeAsientos, int tiempoMaximoDeVuelo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.numeroDeAsientos = numeroDeAsientos;
        this.tiempoMaximoDeVuelo = tiempoMaximoDeVuelo;
    }

    @Override
    public int getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    @Override
    public void imprimir() {
        System.out.println("Avion - Matrícula: " + matricula + ", Modelo: " + modelo + ", Número de asientos: " + numeroDeAsientos + ", Tiempo máximo de vuelo: " + tiempoMaximoDeVuelo + " horas");
    }

    // Getters y setters


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumeroDeAsientos(int numeroDeAsientos) {
        this.numeroDeAsientos = numeroDeAsientos;
    }

    public int getTiempoMaximoDeVuelo() {
        return tiempoMaximoDeVuelo;
    }

    public void setTiempoMaximoDeVuelo(int tiempoMaximoDeVuelo) {
        this.tiempoMaximoDeVuelo = tiempoMaximoDeVuelo;
    }
}
