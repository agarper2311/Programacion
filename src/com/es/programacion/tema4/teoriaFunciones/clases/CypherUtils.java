package com.es.programacion.tema4.teoriaFunciones.clases;

public class CypherUtils {


    /**
     * Cifrar una contraseña
     * @param passwd
     * @return
     */
    public static String cifrarPass(String passwd) {

        // Creo una variable auxiliar para almacenar la nueva contraseña ya cifrada
        String passCifrada = "";

        // Recorro la passwd original para ir tratando cada caracter de manera individual
        for (int i=0; i<=passwd.length()-1;i++) {

            // Cojo cada uno de los caracteres
            char letraACifrar = passwd.charAt(i);

            // Obtengo el valor numerico del caracter
            int valorNumerico = (int) letraACifrar;

            // Sumo 3 a ese valor
            valorNumerico = valorNumerico + 3;

            // Paso de numero a caracter
            char letraCifrada = (char) valorNumerico;

            // Concateno el caracter a la passCifrada
            passCifrada = passCifrada + Character.toString(letraCifrada);

        }

        System.out.println("La pass sin cifrar es: "+ passwd);
        System.out.println("La pass cifrada es: "+ passCifrada);

        return passCifrada;
    }
}
