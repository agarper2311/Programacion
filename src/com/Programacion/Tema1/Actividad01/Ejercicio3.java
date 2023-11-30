package com.Programacion.Tema1.Actividad01;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Creamos el objeto scanner para recoger la entrada del usuario
        Scanner scann = new Scanner(System.in);

        // Solicitamos la entrada al usuario
        System.out.println("Introduzca el precio del producto sin iva: ");

        // Almacenar la entrada del usuario
        double PrecioProducto = scann.nextDouble();

        // Hacer los calculos
        double PrecioProductoIva = PrecioProducto * 1.21;

        System.out.println("El precio del producto con IVA es de " + PrecioProductoIva);
    }
}
