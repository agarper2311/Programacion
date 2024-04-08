package com.es.programacion.tema7.proyectoUser.services.api;

import com.es.programacion.tema7.proyectoUser.model.User;

import java.util.ArrayList;

public interface GestionFichero<T> {


    ArrayList<T> leerFichero(String ruta);
    void modificarFichero(ArrayList<T> objs, String ruta);
    void anadirFichero(T obj, String ruta);


}
