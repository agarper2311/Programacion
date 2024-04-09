package com.es.programacion.Tema7.proyectoUser;

import com.es.programacion.Tema7.proyectoUser.services.impl.GestionFicheroUser;
import com.es.programacion.Tema7.proyectoUser.services.impl.UsersService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Primero declaro los dos objetos que me van a permitir llamar a los diferentes métodos que tengo en las
        // clases GestionFicheroUser y UsersService.
        GestionFicheroUser g = new GestionFicheroUser(); // Aquí tengo métodos para leer/escribir en el fichero
        UsersService u = new UsersService("", g); // Aquí tengo métodos para hacer consultar

        int opt;
        do {
            System.out.println("___________________________________________");
            System.out.println("|                                         |");
            System.out.println("|               Login AirBnB              |");
            System.out.println("|_________________________________________|");
            System.out.println("| 1). Darse de alta                       |");
            System.out.println("| 2). Login                               |");
            System.out.println("| 3). Modificar usuario                   |");
            System.out.println("| 4). Darse de baja                       |");
            System.out.println("| 0). Salir                               |");
            System.out.println("|_________________________________________|");
            System.out.println("|                                         |");
            System.out.println("| Introduzca su opcion:                   |");
            System.out.println("|_________________________________________|");

            Scanner scan = new Scanner(System.in);
            opt = scan.nextInt();

        } while (opt != 0);
        switch (opt) {
            case 1:


                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 0:

                break;

        }

    }


}
