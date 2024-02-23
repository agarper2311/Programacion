package com.es.programacion.tema6.proyectoVehiculos.classes.impl;

import com.es.programacion.tema6.proyectoVehiculos.classes.api.Terrestre;
import com.es.programacion.tema6.proyectoVehiculos.classes.api.Vehiculo;

/**
 * La clase Moto implementa las interfaces Terrestre y Vehiculo, representando un vehículo terrestre
 * con características específicas como matrícula, modelo, número de ruedas y color.
 * Modela las propiedades y comportamientos fundamentales de una moto.
 */
public class Moto implements Terrestre, Vehiculo {
    private String matricula;         // La matrícula de la moto
    private String modelo;            // El modelo de la moto
    private int numeroDeRuedas;       // El número de ruedas de la moto
    private String color;             // El color de la moto

    /**
     * Constructor de la clase Moto.
     *
     * @param matricula El identificador único de la moto.
     * @param modelo El modelo de la moto.
     * @param numeroDeRuedas La cantidad de ruedas de la moto.
     * @param color El color de la moto.
     */
    public Moto(String matricula, String modelo, int numeroDeRuedas, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.numeroDeRuedas = numeroDeRuedas;
        this.color = color;
    }

    /**
     * Obtiene el número de ruedas de la moto.
     *
     * @return El número de ruedas de la moto.
     */
    @Override
    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    /**
     * Imprime la información de la moto, incluyendo su matrícula, modelo,
     * número de ruedas y color.
     */
    @Override
    public void imprimir() {
        System.out.println("Moto - Matrícula: " + matricula + ", Modelo: " + modelo + ", Número de ruedas: " + numeroDeRuedas + ", Color: " + color);
    }

    // Métodos getters y setters para las propiedades de la clase Moto.

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
