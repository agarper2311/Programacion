package com.es.programacion.tema7.proyectoUbriCine.services.impl;

import com.es.programacion.tema7.proyectoUbriCine.model.User;

import java.io.*;
import java.util.List;

/**
 * Archivo para manejar la lectura y escritura de los datos
 * en el archivo usuarios.txt
 */
public class GestionFicheroUser {
    // Atributos de clase
    private List<User> users; // Lista de usuarios
    private static final String archivoUsuarios = "usuarios.txt";

    // Constructor
    public GestionFicheroUser(List<User> users) {
        this.users = users;
        cargarUsuarios();
    }

    // Método cargarUsuarios
    private void cargarUsuarios() {
        File archivoUser = new File(archivoUsuarios);
        if (archivoUser.exists()) { // Comprobamos de que el archivo existe
            try (BufferedReader br = new BufferedReader(new FileReader(archivoUser))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] partes = linea.split(":");
                    if (partes.length == 4) {
                        users.add(new User(partes[0], partes[1], partes[2], Boolean.parseBoolean(partes[3])));
                    }
                }
            } catch (IOException e) {
                System.err.println("Error al leer el archivo de usuarios: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo de usuarios no existe. Se creará uno nuevo cuando se registre el primer usuario.");
        }
    }

    /**
     * Método añadirUsuarios
     * @param id
     * @param name
     * @param password
     * @param isAdmin
     *
     * Este método
     * Crea y añade un nuevo usuario a la lista users.
     * Invoca guardarUsuario() para actualizar el archivo users.txt con el nuevo usuario.
     */

    public void aniadirUsuario(String id, String name, String password, boolean isAdmin) {
        User nuevoUsuario = new User(id, name, password, isAdmin);
        users.add(nuevoUsuario);
        guardarUsuario();
        registrarAccion("alta", id, name, password, isAdmin, true);
    }

    private void registrarAccion(String alta, String id, String name, String password, boolean isAdmin, boolean b) {

    }

    /**
     * Método guardarUsuario
     *
     * Este método:
     * Utiliza un BufferedWriter para escribir todos los objetos User de la lista users al archivo users.txt.
     * Cada usuario se escribe en una nueva línea utilizando su método toString().
     * Maneja excepciones relacionadas con problemas de escritura de archivo.
     */
    private void guardarUsuario() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoUsuarios))) {
            for (int i = 0; i < users.size(); i++) {
                User usuario = users.get(i);
                bw.write(usuario.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de usuarios: " + e.getMessage());
        }
    }


    /**
     * Método loginUsuario
     * @param id
     * @param password
     * @return
     */
    public boolean loginUsuario(String id, String password) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getId().equals(id) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }


}
