package com.es.programacion.tema6.proyectoVehiculos.classes.impl;

import com.es.programacion.tema6.proyectoVehiculos.classes.api.Terrestre;
import com.es.programacion.tema6.proyectoVehiculos.classes.api.Vehiculo;

public class Coche implements Terrestre, Vehiculo {
    private String matricula;
    private String modelo;
    private int numeroDeRuedas;
    private boolean aireAcondicionado;

    public Coche(String matricula, String modelo, int numeroDeRuedas, boolean aireAcondicionado) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.numeroDeRuedas = numeroDeRuedas;
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    @Override
    public void imprimir() {
        System.out.println("Coche - Matrícula: " + matricula + ", Modelo: " + modelo + ", Número de ruedas: " + numeroDeRuedas + ", Aire acondicionado: " + (aireAcondicionado ? "Sí" : "No"));
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

    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
}
