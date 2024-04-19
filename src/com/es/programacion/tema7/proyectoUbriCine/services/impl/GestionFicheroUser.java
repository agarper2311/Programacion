package com.es.programacion.tema7.proyectoUbriCine.services.impl;

import com.es.programacion.tema7.proyectoUbriCine.model.User;

import java.io.*;
import java.util.ArrayList;

/**
 * Clase encargada de gestionar el fichero de usuarios.
 */
public class GestionFicheroUser{

    // Método para leer los usuarios desde el fichero
    public ArrayList<User> leerFicheroUser(String ruta) {
        ArrayList<User> arrUsuariosTemporal = new ArrayList<>();

        File fichero = new File(ruta);

        if (fichero.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] valores = linea.split(":");
                    if (valores.length == 4) {
                        String id = valores[0];
                        String nombre = valores[1];
                        String contrasena = valores[2];
                        boolean isAdmin = Boolean.parseBoolean(valores[3]);
                        User usuario = new User(id, nombre, contrasena, isAdmin);
                        arrUsuariosTemporal.add(usuario);
                    } else {
                        System.err.println("Error: la línea no tiene el formato esperado: " + linea);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("El archivo no existe en la ruta especificada: " + ruta);
        }
        return arrUsuariosTemporal;
    }

    // Método para añadir un usuario al fichero
    public void anadirUsuarioFichero(User u, String ruta) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta, true))) {
            pw.println(u.getId() + ":" + u.getName() + ":" + u.getPassword() + ":" + u.isAdmin());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
