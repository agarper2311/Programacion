package com.es.programacion.tema6.proyectoFiguras.impl;

import com.es.programacion.tema6.proyectoFiguras.api.iFigura2D;

/**
 * La clase Rectangulo implementa la interfaz iFigura2D, proporcionando una implementación
 * concreta para los métodos de cálculo de perímetro y área, escalado de dimensiones,
 * y presentación de detalles específicos para un rectángulo. Esta clase representa un rectángulo
 * mediante sus dimensiones de ancho y alto.
 */
public class Rectangulo implements iFigura2D {
    private double ancho; // El ancho del rectángulo
    private double alto;  // El alto del rectángulo

    /**
     * Constructor para crear un nuevo rectángulo con dimensiones específicas de ancho y alto.
     *
     * @param ancho El ancho del rectángulo.
     * @param alto  El alto del rectángulo.
     */
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * Calcula y devuelve el perímetro del rectángulo.
     *
     * @return El perímetro del rectángulo, calculado como la suma del doble del ancho y el doble del alto.
     */
    @Override
    public double perimetro() {
        return 2 * (ancho + alto);
    }

    /**
     * Calcula y devuelve el área del rectángulo.
     *
     * @return El área del rectángulo, calculada como el producto del ancho por el alto.
     */
    @Override
    public double area() {
        return ancho * alto;
    }

    /**
     * Escala las dimensiones del rectángulo (ancho y alto) por un factor de escala dado.
     * Esto modifica tanto el ancho como el alto del rectángulo.
     *
     * @param escala El factor por el cual escalar el rectángulo.
     */
    @Override
    public void escalar(double escala) {
        this.ancho *= escala;
        this.alto *= escala;
    }

    /**
     * Imprime los detalles del rectángulo, incluyendo su ancho, alto, perímetro y área.
     * Esta es una implementación específica que muestra cómo se presenta la figura.
     */
    @Override
    public void imprimir() {
        System.out.println("Rectangulo: Ancho = " + ancho + ", Alto = " + alto + ", Perimetro = " + perimetro() + ", Area = " + area());
    }
}
