package com.es.programacion.tema7.proyectoUser.services.api;

public interface BasicService<T> {


    T find(String id);
    boolean exists(String id);
    boolean alta(T newObj);

}
