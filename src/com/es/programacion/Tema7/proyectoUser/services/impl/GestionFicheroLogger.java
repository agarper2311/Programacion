package com.es.programacion.Tema7.proyectoUser.services.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase que proporciona funcionalidades de registro en un archivo.
 * Permite añadir mensajes de log a un archivo especificado.
 */
public class GestionFicheroLogger {

    private final String rutaArchivo;

    /**
     * Crea una instancia de GestionFicheroLogger con la ruta especificada para el archivo de logs.
     *
     * @param rutaArchivo la ruta al archivo donde se escribirán los logs.
     */
    public GestionFicheroLogger(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    /**
     * Añade un mensaje de log al archivo configurado.
     *
     * @param mensaje el mensaje a registrar en el archivo de logs.
     * @param s
     */
    public void anadirFicheroLog(String mensaje, String s) {
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            bf.write(mensaje);
            bf.newLine(); // Asegura que cada mensaje de log esté en una nueva línea.
        } catch (IOException e) {
            // Aquí manejamos la excepción, con un mensaje de error.
            System.err.println("Error al escribir en el archivo de log: " + e.getMessage());
        }
    }
}
