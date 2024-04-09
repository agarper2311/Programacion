package com.es.programacion.Tema7.proyectoUser.services.impl;

import com.es.programacion.tema7.proyectoUser.services.api.BasicLoggerService;

public class LoggerService implements BasicLoggerService {

    private GestionFicheroLogger gestion;

    public LoggerService() {
        this.gestion = new GestionFicheroLogger();
    }

    public LoggerService(GestionFicheroLogger gestion) {
        this.gestion = gestion;
    }

    @Override
    public boolean logAlta(String idUser) {
        return false;
    }

    @Override
    public boolean logLogin(String idUser) {
        return false;
    }

    @Override
    public void anadirFicheroLogger(String mensaje) {

        this.gestion.anadirFicheroLog(mensaje, "src/main/resources/archivosTema7/Users/Logs/logs.txt");

    }
}