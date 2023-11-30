package com.Programacion.Tema1.Actividad00;

import java.util.Scanner;

/*
Implemente un programa para calcular las áreas de las siguientes
figuras geométricas (los datos que no tengamos hay que pedirlos
por teclado):
a. Área del triángulo: (𝑏𝑎𝑠𝑒 𝑥 𝑎𝑙𝑡𝑢𝑟𝑎)⁄2
b. Área del Cuadrado: 𝑙𝑎𝑑𝑜2
c. Área del Círculo: 𝜋 𝑥 𝑟𝑎𝑑𝑖𝑜2
d. Área del Rectángulo: 𝑏𝑎𝑠𝑒 𝑥 𝑎𝑙𝑡𝑢𝑟a
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        // Declaramos las variables que vamos a utilizar
        int opcion;
        double area, base, altura, lado, radio;

        // Creamos el objeto scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        // Pedimos al usuario que introduzca la figura geométrica
        System.out.println("Seleccione la figura geométrica para calcular el área:");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");
        System.out.println("4. Rectángulo");

        //Almacenamos la variable opción
        opcion = scann.nextInt();

        area = 0; //Inicializamos el area en 0

        if (opcion == 1) {
            // Área del triángulo: (base x altura) / 2
            System.out.print("Ingrese la base del triángulo: ");
             base = scann.nextDouble();
            System.out.print("Ingrese la altura del triángulo: ");
             altura = scann.nextDouble();
            area = (base * altura) / 2;
        } else if (opcion == 2) {
            // Área del cuadrado: lado^2
            System.out.print("Ingrese el lado del cuadrado: ");
             lado = scann.nextDouble();
            area = Math.pow(lado, 2);
        } else if (opcion == 3) {
            // Área del círculo: pi x radio^2
            System.out.print("Ingrese el radio del círculo: ");
             radio = scann.nextDouble();
            area = Math.PI * Math.pow(radio, 2);
        } else if (opcion == 4) {
            // Área del rectángulo: base x altura
            System.out.print("Ingrese la base del rectángulo: ");
             base = scann.nextDouble();
            System.out.print("Ingrese la altura del rectángulo: ");
             altura = scann.nextDouble();
            area = base * altura;
        }else {
            System.out.println("Opcion no valida");
        }
        //Mostramos el area de la figura seleccionada
        System.out.println("El área de la figura seleccionada es: "+area);
    }
}