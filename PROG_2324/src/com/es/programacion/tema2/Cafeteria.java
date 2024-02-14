package com.es.programacion.tema2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Cafeteria {

    public static void main(String[] args) {

        // Variables que voy a usar durante el programa
        Scanner scan = new Scanner(System.in);
        String userRegistrado = "admin";
        String passRegistrada = "admin";

        // 1º Zona de bienvenida y login
        String intentoUser = "";
        String intentoPass = "";

        System.out.println("Bienvenid@ a UbriCoffee. Por favor, introduzca sus credenciales para continuar (Pulse 0 para salir)");
        do {

            // Leo el usuario por teclado
            System.out.print("Usuario: ");
            intentoUser = scan.nextLine();

            // Si el usuario ha introducido un 0, es que quiere salir
            if (intentoUser.equals("0")){
                break;
            }

            // Leo la contrasenia por teclado
            System.out.print("Password: ");
            intentoPass = scan.nextLine();


            // Si el usuario ha introducido un 0, es que quiere salir
            if (intentoPass.equals("0")){
                break;
            }

            // Si introduce incorrectamente las credenciales, pues le muestro un mensaje diciéndoselo.
            if(!intentoUser.equals(userRegistrado) || !intentoPass.equals(passRegistrada)){
                System.out.println("Usuario o contrasenia incorrectos, vuelva a intentarlo (0 para salir)");
            }


        } while (!intentoUser.equals(userRegistrado) || !intentoPass.equals(passRegistrada));

        // Una vez fuera del bucle, si el usuario ha introducido un 0, es que quería salir
        if (intentoUser.equals("0") || intentoPass.equals("0")){
            System.out.println("Salir");
        } else {

            // Si no ha pulsado Salir, pues empiezo con el menú

            // Muestro un mensaje de bienvenida al usuario
            System.out.println("\nBienvenid@ "+userRegistrado);

            // Declaro una variable para controlar la opción introducida
            int opc = 0;
            int contadorCafe = 0;
            int contadorAgua = 0;
            int contadorTostada = 0;
            do {

                // Muestro el menú
                System.out.println("1.\tCafé\t1€");
                System.out.println("2.\tAgua\t0,50€");
                System.out.println("3.\tTostada\t1.20€");
                System.out.println("0.\tSalir\n");
                System.out.print("Seleccione un producto (0 para salir): ");
                opc = scan.nextInt();

                // Simplemente, pongo unos if-else para aumentar el contador de lo que seleccione el usuario para después poder mostrar lo que tiene que pagar
                if (opc == 1){

                    contadorCafe++;
                    System.out.println("Ha seleccionado un café\n");

                } else if (opc == 2) {

                    contadorAgua++;
                    System.out.println("Ha seleccionado agua\n");

                } else if (opc == 3) {

                    contadorTostada++;
                    System.out.println("Ha seleccionado tostada\n");

                } else if (opc==0) {

                    // EXTRA. Permitir al usuario volver atrás si quiere seguir comprando
                    // Si ha marcado la opc 0, es que quiere salir, entonces voy a controlar esa opción para darle la opción de arrepentirse
                    System.out.println("Salir");
                    System.out.println("Ha seleccionado:");
                    System.out.println(contadorCafe + " cafés");
                    System.out.println(contadorAgua + " aguas");
                    System.out.println(contadorTostada + " tostada");
                    System.out.println("Total:\t\t"+(contadorCafe*1 + contadorAgua*0.5 + contadorTostada*1.2)+"€");

                    System.out.println("¿Realmente quiere salir?");
                    System.out.println("0.\tSí");
                    System.out.println("1.\tNo");

                    opc = scan.nextInt();

                    if(opc!=0 && opc!=1){
                        System.out.println("Opción incorrecta, se procede a salir");
                        opc = 0;
                    }
                }
            } while (opc != 0);



            // Zona paso por caja definitiva.
            System.out.println("\nSu selección:");
            System.out.println(contadorCafe + " cafés");
            System.out.println(contadorAgua + " aguas");
            System.out.println(contadorTostada + " tostada");
            System.out.println("Total:\t\t"+(contadorCafe*1 + contadorAgua*0.5 + contadorTostada*1.2)+"€");

            System.out.print("Gracias por confiar en UbriCoffee, que pase un");

            // EXTRA NO PUNTUABLE: Que de un mensaje de despedida dependiendo de la hora
            LocalDateTime time = LocalDateTime.now();
            int hora = time.getHour();
            if(hora >= 12 && hora < 21){
                System.out.println("a buena tarde");
            } else if (hora >= 21 && hora <= 23 || hora >= 0 && hora < 6) {
                System.out.println("a buena noche");
            } else {
                System.out.println(" buen día");
            }
        }
    }
}
