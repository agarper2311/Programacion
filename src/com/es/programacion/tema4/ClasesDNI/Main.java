package com.Programacion.Tema4.ClasesDNI;

import com.Programacion.Tema4.ClasesDNI.Clases.VerificadorDNI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca su DNI: ");

        String dniUsuario = scan.next();

        boolean comprobarLetra = VerificadorDNI.comprobarLetras(dniUsuario);
        boolean comprobarLongitud = VerificadorDNI.comprobarLongitud(dniUsuario);
        boolean  comprobarParteNumerica = VerificadorDNI.comprobarParteNumerica(dniUsuario);
        boolean comprobarLetraCorrecta = VerificadorDNI.comprobarLetraCorrecta(dniUsuario);

        if (comprobarLetra && comprobarLongitud && comprobarParteNumerica && comprobarLetraCorrecta){
            System.out.println("Su DNI es correcto sosio");
        }else{
            System.out.println("Su DNI es incorrecto sosio");
        }
    }
}
