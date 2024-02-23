package com.es.programacion.tema6.proyectoFiguras.api;

/**
 * La interfaz iFigura2D define los métodos fundamentales que deben ser implementados
 * por cualquier figura geométrica bidimensional. Proporciona métodos para calcular
 * el perímetro y el área de la figura, escalar la figura por un factor dado, e imprimir
 * la información de la figura.
 */
public interface iFigura2D {

    /**
     * Calcula y devuelve el perímetro de la figura.
     *
     * @return el perímetro de la figura como un valor de tipo double.
     */
    public double perimetro();

    /**
     * Calcula y devuelve el área de la figura.
     *
     * @return el área de la figura como un valor de tipo double.
     */
    public double area();

    /**
     * Escala la figura por un factor de escala dado. Un factor mayor que 1.0
     * agranda la figura, mientras que un factor entre 0 y 1 la reduce.
     *
     * @param escala el factor de escala para ajustar el tamaño de la figura.
     */
    public void escalar(double escala);

    /**
     * Imprime la información de la figura, incluyendo detalles como dimensiones,
     * área, y perímetro. La implementación específica de este método dependerá
     * de la clase concreta que implemente la interfaz.
     */
    public void imprimir();
}
