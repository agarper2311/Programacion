package com.es.programacion.Tema7.proyectoUser.services.api;

/**
 * Interfaz de servicio básico que define operaciones CRUD para cualquier tipo de objeto.
 * CRUD (Create, Read, Update, Delete)
 *
 * @param <T> el tipo de objeto con el que trabaja este servicio.
 */
public interface BasicService<T> {

    /**
     * Busca y devuelve un objeto por su ID.
     *
     * @param id el ID del objeto a buscar.
     * @return el objeto encontrado, o null si no se encuentra.
     */
    T find(String id);

    /**
     * Verifica si existe un objeto con el ID dado.
     *
     * @param id el ID del objeto a verificar.
     * @return true si el objeto existe, false en caso contrario.
     */
    boolean exists(String id);

    /**
     * Registra un nuevo objeto en el sistema.
     *
     * @param newObj el objeto nuevo a registrar.
     * @return true si el objeto se añadió con éxito, false en caso contrario.
     */
    boolean alta(T newObj);
}
