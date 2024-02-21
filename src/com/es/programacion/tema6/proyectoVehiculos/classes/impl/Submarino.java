package com.es.programacion.tema6.proyectoVehiculos.classes.impl;

import com.es.programacion.tema6.proyectoVehiculos.classes.api.Acuatico;
import com.es.programacion.tema6.proyectoVehiculos.classes.api.Vehiculo;

public class Submarino implements Acuatico, Vehiculo {
    private String matricula;
    private String modelo;
    private int eslora;
    private int profundidadMaxima;

    public Submarino(String matricula, String modelo, int eslora, int profundidadMaxima) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.eslora = eslora;
        this.profundidadMaxima = profundidadMaxima;
    }

    @Override
    public int getEslora() {
        return eslora;
    }

    @Override
    public void imprimir() {
        System.out.println("Submarino - Matrícula: " + matricula + ", Modelo: " + modelo + ", Eslora: " + eslora + ", Profundidad máxima: " + profundidadMaxima);
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

    public int getProfundidadMaxima() {
        return profundidadMaxima;
    }

    public void setProfundidadMaxima(int profundidadMaxima) {
        this.profundidadMaxima = profundidadMaxima;
    }
}

