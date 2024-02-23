package com.es.programacion.tema6.proyectoFiguras.impl;

import Tema6.proyectoFiguras.api.iFigura2D;

public class Rectangulo implements iFigura2D {
    private double ancho;
    private double alto;
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    @Override
    public double perimetro() {
        return  2 * (ancho + alto);
    }

    @Override
    public double area() {
        return ancho * alto;
    }

    @Override
    public void escalar(double escala) {
        this.ancho *= escala;
        this.alto *= escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Rectangulo: Ancho = " + ancho + ", Alto = " + alto + ", Perimetro = " + perimetro() + ", Area = " + area());
    }
}
