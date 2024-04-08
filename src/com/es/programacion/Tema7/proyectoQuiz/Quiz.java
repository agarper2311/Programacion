package com.es.programacion.Tema7.proyectoQuiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        String ls = File.separator;
        File fichero = new File("src" + ls + "main" + ls + "resources" + ls + "archivosTema7" + ls + "proyectoQuiz" + ls + "preguntas_respuestas.txt");

        ArrayList<String> preguntas = new ArrayList<>();
        ArrayList<String> respuestas = new ArrayList<>();

        try {
            if (fichero.exists() && fichero.isFile() && fichero.canRead()) {
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);

                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] lineaSeparada = linea.split(":");
                    preguntas.add(lineaSeparada[0]);
                    respuestas.add(lineaSeparada[1]);
                }
                br.close();
            }
        } catch (IOException e) {
            System.out.println("Error al operar con el fichero");
            e.printStackTrace();
            return;
        }

        ArrayList<String> preguntasParaJuego = new ArrayList<>();
        ArrayList<String> respuestasParaJuego = new ArrayList<>();
        Random r = new Random();

        while (preguntasParaJuego.size() < 10) {
            int nRandom = r.nextInt(preguntas.size());
            String pregunta = preguntas.get(nRandom);
            String respuesta = respuestas.get(nRandom);

            if (!preguntasParaJuego.contains(pregunta)) {
                preguntasParaJuego.add(pregunta);
                respuestasParaJuego.add(respuesta);
            }
        }

        Scanner scan = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + preguntasParaJuego.get(i));
            String respuestaUsuario = scan.nextLine();
            if (respuestaUsuario.equalsIgnoreCase(respuestasParaJuego.get(i))) {
                score++;
            }
        }

        System.out.println("Tu puntuación es: " + score + "/10");
        System.out.println("Ingresa tu nombre:");
        String nombreUsuario = scan.nextLine();

        File archivoPuntuaciones = new File("src" + ls + "main" + ls + "resources" + ls + "archivosTema7" + ls + "proyectoQuiz" + ls + "puntuaciones.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoPuntuaciones, true))) {
            bw.write(nombreUsuario + ":" + score);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar la puntuación");
            e.printStackTrace();
        }


    }
}
