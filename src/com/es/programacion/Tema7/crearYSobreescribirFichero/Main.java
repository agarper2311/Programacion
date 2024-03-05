package com.es.programacion.Tema7.crearYSobreescribirFichero;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;

        // Especifica la ruta donde deseas guardar el archivo de texto
        String filePath = "src/main/resources/archivosTema7/usuarios_y_contrasenas.txt";

        try {
            // Usar FileWriter para escribir en el archivo, el segundo parámetro 'true' indica que se añadirá al archivo (append)
            FileWriter fileWriter = new FileWriter(filePath, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            while(true) {
                System.out.println("Escribe tu nombre de usuario o 'FIN' para terminar:");
                username = scanner.nextLine();

                // Verifica si el usuario escribió "FIN" para terminar el bucle
                if(username.equalsIgnoreCase("FIN")) {
                    break;
                }

                System.out.println("Escribe tu contraseña:");
                password = scanner.nextLine();

                // Escribe el nombre de usuario y la contraseña en el archivo
                printWriter.println("Usuario: " + username + ", Contraseña: " + password);
            }

            // Cierra PrintWriter y FileWriter (el flujo de datos)
            printWriter.close();
            fileWriter.close();

            System.out.println("Los nombres de usuario y contraseñas se han guardado exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}

