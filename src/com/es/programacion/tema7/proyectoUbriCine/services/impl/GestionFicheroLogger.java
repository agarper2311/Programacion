package com.es.programacion.tema7.proyectoUbriCine.services.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase encargada de gestionar el fichero de log de movimientos.
 */
public class GestionFicheroLogger {

    private String rutaArchivoLog;

    // Constructor con parámetro
    public GestionFicheroLogger(String rutaArchivoLog) {
        this.rutaArchivoLog = rutaArchivoLog;
    }

    // Método para añadir un mensaje al log de movimientos
    public boolean logMovimiento(String mensaje) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaArchivoLog, true))) {
            pw.println(mensaje);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
