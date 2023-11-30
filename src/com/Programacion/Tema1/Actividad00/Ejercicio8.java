package com.Programacion.Tema1.Actividad00;

import java.util.Scanner;

/*
Una farmacia nos ha encargado un programa para introducir el
valor de compra de un producto, y calcular los correspondientes
descuentos o recargos de la siguiente forma:
a. Si se introduce la opción 1, el pago se efectúa “al
contado”. Aplicar un descuento del 5%.
b. Si se introduce la opción 2, el pago es con “tarjeta”.
Aplicar un recargo del 3%.
Calcular y visualizar el descuento o recargo, según sea el caso,
y el total a pagar de la compra.

 */
public class Ejercicio8 {
    public static void main(String[] args) {
        // Declaramos las variables que vamos a usar
        double valorCompra, descuento, recargo;
        int metodoPago;


        // Creamos el objeto scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        // Pedimos por pantalla al usuario que introduzca el valor de compra del producto
        System.out.print("Introduzca el valor de la compra del producto: ");

        // Almacenamos la variable valorCompra
        valorCompra = scann.nextDouble();

        // Preguntamos si ha pagado en tarjeta o al contado
        System.out.println("¿Como ha pagado?");
        System.out.println("1. Al contado.");
        System.out.println("2. Con tarjeta.");

        // Almacenamos la variable metodo de pago
        metodoPago = scann.nextInt();

        descuento = valorCompra * 0.05;
        recargo = valorCompra * 0.03;

        // Condición para comparar si el tipo de pago es al contado o con tarjeta y calculamos el descuento o recargo
        if (metodoPago == 1){
            System.out.println("Su compra tiene un 5% de descuento, en total es: "+descuento+" €");
        } else if (metodoPago == 2) {
            System.out.println("Su compra tiene un recargo del 3%, en total es: "+recargo+" €");
        }else {
            System.out.println("Tipo de pago incorrecto");
        }
        scann.close();
    }
}
