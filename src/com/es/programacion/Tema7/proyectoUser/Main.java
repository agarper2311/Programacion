package com.es.programacion.tema7.proyectoUser;

import com.es.programacion.tema7.proyectoUser.services.impl.UsersService;
import com.es.programacion.tema7.proyectoUser.services.impl.GestionFicheroUser;

public class Main {

    public static void main(String[] args) {

        // Primero declaro los dos objetos que me van a permitir llamar a los diferentes métodos que tengo en las
        // clases GestionFicheroUser y UsersService.
        GestionFicheroUser g = new GestionFicheroUser(); // Aquí tengo métodos para leer/escribir en el fichero
        UsersService u = new UsersService("", g); // Aquí tengo métodos para hacer consultar


    }
}
