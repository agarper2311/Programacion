package com.es.programacion.tema7.proyectoUser.services.api;

import java.util.ArrayList;

/**
 * Interfaz genérica para la gestión de archivos, permitiendo realizar operaciones
 * de lectura, modificación y adición de objetos de cualquier tipo a un archivo.
 *
 * @param <T> el tipo de objetos con los que trabaja esta interfaz
 */
public interface GestionFichero<T> {

    /**
     * Lee objetos desde un archivo especificado y los devuelve como una lista.
     *
     * @param ruta la ruta del archivo a leer.
     * @return una lista de objetos del tipo T leídos desde el archivo.
     */
    ArrayList<T> leerFichero(String ruta);

    /**
     * Modifica un archivo existente reemplazándolo con la lista de objetos proporcionada.
     *
     * @param objs la lista de objetos del tipo T para escribir en el archivo.
     * @param ruta la ruta del archivo a modificar.
     */
    void modificarFichero(ArrayList<T> objs, String ruta);

    /**
     * Añade un objeto al final de un archivo especificado.
     *
     * @param obj el objeto del tipo T a añadir en el archivo.
     * @param ruta la ruta del archivo donde se añadirá el objeto.
     */
    void anadirFichero(T obj, String ruta);

}
