package com.es.programacion.Tema7.proyectoTrivial.services;

import com.es.programacion.Tema7.proyectoTrivial.model.Participante;
import com.es.programacion.Tema7.proyectoTrivial.model.Pregunta;
import com.es.programacion.Tema7.proyectoTrivial.model.Puntuacion;

import java.io.*;
import java.util.ArrayList;

public class GestionFichero {

    /*
    Va a tener 2 métodos.
    1º Va a ser para leer un fichero y volcar la información en en ArrayList de Preguntas
    2º Va a ser para escribir en un fichero LA INFORMACIÓN que viene desde el arrayList de participantes
     */

    public ArrayList<Pregunta> leerFicheroPreguntas() {

        // 0º Crear e inicializar el ArrayList que al final pasaremos a la clase Trivial
        ArrayList<Pregunta> arrDePreguntasTemporal = new ArrayList<>();

        /*
        *******************************************************************
        1º Abrir el file (la ruta es la misma que en el ejercicio anterior)
        *******************************************************************
         */
        // Primero obtenemos el separador del SO en el que nuestra app se está ejecutando
        String ls = File.separator;
        // Para abrir el fichero, ya sabemos que tenemos que usar la clase File de Java
        File fichero = new File("src"+ls+"main"+ls+"resources"+ls+"archivosTema7"+ls+"proyectoQuiz"+ls+"preguntas_respuestas.txt");

        /*
        *******************************************************************
        2º Comprobar si el file existe, tiene modo lectura, etc.
        *******************************************************************
         */
        // Comprobamos que existe, que efectivamente es un file y que tiene los permisos adecuados de lectura
        if(fichero.exists() && fichero.isFile() && fichero.canRead()) {

            /*
            *******************************************************************
            3º Abrir flujos de lectura (QUEREMOS TRABAJAR CON BUFFEREDREADER)
            *******************************************************************
             */
            // Una vez comprobado que el fichero existe, podemos proceder a abrir los flujos de lectura
            // Vamos a usar la clase BufferedReader, que es más conveniente a la hora de leer archivos de texto plano
            FileReader fr = null;
            BufferedReader br = null;
            try {
                // Sabemos que el constructor de la clase BufferedReader acepta un Reader por parámetros
                // Así que instanciamos dicha clase Reader primero (en este caso, la clase FileReader)
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);

                /*
                *******************************************************************
                4º Operar con el fichero
                *******************************************************************
                 */
                // El cuarto paso es operar con el fichero, así que aquí hacemos las operaciones necesarias.
                // a) Nos fijamos en la información del fichero. ¿Qué contiene? ¿Cómo está almacenada la información en el fichero? etc
                // Vemos que la información está almacenada de la siguiente manera:
                // pregunta:respuesta
                // Sabiendo esto, podemos empezar a imaginarnos técnicas para poder obtener
                // la pregunta y la respuesta de manera independiente.
                // Declaro dos variables de tipo String que me servirán para ir almacenando temporalmente
                // las preguntas y las respuestas
                String pregunta = "";
                String respuesta = "";

                // b) Ya tenemos en mente cómo vamos a hacerlo, ahora debemos leer
                // cada una de las líneas del fichero. Esto lo hacemos con el método .readLine().
                // Primero leemos la PRIMERA LÍNEA.
                String lineaDelFichero = br.readLine();
                while (lineaDelFichero != null) { // Este bucle sirve para leer una a una todas las líneas del fichero

                    // Una vez tenemos la línea, ya podemos trabajar para separar la pregunta de la respuesta
                    // Lo hacemos con el método .split()
                    // El método .split() devuelve un array de String que contiene todos los String de la línea
                    // separados por el separador que indiques dentro de los parámetros del método.
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

                    // Una vez tenemos el objeto, lo añadimos al ArrayList arrDePreguntasTemporal, que es
                    // el que va a contener todas las preguntas y respuestas del fichero
                    if(!arrDePreguntasTemporal.contains(p)) {
                        arrDePreguntasTemporal.add(p);
                    }

                    // Ya hemos terminado el proceso de añadir una respuesta al ArrayList, proseguimos con la lectura
                    // de la siguiente línea del fichero.
                    lineaDelFichero = br.readLine();
                }

                /*
                *******************************************************************
                5º Cerrar los flujos
                *******************************************************************
                 */
                // Por último, cerramos los flujos de lectura
                br.close();
                fr.close();


            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            // Si no existe el fichero o hay algún problema con los permisos o con la ruta, podemos imprimir un mensaje
            // por pantalla y devolver un null o algo que le diga al programa que ha habido un error.
            return null;
        }

        /*
        *******************************************************************
        6º Devolver el arrDePreguntasTemporal
        *******************************************************************
         */
        // Si t0do ha ido bien y el arrDePreguntasTemporal contiene todas las preguntas, entonces lo devolvemos sin miedo
        return arrDePreguntasTemporal.size() != 0 ? arrDePreguntasTemporal : null;

    }

