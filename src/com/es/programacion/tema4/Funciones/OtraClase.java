package com.Programacion.Tema4.Funciones;

public class OtraClase {
    /**
     * Método para sumar 2 variables
     * @param a - sumando 1
     * @param b - sumando 2
     * @return - resultado de la suma (int)
     */
    public static int sumar (int a, int b){
        return a + b;//Devuelve el resultado de la suma
    }

    /**
     * Método para realizar la resta
     * @param a numero 1
     * @param b numero 2
     * @return resultado de la resta
     */
    private static int restar(int a, int b){

        return a-b;

    }

    /**
     * Imprime por pantalla un mensaje
     */

    protected static void imprimirOperaciones(){

        System.out.println("Esta clase puede sumar y restar");

    }

}
