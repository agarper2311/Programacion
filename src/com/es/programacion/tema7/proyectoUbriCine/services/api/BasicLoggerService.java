package com.es.programacion.tema7.proyectoUbriCine.services.api;

/**
 * Servicio básico de registro para actividades de usuarios.
 * Permite registrar eventos como el registro de nuevos usuarios y sus inicios de sesión.
 */
public interface BasicLoggerService {

    /**
     * Registra el evento de creación de un nuevo usuario.
     *
     * @param idUser ID del usuario creado.
     * @param isSuccess Indica si el registro fue exitoso.
     * @return true si el registro en el log ha sido completado con éxito, de lo contrario false.
     */
    boolean logAlta(String idUser, boolean isSuccess);

    /**
     * Registra el evento de inicio de sesión de un usuario.
     *
     * @param idUser id del usuario que inicia sesión.
     * @param isSuccess Indica si el inicio de sesión fue exitoso.
     * @return true si el registro en el log ha sido exitoso, de lo contrario false.
     */
    boolean logLogin(String idUser, boolean isSuccess);

    /**
     * Añade un mensaje al fichero de registro.
     *
     * @param mensaje Mensaje a registrar en el archivo de logs.
     */
    void anadirMensajeLog(String mensaje);
}
