package com.es.programacion.tema6.proyectoVehiculos.classes.impl;

import com.es.programacion.tema6.proyectoVehiculos.classes.api.Acuatico;
import com.es.programacion.tema6.proyectoVehiculos.classes.api.Vehiculo;

/**
 * La clase Barco implementa las interfaces Acuatico y Vehiculo, representando un vehículo acuático
 * con características específicas como matrícula, modelo, eslora y si tiene motor.
 * Modela las propiedades y comportamientos fundamentales de un barco.
 */
public class Barco implements Acuatico, Vehiculo {
    private String matricula;   // La matrícula del barco
    private String modelo;      // El modelo del barco
    private int eslora;         // La eslora del barco en metros
    private boolean tieneMotor; // Indica si el barco tiene motor

    /**
     * Constructor de la clase Barco.
     *
     * @param matricula El identificador único del barco.
     * @param modelo El modelo del barco.
     * @param eslora La longitud del barco desde la proa hasta la popa en metros.
     * @param tieneMotor Verdadero si el barco está equipado con un motor; de lo contrario, falso.
     */
    public Barco(String matricula, String modelo, int eslora, boolean tieneMotor) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.eslora = eslora;
        this.tieneMotor = tieneMotor;
    }

    /**
     * Obtiene la eslora del barco.
     *
     * @return La eslora del barco en metros.
     */
    @Override
    public int getEslora() {
        return eslora;
    }

    /**
     * Imprime la información del barco, incluyendo su matrícula, modelo,
     * eslora y si tiene motor.
     */
    @Override
    public void imprimir() {
        System.out.println("Barco - Matrícula: " + matricula + ", Modelo: " + modelo + ", Eslora: " + eslora + " metros, Tiene motor: " + tieneMotor);
    }

    // Métodos getters y setters para las propiedades de la clase Barco.

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
