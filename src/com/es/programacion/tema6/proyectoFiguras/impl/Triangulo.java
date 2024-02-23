package com.es.programacion.tema6.proyectoFiguras.impl;

import Tema6.proyectoFiguras.api.iFigura2D;

public class Triangulo implements iFigura2D {
    private double base;
    private double altura;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double perimetro() {
        return base +  2 * altura;
    }

    @Override
    public double area() {
        return (base * altura) /  2;
    }

    @Override
    public void escalar(double escala) {
        this.base *= escala;
        this.altura *= escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Triangulo: Base = " + base + ", Altura = " + altura + ", Perimetro = " + perimetro() + ", Area = " + area());
    }
}
