package com.es.programacion.Tema7.proyectoUser.services.api;

import com.es.programacion.Tema7.proyectoUser.model.*;

import java.util.ArrayList;

public interface GestionFichero<T> {


    ArrayList<T> leerFichero(String ruta);
    void modificarFichero(ArrayList<T> objs, String ruta);
    void anadirFichero(T obj, String ruta);


}