package com.es.programacion.Tema7.proyectoTrivial;

import com.es.programacion.Tema7.proyectoTrivial.model.Participante;
import com.es.programacion.Tema7.proyectoTrivial.model.Pregunta;
import com.es.programacion.Tema7.proyectoTrivial.model.Puntuacion;
import com.es.programacion.Tema7.proyectoTrivial.services.GestionFichero;

import java.util.ArrayList;
import java.util.Scanner;

public class Trivial {

    public static void main(String[] args) {

        ArrayList<Participante> arrParticipantes = new ArrayList<>();
        ArrayList<Pregunta> preguntasParaJuego = new ArrayList<>();
        GestionFichero gf = new GestionFichero();
        preguntasParaJuego = gf.leerFicheroPreguntas();

        // JUEGO NORMAL -> HACER todas las preguntas al usuario
        // Creo 4 variables para almacenar, el nombre del usuario, el id del usuario, la respuesta que da el usuario y la puntacion del usuario
        String nombreUsuario = "";
        String idUsuario = "";
        String respuestaUsuario = "";
        int puntuacion = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Dime tu nombre:");
        nombreUsuario = scan.nextLine();

        System.out.println("Ahora tu id:");
        idUsuario = scan.nextLine();

        // Creo un objeto de tipo Participante
        Participante p = new Participante(nombreUsuario, idUsuario);

        // Recorro el arrayList que contiene las preguntas para el juego
        for(int i=0; i<preguntasParaJuego.size(); i++) {
            // Almaceno temporalmente la pregunta y la respuesta que se va a hacer
            String pregunta = preguntasParaJuego.get(i).getPregunta();
            String respuesta = preguntasParaJuego.get(i).getRespuesta();

            // Formulo la pregunta
            System.out.println(pregunta);
            respuestaUsuario = scan.nextLine();

            // Compruebo si la respuesta es correcta
            if(respuestaUsuario.equalsIgnoreCase(respuesta)) {
                System.out.println("Respuesta correcta");
                puntuacion++;
            } else {
                System.out.println("Respuesta incorrecta, la respuesta correcta era..."+respuesta);
            }
        }
        System.out.println(nombreUsuario+ ", tu puntuacion ha sido de..."+puntuacion);

        // Creo un objeto de tipo Puntuacion para poder darsela al Participante
        Puntuacion punt = new Puntuacion(puntuacion);

        // Añado al ArrayList<Puntuacion> la puntuacion obtenida por el Participante
        p.getPuntuaciones().add(punt);

        // Añado al ArrayList<Participante> el participante que acaba de participar en el concurso
        arrParticipantes.add(p);

        // Llamo al metodo escribirFicheroPuntuaciones y le paso por parametros el ArrayList con todos los Participantes
        gf.escribirFicheroPuntuaciones(arrParticipantes);


    }
}
