package com.es.programacion.Tema7.Teoria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTeoria {
    public static void main(String[] args) {
        // TEORIA DE BUFFERED READER
        /*
        BufferedReader es una clase en Java que hereda de Reader.
        Esta clase BufferedReader añade funcionalidades muy útiles como puede ser
        el método .readline(): String
        Este método .readline lee una linea entera del fichero y la devuelve en forma de String

        Para construir un objeto de tipo BufferedReader, le pasamos por parámetros otro Reader
         */

        String ls = File.separator;
        File fichero = new File("src/main/resources/archivosTema7/buffered_ficheros.txt");

        try {
            if (fichero.exists() && fichero.isFile() && fichero.canRead()){
                // Abrir flujo de lectura
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
                // En este punto ya tenemos un BufferedReader a punto y listo para leer

                // Operar con el fichero
                String lineaDelFichero = br.readLine();
                while(lineaDelFichero != null){
                    System.out.println(lineaDelFichero);
                    lineaDelFichero = br.readLine();
                }
                // Cuando sale del bucle significa que ya no hay más líneas que leer
                br.close();
                fr.close();
            }


        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Error al operar con los ficheros");
        }

    }
}
