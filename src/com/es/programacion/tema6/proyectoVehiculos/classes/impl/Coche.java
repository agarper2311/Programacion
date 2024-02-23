package com.es.programacion.tema6.proyectoVehiculos.classes.impl;

import com.es.programacion.tema6.proyectoVehiculos.classes.api.Terrestre;
import com.es.programacion.tema6.proyectoVehiculos.classes.api.Vehiculo;

/**
 * La clase Coche implementa las interfaces Terrestre y Vehiculo, representando un vehículo terrestre
 * con características específicas como matrícula, modelo, número de ruedas y si tiene aire acondicionado.
 * Modela las propiedades y comportamientos fundamentales de un coche.
 */
public class Coche implements Terrestre, Vehiculo {
    private String matricula;            // La matrícula del coche
    private String modelo;               // El modelo del coche
    private int numeroDeRuedas;          // El número de ruedas del coche
    private boolean aireAcondicionado;   // Indica si el coche tiene aire acondicionado

    /**
     * Constructor de la clase Coche.
     *
     * @param matricula El identificador único del coche.
     * @param modelo El modelo del coche.
     * @param numeroDeRuedas La cantidad de ruedas del coche.
     * @param aireAcondicionado Verdadero si el coche está equipado con aire acondicionado; de lo contrario, falso.
     */
    public Coche(String matricula, String modelo, int numeroDeRuedas, boolean aireAcondicionado) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.numeroDeRuedas = numeroDeRuedas;
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * Obtiene el número de ruedas del coche.
     *
     * @return El número de ruedas del coche.
     */
    @Override
    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    /**
     * Imprime la información del coche, incluyendo su matrícula, modelo,
     * número de ruedas y si tiene aire acondicionado.
     */
    @Override
    public void imprimir() {
        System.out.println("Coche - Matrícula: " + matricula + ", Modelo: " + modelo + ", Número de ruedas: " + numeroDeRuedas + ", Aire acondicionado: " + (aireAcondicionado ? "Sí" : "No"));
    }

    // Métodos getters y setters para las propiedades de la clase Coche.

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
