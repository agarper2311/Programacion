package com.es.programacion.tema6.proyectoFiguras.impl;

import Tema6.proyectoFiguras.api.iFigura2D;

public class Circulo implements iFigura2D {
    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double perimetro() {
        return  2 * Math.PI * radio;
    }

    @Override
    public double area() {
        return Math.PI *  radio * radio;
    }

    @Override
    public void escalar(double escala) {
        this.radio *= escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Circulo: Radio = " + radio + ", Perimetro = " + perimetro() + ", Area = " + area());
    }
}
