package com.es.programacion.tema7.EjerciciosClase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ContadorDePalabras {

    public static void main(String[] args) {
        File archivo = new File("src/main/resources/archivosTema7/ContadorDePalabras.txt"); // 1. Abrir el File

        int nPalabras = 0; // 3. Declarar una variable int nPalabras=0
        int caracter; // 4. Declarar una variable int caracter=0
        boolean esPalabra = false;

        try (FileReader flujoLectura = new FileReader(archivo)) { // 2. Abrir el flujo de lectura
            while ((caracter = flujoLectura.read()) != -1) { // 6. Hacer un bucle while
                if (caracter == ' ' || caracter == '\n' || caracter == '\t') { // 7. Si el caracter es un espacio en blanco
                    if (esPalabra) {
                        nPalabras++; // Suma 1 a nPalabras
                        esPalabra = false;
                    }
                } else {
                    esPalabra = true;
                }
            }
            if (esPalabra) { // Para contar la última palabra si no termina en espacio.
                nPalabras++;
            }
        } catch (IOException e) { // Catch de la excepción
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Número de palabras: " + nPalabras); // 9. Muestra nPalabras por pantalla
    }
}
