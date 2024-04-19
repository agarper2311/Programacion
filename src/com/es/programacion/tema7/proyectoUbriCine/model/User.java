package com.es.programacion.tema7.proyectoUbriCine.model;

/**
 * Clase que representa a un usuario del sistema de gestión de entradas del cine UbriCines.
 */
public class User {
    private String id;
    private String name;
    private String password;
    private boolean isAdmin;

    /**
     * Constructor para crear un nuevo usuario.
     * @param id El identificador único del usuario.
     * @param name El nombre del usuario.
     * @param password La contraseña del usuario.
     * @param isAdmin Booleano que indica si el usuario tiene privilegios de administrador.
     */
    public User(String id, String name, String password, boolean isAdmin) {
        this.setId(id);
        this.setName(name);
        this.setPassword(password);
        this.setAdmin(isAdmin);
    }

    // Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID no puede ser nulo o vacío.");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede ser nula o vacía.");
        }
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='[PROTECTED]'" +
                ", isAdmin=" + isAdmin +
                '}';
    }


    public void setNombre(String nombre) {
        this.name = nombre;
    }
}
