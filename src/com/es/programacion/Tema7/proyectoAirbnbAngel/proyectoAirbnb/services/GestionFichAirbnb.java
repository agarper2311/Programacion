package com.es.programacion.Tema7.proyectoAirbnbAngel.proyectoAirbnb.services;

import com.es.programacion.Tema7.proyectoAirbnb.model.Alojamiento;
import com.es.programacion.Tema7.proyectoAirbnb.model.Propietario;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GestionFichAirbnb {

    public static List<Alojamiento> cargarAlojamientosDesdeCSV(String archivo) {
        List<Alojamiento> alojamientos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean esPrimeraLinea = true; // Agregado para saltar la primera línea
            while ((linea = br.readLine()) != null) {
                // Saltar la primera línea que contiene los encabezados
                if (esPrimeraLinea) {
                    esPrimeraLinea = false;
                    continue;
                }
                String[] partes = linea.split(",");
                if (partes.length >= 5) {
                    String id = partes[0];
                    String name = partes[1];
                    String hostId = partes[2];
                    String hostName = partes[3];
                    /**
                     *  Tenía un fallo con esta linea, he prescicindido de chatGPT para resolverlo
                     *    double price = Double.parseDouble(partes[4]);
                     */
                    // Asegúrate de capturar correctamente el índice para el precio
                    try {
                        double price = Double.parseDouble(partes[9]); // Ajuste si el índice es incorrecto
                        Propietario propietario = new Propietario(hostId, hostName);
                        Alojamiento alojamiento = new Alojamiento(id, name, propietario, price);
                        alojamientos.add(alojamiento);
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("Posición Incorrecta");
                    }


                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato de número: " + e.getMessage());
        }
        return alojamientos;
    }

    public static void guardarAlojamientosEnCSV(List<Alojamiento> alojamientos, String archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (int i = 0; i < alojamientos.size(); i++) {
                Alojamiento alojamiento = alojamientos.get(i);
                String linea = String.join(",",
                        alojamiento.getId(),
                        alojamiento.getName(),
                        alojamiento.getPropietario().getHost_id(),
                        alojamiento.getPropietario().getHost_name(),
                        String.valueOf(alojamiento.getPrice()));
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
    // Métodos imprimirAlojamientos, baratos, caros, filtrarPorPresupuesto, modificarPrecio, modificarPropietario

    // Método imprimirAlojamientos
    /*
    Este método toma una lista de alojamientos y los imprime por pantalla
     */
    public static void imprimirAlojamientos(List<Alojamiento> alojamientos) {
        for (int i = 0; i < alojamientos.size(); i++) {
            System.out.println(alojamientos.get(i));
        }
    }

    // Método barátos
    /*
    Este método recibe la lista de todos los alojamientos y devuelve una lista de los n alojamientos más baratos
     */

    public static List<Alojamiento> baratos(List<Alojamiento> alojamientos, int n) {
        Collections.sort(alojamientos);
        List<Alojamiento> resultado = new ArrayList<>();
        for (int i = 0; i < Math.min(n, alojamientos.size()); i++) {
            resultado.add(alojamientos.get(i));
        }
        return resultado;
    }

    // Método cáros
    /*
    Este método funciona de manera similar al método baratos, pero devuelve los n alojamientos más caros
     */

    public static List<Alojamiento> caros(List<Alojamiento> alojamientos, int n) {
        Collections.sort(alojamientos, Collections.reverseOrder());
        List<Alojamiento> resultado = new ArrayList<>();
        for (int i = 0; i < Math.min(n, alojamientos.size()); i++) {
            resultado.add(alojamientos.get(i));
        }
        return resultado;
    }

    // Método filtrarPorPresupuesto
    /*
    Este método filtra los alojamientos según un presupuesto máximo especificado por el usuario
     */

    public static List<Alojamiento> filtrarPorPresupuesto(List<Alojamiento> alojamientos, double presupuesto) {
        List<Alojamiento> resultado = new ArrayList<>();
        for (int i = 0; i < alojamientos.size(); i++) {
            if (alojamientos.get(i).getPrice() <= presupuesto) {
                resultado.add(alojamientos.get(i));
            }
        }
        return resultado;
    }


    // Método modificarPrecio
    /*
    Este método permite al usuario modificar el precio de un alojamiento específico buscando por su ID
     */

    public static void modificarPrecio(List<Alojamiento> alojamientos, Scanner scanner) {
        System.out.print("Introduce el ID del alojamiento que deseas modificar: ");
        String id = scanner.nextLine();
        for (int i = 0; i < alojamientos.size(); i++) {
            if (alojamientos.get(i).getId().equals(id)) {
                System.out.println("Datos del alojamiento a modificar: " + alojamientos.get(i));
                System.out.print("Introduce el nuevo precio: ");
                double nuevoPrecio = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer
                alojamientos.get(i).setPrice(nuevoPrecio);
                System.out.println("Precio actualizado.");
                break;
            }
        }
    }

    // Método modificarPropietario
    /*
    Este método permite al usuario modificar el propietario de un alojamiento específico buscando por su ID
     */

    public static void modificarPropietario(List<Alojamiento> alojamientos, Scanner scanner) {
        System.out.print("Introduce el ID del alojamiento que deseas modificar: ");
        String id = scanner.nextLine();
        for (int i = 0; i < alojamientos.size(); i++) {
            if (alojamientos.get(i).getId().equals(id)) {
                System.out.println("Datos del alojamiento a modificar: " + alojamientos.get(i));
                System.out.print("Introduce el nuevo ID del propietario: ");
                String nuevoHostId = scanner.nextLine();
                System.out.print("Introduce el nuevo nombre del propietario: ");
                String nuevoHostName = scanner.nextLine();
                alojamientos.get(i).getPropietario().setHost_id(nuevoHostId);
                alojamientos.get(i).getPropietario().setHost_name(nuevoHostName);
                System.out.println("Propietario actualizado.");
                break;
            }
        }
    }


}
