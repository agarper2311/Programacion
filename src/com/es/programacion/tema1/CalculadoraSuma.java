package com.es.programacion.tema1;

import java.util.Scanner;

public class CalculadoraSuma {

    public static void main(String[] args) {

        // ANALISIS
        // ¿Qué nos pide? -> Sumar dos números
        // ¿Qué tenemos? -> Nada
        // ¿Qué necesitamos? -> 2 números para sumar

        // DISEÑO
        // ¿Se ha hecho ya? -> Sí, básicamente usas el operador +
        // ¿Cómo lo hacemos?
        /*
        1º Declarar las variables. Una para el numero a, otra para el numero b, y otra para la suma
        2º las tres variables son de tipo entero
        3º Pedir el numero a al usuario
        4º Pedir el numero b al usuario
        5º Sumar a y b, y asignarle el resultado a "suma"
        6º Mostrar el resultado por pantalla
         */

        int a;
        int b = 5;
        int suma;

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el valor para a: ");
        a = scan.nextInt();

        System.out.println("Introduzca el valor para b: ");
        b = scan.nextInt();

        suma = b + a;
        System.out.println("El resultado es: "+suma);



    }
}
