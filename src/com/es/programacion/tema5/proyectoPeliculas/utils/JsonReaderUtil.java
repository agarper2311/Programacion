package com.es.programacion.tema5.proyectoPeliculas.utils;


import com.es.programacion.tema5.proyectoPeliculas.clases.Pelicula;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class JsonReaderUtil {

    public static ArrayList<Pelicula> loadJsonFile(String fileName) {
        // Use the class loader to load the file as an InputStream
        return getPeliculas(fileName);
    }

    private static ArrayList<Pelicula> getPeliculas(String fileName) {
        try (InputStream inputStream = JsonReader.class.getClassLoader().getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new IOException("File not found: " + fileName);
            }

            // Use InputStreamReader to read the contents of the file
            try (InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8)) {
                // Parse the JSON using Gson
                Type listType = new TypeToken<ArrayList<Pelicula>>() {}.getType();

                JsonObject jsonObject = new Gson().fromJson(reader, JsonObject.class);

                ArrayList<Pelicula> listaPeliculas = new Gson().fromJson(jsonObject.get("items"), listType);

                return listaPeliculas;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
