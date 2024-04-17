package com.es.programacion.tema7.proyectoUbriCine.model;

import java.util.Objects;

public class User {
    // Atributos de clase
    private String id;
    private String name;
    private String password;
    private boolean isAdmin;

    /**
     * Constructor que recibe los siguiente parámetros:
     * @param id
     * @param name
     * @param password
     * @param isAdmin
     */
    public User(String id, String name, String password, boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    // Método toString

    @Override
    public String toString() {
        return id + ":" + name + ":" + password + ":" + isAdmin;
    }

    // Método equals()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isAdmin == user.isAdmin && Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(password, user.password);
    }

    // Método hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, isAdmin);
    }


    // Getters y setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
