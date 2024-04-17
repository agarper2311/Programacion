package com.Programacion.Tema1.Actividad02;
import java.util.Scanner;
/*
        Nombre: Angel
        Apellidos: Garcia Perez

        Uso de condiciones y operadores
         */
public class Ejercicio3 {//Definicion de la clase
    public static void main(String[] args) {//Metodo principal
    //Creamos el objeto Scanner para recoger la entrada del usuario
        Scanner scann = new Scanner(System.in);
        //Solicitamos al usuario que introduzca el precio del producto sin iva
        System.out.println("Introduzca el precio del producto para conocer el IVA: ");
        // Creamos la variable para almacenar el dato introducido por el usuario
        double PrecioProducto = scann.nextDouble();

        // Hacemos los cálculos para aplicar el IVA
        double PrecioProductoIVA = PrecioProducto * 1.21;

        //Mostramos al usuario el resultado final
        System.out.println("El precio del producto con iva es de "+PrecioProductoIVA+ " €");
    }
}
