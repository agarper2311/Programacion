package com.es.programacion.Tema7.proyectoUser.model;

import java.util.Objects;

public class User {

    private String id;
    private String name;
    private String pass;
    private boolean isAdmin;

    /**
     * Constructor que recibe los siguientes parámetros:
     * @param id
     * @param name
     * @param pass
     * @param isAdmin
     */
    public User(String id, String name, String pass, boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.isAdmin = isAdmin;
    }

    // Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    /**
     * El setter setName asegura que tanto el nombre, ID y pass no sean null
     * @param name
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        this.name = name;
    }


    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }


    // Método toString que devuelve el nombre y el ID del usuario, también nos mostrará
    // si es administrador o no
    @Override
    public String toString() {
        return "User{name='" + name + "', id='" + id + "', isAdmin=" + isAdmin + "}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(this.id, user.id);
    }

    // Método hashCode para que se base solo en el ID
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}