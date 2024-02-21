package com.es.programacion.tema6.proyectoVehiculos.classes.impl;

import com.es.programacion.tema6.proyectoVehiculos.classes.api.Terrestre;
import com.es.programacion.tema6.proyectoVehiculos.classes.api.Vehiculo;

public class Moto implements Terrestre, Vehiculo {
    private String matricula;
    private String modelo;
    private int numeroDeRuedas;
    private String color;

    public Moto(String matricula, String modelo, int numeroDeRuedas, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.numeroDeRuedas = numeroDeRuedas;
        this.color = color;
    }

    @Override
    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    @Override
    public void imprimir() {
        System.out.println("Moto - Matrícula: " + matricula + ", Modelo: " + modelo + ", Número de ruedas: " + numeroDeRuedas + ", Color: " + color);
    }

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

    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

