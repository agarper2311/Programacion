package com.es.programacion.tema7.proyectoUbriCine.services.api;

import java.util.List;

/**
 * Interfaz genérica para gestión de archivos.
 * Proporciona métodos para leer y escribir colecciones de objetos en archivos.
 *
 * @param <T> Tipo de objeto que manejará esta gestión de fichero.
 */
public interface GestionFichero<T> {

    /**
     * Lee objetos desde un archivo y los devuelve como una lista.
     *
     * @param rutaArchivo La ruta al archivo de donde leer los objetos.
     * @return Lista de objetos leídos desde el archivo.
     */
    List<T> leerFichero(String rutaArchivo);

    /**
     * Escribe una lista de objetos en un archivo.
     *
     * @param objetos Lista de objetos a escribir en el archivo.
     * @param rutaArchivo La ruta al archivo donde se guardarán los objetos.
     */
    void escribirFichero(List<T> objetos, String rutaArchivo);
}
