package com.es.programacion.tema7.proyectoUser.services.api;

/**
 * Servicio básico de registro para actividades de usuarios
 */
public interface BasicLoggerService {

    /**
     * Registra el evento de creación de un nuevo usuario
     *
     * @param idUser idUser es el ID del usuario creado
     * @return true si el registro ha sido completado con exito,
     * de lo contrario nos daría false
     */

     boolean logAlta(String idUser);

    /**
     * Registra el evento de inicio de sesión de un usuario
     * @param idUser idUser es el ID del usuario que inicia sesión
     * @return true si el registro ha sido exitoso, de lo contrario
     * sería false
     */
     boolean logLogin(String idUser);

    /**
     * Añade un mensaje al fichero de registro
     * @param mensaje
     */
     void anadirFicheroLogger(String mensaje);


     //**************************************\\
    //                NOTA                    \\
    //-----------------------------------------\\
    /**
     *  Al ser una interfaz no es necesario
     *  especificar el modificador de acceso
     *  (public, private, protected)
     */



}