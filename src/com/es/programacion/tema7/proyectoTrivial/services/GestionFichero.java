package com.es.programacion.tema7.proyectoTrivial.services;

import com.es.programacion.tema7.proyectoTrivial.model.Participante;
import com.es.programacion.tema7.proyectoTrivial.model.Pregunta;
import com.es.programacion.tema7.proyectoTrivial.model.Puntuacion;

import java.io.*;
import java.util.ArrayList;

public class GestionFichero {

    /*
    Va a tener 2 m�todos.
    1� Va a ser para leer un fichero y volcar la informaci�n en en ArrayList de Preguntas
    2� Va a ser para escribir en un fichero LA INFORMACI�N que viene desde el arrayList de participantes
     */

    public ArrayList<Pregunta> leerFicheroPreguntas() {

        // 0� Crear e inicializar el ArrayList que al final pasaremos a la clase Trivial
        ArrayList<Pregunta> arrDePreguntasTemporal = new ArrayList<>();

        /*
        *******************************************************************
        1� Abrir el file (la ruta es la misma que en el ejercicio anterior)
        *******************************************************************
         */
        // Primero obtenemos el separador del SO en el que nuestra app se est� ejecutando
        String ls = File.separator;
        // Para abrir el fichero, ya sabemos que tenemos que usar la clase File de Java
        File fichero = new File("src"+ls+"main"+ls+"resources"+ls+"archivosTema7"+ls+"proyectoQuiz"+ls+"preguntas_respuestas.txt");

        /*
        *******************************************************************
        2� Comprobar si el file existe, tiene modo lectura, etc.
        *******************************************************************
         */
        // Comprobamos que existe, que efectivamente es un file y que tiene los permisos adecuados de lectura
        if(fichero.exists() && fichero.isFile() && fichero.canRead()) {

            /*
            *******************************************************************
            3� Abrir flujos de lectura (QUEREMOS TRABAJAR CON BUFFEREDREADER)
            *******************************************************************
             */
            // Una vez comprobado que el fichero existe, podemos proceder a abrir los flujos de lectura
            // Vamos a usar la clase BufferedReader, que es m�s conveniente a la hora de leer archivos de texto plano
            FileReader fr = null;
            BufferedReader br = null;
            try {
                // Sabemos que el constructor de la clase BufferedReader acepta un Reader por par�metros
                // As� que instanciamos dicha clase Reader primero (en este caso, la clase FileReader)
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);

                /*
                *******************************************************************
                4� Operar con el fichero
                *******************************************************************
                 */
                // El cuarto paso es operar con el fichero, as� que aqu� hacemos las operaciones necesarias.
                // a) Nos fijamos en la informaci�n del fichero. �Qu� contiene? �C�mo est� almacenada la informaci�n en el fichero? etc
                // Vemos que la informaci�n est� almacenada de la siguiente manera:
                // pregunta:respuesta
                // Sabiendo esto, podemos empezar a imaginarnos t�cnicas para poder obtener
                // la pregunta y la respuesta de manera independiente.
                // Declaro dos variables de tipo String que me servir�n para ir almacenando temporalmente
                // las preguntas y las respuestas
                String pregunta = "";
                String respuesta = "";

                // b) Ya tenemos en mente c�mo vamos a hacerlo, ahora debemos leer
                // cada una de las l�neas del fichero. Esto lo hacemos con el m�todo .readLine().
                // Primero leemos la PRIMERA L�NEA.
                String lineaDelFichero = br.readLine();
                while (lineaDelFichero != null) { // Este bucle sirve para leer una a una todas las l�neas del fichero

                    // Una vez tenemos la l�nea, ya podemos trabajar para separar la pregunta de la respuesta
                    // Lo hacemos con el m�todo .split()
                    // El m�todo .split() devuelve un array de String que contiene todos los String de la l�nea
                    // separados por el separador que indiques dentro de los par�metros del m�todo.
                    // Ejemplo:
                    /*
                    lineaDelFichero1 = "unaCadena:otraCadena"
                    lineaDelFichero1.split(":"); -> Devuelve [unaCadena, otraCadena]

                    lineaDelFichero2 = "pepito-jaimito-joselito"
                    lineaDelFichero2.split("-"); -> Devuelve [pepito, jaimito, joselito]

                    lineaDelFichero3 = "almeriaholacadizholajaenholasevilla"
                    lineaDelFichero3.split("hola"); -> Devuelve [almeria, cadiz, jaen, sevilla]

                    almeria -> posicion 0 del array
                    cadiz -> posicion 1 del array
                    jaen -> posicion 2 del array
                    sevilla -> posicion 3 del array
                     */

                    // Nosotros sabemos que la pregunta se separa de la respuesta por ":"
                    String[] preguntaYRespuesta = lineaDelFichero.split(":");
                    pregunta = preguntaYRespuesta[0];
                    respuesta = preguntaYRespuesta[1];

                    // Una vez tenemos la pregunta y la respuesta, podemos inicializar un objeto de tipo Pregunta
                    Pregunta p = new Pregunta(pregunta, respuesta);

                    // Una vez tenemos el objeto, lo a�adimos al ArrayList arrDePreguntasTemporal, que es
                    // el que va a contener todas las preguntas y respuestas del fichero
                    if(!arrDePreguntasTemporal.contains(p)) {
                        arrDePreguntasTemporal.add(p);
                    }

                    // Ya hemos terminado el proceso de a�adir una respuesta al ArrayList, proseguimos con la lectura
                    // de la siguiente l�nea del fichero.
                    lineaDelFichero = br.readLine();
                }

                /*
                *******************************************************************
                5� Cerrar los flujos
                *******************************************************************
                 */
                // Por �ltimo, cerramos los flujos de lectura
                br.close();
                fr.close();


            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            // Si no existe el fichero o hay alg�n problema con los permisos o con la ruta, podemos imprimir un mensaje
            // por pantalla y devolver un null o algo que le diga al programa que ha habido un error.
            return null;
        }

        /*
        *******************************************************************
        6� Devolver el arrDePreguntasTemporal
        *******************************************************************
         */
        // Si t0do ha ido bien y el arrDePreguntasTemporal contiene todas las preguntas, entonces lo devolvemos sin miedo
        return arrDePreguntasTemporal.size() != 0 ? arrDePreguntasTemporal : null;

    }

