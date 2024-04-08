package com.Programacion.Tema5.proyectoLogginSession.Services;

import com.Programacion.Tema5.proyectoLogginSession.Clases.Session;
import com.Programacion.Tema5.proyectoLogginSession.Clases.User;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class UserSessionService {
    // ArrayList de usuarios Registrados
    public static ArrayList<User> usersRegistered = new ArrayList<>();

    // ArrayList de Sesiones activas (inferiores a 3 minutos)
    public static ArrayList<Session> activeSessions = new ArrayList<>();

    // Función para verificar si el usuario que intenta iniciar sesión existe
    public static boolean checkIfUserExists(String username, String password) {
        for (int i = 0; i < usersRegistered.size(); i++) {
            User user = usersRegistered.get(i);
            if (user.getUser().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    // Función para agregar una sesión
    public static void addSession(String username) {
        for (int i = 0; i < usersRegistered.size(); i++) {
            User user = usersRegistered.get(i);
            if (user.getUser().equals(username)) {
                Session newSession = new Session(user);
                activeSessions.add(newSession);
                break; // Salir del bucle una vez que la sesión se añade
            }
        }
    }

    // Función para verificar que no se duplique un nombre de usuario
    public static boolean checkIfUserIsDuplicate(String username) {
        for (int i = 0; i < usersRegistered.size(); i++) {
            User user = usersRegistered.get(i);
            if (user.getUser().equals(username)) {
                return true;
            }
        }
        return false;
    }

    // Función para verificar si la sesión del usuario está activa
    public static boolean checkIfSessionIsActive(String username) {
        for (int i = 0; i < activeSessions.size(); i++) {
            Session session = activeSessions.get(i);
            if (session.getUsuario().getUser().equals(username)) {
                if (session.getSessionExpires().isAfter(LocalDateTime.now())) {
                    return true;
                } else {
                    activeSessions.remove(i); // Elimina la sesión expirada
                    i--; // Ajusta el índice después de la eliminación
                }
            }
        }
        return false;
    }

    // Función para verificar que el nombre de usuario que se está registrando cumpla con la norma de 5 letras y 3 números
    // y que la contraseña sea numérica y de 5 caracteres
    public static boolean addUser(String username, String password) {
        if (!username.matches("[a-zA-Z]{5}\\d{3}") || !password.matches("\\d{5}")) {
            System.out.println("El formato del usuario o contraseña no es válido.");
            return false;
        }

        if (!checkIfUserIsDuplicate(username)) {
            usersRegistered.add(new User(username, password)); // Correctamente añade el usuario
            return true; // Devuelve true si el usuario es exitosamente añadido
        }
        return false; // Devuelve false si el usuario ya existe
    }

    // Getters and Setters
    public static ArrayList<User> getUsersRegistered() {
        return usersRegistered;
    }

    public static void setUsersRegistered(ArrayList<User> usersRegistered) {
        UserSessionService.usersRegistered = usersRegistered;
    }

    public static ArrayList<Session> getActiveSessions() {
        return activeSessions;
    }

    public static void setActiveSessions(ArrayList<Session> activeSessions) {
        UserSessionService.activeSessions = activeSessions;
    }
}
