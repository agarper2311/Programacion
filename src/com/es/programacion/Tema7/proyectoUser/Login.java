package com.es.programacion.Tema7.proyectoUser;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

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
            System.out.println("| Introduzca su opción:                   |");
            System.out.println("|_________________________________________|");

            Scanner scan = new Scanner(System.in);
            opt = scan.nextInt();

        } while (opt != 0);
        switch (opt){
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
