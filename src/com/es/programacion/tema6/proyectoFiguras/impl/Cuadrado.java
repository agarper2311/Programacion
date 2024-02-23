package com.es.programacion.tema6.proyectoFiguras.impl;

import Tema6.proyectoFiguras.api.iFigura2D;

public class Cuadrado implements iFigura2D {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return  4 * lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public void escalar(double escala) {
        this.lado *= escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Cuadrado: Lado = " + lado + ", Perimetro = " + perimetro() + ", Area = " + area());
    }
}
