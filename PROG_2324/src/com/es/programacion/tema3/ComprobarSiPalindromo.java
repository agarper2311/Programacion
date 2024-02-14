package com.es.programacion.tema3;

public class ComprobarSiPalindromo {

    public static void main(String[] args) {
        checkPalindromo();
    }


    /**
     * ChekPalindromo. Comprobar si cadena es un palindromo<br/>
     *<br/>
     * ¿Qué nos piden?<br/>
     * Comprobar si una cadena es un palíndromo o no<br/>
     *<br/>
     * ¿Qué nos dan? ¿Qué tenemos?<br/>
     * Nos dan la cadenaAComprobar -> Esta cadena puede ser algo introducido por teclado si se desea
     * Tenemos la definición de palíndromo -> Palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.<br/>
     *<br/>
     * ¿Cómo lo hacemos?<br/>
     * Gracias a la definición de lo que es un palíndromo, sé que la cadena debe ser EXACTAMENTE IGUAL
     * de izquierda a derecha que de derecha a izquierda.<br/>
     * Voy a crear una variable auxiliar llamada cadenaAlReves de tipo String donde almacenaré
     * la cadenaAComprobar PERO AL REVÉS.
     */
    public static void checkPalindromo() {

        // Cadena a comprobar
        String cadenaAComprobar = "abcdba";

        // Creo una variable auxiliar llamada cadenaAlReves de tipo String
        // El objetivo de esta cadena es almacenar la cadenaAComprobar al revés.
        String cadenaAlReves = "";

        // Creo la cadenaAlReves -> recorro cadena de derecha a izquierda y concateno cada caracter
        // a la cadenaAlReves
        for (int i = cadenaAComprobar.length() -1; i>=0; i--){
            cadenaAlReves = cadenaAlReves + cadenaAComprobar.charAt(i);
        }


        // Por último, compruebo que ambas cadenas son iguales
        if (cadenaAComprobar.equalsIgnoreCase(cadenaAlReves)){
            System.out.println(cadenaAComprobar + " es un palindromo");
        } else {
            System.out.println(cadenaAComprobar + " no es un palindromo");
        }
    }
}
