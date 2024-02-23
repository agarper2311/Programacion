package com.es.programacion.tema6.proyectoVehiculos.classes.impl;

import com.es.programacion.tema6.proyectoVehiculos.classes.api.Acuatico;
import com.es.programacion.tema6.proyectoVehiculos.classes.api.Vehiculo;

/**
 * La clase Submarino implementa las interfaces Acuatico y Vehiculo, representando un vehículo acuático
 * con características específicas como matrícula, modelo, eslora y profundidad máxima de inmersión.
 * Modela las propiedades y comportamientos fundamentales de un submarino.
 */
public class Submarino implements Acuatico, Vehiculo {
    private String matricula;          // La matrícula del submarino
    private String modelo;             // El modelo del submarino
    private int eslora;                // La eslora del submarino en metros
    private int profundidadMaxima;     // La profundidad máxima a la que puede sumergirse el submarino

    /**
     * Constructor de la clase Submarino.
     *
     * @param matricula El identificador único del submarino.
     * @param modelo El modelo del submarino.
     * @param eslora La longitud del submarino desde la proa hasta la popa en metros.
     * @param profundidadMaxima La profundidad máxima a la que el submarino puede operar.
     */
    public Submarino(String matricula, String modelo, int eslora, int profundidadMaxima) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.eslora = eslora;
        this.profundidadMaxima = profundidadMaxima;
    }

    /**
     * Obtiene la eslora del submarino.
     *
     * @return La eslora del submarino en metros.
     */
    @Override
    public int getEslora() {
        return eslora;
    }

    /**
     * Imprime la información del submarino, incluyendo su matrícula, modelo,
     * eslora y la profundidad máxima a la que puede sumergirse.
     */
    @Override
    public void imprimir() {
        System.out.println("Submarino - Matrícula: " + matricula + ", Modelo: " + modelo + ", Eslora: " + eslora + " metros, Profundidad máxima: " + profundidadMaxima + " metros");
    }

    // Métodos getters y setters para las propiedades de la clase Submarino.

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
