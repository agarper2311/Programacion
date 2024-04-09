package com.es.programacion.Tema7.proyectoUser.services.impl;

import com.es.programacion.Tema7.proyectoUser.model.User;
import com.es.programacion.Tema7.proyectoUser.services.api.BasicService;
import com.es.programacion.Tema7.proyectoUser.services.api.GestionFichero;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementa {@link BasicService} para proporcionar servicios de gestión de usuarios,
 * incluyendo registro, búsqueda, y verificación de existencia de usuarios.
 */
public class UsersService implements BasicService<User> {

    private String rutaFichero;
    private List<User> users;
    private GestionFichero<User> gestionFicheroUser;

    /**
     * Constructor de clase.
     * Inicializa la lista de usuarios y los carga desde un archivo especificado.
     *
     * @param rutaFichero La ruta del fichero donde se almacenan los datos de los usuarios.
     * @param gestionFicheroUser Implementación de GestionFichero para manejar operaciones de archivo.
     */
    public UsersService(String rutaFichero, GestionFichero<User> gestionFicheroUser) {
        this.gestionFicheroUser = gestionFicheroUser;
        this.rutaFichero = rutaFichero;
        this.users = gestionFicheroUser.leerFichero(rutaFichero);
    }

    /**
     * Verifica si existe un usuario con el ID especificado.
     *
     * @param idUser ID del usuario a buscar.
     * @return true si el usuario existe, false en caso contrario.
     */
    @Override
    public boolean exists(String idUser) {
        return users.stream().anyMatch(u -> u.getId().equalsIgnoreCase(idUser));
    }

    /**
     * Busca y devuelve un usuario por su ID.
     *
     * @param idUser ID del usuario a buscar.
     * @return El usuario encontrado, o null si no existe.
     */
    @Override
    public User find(String idUser) {
        return users.stream().filter(u -> u.getId().equalsIgnoreCase(idUser)).findFirst().orElse(null);
    }

    /**
     * Da de alta un nuevo usuario en el sistema.
     *
     * @param newObj Objeto de tipo {@link User} que representa el nuevo usuario.
     * @return true si el usuario se añade correctamente, false si ya existe.
     */
    @Override
    public boolean alta(User newObj) {
        if (!exists(newObj.getId())) {
            users.add(newObj);
            anadirFicheroUsers(newObj);
            return true;
        }
        System.out.println("Usuario ya existente en el sistema...");
        return false;
    }

    /**
     * Añade un usuario al fichero de usuarios.
     *
     * @param u El usuario a añadir.
     */
    private void anadirFicheroUsers(User u) {
        gestionFicheroUser.anadirFichero(u, rutaFichero);
    }

    /**
     * Actualiza el fichero de usuarios con la lista actual de usuarios.
     */
    private void modificarFicheroUsers() {
        gestionFicheroUser.modificarFichero((ArrayList<User>) users, rutaFichero);
    }

    /**
     * Comprueba si un usuario es administrador.
     *
     * @param idUser ID del usuario a verificar.
     * @return true si el usuario es administrador, false en caso contrario.
     */
    public boolean userIsAdmin(String idUser) {
        return users.stream().anyMatch(u -> u.getId().equalsIgnoreCase(idUser) && u.isAdmin());
    }

    /**
     * Carga nuevamente la lista de usuarios desde el fichero.
     */
    private void leerFicheroUsers() {
        this.users = gestionFicheroUser.leerFichero(rutaFichero);
    }

    public boolean loginUsuario(String id, String pass) {
        // Recorre la lista de usuarios para encontrar uno que coincida con el ID y la contraseña proporcionados.
        for (User usuario : users) {
            if (usuario.getId().equals(id) && usuario.getPass().equals(pass)) {
                // Si se encuentra un usuario con el ID y la contraseña correspondientes, retorna true.
                return true;
            }
        }
        // Si no se encuentra ningún usuario que coincida, retorna false.
        return false;
    }

}
