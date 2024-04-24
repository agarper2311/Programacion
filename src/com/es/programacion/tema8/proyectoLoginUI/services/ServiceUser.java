package com.es.programacion.tema8.proyectoLoginUI.services;

import com.es.programacion.tema7.proyectoUser.model.User;
import com.es.programacion.tema7.proyectoUser.services.api.BasicServiceUser;

import java.util.ArrayList;
import java.util.List;

public class ServiceUser implements BasicServiceUser {

    private List<User> users;
    private GestionFicheroUser gestionFichero;
    private final String rutaFichero;

    public ServiceUser() {
        this.gestionFichero = new GestionFicheroUser();
        this.rutaFichero = "src/main/resources/archivosTema7/Users/Users.txt";
        this.users = gestionFichero.leerFichero(rutaFichero);
    }

    public boolean loginUI(String idUser, String passUser){

        return users.stream()
                .filter(user -> user.getId().equalsIgnoreCase(idUser) && user.getPass().equals(passUser))
                .findFirst()
                .isPresent();

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
        // Reutilizamos el método checkUser para verificar si existe un usuario
        // con el id y la contraseña proporcionados.
        boolean loginExitoso = checkUser(idUser, password);
        if (loginExitoso) {
            System.out.println("Inicio de sesión exitoso.");
        } else {
            System.out.println("Error de inicio de sesión: Usuario o contraseña incorrectos.");
        }
        return loginExitoso;
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
