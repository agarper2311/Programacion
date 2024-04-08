package com.Programacion.Tema4.Funciones;

import java.util.Scanner;
/**
 * Vamos a hacer una función que dada una fecha de nacimiento, devuelva el signo zodiacal de esa persona
 * ¿Qué le entra por parámetros? -> dia mes y anio
 * ¿Qué devuelve la funcion? -> Un String
 */

public class SignoZodiacal {

    Scanner scan = new Scanner(System.in);
    public static String obtenerSignoZodiacal(int dia, int mes, int anio) {
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }

    public static void main(String[] args) {
        int dia = 23;
        int mes = 11;
        int anio = 2003;
        String signo = obtenerSignoZodiacal(dia, mes, anio);
        System.out.println("El signo zodiacal es: " + signo);
    }
}

