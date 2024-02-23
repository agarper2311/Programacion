package com.es.programacion.tema6.proyectoFiguras.impl;

import com.es.programacion.tema6.proyectoFiguras.api.iFigura2D;

/**
 * La clase Cuadrado implementa la interfaz iFigura2D, definiendo los métodos para
 * calcular el perímetro y el área de un cuadrado, escalar sus dimensiones y imprimir
 * sus detalles. Esta clase modela un cuadrado mediante la longitud de su lado.
 */
public class Cuadrado implements iFigura2D {
    private double lado; // La longitud del lado del cuadrado

    /**
     * Constructor que inicializa un nuevo cuadrado con la longitud de lado especificada.
     *
     * @param lado La longitud del lado del cuadrado.
     */
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    /**
     * Calcula y devuelve el perímetro del cuadrado.
     *
     * @return El perímetro del cuadrado, calculado como 4 veces la longitud de su lado.
     */
    @Override
    public double perimetro() {
        return 4 * lado;
    }

    /**
     * Calcula y devuelve el área del cuadrado.
     *
     * @return El área del cuadrado, calculada como el cuadrado de la longitud de su lado.
     */
    @Override
    public double area() {
        return lado * lado;
    }

    /**
     * Escala el cuadrado por un factor de escala dado. Esto afecta la longitud de su lado.
     *
     * @param escala El factor de escala para ajustar el tamaño del cuadrado.
     */
    @Override
    public void escalar(double escala) {
        this.lado *= escala;
    }

    /**
     * Imprime los detalles del cuadrado, incluyendo la longitud de su lado, el perímetro y el área.
     */
    @Override
    public void imprimir() {
        System.out.println("Cuadrado: Lado = " + lado + ", Perimetro = " + perimetro() + ", Area = " + area());
    }
}