    public void escribirFicheroPuntuaciones(ArrayList<Participante> arrPar) {

        /*
        *******************************************************************
        1º Abrir el file
        *******************************************************************
         */
        // Primero obtenemos el separador del SO en el que nuestra app se está ejecutando
        String ls = File.separator;
        // Para abrir el fichero, ya sabemos que tenemos que usar la clase File de Java
        File fichero = new File("src"+ls+"main"+ls+"resources"+ls+"archivosTema7"+ls+"proyectoQuiz"+ls+"puntuaciones.txt");

        /*
        *******************************************************************
        2º Comprobar si el file existe, tiene modo escritura, etc.
        *******************************************************************
         */
        // Comprobamos que existe, que efectivamente es un file y que tiene los permisos adecuados de escritura
        if(fichero.exists() && fichero.isFile() && fichero.canWrite()) {

            /*
            *******************************************************************
            3º Abrir flujos de escritura (QUEREMOS TRABAJAR CON BufferedWriter)
            *******************************************************************
             */
            // Una vez comprobado que el fichero existe, podemos proceder a abrir los flujos de escritura
            // Vamos a usar la clase BufferedWriter, que es más conveniente a la hora de escribir archivos de texto plano
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                // Sabemos que el constructor de la clase BufferedWriter acepta un Writer por parámetros
                // Así que instanciamos dicha clase Writer primero (en este caso, la clase FileWriter)
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);

                /*
                *******************************************************************
                4º Operar con el fichero
                *******************************************************************
                 */
                // En este punto deberíamos tener claro lo que debemos hacer.
                // ¿Qué queremos hacer? -> Escribir en un fichero la información contenida en el ArrayList arrPar
                // ¿Qué contiene arrPar? -> arrPar contiene la información de los participantes que han jugado al juego.
                // ¿Qué tipo de dato contiene arrPar? -> Contiene objetos de tipo Participante
                // ¿Qué contiene la clase Participante? -> Contiene 3 atributos:
                // 1. Un String -> nombre
                // 2. Un String -> id
                // 3. Un ArrayList<Puntuacion> -> puntuaciones
                // 3b. ¿Qué contiene Puntuacion?
                // 3b.1. Un LocalDateTime -> fecha
                // 3b.2. Un int -> puntuacion

                // Una vez sabemos toda esa información, podemos empezar a escribir en el fichero.
                // Debemos recorrer el ArrayList arrPar para acceder a todos los registros almacenados en él
                for (Participante p: arrPar) {
                    // El formato para escribir va a ser:
                    // id:[fecha,puntuacion;fecha,puntuacion]
                    bw.write(p.getId());
                    bw.write(":");

                    // Ahora escribimos en el fichero el ArrayList<Puntuacion>
                    // ¿Cómo lo hacemos? -> Recorremos el arrayList y escribimos todos los registros
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
                5º Cerrar los flujos
                *******************************************************************
                 */
                // Por último, cerramos los flujos de escritura
                bw.close();
                fw.close();


            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            // Si no existe el fichero o hay algún problema con los permisos o con la ruta, podemos imprimir un mensaje
            // por pantalla y devolver un null o algo que le diga al programa que ha habido un error.
            System.out.println("Error al escribir los registros");

        }
    }

}