package com.es.programacion.Tema7.proyectoUser.services.impl;

import com.es.programacion.Tema7.proyectoUser.services.api.BasicServiceUser;
import com.es.programacion.tema7.proyectoUser.model.User;

import java.util.ArrayList;
import java.util.Scanner;

import com.es.programacion.tema7.proyectoUser.services.impl.GestionFicheroUser;
public class ServicesUser implements BasicServiceUser {
    // Atributos
    ArrayList<User> users;
    GestionFicheroUser gestion;

    public ServicesUser(){
        this.users = new ArrayList<>();
        this.gestion = new GestionFicheroUser();
    }


    // @Override
    public boolean altaUsuario() {
        return false;
    }

    @Override
    public boolean loginUsuario() {

        Scanner scan = new Scanner(System.in);
        String idUsuario = "";
        String passwordUsuario = "";

        System.out.print("Introduzca su idUsuario: ");
        idUsuario = scan.nextLine();

        // Comprobamos en el fichero que si el idUser existe
        if (checkUser(idUsuario))

        return false;
    }

    @Override
    public boolean checkUser(String idUser, String password) {
        return false;
    }

    @Override
    public boolean checkExists(String idUser) {
        return false;
    }

    @Override
    public void leerFicheroUsers() {
        this.users = gestion.leerFichero("src/main/resources/archivosTema7/Users/Users.txt");
    }

    @Override
    public void anadirFihceroUsers(User u) {
        gestion.anadirFichero(u, "src/main/resources/archivosTema7/Users/Users.txt");
    }

    @Override
    public void modificarFicheroUsers() {
        gestion.modificarFichero(this.users, "src/main/resources/archivosTema7/Users/Users.txt");

    }
}
