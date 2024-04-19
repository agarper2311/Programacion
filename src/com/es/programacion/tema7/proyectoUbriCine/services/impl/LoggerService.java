package com.es.programacion.tema7.proyectoUbriCine.services.impl;

import com.es.programacion.tema7.proyectoUbriCine.services.api.BasicLoggerService;

/**
 * Servicio de registro que implementa {@link BasicLoggerService} para ofrecer
 * funcionalidades de registro en un archivo de logs.
 * Se utiliza para registrar eventos como el registro y el inicio de sesión de usuarios.
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase encargada de gestionar el logging de eventos.
 */
public class LoggerService {

    private GestionFicheroLogger gestion;
    private String rutaArchivoLog;

    // Constructor con parámetro
    public LoggerService(String rutaArchivoLog) {
        this.gestion = new GestionFicheroLogger(rutaArchivoLog);
        this.rutaArchivoLog = rutaArchivoLog;
    }

    // Método para registrar un alta de usuario en el log
    public boolean logAlta(String idUser, boolean exitoso) {
        String resultado = exitoso ? "correcta" : "incorrecta";
        String mensaje = String.format("%s;%s;Registro de nuevo usuario;%s", idUser, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd;HH:mm:ss")), resultado);
        return gestion.logMovimiento(mensaje);
    }

    // Método para registrar un inicio de sesión en el log
    public boolean logLogin(String idUser, boolean exitoso) {
        String resultado = exitoso ? "correcta" : "incorrecta";
        String mensaje = String.format("%s;%s;Inicio de sesión;%s", idUser, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd;HH:mm:ss")), resultado);
        return gestion.logMovimiento(mensaje);
    }
}
