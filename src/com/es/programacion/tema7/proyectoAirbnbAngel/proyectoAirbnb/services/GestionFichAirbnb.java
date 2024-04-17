package com.es.programacion.tema7.proyectoAirbnbAngel.proyectoAirbnb.services;

import com.es.programacion.tema7.proyectoAirbnb.model.Alojamiento;
import com.es.programacion.tema7.proyectoAirbnb.model.Propietario;

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
            boolean esPrimeraLinea = true; // Agregado para saltar la primera l�nea
            while ((linea = br.readLine()) != null) {
                // Saltar la primera l�nea que contiene los encabezados
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
                     *  Ten�a un fallo con esta linea, he prescicindido de chatGPT para resolverlo
                     *    double price = Double.parseDouble(partes[4]);
                     */
                    // Aseg�rate de capturar correctamente el �ndice para el precio
                    try {
                        double price = Double.parseDouble(partes[9]); // Ajuste si el �ndice es incorrecto
                        Propietario propietario = new Propietario(hostId, hostName);
                        Alojamiento alojamiento = new Alojamiento(id, name, propietario, price);
                        alojamientos.add(alojamiento);
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("Posici�n Incorrecta");
                    }


                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato de n�mero: " + e.getMessage());
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
    // M�todos imprimirAlojamientos, baratos, caros, filtrarPorPresupuesto, modificarPrecio, modificarPropietario

    // M�todo imprimirAlojamientos
    /*
    Este m�todo toma una lista de alojamientos y los imprime por pantalla
     */
    public static void imprimirAlojamientos(List<Alojamiento> alojamientos) {
        for (int i = 0; i < alojamientos.size(); i++) {
            System.out.println(alojamientos.get(i));
        }
    }

    // M�todo bar�tos
    /*
    Este m�todo recibe la lista de todos los alojamientos y devuelve una lista de los n alojamientos m�s baratos
     */

    public static List<Alojamiento> baratos(List<Alojamiento> alojamientos, int n) {
        Collections.sort(alojamientos);
        List<Alojamiento> resultado = new ArrayList<>();
        for (int i = 0; i < Math.min(n, alojamientos.size()); i++) {
            resultado.add(alojamientos.get(i));
        }
        return resultado;
    }

    // M�todo c�ros
    /*
    Este m�todo funciona de manera similar al m�todo baratos, pero devuelve los n alojamientos m�s caros
     */

    public static List<Alojamiento> caros(List<Alojamiento> alojamientos, int n) {
        Collections.sort(alojamientos, Collections.reverseOrder());
        List<Alojamiento> resultado = new ArrayList<>();
        for (int i = 0; i < Math.min(n, alojamientos.size()); i++) {
            resultado.add(alojamientos.get(i));
        }
        return resultado;
    }

    // M�todo filtrarPorPresupuesto
    /*
    Este m�todo filtra los alojamientos seg�n un presupuesto m�ximo especificado por el usuario
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


    // M�todo modificarPrecio
    /*
    Este m�todo permite al usuario modificar el precio de un alojamiento espec�fico buscando por su ID
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

    // M�todo modificarPropietario
    /*
    Este m�todo permite al usuario modificar el propietario de un alojamiento espec�fico buscando por su ID
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
