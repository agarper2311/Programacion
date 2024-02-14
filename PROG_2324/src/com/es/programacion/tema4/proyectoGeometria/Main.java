package com.es.programacion.tema4.proyectoGeometria;

import com.es.programacion.tema4.proyectoGeometria.clases.Circulo;
import com.es.programacion.tema4.proyectoGeometria.clases.Punto;

public class Main {

    public static void main(String[] args) {

        // Ahora, vamos a crear dos objetos de tipo Punto
        Punto punto1 = new Punto(0,0);
        Punto punto2 = new Punto(5,7);

        punto1.nombre = "punto en 0";
        punto2.nombre = "punto otro";

        double distanciaEntrePuntos = punto1.calcularDistancia(punto2);
        System.out.println("La distancia entre "+punto1.nombre+" y "+punto2.nombre+ " es de "+ distanciaEntrePuntos);



        Circulo circulo1 = new Circulo(5.0);
        Circulo circulo2 = new Circulo(6.0);

        circulo1.mostrarInfo();
        circulo2.mostrarInfo();

    }
}
