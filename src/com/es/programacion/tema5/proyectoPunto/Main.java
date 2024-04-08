package com.Programacion.Tema5.proyectoPunto;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(3,4);

        Punto p2 = new Punto(6, 2);

        System.out.println("La distancia es: "+p1.distancia(p2));


        p1.desplaza(10, 10);
        System.out.println("La distancia es: "+p1.distancia(p2));

        Punto p3 = Punto.crearPuntoAleatorio();
        p3.imprime();
    }
}
