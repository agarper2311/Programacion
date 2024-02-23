package com.es.programacion.tema6.proyectoVehiculos.classes.impl;

import com.es.programacion.tema6.proyectoVehiculos.classes.api.Aereo;
import com.es.programacion.tema6.proyectoVehiculos.classes.api.Vehiculo;

/**
 * La clase Helicoptero implementa las interfaces Aereo y Vehiculo, representando un vehículo aéreo
 * con características específicas como matrícula, modelo, número de asientos y número de hélices.
 * Modela las propiedades y comportamientos fundamentales de un helicóptero.
 */
public class Helicoptero implements Aereo, Vehiculo {
    private String matricula;          // La matrícula del helicóptero
    private String modelo;             // El modelo del helicóptero
    private int numeroDeAsientos;      // El número de asientos disponibles en el helicóptero
    private int numeroDeHelices;       // El número de hélices del helicóptero

    /**
     * Constructor de la clase Helicoptero.
     *
     * @param matricula El identificador único del helicóptero.
     * @param modelo El modelo del helicóptero.
     * @param numeroDeAsientos La cantidad de asientos disponibles en el helicóptero.
     * @param numeroDeHelices El número de hélices que tiene el helicóptero.
     */
    public Helicoptero(String matricula, String modelo, int numeroDeAsientos, int numeroDeHelices) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.numeroDeAsientos = numeroDeAsientos;
        this.numeroDeHelices = numeroDeHelices;
    }

    /**
     * Obtiene el número de asientos del helicóptero.
     *
     * @return El número de asientos disponibles en el helicóptero.
     */
    @Override
    public int getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    /**
     * Imprime la información del helicóptero, incluyendo su matrícula, modelo,
     * número de asientos y número de hélices.
     */
    @Override
    public void imprimir() {
        System.out.println("Helicoptero - Matrícula: " + matricula + ", Modelo: " + modelo + ", Número de asientos: " + numeroDeAsientos + ", Número de hélices: " + numeroDeHelices);
    }

    // Métodos getters y setters para las propiedades de la clase Helicoptero.

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
