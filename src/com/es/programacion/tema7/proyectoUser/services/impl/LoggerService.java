package com.es.programacion.tema7.proyectoUser.services.impl;

import com.es.programacion.tema7.proyectoUser.services.api.BasicLoggerService;

/**
 * Servicio de registro que implementa {@link BasicLoggerService} para ofrecer
 * funcionalidades de registro en un archivo de logs.
 * Se utiliza para registrar eventos como el registro y el inicio de sesión de usuarios.
 */
public class LoggerService implements BasicLoggerService {

    private GestionFicheroLogger gestion;

    /**
     * Construye una instancia de LoggerService con una nueva instancia de GestionFicheroLogger.
     */
    public LoggerService() {
        this.gestion = new GestionFicheroLogger("src/main/resources/archivosTema7/Users/Logs/logs.txt");
    }

    /**
     * Construye una instancia de LoggerService con una instancia específica de GestionFicheroLogger.
     * Permite la inyección de dependencias para facilitar la prueba y configuración.
     *
     * @param gestion Instancia de GestionFicheroLogger para manejar operaciones de archivo.
     */
    public LoggerService(GestionFicheroLogger gestion) {
        this.gestion = gestion;
    }

    @Override
    public boolean logAlta(String idUser) {
        // Implementación del registro de alta de usuario
        return false;
    }

    @Override
    public boolean logLogin(String idUser) {
        // Implementación del registro de inicio de sesión de usuario
        return false;
    }

    @Override
    public void anadirFicheroLogger(String mensaje) {
        // Uso de GestionFicheroLogger para añadir el mensaje al archivo de logs
        this.gestion.anadirFicheroLog(mensaje, "src/main/resources/archivosTema7/Users/Logs/logs.txt");
    }
}
