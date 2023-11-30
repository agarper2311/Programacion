package com.Programacion.Tema2.EjemplosClase;

import java.util.Scanner;

public class CadenaDeCaracteres {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
/*


        // Declaramos una cadena de caracteres que se llame "mensajePresentacion"
        String mensajePresentacion = "";
        String nombre = "";
        System.out.println("Ingrese su nombre: ");
        nombre = scann.next();

        mensajePresentacion = "Hola mi nombre es " +nombre+",";

        System.out.println(mensajePresentacion);

        // Continuamos con la edad
        int edad = 0;

        System.out.println("Introduce tu edad: ");
        edad = scann.nextInt();

        mensajePresentacion = mensajePresentacion+"\sTengo "+edad+" años,";
        System.out.println(mensajePresentacion);

        // Continuamos con la localización
        String localizacon = "";
        System.out.println("De donde eres?: ");
        localizacon = scann.next();

        mensajePresentacion = mensajePresentacion+" Y soy de "+localizacon+".";
        System.out.println(mensajePresentacion);
        */
        // Declarar 2 variables
        String cadena1 = "Hola";
        String cadena2 = "Adios";

        if (cadena1.equals(cadena2)){
            System.out.println("Son iguales.");
        }else {
            System.out.println("Son distintas.");

        }
        if (cadena1.equals("hola")){
            System.out.println("Son iguales.");
        }else {
            System.out.println("Son distintas.");

        }
        if (cadena1.equals("Hola")){
            System.out.println("Son iguales.");
        }else {
            System.out.println("Son distintas.");

        }
    }
}
