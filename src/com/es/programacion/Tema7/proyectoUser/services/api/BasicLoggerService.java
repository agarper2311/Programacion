package com.es.programacion.Tema7.proyectoUser.services.api;

import com.es.programacion.tema7.proyectoUser.model.User;

public interface BasicLoggerService {

    public boolean logAlta(String idUser);
    public boolean logLogin(String idUser);
    public void anadirFicheroLogger(String mensaje);


}