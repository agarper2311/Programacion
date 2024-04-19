package com.es.programacion.tema7.proyectoUbriCine.services.impl;

import com.es.programacion.tema7.proyectoUbriCine.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceUser {

    private ArrayList<User> users;
    private GestionFicheroUser gestion;
    private LoggerService ls;
    private Scanner scanner;

    // Constructor por defecto
    public ServiceUser(String file) {
        this.ls = new LoggerService("src/main/resources/archivosTema7/proyectoUbriCines/logs.txt");
        this.users = new ArrayList<>();
        this.gestion = new GestionFicheroUser();
        this.users = gestion.leerFicheroUser("src/main/resources/archivosTema7/proyectoUbriCines/usuarios.txt");
        this.scanner = new Scanner(System.in);
    }

    // Método para dar de alta un nuevo usuario
    public boolean altaUsuario(User user) {
        try {
            System.out.println("Id de usuario:");
            String idUsuario = scanner.nextLine();
            System.out.println("Nombre:");
            String nombre = scanner.nextLine();
            System.out.println("Contraseña:");
            String contrasena = scanner.nextLine();
            System.out.println("¿Es administrador? (true/false):");
            boolean isAdmin = Boolean.parseBoolean(scanner.nextLine());

            if (!userExists(idUsuario)) {
                User newUser = new User(idUsuario, nombre, contrasena, isAdmin);
                users.add(newUser);
                gestion.anadirUsuarioFichero(newUser, "src/main/resources/archivosTema7/proyectoUbriCines/usuarios.txt");
                ls.logAlta(idUsuario, true);
                return true;
            } else {
                System.out.println("El usuario ya existe.");
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error al dar de alta usuario: " + e.getMessage());
            return false;
        }
    }

    // Método para iniciar sesión de un usuario
    public boolean loginUsuario(String id, String password) {
        try {
            System.out.println("Id de usuario:");
            String idUsuario = scanner.nextLine();

            if (userExists(idUsuario)) {
                System.out.println("Contraseña:");
                String passwordUsuario = scanner.nextLine();

                if (checkUser(idUsuario, passwordUsuario)) {
                    System.out.println("Bienvenid@ " + idUsuario);
                    ls.logLogin(idUsuario, true);
                    return true;
                } else {
                    System.out.println("Identificación Incorrectas");
                    ls.logLogin(idUsuario, false);
                    return false;
                }
            } else {
                System.out.println("El usuario no está registrado");
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error al hacer login: " + e.getMessage());
            return false;
        }
    }

    // Método para comprobar las credenciales de un usuario
    private boolean checkUser(String idUser, String password) {
        return users.stream().anyMatch(user -> user.getId().equalsIgnoreCase(idUser) && user.getPassword().equals(password));
    }

    // Método para comprobar si un usuario existe
    private boolean userExists(String idUser) {
        return users.stream().anyMatch(user -> user.getId().equalsIgnoreCase(idUser));
    }
}

