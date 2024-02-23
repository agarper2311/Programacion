package com.es.programacion.tema6.proyectoFiguras;


import com.es.programacion.tema6.proyectoFiguras.api.iFigura2D;
import com.es.programacion.tema6.proyectoFiguras.impl.Circulo;
import com.es.programacion.tema6.proyectoFiguras.impl.Cuadrado;
import com.es.programacion.tema6.proyectoFiguras.impl.Rectangulo;
import com.es.programacion.tema6.proyectoFiguras.impl.Triangulo;

import java.util.ArrayList;

/**
 * Clase principal para demostrar el uso de figuras geométricas.
 * Crea una lista de figuras geométricas, imprime sus detalles,
 * escala sus dimensiones y vuelve a imprimir los detalles actualizados.
 */
public class Main {
    public static void main(String[] args) {
        // Lista para almacenar figuras geométricas.
        ArrayList<iFigura2D> figuras = new ArrayList<>();
        figuras.add(new Cuadrado(4));         // Añade un cuadrado con lado de 4
        figuras.add(new Rectangulo(2, 3));    // Añade un rectángulo con ancho de 2 y alto de 3
        figuras.add(new Triangulo(4, 5));     // Añade un triángulo con base de 4 y altura de 5
        figuras.add(new Circulo(3));          // Añade un círculo con radio de 3

        // Imprime los detalles de cada figura en la lista.
        System.out.println("Datos de las figuras:");
        for (int i = 0; i < figuras.size(); i++) {
            iFigura2D figura = figuras.get(i);
            figura.imprimir();
        }

        // Aumenta el tamaño de cada figura al doble y luego imprime los detalles actualizados.
        System.out.println("-------------------");
        System.out.println("Aumentar el tamaño:");
        for (int i = 0; i < figuras.size(); i++) {
            iFigura2D figura = figuras.get(i);
            figura.escalar(2); // Escala al doble
            figura.imprimir();
        }

        // Disminuye el tamaño de cada figura al 10% de su tamaño original y luego imprime los detalles actualizados.
        System.out.println("-------------------");
        System.out.println("Disminuir el tamaño:");
        for (int i = 0; i < figuras.size(); i++) {
            iFigura2D figura = figuras.get(i);
            figura.escalar(0.1); // Escala al 10%
            figura.imprimir();
        }
    }
}
