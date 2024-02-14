package com.es.programacion.tema3;

import java.util.Scanner;

public class LoginMejorado2 {

    public static void main(String[] args) {


        // Primero, declaro variables de uso general
        Scanner scan = new Scanner(System.in);
        int opc = 0; // Para la seleccion del menú
        String userIntroducido = "";
        String passIntroducida = "";

        // Dos arrays que contendran los users y pass registradas en el sistema
        String[] usersRegistered = new String[10];
        String[] passRegistered = new String[10];

        // Rellenar manualmente las 5 primeras posiciones
        usersRegistered[0] = "lainez";
        usersRegistered[1] = "eldioni666";
        usersRegistered[2] = "amadorRivas";
        usersRegistered[3] = "reshu_";
        usersRegistered[4] = "otroUser";

        passRegistered[0] = "lainez";
        passRegistered[1] = "eldioni666";
        passRegistered[2] = "amadorRivas";
        passRegistered[3] = "reshu_";
        passRegistered[4] = "otroUser";



        // Tercero: Hacer el menú de inicio
        System.out.println("Bienvenid@ al sistema");
        do {

            // Muestro el menu
            menu();

            // Leemos por teclado la opcion
            opc = scan.nextInt();

            // If para las distintas opciones
            if(opc == 1){
                // Para login
                System.out.print("usuario: ");
                userIntroducido = scan.next();

                System.out.print("password: ");
                passIntroducida = scan.next();

                // Declaro un boolean auxiliar
                boolean autenticacion = false;

                for (int i=0; i<= usersRegistered.length-1; i++) {
                    if(userIntroducido.equals(usersRegistered[i])){

                        if(passIntroducida.equals(passRegistered[i])){
                            autenticacion = true;
                            break;
                        }
                    }
                }

                if (autenticacion){
                    System.out.println("Bienvenid@ "+userIntroducido);
                } else {
                    System.out.println("Acceso denegado");
                }


            } else if(opc == 2) {
                // Para registro

                // Declaro un boolean auxiliar
                boolean estaRegistrado = false;

                // Leo el usuario que se va a dar de alta
                System.out.print("Introduzca un usuario valido: ");
                userIntroducido = scan.next();

                // Recorro el array para comprobar la existencia o no del usuario
                for (int i=0; i<= usersRegistered.length-1; i++) {

                    if(userIntroducido.equals(usersRegistered[i])){
                        estaRegistrado = true;
                        break;
                    }
                }

                if (estaRegistrado){
                    System.out.println("Usuario ya existente...");
                } else {
                    System.out.print("Introduzca una pass valida: ");
                    passIntroducida = scan.next();

                    // Recorro el array para encontrar la primera posicion vacia
                    for (int i=0; i<= usersRegistered.length-1; i++) {
                        if(usersRegistered[i] == null) {
                            usersRegistered[i] = userIntroducido;
                            passRegistered[i] = passIntroducida;
                            break;
                        }
                    }
                }


            } else if(opc == 3) {
                // Para baja

                // Declaro un boolean auxiliar
                boolean dadoDeBaja = false;

                // Leo el usuario que se va a dar de alta
                System.out.print("Introduzca un usuario a dar de baja: ");
                userIntroducido = scan.next();

                System.out.print("Introduzca su password: ");
                passIntroducida = scan.next();

                for (int i=0; i<= usersRegistered.length-1; i++) {
                    if(userIntroducido.equals(usersRegistered[i])){
                        if(passIntroducida.equals(passRegistered[i])){

                            usersRegistered[i] = null;
                            passRegistered[i] = null;
                            dadoDeBaja = true;
                            break;
                        }
                    }
                }

                if (dadoDeBaja){
                    System.out.println("Usuario eliminado correctamente");
                } else {
                    System.out.println("Baja fallida");
                }

            } else if(opc == 0) {
                // Para salir
                System.out.println("Saliendo del sistema...");
            } else {
                // Para opcs invalidas
                System.out.println("Opcion erronea");
            }





        } while (opc != 0);
    }

    /**
     * Funcion que imprime por pantalla el menu principal
     */
    public static void menu() {
        System.out.println("" +
                "\nIntroduzca una opcion valida" +
                "\n1. Login" +
                "\n2. Registro/Alta" +
                "\n3. Baja" +
                "\n0. Salir");
    }
}
