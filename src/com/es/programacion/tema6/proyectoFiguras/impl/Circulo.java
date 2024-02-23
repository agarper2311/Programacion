package com.es.programacion.tema6.proyectoFiguras.impl;

import com.es.programacion.tema6.proyectoFiguras.api.iFigura2D;

/**
 * La clase Circulo implementa la interfaz iFigura2D para representar una figura geométrica circular.
 * Proporciona métodos para calcular el perímetro y el área de un círculo, escalar su tamaño y
 * imprimir sus detalles.
 */
public class Circulo implements iFigura2D {
    private double radio; // Almacena el radio del círculo.

    /**
     * Constructor para crear una instancia de un círculo con un radio específico.
     *
     * @param radio El radio del círculo.
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * Calcula y devuelve el perímetro del círculo.
     *
     * @return El perímetro del círculo.
     */
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    /**
     * Calcula y devuelve el área del círculo.
     *
     * @return El área del círculo.
     */
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    /**
     * Escala el círculo por un factor de escala dado. Este método ajusta el radio del círculo.
     *
     * @param escala El factor de escala para ajustar el tamaño del círculo.
     */
    @Override
    public void escalar(double escala) {
        this.radio *= escala;
    }

    /**
     * Imprime los detalles del círculo, incluyendo su radio, perímetro y área.
     */
    @Override
    public void imprimir() {
        System.out.println("Circulo: Radio = " + radio + ", Perimetro = " + perimetro() + ", Area = " + area());
    }
}