    public void escribirFicheroPuntuaciones(ArrayList<Participante> arrPar) {

        /*
        *******************************************************************
        1� Abrir el file
        *******************************************************************
         */
        // Primero obtenemos el separador del SO en el que nuestra app se est� ejecutando
        String ls = File.separator;
        // Para abrir el fichero, ya sabemos que tenemos que usar la clase File de Java
        File fichero = new File("src"+ls+"main"+ls+"resources"+ls+"archivosTema7"+ls+"proyectoQuiz"+ls+"puntuaciones.txt");

        /*
        *******************************************************************
        2� Comprobar si el file existe, tiene modo escritura, etc.
        *******************************************************************
         */
        // Comprobamos que existe, que efectivamente es un file y que tiene los permisos adecuados de escritura
        if(fichero.exists() && fichero.isFile() && fichero.canWrite()) {

            /*
            *******************************************************************
            3� Abrir flujos de escritura (QUEREMOS TRABAJAR CON BufferedWriter)
            *******************************************************************
             */
            // Una vez comprobado que el fichero existe, podemos proceder a abrir los flujos de escritura
            // Vamos a usar la clase BufferedWriter, que es m�s conveniente a la hora de escribir archivos de texto plano
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                // Sabemos que el constructor de la clase BufferedWriter acepta un Writer por par�metros
                // As� que instanciamos dicha clase Writer primero (en este caso, la clase FileWriter)
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);

                /*
                *******************************************************************
                4� Operar con el fichero
                *******************************************************************
                 */
                // En este punto deber�amos tener claro lo que debemos hacer.
                // �Qu� queremos hacer? -> Escribir en un fichero la informaci�n contenida en el ArrayList arrPar
                // �Qu� contiene arrPar? -> arrPar contiene la informaci�n de los participantes que han jugado al juego.
                // �Qu� tipo de dato contiene arrPar? -> Contiene objetos de tipo Participante
                // �Qu� contiene la clase Participante? -> Contiene 3 atributos:
                // 1. Un String -> nombre
                // 2. Un String -> id
                // 3. Un ArrayList<Puntuacion> -> puntuaciones
                // 3b. �Qu� contiene Puntuacion?
                // 3b.1. Un LocalDateTime -> fecha
                // 3b.2. Un int -> puntuacion

                // Una vez sabemos toda esa informaci�n, podemos empezar a escribir en el fichero.
                // Debemos recorrer el ArrayList arrPar para acceder a todos los registros almacenados en �l
                for (Participante p: arrPar) {
                    // El formato para escribir va a ser:
                    // id:[fecha,puntuacion;fecha,puntuacion]
                    bw.write(p.getId());
                    bw.write(":");

                    // Ahora escribimos en el fichero el ArrayList<Puntuacion>
                    // �C�mo lo hacemos? -> Recorremos el arrayList y escribimos todos los registros
                    bw.write("["); // Primero va el simbolo [
                    for (Puntuacion punt : p.getPuntuaciones()) {
                        bw.write(punt.getFecha().getHour()+":"+punt.getFecha().getMinute()); // Despues va la fecha
                        bw.write(","); // Seguido de ,
                        bw.write(punt.getPuntuacion()+""); // Y a su vez seguido de la puntuacion
                        bw.write(";"); // Por ultimo, para "separar" registros, usamos un punto y coma
                    }
                    bw.write("]"); // Cuando terminamos de escribir las puntuaciones escribimos el simbolo ]
                }

                /*
                *******************************************************************
                5� Cerrar los flujos
                *******************************************************************
                 */
                // Por �ltimo, cerramos los flujos de escritura
                bw.close();
                fw.close();


            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            // Si no existe el fichero o hay alg�n problema con los permisos o con la ruta, podemos imprimir un mensaje
            // por pantalla y devolver un null o algo que le diga al programa que ha habido un error.
            System.out.println("Error al escribir los registros");

        }
    }

}