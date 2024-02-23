package com.es.programacion.tema6.proyectoFiguras.impl;

import com.es.programacion.tema6.proyectoFiguras.api.iFigura2D;

/**
 * La clase Triangulo implementa la interfaz iFigura2D, ofreciendo una implementación específica
 * para calcular el perímetro y el área de un triángulo, así como para escalar sus dimensiones y
 * imprimir detalles sobre el triángulo. Esta clase representa un triángulo utilizando su base
 * y altura.
 */
public class Triangulo implements iFigura2D {
    private double base;   // La base del triángulo
    private double altura; // La altura del triángulo

    /**
     * Constructor que inicializa un nuevo triángulo con una base y altura específicas.
     *
     * @param base La base del triángulo.
     * @param altura La altura del triángulo.
     */
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Calcula y devuelve el perímetro del triángulo.
     * Nota: Esta implementación asume un triángulo isósceles para simplificar el cálculo.
     *
     * @return El perímetro del triángulo, calculado como la base más el doble de la altura.
     */
    @Override
    public double perimetro() {
        return base + 2 * altura;
    }

    /**
     * Calcula y devuelve el área del triángulo.
     *
     * @return El área del triángulo, calculada como el producto de la base por la altura dividido por dos.
     */
    @Override
    public double area() {
        return (base * altura) / 2;
    }

    /**
     * Escala las dimensiones del triángulo (base y altura) por un factor de escala dado.
     * Esto modifica tanto la base como la altura del triángulo.
     *
     * @param escala El factor por el cual escalar el triángulo.
     */
    @Override
    public void escalar(double escala) {
        this.base *= escala;
        this.altura *= escala;
    }

    /**
     * Imprime los detalles del triángulo, incluyendo su base, altura, perímetro y área.
     * Esta implementación específica muestra cómo se presenta la figura.
     */
    @Override
    public void imprimir() {
        System.out.println("Triangulo: Base = " + base + ", Altura = " + altura + ", Perimetro = " + perimetro() + ", Area = " + area());
    }
}
