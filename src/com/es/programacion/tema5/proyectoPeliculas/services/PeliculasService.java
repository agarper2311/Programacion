package com.es.programacion.tema5.proyectoPeliculas.services;

import com.es.programacion.tema5.proyectoPeliculas.MainCreacion;
import com.es.programacion.tema5.proyectoPeliculas.clases.Pelicula;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;

public class PeliculasService {


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

        Pelicula peliNueva = new Pelicula(id, nombrePeli, anio+"",
                dir, act1, act2, nota+"");



        boolean peliExiste = false;
        for(int i=0; i<MainCreacion.peliculas.size(); i++) {

            if(MainCreacion.peliculas.get(i).getId().equals(peliNueva.getId())) {
                System.out.println("Pelicula ya existente");
                peliExiste = true;
                break;
            }

        }

        if(!peliExiste){
            // Vamos a comprobar la posición en la que tenemos que meter la peli
            for (int i=0; i<MainCreacion.peliculas.size(); i++) {

                double notaPelinueva = Double.parseDouble(peliNueva.getImDbRating());
                double notaPeliLista = Double.parseDouble(MainCreacion.peliculas.get(i).getImDbRating());


                if(notaPelinueva > notaPeliLista) {
                    // Insertamos la peliNueva en la posición de la pelicula de la lista
                    peliNueva.setRank(MainCreacion.peliculas.get(i).getRank());
                    MainCreacion.peliculas.add(i, peliNueva);

                    for (int j=i+1; j<MainCreacion.peliculas.size(); j++) {

                        int rankingAntiguo = Integer.parseInt(MainCreacion.peliculas.get(j).getRank());
                        int rankingNuevo = rankingAntiguo + 1;
                        MainCreacion.peliculas.get(j).setRank(rankingNuevo+"");
                    }
                    break;
                }
            }
            System.out.println("Pelicula correctamente anadida...");
            return true;
        }
        return false;
    }



    public static void mostrarPeliculasDesc() {

        for (int i=0; i<MainCreacion.peliculas.size(); i++){

            System.out.printf("----(%s)---------\n", MainCreacion.peliculas.get(i).getRank());
            System.out.printf("- Titulo (año): %s\n", MainCreacion.peliculas.get(i).getFullTitle());
            System.out.printf("\t* Nota: %s\n", MainCreacion.peliculas.get(i).getImDbRating());
            System.out.printf("\t* Reparto: %s\n", MainCreacion.peliculas.get(i).getCrew());

        }

    }



}
