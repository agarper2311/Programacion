package com.es.programacion.tema4.proyectoDNI;

import com.es.programacion.tema4.proyectoDNI.clases.VerificadorDNI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca su dni:");

        String dniUsuario = scan.next();

        boolean comprobarLetra = VerificadorDNI.comprobarLetra(dniUsuario);
        boolean comprobarLongitud = VerificadorDNI.comprobarLongitud(dniUsuario);
        boolean comprobarParteNumerica = VerificadorDNI.comprobarParteNumerica(dniUsuario);
        boolean comprobarLetraCorrecta = VerificadorDNI.comprobarLetraCorrecta(dniUsuario);

        if(comprobarLetra && comprobarLongitud && comprobarParteNumerica && comprobarLetraCorrecta){
            System.out.println("Su DNI es correcto, sosio");
        } else {
            System.out.println("Su DNI es incorrecto.");
        }

    }
}
