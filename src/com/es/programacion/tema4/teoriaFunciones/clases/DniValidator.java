package com.es.programacion.tema4.teoriaFunciones.clases;

public class DniValidator {

    // Array con las letras del DNI en sus posiciones correctas
    private static char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E',};

    /**
     * Método que comprueba la validez de un DNI
     * @param dni
     * @return true -> DNI valido / False -> DNI invalido
     */
    public static boolean checkDNI(String dni){

        char letraDNI = dni.charAt(dni.length()-1);
        if (comprobarLength(dni) && checkCaracteres(dni) && comprobarSiEsLetra(letraDNI) && comprobarParteNumerica(dni) && comprobarLetra(dni)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Comprueba la longitud del DNI
     * @return
     */
    protected static boolean comprobarLength(String dni) {

        if (dni.length() == 9) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que comprueba que la ultima posicion es una letra
     * @param letraDNI caracter del dni
     * @return
     */
    protected static boolean comprobarSiEsLetra(char letraDNI) {

        if((letraDNI >= 65 && letraDNI <= 90) || (letraDNI >= 97 && letraDNI <= 122)){
            return true;
        } else {
            return false;
        }

    }


    /**
     * Método que compruebe que todos los caracteres del DNI son válidos.
     * Comprobar que tiene 8 numeros y 1 letra
     */
    private static boolean checkCaracteres(String dni) {
        boolean dniEsValido = true;
        for(int i=0; i<=dni.length()-2; i++) {

            try{

                // Intentar parsear a entero el caracter
                char letraEnI = dni.charAt(i); // Obtenemos el caracter en esa posicion
                String letraEnPosicionI = Character.toString(letraEnI); // Convertir ese caracter a String
                int num = Integer.parseInt(letraEnPosicionI); // Intentamos convertir el String a int

            } catch (NumberFormatException e) {
                System.out.println("El dni no es valido");
                dniEsValido = false;
                break;
            }
        }
        return dniEsValido;
    }

    /**
     * Funcion que comprueba que la parte numerica del dni
     * es efectivamente un número.
     * @param dni String que contiene el dni
     * @return true - si la parte numerica esta bien, false - si no esta bien
     */
    public static boolean comprobarParteNumerica(String dni) {
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

    /**
     * Metodo que comprueba que la letra del DNI es la correcta
     * @param dni
     * @return true - letra correcta false - letra incorrecta
     */
    public static boolean comprobarLetra(String dni) {
        String parteNumerica = ""; // String auxiliar para almacenar la parte numerica
        try {
            // Para obtener la parte numerica, hago un substring de la posicion 0 a la 8
            parteNumerica = dni.substring(0, 8);
            System.out.println("La parte numerica es: "+parteNumerica);

            // Por ultimo, voy a comprobar que EFECTIVAMENTE ES UN NUMERO
            int numeroDNI = Integer.parseInt(parteNumerica);
            System.out.println("La parte numerica como numero es: "+numeroDNI);

            int resto = numeroDNI % 23;
            char letraDNI = dni.charAt(dni.length()-1);

            if(letrasDNI[resto] != letraDNI) {
                return false;
            }

        } catch (Exception e) {
            // Si lanza una excepcion significa que la parte numerica del DNI
            // ES INCORRECTA
            System.out.println("Error en los datos");
            return false;
        }
        return true;
    }



} // FIN DE LA CLASE
