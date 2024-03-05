package com.es.programacion.Tema7.Teoria;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class AccesoFicheros {
    public static void main(String[] args) {

        // Para crear un objeto de tipo File, debemos llamar al constructor de la clase File
        File fichero1 = new File("D:\\Instituto\\Programacion\\Programacion\\src\\main\\resources\\archivosTema7\\fich_noexiste.txt");

        // En este punto, ya tenemos un objeto de tipo File... que en este caso,  es el fichero que hemos creado
        if (fichero1.exists()){
            System.out.println("El fichero existe y tiene de nombre "+fichero1.getName());
        }else {
            System.out.println("El fichero no existe, creando fichero");

            try {
                fichero1.createNewFile();

            }catch (IOException e){
                e.printStackTrace();
                System.out.println("Error al crear el fichero");
            }
        }
        try {
            // Vamos a obtener información del fichero
            System.out.println("Nombre fichero: "+fichero1.getName());
            System.out.println("Padre del Fichero: "+fichero1.getParent());
            System.out.println("Ruta: "+fichero1.getCanonicalPath());

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Error al obtener los datos del fichero");
        }

        // Vamos a intentar borrar el fichero
            if (fichero1.delete()){
                System.out.println("Borrando System32");
            }else {
                System.out.println("Usa Linux JODER");
            }



            // Ejercicio Clase
        // Tenemos que acceder al directorio alumnos
        File DirectorioAlumnos = new File("D:\\Instituto\\Programacion\\Programacion\\src\\main\\resources\\archivosTema7\\alumnos");
        // Tenemos que preguntar si existe
        if (DirectorioAlumnos.exists()){
            File[] ficherosDelDirectorio = DirectorioAlumnos.listFiles();

            // Si existe tenemos que listar todos los ficheros que contenga el directorio
            for (int i=0; i< ficherosDelDirectorio.length; i++){
                //Accedemos a cada elemento del array directamente con [i]
                String nombreDelFichero = ficherosDelDirectorio[i].getName();
                System.out.println("Nombre: "+nombreDelFichero);
            }
        }


   }
}
