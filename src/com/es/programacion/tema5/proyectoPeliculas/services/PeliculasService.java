package com.Programacion.Tema5.proyectoPeliculas.services;
/*
import java.util.Collections;
import java.util.Comparator;

import com.Programacion.Tema5.proyectoPeliculas.MainCreacion;
import com.Programacion.Tema5.proyectoPeliculas.clases.Pelicula;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;

import static com.Programacion.Tema5.proyectoPeliculas.MainCreacion.peliculas;

public class PeliculasService {


    private static Pelicula nuevaPelicula;

    public static boolean addPelicula() {
        // Adicion de una pelicula nueva
        Scanner scan = new Scanner(System.in);

        System.out.print("Dime el nombre de la pelicula: ");
        String nombrePeli = scan.nextLine();

        int anio = 0;
        try {
            System.out.print("Dime el anio de publicación de la pelicula: ");
            anio = scan.nextInt();
            scan.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Anio erroneo...");
        }

        System.out.print("Dime el nombre del director/a: ");
        String dir = scan.nextLine();


        System.out.print("Dime el nombre del/a actor/actriz 1: ");
        String act1 = scan.nextLine();


        System.out.print("Dime el nombre del/a actor/actriz 2: ");
        String act2 = scan.nextLine();

        String id = UUID.randomUUID().toString();

        double nota = 0.0;
        try {
            System.out.print("Dime la nota de la pelicula: ");
            nota = scan.nextDouble();
            scan.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Nota erronea...");
        }

        Pelicula peliNueva = new Pelicula(id, nombrePeli, anio + "",
                dir, act1, act2, nota + "");


        boolean peliExiste = false;
        for (int i = 0; i < peliculas.size(); i++) {

            if (peliculas.get(i).getId().equals(peliNueva.getId())) {
                System.out.println("Pelicula ya existente");
                peliExiste = true;
                break;
            }

        }

        if (!peliExiste) {

            // Vamos a comprobar la posición en la que tenemos que meter la peli
            for (int i = 0; i < peliculas.size(); i++) {
                double notaPelinueva = Double.parseDouble(peliNueva.getImDbRating());
                double notaPeliLista = Double.parseDouble(peliculas.get(i).getImDbRating());

                if (notaPelinueva > notaPeliLista) {
                    //Insertamos la peliNueva en la posición de la pelicula de la lista
                    peliNueva.setRank(peliculas.get(i).getRank());
                    peliculas.add(i, peliNueva);

                    // For para actualizar el Rank de las películas y J es el valor de i + 1
                    for (int j = i + 1; j < peliculas.size(); j++) {

                        int rankingAntiguo = Integer.parseInt(peliculas.get(j).getRank());
                        int rankingNuevo = rankingAntiguo + 1;
                        peliculas.get(j).setRank(rankingNuevo + "");
                    }

                    break;
                }
            }

            System.out.println("Pelicula correctamente añadida...");
            return true;
        }


        return false;
    }

    public static void mostrarPeliculasDesc() {
        for (int j = 0; j < peliculas.size(); j++) {
            System.out.printf("|-----------(%s)---------------\n", peliculas.get(j).getRank());
            System.out.printf("|- Titulo (año): %s\n", peliculas.get(j).getFullTitle());
            System.out.printf("|\t- Nota: %s\n", peliculas.get(j).getImDbRating());
            System.out.printf("|\t- Reparto: %s\n", peliculas.get(j).getCrew());
        }
    }

    public static void mostrarPeliculasAsc() {
        // Ordenar la lista de películas por nota de mayor a menor
        peliculas.sort(Comparator.comparingDouble(p -> -Double.parseDouble(p.getImDbRating())));

        // Mostrar la lista ordenada
        System.out.println("Lista de películas de menor a mayor nota:");
        for (Pelicula pelicula : peliculas) {
            System.out.printf("|-----------(%s)---------------\n", pelicula.getRank());
            System.out.printf("|- Titulo (año): %s\n", pelicula.getFullTitle());
            System.out.printf("|\t- Nota: %s\n", pelicula.getImDbRating());
            System.out.printf("|\t- Reparto: %s\n", pelicula.getCrew());
        }
    }

    public static void mostrarPeliculasDesde2000() {
        // Obtener el año actual (2024)
        int anioActual = 2024;

        // Mostrar las películas del año 2000 hasta la actualidad (2024) ordenadas por nota de mayor a menor
        System.out.println("Lista de películas del año 2000 hasta 2024, ordenadas por nota de mayor a menor:");
        for (Pelicula pelicula : peliculas) {
            int year = Integer.parseInt(pelicula.getYear());

            if (year >= 2000 && year <= anioActual) {
                System.out.printf("|-----------(%s)---------------\n", pelicula.getRank());
                System.out.printf("|- Título (año): %s\n", pelicula.getFullTitle());
                System.out.printf("|\t- Nota: %s\n", pelicula.getImDbRating());
                System.out.printf("|\t- Reparto: %s\n", pelicula.getCrew());
            }
        }
    }

    public static void mostrarPeliculasConNota() {
        // Obtener el año actual (2024)
        int currentYear = 2024;

        Scanner scan = new Scanner(System.in);

        // Pedir al usuario que ingrese la nota mínima de la película
        System.out.print("Ingrese la nota mínima de la película: ");
        int notaMinima = scan.nextInt();

        System.out.println("Lista de películas del año 2000 hasta 2024, con nota igual o superior a " + notaMinima);
        for (Pelicula pelicula : peliculas) {
            int year = Integer.parseInt(pelicula.getYear());
            double nota = Double.parseDouble(pelicula.getImDbRating());

            if (year >= 2000 && year <= currentYear && nota >= notaMinima) {
                System.out.printf("|-----------(%s)---------------\n", pelicula.getRank());
                System.out.printf("|- Título (año): %s\n", pelicula.getFullTitle());
                System.out.printf("|\t- Nota: %s\n", pelicula.getImDbRating());
                System.out.printf("|\t- Reparto: %s\n", pelicula.getCrew());
            }
        }
    }

    public static void mostrarPeliculaPorTitulo() {
        Scanner scan = new Scanner(System.in);

        // Pedir al usuario que ingrese el título de la película
        System.out.print("Ingrese el título completo de la película (incluyendo el año): ");
        String tituloBuscado = scan.nextLine();

        // Buscar la película por título
        Pelicula peliculaEncontrada = null;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getFullTitle().equalsIgnoreCase(tituloBuscado)) {
                peliculaEncontrada = pelicula;
                break; // Terminar el bucle si se encuentra la película
            }
        }

        // Mostrar la información de la película encontrada o mensaje de no encontrada
        if (peliculaEncontrada != null) {
            System.out.println("Información de la película encontrada:");
            System.out.printf("|-----------(%s)---------------\n", peliculaEncontrada.getRank());
            System.out.printf("|- Título (año): %s\n", peliculaEncontrada.getFullTitle());
            System.out.printf("|\t- Nota: %s\n", peliculaEncontrada.getImDbRating());
            System.out.printf("|\t- Reparto: %s\n", peliculaEncontrada.getCrew());
        } else {
            System.out.println("No se encontró ninguna película con el título proporcionado.");
        }
    }

    public static void mostrarPeliculaPorDirector() {
        Scanner scan = new Scanner(System.in);

        // Pedir al usuario que ingrese el nombre del director
        System.out.print("Ingrese el nombre del director: ");
        String directorBuscado = scan.nextLine();

        // Buscar la película por director
        Pelicula peliculaEncontrada = null;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getCrew().toLowerCase().contains(directorBuscado.toLowerCase())) {
                peliculaEncontrada = pelicula;
                break; // Terminar el bucle si se encuentra la película
            }
        }

        // Mostrar la información de la película encontrada o mensaje de no encontrada
        if (peliculaEncontrada != null) {
            System.out.println("Información de la película encontrada:");
            System.out.printf("|-----------(%s)---------------\n", peliculaEncontrada.getRank());
            System.out.printf("|- Título (año): %s\n", peliculaEncontrada.getFullTitle());
            System.out.printf("|\t- Nota: %s\n", peliculaEncontrada.getImDbRating());
            System.out.printf("|\t- Reparto: %s\n", peliculaEncontrada.getCrew());
        } else {
            System.out.println("No se encontró ninguna película con el director proporcionado.");
        }
    }

    public static void eliminarPelicula() {
        Scanner scan = new Scanner(System.in);

        // Mostrar la lista actual de películas
        System.out.println("Lista actual de películas:");
        mostrarPeliculasDesc();

        // Solicitar al usuario el Rank de la película a eliminar
        System.out.print("Ingrese el Rank de la película que desea eliminar: ");
        String rankToDelete = scan.nextLine();

        // Buscar la película en la lista por el Rank
        boolean peliculaEncontrada = false;
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).getRank().equals(rankToDelete)) {
                peliculas.remove(i);
                peliculaEncontrada = true;
                break;
            }
        }


        public static void imprimirPeliculasDecada () {
            Scanner scan = new Scanner(System.in);

            // Pedir al usuario que ingrese la década
            System.out.print("Ingrese la década (por ejemplo, 2000 para la década de 2000-2009): ");
            int decada = scan.nextInt();

            int inicioDecada = decada;
            int finDecada = decada + 9;

            // Mostrar las películas de la década indicada
            System.out.println("Lista de películas de la década " + decada + " - " + finDecada + ":");
            boolean encontrada = false;
            for (Pelicula pelicula : peliculas) {
                int year = Integer.parseInt(pelicula.getYear());

                if (year >= inicioDecada && year <= finDecada) {
                    encontrada = true;
                    System.out.printf("|-----------(%s)---------------\n", pelicula.getRank());
                    System.out.printf("|- Título (año): %s\n", pelicula.getFullTitle());
                    System.out.printf("|\t- Nota: %s\n", pelicula.getImDbRating());
                    System.out.printf("|\t- Reparto: %s\n", pelicula.getCrew());
                }
            }

            if (!encontrada) {
                System.out.println("No se encontraron películas para la década indicada.");
            }
        }

        public static void incorporarNuevaPelicula(){
            // Pedir al usuario que ingrese los datos de la nueva película
            System.out.print("Ingrese el título de la película: ");
            String titulo = scan.nextLine();
            System.out.print("Ingrese el año de la película: ");
            String anio = scan.nextLine();
            System.out.print("Ingrese la puntuación de la película: ");
            String puntuacion = scan.nextLine();
            System.out.print("Ingrese el nombre del director: ");
            String director = scan.nextLine();
            System.out.print("Ingrese el reparto (2 actores/actrices principales): ");
            String reparto = scan.nextLine();

            // Crear la nueva película
            Pelicula nuevaPelicula = new Pelicula(anio, "", titulo + " (" + anio + ")", director, reparto, puntuacion, "");

            // Agregar la nueva película en la posición correcta de la lista según su nota
            mostrarPeliculasDesc();

            System.out.println("La nueva película se ha incorporado correctamente.");
        }

        private static void agregarPeliculaOrdenada (Pelicula nuevaPelicula){
            // Agregar la nueva película en la posición correcta de la lista según su nota
            double nuevaNota = Double.parseDouble(nuevaPelicula.getImDbRating());

            int i;
            for (i = 0; i < peliculas.size(); i++) {
                double notaExistente = Double.parseDouble(peliculas.get(i).getImDbRating());
                if (nuevaNota > notaExistente) {
                    break;
                }
            }

            peliculas.add(i, nuevaPelicula);
        }

        public static void eliminarPeliculaPorPosicion () {
            Scanner scan = new Scanner(System.in);

            // Pedir al usuario que ingrese la posición de la película a eliminar
            System.out.print("Ingrese la posición de la película a eliminar: ");
            int posicion = scan.nextInt();

            if (posicion >= 0 && posicion < peliculas.size()) {
                peliculas.remove(posicion);
                System.out.println("La película se ha eliminado correctamente.");
            } else {
                System.out.println("Error: La posición indicada está fuera del rango de películas existentes.");
            }
        }

        public static void eliminarPeliculaPorNombre(){
            Scanner scan = new Scanner(System.in);

            // Pedir al usuario que ingrese el nombre de la película a eliminar
            System.out.print("Ingrese el nombre de la película a eliminar: ");
            String nombrePelicula = scan.nextLine();

            boolean eliminada = false;
            // Buscar la película por nombre y eliminarla si se encuentra
            for (Pelicula pelicula : peliculas) {
                if (pelicula.getFullTitle().equalsIgnoreCase(nombrePelicula)) {
                    peliculas.remove(pelicula);
                    eliminada = true;
                    System.out.println("La película se ha eliminado correctamente.");
                    break;
                }
            }

            if (!eliminada) {
                System.out.println("No se encontró ninguna película con el nombre proporcionado.");
            }
        }

        public static void modificarDatosPelicula () {
            Scanner scan = new Scanner(System.in);

            // Pedir al usuario que ingrese el nombre de la película a modificar
            System.out.print("Ingrese el nombre de la película a modificar: ");
            String nombrePeliculaModificar = scan.nextLine();

            boolean encontrada = false;
            // Buscar la película por nombre y mostrar sus datos si se encuentra
            for (Pelicula pelicula : peliculas) {
                if (pelicula.getFullTitle().equalsIgnoreCase(nombrePeliculaModificar)) {
                    encontrada = true;
                    System.out.println("Datos actuales de la película:");
                    System.out.printf("|-----------(%s)---------------\n", pelicula.getRank());
                    System.out.printf("|- Título (año): %s\n", pelicula.getFullTitle());
                    System.out.printf("|\t- Nota: %s\n", pelicula.getImDbRating());
                    System.out.printf("|\t- Reparto: %s\n", pelicula.getCrew());

                    // Pedir al usuario que ingrese los nuevos datos de la película
                    System.out.print("Ingrese el nuevo título de la película: ");
                    String nuevoTitulo = scan.nextLine();
                    System.out.print("Ingrese el nuevo año de la película: ");
                    String nuevoAnio = scan.nextLine();
                    System.out.print("Ingrese la nueva puntuación de la película: ");
                    String nuevaPuntuacion = scan.nextLine();

                    // Modificar los datos de la película
                    pelicula.setFullTitle(nuevoTitulo + " (" + nuevoAnio + ")");
                    pelicula.setYear(nuevoAnio);
                    pelicula.setImDbRating(nuevaPuntuacion);

                    System.out.println("La película se ha modificado correctamente.");
                    break;
                }
            }

            if (!encontrada) {
                System.out.println("No se encontró ninguna película con el nombre proporcionado.");
            }
        }

        private static void agregarPeliculaOrdenada (Pelicula) {
        // Agregar la nueva película en la posición correcta de la lista según su nota
        double nuevaNota = Double.parseDouble(nuevaPelicula.getImDbRating());

        int i;
        for (i = 0; i < peliculas.size(); i++) {
            double notaExistente = Double.parseDouble(peliculas.get(i).getImDbRating());
            if (nuevaNota > notaExistente) {
                break;
            }
        }

        peliculas.add(i, nuevaPelicula);
        }

    }


    } */