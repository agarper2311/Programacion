package com.Programacion.Tema4.Funciones2;

public class ClaseFueraPaquete {
    /**
     * Método que comprueba la validez de un DNI
     * @param dni
     * @return true --> DNI valido / False --> DNI inválido
     */
    public static boolean checkDNI(String dni){

        char letraDNI = dni.charAt(dni.length()-1);

        if (comprobarLength(dni) && comprobarSiEsLetra(letraDNI)){
            return true;
        }else {
            return false;
        }




    }

    /**
     * Comprueba la longitud del DNI
     * @param dni
     * @return
     */
    protected static boolean comprobarLength(String dni){
        if (dni.length() == 9){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Método que comprueba que la ultima posición es una letra
     * @param letraDNI caracter del DNI
     * @return
     */
    protected static boolean comprobarSiEsLetra(char letraDNI){

        if ((letraDNI >=65 && letraDNI <= 90) || (letraDNI >=97 && letraDNI <=122)){
            return true;
        }else {
            return false;
        }

    }
}

