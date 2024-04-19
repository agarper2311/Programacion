package com.es.programacion.tema7.proyectoUbriCine.model;

import java.util.ArrayList;

/**
 * Clase que representa un cine con su nombre, matriz de asientos y entradas vendidas.
 */
public class Cine {

    private String nombreCine;
    private String[][] asientosSala;
    private ArrayList<Butaca> entradasVendidas;

    // Constructor con parámetros
    public Cine(String nombreCine, String[][] asientosSala, ArrayList<Butaca> entradasVendidas) {
        this.nombreCine = nombreCine;
        this.asientosSala = asientosSala;
        this.entradasVendidas = entradasVendidas;
    }

    // Método para obtener el nombre del cine
    public String getNombreCine() {
        return nombreCine;
    }

    // Método para obtener la matriz de asientos
    public String[][] getAsientosSala() {
        return asientosSala;
    }

    // Método para obtener las entradas vendidas
    public ArrayList<Butaca> getEntradasVendidas() {
        return entradasVendidas;
    }

    // Método para representar el cine como una cadena de texto
    @Override
    public String toString() {
        return "Cine{" +
                "nombreCine='" + nombreCine + '\'' +
                ", asientosSala=" + asientosSala +
                ", entradasVendidas=" + entradasVendidas +
                '}';
    }
}

