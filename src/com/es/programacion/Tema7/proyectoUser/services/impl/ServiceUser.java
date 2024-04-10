package com.es.programacion.Tema7.proyectoUser.services.impl;

import com.es.programacion.Tema7.proyectoUser.model.User;
import com.es.programacion.Tema7.proyectoUser.services.api.BasicServiceUser;
import com.es.programacion.Tema7.proyectoUser.services.api.GestionFichero;

import java.util.ArrayList;
import java.util.List;

public class ServiceUser implements BasicServiceUser {

    private List<User> users;
    private GestionFichero<User> gestionFichero;
    private final String rutaFichero;

    public ServiceUser(String rutaFichero) {
        this.gestionFichero = gestionFichero;
        this.rutaFichero = rutaFichero;
        this.users = gestionFichero.leerFichero(rutaFichero);
    }

    @Override
    public boolean altaUsuario(User nuevoUsuario) {
        if (userExists(nuevoUsuario.getId())) {
            System.out.println("El usuario ya existe.");
            return false;
        }
        users.add(nuevoUsuario);
        gestionFichero.anadirFichero(nuevoUsuario, rutaFichero);
        return true;
    }

    @Override
    public boolean loginUsuario(String idUser, String password) {
        return false;
    }

    @Override
    public void anadirUsuario(User u) {
        if (!userExists(u.getId())) {
            users.add(u); // Añadir usuario a la lista en memoria
            gestionFichero.anadirFichero(u, rutaFichero); // Añadir usuario al fichero
        } else {
            System.out.println("El usuario ya existe y no se puede añadir de nuevo.");
        }
    }



    @Override
    public boolean checkUser(String idUser, String password) {
        return users.stream().anyMatch(u -> u.getId().equals(idUser) && u.getPass().equals(password));
    }

    @Override
    public boolean userExists(String idUser) {
        return users.stream().anyMatch(u -> u.getId().equals(idUser));
    }

    @Override
    public void leerFicheroUsers() {
        this.users = gestionFichero.leerFichero(rutaFichero);
    }

    @Override
    public void anadirFicheroUsers(User u) {
        gestionFichero.anadirFichero(u, rutaFichero);
    }

    @Override
    public void modificarFicheroUsers() {
        // He casteado el primer argumento para que no me de fallo
        gestionFichero.modificarFichero((ArrayList<User>) users, rutaFichero);
    }
}
