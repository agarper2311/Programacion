package com.es.programacion.tema6.proyectoVehiculos.classes.impl;

import com.es.programacion.tema6.proyectoVehiculos.classes.api.Aereo;
import com.es.programacion.tema6.proyectoVehiculos.classes.api.Vehiculo;

/**
 * La clase Avion implementa las interfaces Aereo y Vehiculo, representando un vehículo aéreo
 * con características específicas como matrícula, modelo, número de asientos y tiempo máximo de vuelo.
 */
public class Avion implements Aereo, Vehiculo {
    private String matricula;           // La matrícula del avión
    private String modelo;              // El modelo del avión
    private int numeroDeAsientos;       // El número de asientos disponibles en el avión
    private int tiempoMaximoDeVuelo;    // El tiempo máximo de vuelo del avión en horas

    /**
     * Constructor de la clase Avion.
     *
     * @param matricula El identificador único del avión.
     * @param modelo El modelo del avión.
     * @param numeroDeAsientos La cantidad de asientos disponibles en el avión.
     * @param tiempoMaximoDeVuelo El tiempo máximo que el avión puede volar sin necesidad de reabastecimiento.
     */
    public Avion(String matricula, String modelo, int numeroDeAsientos, int tiempoMaximoDeVuelo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.numeroDeAsientos = numeroDeAsientos;
        this.tiempoMaximoDeVuelo = tiempoMaximoDeVuelo;
    }

    /**
     * Obtiene el número de asientos del avión.
     *
     * @return El número de asientos disponibles en el avión.
     */
    @Override
    public int getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    /**
     * Imprime la información del avión, incluyendo su matrícula, modelo,
     * número de asientos y tiempo máximo de vuelo.
     */
    @Override
    public void imprimir() {
        System.out.println("Avion - Matrícula: " + matricula + ", Modelo: " + modelo + ", Número de asientos: " + numeroDeAsientos + ", Tiempo máximo de vuelo: " + tiempoMaximoDeVuelo + " horas");
    }

    // Métodos getters y setters para las propiedades de la clase Avion.

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
