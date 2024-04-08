package com.es.programacion.Tema7.proyectoAirbnbAngel.proyectoAirbnb;

import com.es.programacion.Tema7.proyectoAirbnb.model.Alojamiento;
import com.es.programacion.Tema7.proyectoAirbnb.services.GestionFichAirbnb;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionFichAirbnb gestion = new GestionFichAirbnb();

        // Definición de rutas
        String rutaOriginalMalaga = "src/main/resources/archivosTema7/Airbnb/malaga.csv";
        String rutaDatosMalaga = "src/main/resources/archivosTema7/Airbnb/datos_malaga.csv";

        // Cargar alojamientos desde el CSV
        List<Alojamiento> alojamientos = gestion.cargarAlojamientosDesdeCSV(rutaOriginalMalaga);

        // Guardar en nuevo archivo para confirmar la extracción

        gestion.guardarAlojamientosEnCSV(alojamientos, rutaDatosMalaga);

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Imprimir los 20 alojamientos más baratos");
            System.out.println("2. Imprimir los 20 alojamientos más caros");
            System.out.println("3. Filtrar por presupuesto máximo");
            System.out.println("4. Modificar el precio de un alojamiento");
            System.out.println("5. Modificar el propietario de un alojamiento");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Imprimir los 20 alojamientos más baratos
                    System.out.println("Los 20 alojamientos más baratos:");
                    GestionFichAirbnb.imprimirAlojamientos(gestion.baratos(alojamientos, 20));
                    break;
                case 2:
                    // Imprimir los 20 alojamientos más caros
                    System.out.println("Los 20 alojamientos más caros:");
                    GestionFichAirbnb.imprimirAlojamientos(gestion.caros(alojamientos, 20));
                    break;
                case 3:
                    // Filtrar por presupuesto máximo
                    System.out.print("Introduce un presupuesto máximo por noche: ");
                    double presupuesto = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.println("Alojamientos dentro del presupuesto:");
                    GestionFichAirbnb.imprimirAlojamientos(gestion.filtrarPorPresupuesto(alojamientos, presupuesto));
                    break;
                case 4:
                    // Modificar el precio de un alojamiento
                    gestion.modificarPrecio(alojamientos, scanner);
                    // Guardar cambios
                    gestion.guardarAlojamientosEnCSV(alojamientos, rutaDatosMalaga);
                    break;
                case 5:
                    // Modificar el propietario de un alojamiento
                    gestion.modificarPropietario(alojamientos, scanner);
                    // Guardar cambios
                    gestion.guardarAlojamientosEnCSV(alojamientos, rutaDatosMalaga);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }



}
