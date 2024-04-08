package com.Programacion.Tema5.proyectoPeliculas;

import com.Programacion.Tema5.proyectoPeliculas.clases.Pelicula;
import com.Programacion.Tema5.proyectoPeliculas.utils.JsonReaderUtil;
import java.util.ArrayList;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        String pelisPath = "IMDB-api/Top250Movies.json";
        ArrayList<Pelicula> peliculas = JsonReaderUtil.loadJsonFile(pelisPath);


        // PARA LA CLASE DEL 16/01
        // Buscar las películas de antes de los 2000
        // 1º un for para recorrer la lista de peliculas
        for(int i=0; i<peliculas.size(); i++) {

            // Ahora tengo que hacer una condición para comprobar el anio
            if(Integer.parseInt(peliculas.get(i).getYear()) < 2000) {
                System.out.println("- "+peliculas.get(i).getFullTitle());
            }

        }


        // Buscar las películas que tengan de nota menor que 8.5
        for(int i=0; i<peliculas.size(); i++) {

            // Ahora tengo que hacer una condición para comprobar el anio
            if(Double.parseDouble(peliculas.get(i).getImDbRating()) < 8.5) {
                System.out.println("- "+peliculas.get(i).getFullTitle());
            }

        }

        // Buscar la película más antigua de la lista
        // Voy a recorrer la lista de películas comparando la fecha
        Pelicula peliMasAntigua = peliculas.get(0);
        for(int i=0; i<peliculas.size(); i++) {

            int anioPeli = Integer.parseInt(peliculas.get(i).getYear());

            if(anioPeli < Integer.parseInt(peliMasAntigua.getYear())) {
                peliMasAntigua = peliculas.get(i);
            }
        }
        System.out.println("La peli mas antigua es: "+peliMasAntigua.getFullTitle());


        // Buscar la película más moderna de la lista
        Pelicula peliMasModerna = peliculas.get(0);
        for(int i=0; i<peliculas.size(); i++) {

            int anioPeli = Integer.parseInt(peliculas.get(i).getYear());

            if(anioPeli > Integer.parseInt(peliMasModerna.getYear())) {
                peliMasModerna = peliculas.get(i);
            }
        }
        System.out.println("La peli mas moderna es: "+peliMasModerna.getFullTitle());

        // Buscar las películas protagonizadas por Emma Stone
        ArrayList<Pelicula> peliculasEmma = new ArrayList<Pelicula>();
        for(int i=0; i<peliculas.size(); i++) {

            // Compruebo, haciendo uso del método contains, si en el crew de la película
            // existe la cadena "Emma Stone"...
            // Si existe, la aniado al ArrayList peliculasEmma
            if(peliculas.get(i).getCrew().contains("Emma Stone")) {
                peliculasEmma.add(peliculas.get(i));
            }

        }

        // Finalmente recorro peliculasEmma y muestro su contenido por pantalla
        for (int i=0; i<peliculasEmma.size(); i++) {
            System.out.println("Peliculas protagonizadas por Emma Stone");
            System.out.println("\t- "+peliculasEmma.get(i).getFullTitle());
        }

        // Buscar las películas protagonizadas por Robin Williams

        // Generamos un id aleatorio usando la clase UUID





    }
}
