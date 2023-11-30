package com.Programacion.Tema4.Funciones;

import java.util.Scanner;
import com.Programacion.Tema4.Funciones.OtraClase;
import com.Programacion.Tema4.Funciones2.ClaseFueraPaquete;

public class TeoriaFuncionesI {
    public static void main(String[] args) {

        /*
        //Hacer un método que imprima un mensaje por pantalla

        Scanner scan = new Scanner(System.in);
        String nombre = "";

        System.out.println("Introduzca su nombre: ");
        nombre = scan.next();

        imprimirNomre(nombre);
        */


        //VAMOS A VER LO QUE PODEMOS HACER DE LA OTRA CLASE
        System.out.println(OtraClase.sumar(2,3));

        boolean esValido = ClaseFueraPaquete.checkDNI("12345678A");
        if (esValido){
            System.out.println("DNI es válido");
        }else {
            System.out.println("El DNI no es válido");
        }

    }//Fin del método main

    /**
     *<h2>Método que imprime por pantalla el nombre del usuario</h2>
     * @param nombreUsuario Nombre del usuario a imprimir por pantalla
     */
    public static void imprimirNomre(String nombreUsuario){
        System.out.println("Hola "+nombreUsuario);
    }





}//Fin de la clase
