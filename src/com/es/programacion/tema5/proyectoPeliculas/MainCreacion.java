package com.Programacion.Tema5.proyectoPeliculas;
/*
import com.Programacion.Tema5.proyectoPeliculas.clases.Pelicula;
import com.Programacion.Tema5.proyectoPeliculas.services.PeliculasService;
import com.Programacion.Tema5.proyectoPeliculas.utils.JsonReaderUtil;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCreacion {

    public static ArrayList<Pelicula> peliculas = null;

    public static void main(String[] args) {
        String pelisPath = "IMDB-api/Top250Movies.json";
        peliculas = JsonReaderUtil.loadJsonFile(pelisPath);




        //Hacer un menú para dar la opción de crear un nuevo registro



        Scanner scan = new Scanner(System.in);

        try {
            int opc = 1;

            while (opc != 0){
                System.out.println("""
                _______________________________________
                |Bienvenid@ al CRUD de Películas      |
                |-------------------------------------|
                |1. Insertar película.                |
                |2. Mostrar películas de mayor a menor|
                |3. Mostrar películas de menor a mayor|
                |4. Mostrar pelis desde el 2000-2024  |
                |5. El 4 pero con  nota que diga el   |
                |   usuario por teclado               |
                |6. Mostrar la película que usted     |
                | quiera                              |
                |7. Mostrar las peliculas de un       |
                |   director.                         |
                |8. Eliminar Pelicula                 |
                |0. Salir.                            |
                |_____________________________________|
                """);

                System.out.print("Ingrese su opción: ");

                opc = scan.nextInt();
                switch (opc){
                    case 1:
                        PeliculasService.addPelicula();
                        break;
                    case 2:
                        PeliculasService.mostrarPeliculasDesc();
                        break;
                    case 3:
                        PeliculasService.mostrarPeliculasAsc();
                        break;
                    case 4:
                        PeliculasService.mostrarPeliculasDesde2000();
                        break;
                    case 5:
                        PeliculasService.mostrarPeliculasConNota();
                        break;
                    case 6:
                        PeliculasService.mostrarPeliculaPorTitulo();
                        break;
                    case 7:
                        PeliculasService.mostrarPeliculaPorDirector();
                        break;
                    case 8:
                        PeliculasService.eliminarPelicula();
                        break;

                    case 0:
                        System.out.println("Adios.....");
                        break;
                    default:
                        System.out.println("opcion no valida");
                }
            }


        }catch (InputMismatchException e){
            System.out.println("Opción incorrecta");
        }








    }


 */