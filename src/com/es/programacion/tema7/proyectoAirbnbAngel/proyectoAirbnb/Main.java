package com.es.programacion.tema7.proyectoAirbnbAngel.proyectoAirbnb;

import com.es.programacion.tema7.proyectoAirbnb.model.Alojamiento;
import com.es.programacion.tema7.proyectoAirbnb.services.GestionFichAirbnb;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionFichAirbnb gestion = new GestionFichAirbnb();

        // Definici�n de rutas
        String rutaOriginalMalaga = "src/main/resources/archivosTema7/Airbnb/malaga.csv";
        String rutaDatosMalaga = "src/main/resources/archivosTema7/Airbnb/datos_malaga.csv";

        // Cargar alojamientos desde el CSV
        List<Alojamiento> alojamientos = gestion.cargarAlojamientosDesdeCSV(rutaOriginalMalaga);

        // Guardar en nuevo archivo para confirmar la extracci�n

        gestion.guardarAlojamientosEnCSV(alojamientos, rutaDatosMalaga);

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMen�:");
            System.out.println("1. Imprimir los 20 alojamientos m�s baratos");
            System.out.println("2. Imprimir los 20 alojamientos m�s caros");
            System.out.println("3. Filtrar por presupuesto m�ximo");
            System.out.println("4. Modificar el precio de un alojamiento");
            System.out.println("5. Modificar el propietario de un alojamiento");
            System.out.println("6. Salir");
            System.out.print("Elige una opci�n: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Imprimir los 20 alojamientos m�s baratos
                    System.out.println("Los 20 alojamientos m�s baratos:");
                    GestionFichAirbnb.imprimirAlojamientos(gestion.baratos(alojamientos, 20));
                    break;
                case 2:
                    // Imprimir los 20 alojamientos m�s caros
                    System.out.println("Los 20 alojamientos m�s caros:");
                    GestionFichAirbnb.imprimirAlojamientos(gestion.caros(alojamientos, 20));
                    break;
                case 3:
                    // Filtrar por presupuesto m�ximo
                    System.out.print("Introduce un presupuesto m�ximo por noche: ");
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
                    System.out.println("Opci�n no v�lida.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }



}
