package com.es.programacion.tema7.proyectoUser.services.impl;

import com.es.programacion.pruebas.pokemon.assets.Loader;
import com.es.programacion.tema7.proyectoUser.model.User;
import com.es.programacion.tema7.proyectoUser.services.api.BasicService;
import com.es.programacion.tema7.proyectoUser.services.api.GestionFichero;

import java.util.ArrayList;
import java.util.Scanner;

public class UsersService implements BasicService<User> {


    private String rutaFichero;
    private ArrayList<User> users;
    private GestionFichero<User> gestionFicheroUser;

    /**
     * Constructor de clase.
     * Aquí le pasamos por parametros la ruta del fichero y una inyección de dependencia del GestionFichero
     * @param rutaFichero
     * @param gestionFicheroUser
     */
    public UsersService(String rutaFichero, GestionFichero<User> gestionFicheroUser) {
        this.gestionFicheroUser = gestionFicheroUser;
        this.rutaFichero = Loader.class.getResource(rutaFichero).toString();;
        users = new ArrayList<>();
    }


    /*
    MÉTODOS IMPLEMENTADOS DE LA INTERFACE BasicService<T>
     */

    /**
     * Método para comprobar si un usuario existe en el sistema o no
     * @param idUser id del usuario a buscar
     * @return true si existe o false si no existe
     */
    public boolean exists(String idUser) {

        /*
        // Este código, se parece a lo que habéis puesto en la práctica del AirBnb. Lo hago más sencillo un poco más abajo
        return this.users.stream()
                .filter(user -> user.getId().equalsIgnoreCase(idUser))
                .findFirst()
                .isEmpty();
         */

        for (User u : this.users) {
            if(u.getId().equalsIgnoreCase(idUser)) {
                // Si encontramos al usuario, podemos devolver true directamente
                return true;
            }
        }
        // Si llega a este punto es que no ha encontrado ningún usuario
        return false;
    }

    /**
     * Método para buscar a un User por su id
     * @param idUser id del usuario a buscar
     * @return User con el usuario encontrado o null si no lo encuentra
     */
    public User find(String idUser) {
        /*
        // Este código, se parece a lo que habéis puesto en la práctica del AirBnb. Lo hago más sencillo un poco más abajo
        return this.users.stream()
                .filter(user -> user.getId().equalsIgnoreCase(idUser))
                .findFirst()
                .orElse(null);
         */

        for (User u : this.users) {
            if(u.getId().equalsIgnoreCase(idUser)) {
                // Si encontramos al usuario, podemos devolverlo directamente
                return u;
            }
        }
        // Si llega a este punto es que no ha encontrado ningún usuario
        return null;
    }

    /**
     * Método que da de alta un nuevo {@link User} en el sistema
     * @param newObj objeto de tipo {@link User}
     * @return true si se ha añadido correctamente o false si no
     */
    public boolean alta(User newObj) {
        // Si encontramos al usuario dentro del sistema, significa que ya existe, así que no podemos darlo de alta
        if(exists(newObj.getId())) {
           // Si el usuario ya existe en el sistema, devolveremos un false indicando que ya existe y que no se puede duplicar
            System.out.println("Usuario ya existente en el sistema...");
            return false;
        } else {
            users.add(newObj); // Primero lo añado al ArrayList que contiene los usuarios
            anadirFicheroUsers(newObj); // Acto seguido, persisto los datos para que estén en el fichero también
            return users.contains(newObj); // Devuelvo true si se ha añadido correctamente o false si ha habido algún problema al añadirlo
        }
    }


    /*
    MÉTODOS PROPIOS DE ESTA CLASE
     */

    /**
     * Método que comprueba si un usuario es admin o no
     * @param idUser
     * @return
     */
    public boolean userIsAdmin(String idUser) {
        /*
        // Este código se asemeja a muchos de los vistos en el proyecto AirBnB, lo pongo más sencillo un poco más abajo
        return this.users.stream()
                .filter(user -> user.getId().equalsIgnoreCase(idUser) && user.isAdmin())
                .findFirst()
                .isEmpty();

         */

        // Recorro el ArrayList para encontrar el idUser dado y ver si es admin
        for (User u: this.users) {
            if (u.getId().equalsIgnoreCase(idUser) && u.isAdmin()) {
                // Si llega a este punto significa que ha encontrado el id dado, y que además el atributo isAdmin es true
                return true;
            }
        }
        // Si llega a este punto significa que no se ha encontrado ningún usuario con el id dado que sea admin
        return false;
    }

    private void leerFicheroUsers() {
        this.users = gestionFicheroUser.leerFichero(rutaFichero);
    }

    private void anadirFicheroUsers(User u) {
        gestionFicheroUser.anadirFichero(u, rutaFichero);
    }

    private void modificarFicheroUsers() {
        gestionFicheroUser.modificarFichero(this.users, rutaFichero);
    }

}
