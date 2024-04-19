package com.es.programacion.tema7.proyectoUbriCine.services.impl;

import com.es.programacion.tema7.proyectoUbriCine.model.Butaca;

import java.io.*;
import java.util.ArrayList;

/**
 * Clase encargada de gestionar el fichero de entradas vendidas del cine.
 */
public class GestionFicheroCine {

    private String rutaArchivoEntradas;

    // Constructor con parámetro
    public GestionFicheroCine(String rutaArchivoEntradas) {
        this.rutaArchivoEntradas = rutaArchivoEntradas;
    }

    // Método para leer las entradas vendidas desde el fichero
    public ArrayList<Butaca> leerEntradas() {
        ArrayList<Butaca> butacas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivoEntradas))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] valores = linea.split(":");
                if (valores.length == 3) {
                    int fila = Integer.parseInt(valores[0]);
                    int asiento = Integer.parseInt(valores[1]);
                    String idUsuario = valores[2];
                    Butaca butaca = new Butaca(fila, asiento, idUsuario);
                    butacas.add(butaca);
                } else {
                    System.err.println("Error en formato: " + linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de butacas: " + e.getMessage());
        }

        return butacas;
    }

    // Método para guardar las entradas vendidas en el fichero
    public void guardarEntradas(ArrayList<Butaca> butacas) {
        try (PrintWriter pw = new PrintWriter(rutaArchivoEntradas)) {
            for (Butaca butaca : butacas) {
                pw.println(butaca.getFila() + ":" + butaca.getAsiento() + ":" + butaca.getIdUsuario());
            }
        } catch (IOException e) {
            System.err.println("Error al guardar las entradas: " + e.getMessage());
        }
    }
}
