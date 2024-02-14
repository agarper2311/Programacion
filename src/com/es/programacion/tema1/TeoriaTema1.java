package com.es.programacion.tema1;

import java.util.Scanner;

public class TeoriaTema1 {
    public static void main(String[] args) {

        // Tipo de dato identificador = valor;
        String nombre = "Diego";
        int num = 0;
        double real;
        boolean estado; // T o F
        char c = 'c';

        // Vimos el operador = , operador de asignación
        int num2 = 15;
        double numeroReal = 2.0;

        num2 = 20;
        numeroReal = 4.5;

        int suma = num + num2;

        System.out.println(suma);

        // + - * / %
        int suma2 = 10 + num2;      // 30
        System.out.println(suma2);  // 30

        suma2 = suma2 - 10;         // 20
        System.out.println(suma2);  // 20

        suma2 = suma2 * 2;          // 40
        System.out.println(suma2);  // 40

        //suma2 = suma2 / 10;         // 4
        //System.out.println(suma2);  // 4

        suma2 = suma2 % 10;             // 0
        System.out.println(suma2);      // 0

        String cadena = "hola";

        System.out.println(cadena+" "+suma2);

        // 1º las variables cuando se declaran, no se tienen que volver a declarar
        int caja = 1;
        caja = 10;
        caja = suma2;

        String ejemplo = "Diego";
        ejemplo = "Pepito";

        // 2º Las variables se pueden declarar sin un valor asociado.
        int numero;
        String cadena2;
        boolean decision;
        float numeroFloat;

        // 3º No se pueden duplicar nombres de variables
        int numero2 = 0;

        // Para mostrar mensajes por pantalla
        System.out.println("Mensaje que queráis: "+numero2);

        // Para pedir datos al usuario
        // Si pedimos un número
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int radio = scan.nextInt();

        // Si pedimos una cadena de caracteres
        System.out.print("Introduzca su nombre: ");
        String nombre2 = scan.next();
        String nombre3 = scan.nextLine();

    }
}

