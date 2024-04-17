package com.es.programacion.tema7.proyectoUbriCine.services.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class GestionFicheroLogger {
    // Método cifrarCesar()
    private String cifrarCesar(String texto) {
        StringBuilder textoCifrado = new StringBuilder();
        int desplazamiento = 3; // Número de desplazamientos del cifrado César
        char[] caracteres = texto.toCharArray(); // Convertir el texto a un array de caracteres

        for (int i = 0; i < caracteres.length; i++) { // Recorremos el array
            char caracter = caracteres[i]; // Leer carácter a carácter

            /**
             * Para letras minúsculas ('a' a 'z'):
             * El código ajusta el carácter al rango de 0 a 25 (donde 'a' es 0 y 'z' es 25), le suma un desplazamiento,
             * y utiliza el módulo 26 para asegurarse de que el resultado sea un índice válido dentro del alfabeto.
             * Luego, convierte este índice de vuelta a un carácter ASCII sumando el valor de 'a'.
             */
            if (caracter >= 'a' && caracter <= 'z') {
                caracter = (char) (((caracter - 'a' + desplazamiento) % 26) + 'a');

                /**
                 * Para letras mayúsculas ('A' a 'Z'):
                 * Similarmente, ajusta el carácter de 'A' a 'Z' al rango de 0 a 25, añade el desplazamiento, aplica
                 * el módulo 26, y convierte el índice resultante de nuevo a un carácter ASCII sumando el valor de 'A'.
                 *
                 * El "módulo 26" es una operación matemática usada en contextos como el cifrado César, donde es crucial
                 * mantener los resultados dentro de un rango específico que corresponda al número de letras en el
                 * alfabeto inglés.
                 */
            } else if (caracter >= 'A' && caracter <= 'Z') {
                caracter = (char) (((caracter - 'A' + desplazamiento) % 26) + 'A');
            }
            textoCifrado.append(caracter); // agrega el carácter modificado
        }
        /**
         * Esta línea convierte todo el contenido acumulado en el objeto StringBuilder
         * (textoCifrado) a un tipo String
         */
        return textoCifrado.toString();




    }

    /**
     * Método registrarAcción
     * @param accion
     * @param idUsuario
     * @param nombreUsuario
     * @param password
     * @param esAdmin
     * @param correcta
     */
    private void registrarAccion(String accion, String idUsuario, String nombreUsuario, String password, boolean esAdmin, boolean correcta) {
        String estado = correcta ? "correcta" : "incorrecta";
        String adminTexto = esAdmin ? "esAdmin" : "noEsAdmin";
        String entradaLog = String.format("%tF %<tT-%s-%s-%s-%s-%s-%s", new Date(), accion, idUsuario, nombreUsuario, cifrarCesar(password), adminTexto, estado);

        // Si la acción es un login, ajustamos el formato del log
        if ("login".equals(accion)) {
            entradaLog = String.format("%tF %<tT-%s-%s-%s-%s", new Date(), accion, idUsuario, cifrarCesar(password), estado);
        }

        try (BufferedWriter br = new BufferedWriter(new FileWriter("logs.txt", true))) {
            br.write(entradaLog);
            br.newLine();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de logs: " + e.getMessage());
        }
    }



}
