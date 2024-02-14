package com.es.programacion.tema4.proyectoPersona.utils;

public class LocalidadValidator {

    // Atributos de clase
    public String[] provinciasValidas = {"Cadiz", "Huelva", "Sevilla", "Malaga", "Granada", "Jaen", "Almeria", "Cordoba"};
    public String[] cpValidos = {"11", "21", "41", "29", "18", "23", "04", "14"};

    /**
     * Método para comprobar la validez de un cp y de una provincia
     * @param provincia
     * @param cp (String) en formato XXXXX
     * @return true si es correcto, false si es incorrecto
     */
    public boolean checkProvincia(String provincia, String cp) {
        // Primero comprobamos que la provincia existe
        boolean provinciaExiste = false;
        int posicionProvincia = 0;
        for(int i=0; i<= provinciasValidas.length-1; i++) {
            if(provincia.equalsIgnoreCase(provinciasValidas[i])) {
                provinciaExiste = true;
                posicionProvincia = i;
                break;
            }
        }

        if(provinciaExiste) { // provinciaExiste == true
            String dosPrimerosNumerosCP = cp.substring(0,2);
            if(dosPrimerosNumerosCP.equalsIgnoreCase(cpValidos[posicionProvincia])) {
                return true;
            }
        }

        System.out.println("Provincia o cp incorrectos");
        return false;
    }

}
