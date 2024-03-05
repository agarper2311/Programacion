package com.es.programacion.Tema7.Teoria;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class RutasFicheros {
    public static void main(String[] args) {
        // Rutas absolutas vs Rutas relativas
        File fichAbsoluto = new File("D:\\Instituto\\Programacion\\Programacion\\src\\main\\resources\\archivosTema7\\fich.txt");
        System.out.println("¿El fichero existe? " + fichAbsoluto.exists());

        File fichRelativo = new File("src/main/resources/archivosTema7/fich.txt");
        System.out.println("¿El fichero existe? " + fichRelativo.exists());

        // Para conocer la línea separadora hacemos uso de
        String lineaSeparadora = File.separator;
        System.out.println("La linea separadora es: " + lineaSeparadora);


        // 0º primero comprobamos que exista el fichero
        if (fichRelativo.exists()) {
            // 1º Abrir el flujo --> Al leer/escribir en ficheros,  se lanzan excepciones
            // esas excepciones son de IOExeption y FileNotFoundException
            FileReader fl = null;
            try {
                // Aquí abrimos el flujo de lectura (fl), al crear un objeto de tipo FileReader
                fl = new FileReader(fichRelativo, StandardCharsets.UTF_8);

                // 2º Operar con el fichero... En este caso, leemos la información
                int character = fl.read();
                while (character != -1) {
                    System.out.print((char) character);
                    character = fl.read();
                }
                // 3º Cerrar el flujo
                fl.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            // Escritura en ficheros
            if (fichRelativo.exists() && fichRelativo.isFile()) {
                FileWriter fw = null;
                Scanner scan = new Scanner(System.in); // Crear un Scanner para leer la entrada del usuario
                try {
                    fw = new FileWriter(fichRelativo); // Abrir el flujo de escritura, en modo append

                    System.out.println("Escribe el texto que quieras guardar en el archivo: ");
                    while (scan.hasNextLine()) {
                        String input = scan.nextLine();
                        if ("FIN".equalsIgnoreCase(input)) { // Terminar la lectura si el usuario escribe FIN
                            break;
                        }
                        fw.write(input + "\n"); // Escribir la entrada del usuario en el fichero
                    }

                    fw.close(); // Cerrar el flujo
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (fw != null) {
                        try {
                            fw.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }
    }
}
