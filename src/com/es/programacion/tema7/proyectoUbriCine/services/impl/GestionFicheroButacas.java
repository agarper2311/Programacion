package com.es.programacion.tema7.proyectoUbriCine.services.impl;

import com.es.programacion.tema7.proyectoUbriCine.model.Butaca;
import com.es.programacion.tema7.proyectoUbriCine.services.api.GestionFichero;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestionFicheroButacas implements GestionFichero<Butaca> {

    @Override
    public List<Butaca> leerFichero(String rutaArchivo) {
        List<Butaca> butacas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(":");
                if (data.length == 3) {
                    Butaca butaca = new Butaca(Integer.parseInt(data[0]), Integer.parseInt(data[1]), data[2]);
                    butacas.add(butaca);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return butacas;
    }

    @Override
    public void escribirFichero(List<Butaca> butacas, String rutaArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (Butaca butaca : butacas) {
                bw.write(butaca.getFila() + ":" + butaca.getAsiento() + ":" + butaca.getIdUsuario());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
