package com.es.programacion.tema6.proyectoVehiculos.classes.impl;

import com.es.programacion.tema6.proyectoVehiculos.classes.api.Acuatico;
import com.es.programacion.tema6.proyectoVehiculos.classes.api.Vehiculo;

public class Barco implements Acuatico, Vehiculo {
    private String matricula;
    private String modelo;
    private int eslora;
    private boolean tieneMotor;

    public Barco(String matricula, String modelo, int eslora, boolean tieneMotor) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.eslora = eslora;
        this.tieneMotor = tieneMotor;
    }

    @Override
    public int getEslora() {
        return eslora;
    }

    @Override
    public void imprimir() {
        System.out.println("Barco - Matrícula: " + matricula + ", Modelo: " + modelo + ", Eslora: " + eslora + ", Tiene motor: " + tieneMotor);
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

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public boolean isTieneMotor() {
        return tieneMotor;
    }

    public void setTieneMotor(boolean tieneMotor) {
        this.tieneMotor = tieneMotor;
    }
}

