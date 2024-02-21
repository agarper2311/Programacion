package com.es.programacion.tema6.proyectoVehiculos.classes.impl;

import com.es.programacion.tema6.proyectoVehiculos.classes.api.Aereo;
import com.es.programacion.tema6.proyectoVehiculos.classes.api.Vehiculo;

public class Helicoptero implements Aereo, Vehiculo {
    private String matricula;
    private String modelo;
    private int numeroDeAsientos;
    private int numeroDeHelices;

    public Helicoptero(String matricula, String modelo, int numeroDeAsientos, int numeroDeHelices) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.numeroDeAsientos = numeroDeAsientos;
        this.numeroDeHelices = numeroDeHelices;
    }

    @Override
    public int getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    @Override
    public void imprimir() {
        System.out.println("Helicoptero - Matrícula: " + matricula + ", Modelo: " + modelo + ", Número de asientos: " + numeroDeAsientos + ", Número de hélices: " + numeroDeHelices);
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

    public int getNumeroDeHelices() {
        return numeroDeHelices;
    }

    public void setNumeroDeHelices(int numeroDeHelices) {
        this.numeroDeHelices = numeroDeHelices;
    }
}
