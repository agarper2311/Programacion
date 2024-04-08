package com.Programacion.Tema4.ClasesDNI.Clases;

public class VerificadorDNI {
    private static String dni = "";
    private static char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N',
            'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};


    /**
     * Método quye comprueba que la última posición es una letra
     *
     * @param dni (String) dni a comprobar
     * @return true - es una letra | false - no es una letra.
     */
    public static boolean comprobarLetras(String dni) {
        // Obtenemos la última posición del String (que debe ser la letra)
        char letraDNI = dni.charAt(dni.length() - 1);
        // Comprobamos que dicha letra es EFECTIVAMENTE UNA LETRA
        if ((letraDNI >= 65 && letraDNI <= 90) || (letraDNI >= 97 && letraDNI <= 122)) {
            return true;
        } else {
            return false;
        }
    }//Fin comprobarLetra

    /**
     * Método que comprueba que la longitud de un DNI dado es de 9
     * @param dni (String) dni a comprobar
     * @return true si la longitud es de 9 | false si la longitud no es de 9
     */
    public static boolean comprobarLongitud(String dni) {
        return dni.length() == 9;
    }//Fin comprobarLongitud

    /**
     * La letra asociada a un DNI se obtiene dividiendo el número del DNI entre 23 y el resto es codificado siguiendo la siguiente correspondencia:
     * 0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N",
     * 13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E"
     * Un método que dado un DNI (con su letra), devuelva true o false si el DNI es válido o no.
     * @param dni (String) dni a comprobar
     * @return true si la letra es correcta
     */

    public static boolean comprobarLetraCorrecta(String dni) {
        char letraDNI = dni.charAt(dni.length() - 1);
        int numeroDNI = Integer.parseInt(dni.substring(0, 8));

        return letraDNI == letrasDNI[numeroDNI % 23];
    }//Fin comprobarLetraCorrecta


    /**
     * Comprueba que la parte numérica es efectivamente numérica y no contiene
     * caracteres
      * @param dni (String) dni a comprobar
     * @return true si la parte numérica es correcta
     */
    public static boolean comprobarParteNumerica(String dni){
        String parteNumerica = ""; // String auxiliar para almacenar la parte numerica
        try {
            // Para obtener la parte numerica, hago un substring de la posicion 0 a la 8
            parteNumerica = dni.substring(0, 8);
            System.out.println("La parte numerica es: "+parteNumerica);

            // Por ultimo, voy a comprobar que EFECTIVAMENTE ES UN NUMERO
            int numero = Integer.parseInt(parteNumerica);
            System.out.println("La parte numerica como numero es: "+numero);

        } catch (Exception e) {
            // Si lanza una excepcion significa que la parte numerica del DNI
            // ES INCORRECTA
            System.out.println("Error en los datos");
            return false;
        }
        return true;
    }


}
