package com.Programacion.Tema1.Actividad00;

import java.util.Scanner;

/*
Implemente un programa para calcular las areas de las siguientes
figuras geométricas (los datos que no tengamos hay que pedirlos
por teclado):
a. Area del triangulo: base x altura / 2
b. Area del Cuadrado: lado^2
c. Area del Círculo: pi x radio^2
d. Area del Rectangulo: base x altura
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        // Declaramos las variables que vamos a utilizar
        int opcion;
        double area, base, altura, lado, radio;

        // Creamos el objeto scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        // Pedimos al usuario que introduzca la figura geométrica
        System.out.println("Seleccione la figura geométrica para calcular el area:");
        System.out.println("1. Triangulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");
        System.out.println("4. Rectangulo");

        //Almacenamos la variable opción
        opcion = scann.nextInt();

        area = 0; //Inicializamos el area en 0

        if (opcion == 1) {
            // area del triangulo: (base x altura) / 2
            System.out.print("Ingrese la base del triangulo: ");
             base = scann.nextDouble();
            System.out.print("Ingrese la altura del triangulo: ");
             altura = scann.nextDouble();
            area = (base * altura) / 2;
        } else if (opcion == 2) {
            // area del cuadrado: lado^2
            System.out.print("Ingrese el lado del cuadrado: ");
             lado = scann.nextDouble();
            area = Math.pow(lado, 2);
        } else if (opcion == 3) {
            // area del círculo: pi x radio^2
            System.out.print("Ingrese el radio del círculo: ");
             radio = scann.nextDouble();
            area = Math.PI * Math.pow(radio, 2);
        } else if (opcion == 4) {
            // area del rectangulo: base x altura
            System.out.print("Ingrese la base del rectangulo: ");
             base = scann.nextDouble();
            System.out.print("Ingrese la altura del rectangulo: ");
             altura = scann.nextDouble();
            area = base * altura;
        }else {
            System.out.println("Opcion no valida");
        }
        //Mostramos el area de la figura seleccionada
        System.out.println("El area de la figura seleccionada es: "+area);
    }
}