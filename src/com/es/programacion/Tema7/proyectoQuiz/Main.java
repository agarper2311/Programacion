package com.es.programacion.Tema7.proyectoQuiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ls = File.separator;
        File fichero = new File("src" + ls + "main" + ls + "resources" + ls + "archivosTema7" + ls + "proyectoQuiz" + ls + "preguntas_respuestas.txt");

        ArrayList<String> preguntas = new ArrayList<>();
        ArrayList<String> respuestas = new ArrayList<>();

        try {
            if (fichero.exists() && fichero.isFile() && fichero.canRead()) {
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);

                String linea = br.readLine();
                while (linea != null) {
                    String[] lineaSeparada = linea.split(":");
                    preguntas.add(lineaSeparada[0]);
                    respuestas.add(lineaSeparada[1]);
                    linea = br.readLine();
                }
                br.close();
                fr.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al operar con el fichero");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error general... eliminando todos sus archivos");
        }

        // Hacer preguntas al usuario y verificar respuestas
        Scanner scan = new Scanner(System.in);
        int correctas = 0;
        for (int i = 0; i < preguntas.size(); i++) {
            System.out.println("Pregunta " + (i + 1) + ": " + preguntas.get(i));
            System.out.print("Tu respuesta: ");
            String respuestaUsuario = scan.nextLine();
            if (respuestaUsuario.equalsIgnoreCase(respuestas.get(i))) {
                correctas++;
                System.out.println("Correcto!");
            } else {
                System.out.println("Incorrecto. La respuesta correcta era: " + respuestas.get(i));
            }
        }

        // Mostrar la puntuación al final
        System.out.println("Tu puntuación es: " + correctas + " de " + preguntas.size());

        // Hacer preguntas random
        String respuestaUsuarioR = "";
        String salir = "";
        int correctasRandom = 0;
        Random r = new Random();

        while (!salir.equalsIgnoreCase("si")){
            int nRandom = r.nextInt(preguntas.size());
            String pregunta = preguntas.get(nRandom);
            String respuesta = respuestas.get(nRandom);
            System.out.println(preguntas.get(nRandom));
            respuestaUsuarioR = scan.nextLine();

            if (respuestaUsuarioR.equalsIgnoreCase(respuesta)) {
                correctasRandom++;
                System.out.println("Correcto!");
            } else {
                System.out.println("Incorrecto. La respuesta correcta era: " + respuestas.get(nRandom));
            }


            System.out.println("¿Quiere salir? si/no");
            salir = scan.nextLine();

        }
    }
}
