package com.es.programacion.tema3;

import java.util.Scanner;

public class LoginMejorado {

    public static void main(String[] args) {

        // Variables de uso general
        Scanner scan = new Scanner(System.in);
        int opc = 0;
        String userIntroducido = "";
        String passIntroducida = "";

        // Declarar dos arrays unidimensionales de tamaño 10
        String[] usersRegistered = new String[10];
        String[] passRegistered = new String[10];


        // Rellenar manualmente 5 users con 5 passwords
        usersRegistered[0] = "lainez";
        usersRegistered[1] = "eldioni666";
        usersRegistered[2] = "amadorRivas";
        usersRegistered[3] = "reshu_";
        usersRegistered[4] = "otroUser";
        usersRegistered[5] = "";
        usersRegistered[6] = "";
        usersRegistered[7] = "";
        usersRegistered[8] = "";
        usersRegistered[9] = "";

        passRegistered[0] = "lainez";
        passRegistered[1] = "1234";
        passRegistered[2] = "pass";
        passRegistered[3] = "contrasenia";
        passRegistered[4] = "algo";
        passRegistered[5] = "";
        passRegistered[6] = "";
        passRegistered[7] = "";
        passRegistered[8] = "";
        passRegistered[9] = "";

        /*
        Los dos arrays quedarían de la siguiente manera
        posiciones ->       0           1               2               3               4           5 6  7  8  9
        usersRegistered -> ["lainez",   "eldioni666",   "amadorRivas",  "reshu_",       "otroUser","","","","",""]
        passRegistered -> ["lainez",    "1234",         "pass",         "contrasenia",  "algo","","","","",""]


         */

        // Bucle do while para controlar el menú principal
        System.out.println("Bienvenid@ al sistema");
        do {

            System.out.println("" +
                    "\n1. Login" +
                    "\n2. Registro" +
                    "\n3. Baja" +
                    "\n0. Salir");

            System.out.print("Introduzca la opcion deseada: ");
            opc = scan.nextInt(); // Aquí podríamos hacer un bloque try catch para controlar las posibles excepciones

            /*
            NOTA: En este caso voy a optar por hacer un menú que se repita de forma indefinida hasta que se pulse salir.
            Es decir... que si pulso login, haga login, y después de la opcion de seguir haciendo otras cosas...
            como registrarse, volver a hacer login, darse de baja... etc
             */
            // Se puede hacer con un switch case. Yo voy a resolverlo con if else if
            if(opc == 1) { // Opcion login

                boolean registrado = false;


                System.out.println("Introduzca sus credenciales");
                System.out.print("usuario: ");
                userIntroducido = scan.next();
                System.out.print("password: ");
                passIntroducida = scan.next();

                // Recorro el array de usuarios para comprobar la existencia del usuario
                for(int i=0; i<= usersRegistered.length-1; i++) {

                    // Si el usuario DEL ARRAY EN LA POSICION i (i es cada una de las posiciones del array) coincide con el userIntroducido
                    if (usersRegistered[i].equals(userIntroducido)){
                        if (passRegistered[i].equals(passIntroducida)){
                            registrado = true;

                            // Podemos optar por dos opciones... o bien rompemos el bucle aqui que ya sabemos que el user
                            // esta registrado... o terminar de recorrer tod0 el array (lo cual no es eficiente)
                            break;
                        }
                    }
                }

                // Por ultimo, para mostrar el mensaje adecuado, hacemos un if
                if (registrado) {
                    System.out.println("Bienvenid@ "+userIntroducido);
                } else {
                    System.out.println("Acceso denegado");
                }

            } else if(opc == 2) { // Opcion alta

                boolean userYaExiste = false;

                System.out.println("" +
                        "Opcion alta de usuario" +
                        "\n\nIntroduzca los datos para el nuevo user");
                System.out.print("usuario: ");
                userIntroducido = scan.next();

                // Para ahorrar trabajo, antes de pedir la contrasenia, podemos comprobar que ese user no exista
                for(int i=0; i<= usersRegistered.length-1; i++) {

                    // Si el usuario DEL ARRAY EN LA POSICION i (i es cada una de las posiciones del array) coincide con el userIntroducido
                    if (usersRegistered[i].equals(userIntroducido)){
                        userYaExiste = true;
                        // Rompo el bucle para que sea eficiente (no me hace falta comprobar el resto de posiciones)
                        break;
                    }
                }

                // Si he comprobado que el user ya existe, entonces no hago nada mas
                if (userYaExiste) {
                    System.out.println("El usuario ya existe...");
                } else { // Si el user no existe, entonces le pido la contrasenia para despues almacenar el user
                    System.out.print("password: ");
                    passIntroducida = scan.next();

                    // Recorro el array para introducir el user en la primera posicion vacia que encuentre
                    for(int i=0; i<= usersRegistered.length-1; i++) {

                        // Si el usuario DEL ARRAY EN LA POSICION i (i es cada una de las posiciones del array) coincide con el userIntroducido
                        if (usersRegistered[i].equals("")){
                            usersRegistered[i] = userIntroducido;
                            passRegistered[i] = passIntroducida;

                            // Rompo el bucle para que no continue
                            break;
                        }
                    }
                }


            } else if(opc == 3) { // Opcion baja

                boolean userEliminado = false;

                System.out.println("" +
                        "Opcion baja de usuario" +
                        "\n\nIntroduzca los datos para a dar de baja");
                System.out.print("usuario: ");
                userIntroducido = scan.next();

                // Ahora le pido la contrasenia para que, si la ha introducido bien, eliminar al usuario
                System.out.print("password: ");
                passIntroducida = scan.next();

                // Primero compruebo la existencia de dicho usuario
                for(int i=0; i<= usersRegistered.length-1; i++) {

                    // Si el usuario DEL ARRAY EN LA POSICION i (i es cada una de las posiciones del array) coincide con el userIntroducido
                    if (usersRegistered[i].equals(userIntroducido)){

                        /*
                         En este punto... sé que existe un usuario que coincide con el introducido en la posicion i
                         La contrasenia debe estar en dicha posicion i del array de contrasenias
                         */

                        // Si la contrasenia de la posicion i coincide con la contrasenia introducia... elimino el user
                        if (passRegistered[i].equals(passIntroducida)){
                            usersRegistered[i] = "";
                            passRegistered[i] = "";

                            // Pongo el boolean userEliminado a true, ya que he podido eliminar el usuario del sistema
                            userEliminado = true;

                            // Puedo romper el bucle for, ya que hemos podido eliminar al usuario correctametne
                            break;
                        }
                    }
                }

                // Para mostrar el mensaje adecuado, simplemente compruebo el boolean userEliminado
                if (userEliminado) {
                    System.out.println("Usuario "+userIntroducido+ " eliminado correctamente del sistema");
                } else {
                    // Si llega aqui, significa que el usuario no se ha eliminado del sistema (ya sea porque no esta, o porque no se ha introducido bien la pass)
                    System.out.println("Usuario "+userIntroducido+" no eliminado");
                }

            } else if (opc == 0) { // Opcion salir
                System.out.println("Saliendo del sistema...");
            } else { // Otras opciones no validas
                System.out.println("Opcion incorrecta, por favor, introduzca una opcion valida");
                scan.nextLine(); // Limpio una línea para evitar problemas
            }

        } while(opc != 0);
    }
}

/*
¿Crees que existe alguna limitación en este programa?
¿Cuántos usuarios como máximo podrá tener el sistema?

Que como máximo sólo pueden haber 10 usuarios a la vez en el sistema, lo cual supone una gran limitación.
Esta limitacion viene dada de la misma naturaleza de los arrays, ya que tienen una longitud fija dada
en el momento de su creación.

Otra limitacion puede ser que, ya que los dos arrays (el de usuarios y passwords) son completamente independientes
el uno del otro, el mantenimiento de los índices de los mismos puede ser tedioso y es bastante
propenso a fallos si el programa siguiera creciendo. Se necesitaría un único array que contuviera
tanto el usuario como la contrasenia.
 */
