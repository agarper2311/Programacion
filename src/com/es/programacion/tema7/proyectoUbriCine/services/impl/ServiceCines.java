package com.es.programacion.tema7.proyectoUbriCine.services.impl;
import com.es.programacion.tema7.proyectoUbriCine.model.Butaca;
import com.es.programacion.tema7.proyectoUbriCine.model.Cine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceCines {

    private Cine cine;
    private String rutaArchivoEntradas = "src/main/resources/archivosTema7/proyectoUbriCines/entradasVendidas.txt";
    Scanner scan = new Scanner(System.in);

    // Método para cargar las butacas desde el archivo
    public void cargarButacas() {
        ArrayList<Butaca> butacas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivoEntradas))) {
            String linea;
            // Leer cada línea del archivo
            while ((linea = br.readLine()) != null) {
                String[] valores = linea.split(":");
                // Verificar el formato de la línea
                if (valores.length == 3) {
                    int fila = Integer.parseInt(valores[0]);
                    int asiento = Integer.parseInt(valores[1]);
                    String idUsuario = valores[2];
                    Butaca butaca = new Butaca(fila, asiento, idUsuario);
                    butacas.add(butaca);
                } else {
                    System.err.println("Error en formato: " + linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de butacas: " + e.getMessage());
        }

        // Crear una matriz para representar los asientos del cine
        String[][] asientos = new String[10][10];
        for (Butaca butaca : butacas) {
            asientos[butaca.getFila() - 1][butaca.getAsiento() - 1] = "XX";
        }

        // Crear una instancia de Cine con las butacas cargadas
        cine = new Cine("Cine", asientos, butacas);
    }

    // Método para mostrar las butacas disponibles y ocupadas del cine
    public void mostrarButacas() {
        String[][] asientos = cine.getAsientosSala();
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j] == null) {
                    System.out.print("__  ");
                } else {
                    System.out.print("XX  ");
                }
            }
            System.out.println();
        }
    }

    // Método para comprar una entrada
    public void comprarEntrada() {
        mostrarButacas();
        System.out.println("Seleccione una butaca para comprar (fila, asiento):");
        Scanner scanner = new Scanner(System.in);
        int filaSeleccionada = scanner.nextInt();
        int asientoSeleccionado = scanner.nextInt();

        // Verificar si la butaca está disponible
        if (cine.getAsientosSala()[filaSeleccionada - 1][asientoSeleccionado - 1] == null) {
            System.out.println("Introduce tu ID de usuario:");
            String idUsuario = scanner.next();
            cine.getEntradasVendidas().add(new Butaca(filaSeleccionada, asientoSeleccionado, idUsuario));
            cine.getAsientosSala()[filaSeleccionada - 1][asientoSeleccionado - 1] = "XX";
            guardarEntradas();  // Guardar la butaca comprada en el archivo
            System.out.println("Entrada comprada con éxito.");
        } else {
            System.out.println("La butaca seleccionada está ocupada.");
        }
    }

    // Método para guardar las entradas vendidas en el archivo
    private void guardarEntradas() {
        try (PrintWriter pw = new PrintWriter(rutaArchivoEntradas)) {
            for (Butaca butaca : cine.getEntradasVendidas()) {
                pw.println(butaca.getFila() + ":" + butaca.getAsiento() + ":" + butaca.getIdUsuario());
            }
        } catch (IOException e) {
            System.err.println("Error al guardar las entradas: " + e.getMessage());
        }
    }

    // Método para devolver una entrada
    public void devolverEntrada() {
        System.out.println("Introduce tu ID de usuario:");
        Scanner scanner = new Scanner(System.in);
        String idUsuario = scanner.next();
        ArrayList<Butaca> butacasUsuario = new ArrayList<>();

        // Buscar las butacas del usuario en las entradas vendidas
        for (Butaca butaca : cine.getEntradasVendidas()) {
            if (butaca.getIdUsuario().equals(idUsuario)) {
                butacasUsuario.add(butaca);
            }
        }

        // Mostrar las butacas compradas por el usuario
        if (butacasUsuario.isEmpty()) {
            System.out.println("No tienes ninguna entrada comprada.");
            return;
        }

        System.out.println("Tus butacas compradas:");
        for (Butaca butaca : butacasUsuario) {
            System.out.println(butaca);
        }

        System.out.println("Seleccione una butaca para devolver (fila, asiento):");
        int filaSeleccionada = scanner.nextInt();
        int asientoSeleccionado = scanner.nextInt();

        // Buscar y devolver la entrada seleccionada
        boolean entradaEncontrada = false;
        for (int i = 0; i < butacasUsuario.size(); i++) {
            Butaca butaca = butacasUsuario.get(i);
            if (butaca.getFila() == filaSeleccionada && butaca.getAsiento() == asientoSeleccionado) {
                cine.getAsientosSala()[filaSeleccionada - 1][asientoSeleccionado - 1] = null;
                cine.getEntradasVendidas().remove(butaca);
                guardarEntradas();
                System.out.println("Entrada devuelta con éxito.");
                entradaEncontrada = true;
                break;
            }
        }

        if (!entradaEncontrada) {
            System.out.println("La butaca seleccionada no pertenece a tus compras.");
        }
    }
}

