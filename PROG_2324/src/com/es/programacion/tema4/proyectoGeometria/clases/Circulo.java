package com.es.programacion.tema4.proyectoGeometria.clases;

public class Circulo {

    // Atributos de circulo para poder calcular el area
    // el radio (quien quiera, private)
    // el area (quien quiera, private)
    // el diametro (quien quiera, private)
    private double radio;
    private double area;
    private double diametro;


    // Constructor personalizado al que se le pasa el radio únicamente
    public Circulo(double radio) {
        this.radio = radio;
        calcularArea();
        calcularDiametro();
    }
    // El Constructor calcula el area y el diametro

    // Métodos para calcular el area y calcular el diametro
    private void calcularArea() {
        this.area = Math.PI * Math.pow(this.radio, 2.0);
    }

    private void calcularDiametro() {
        this.diametro = 2 * this.radio;
    }

    // Método para mostrar la información del circulo. Soy un circulo con area "tal" y
    // diametro "cual"
    public void mostrarInfo(){
        System.out.println("Soy un circulo con radio "+this.radio+" , area "+this.area+ " y diametro "+this.diametro);
    }

    /**
     * Método que compare dos circulos para ver cual es el mayor
     */
    public void compararCirculos(Circulo c) {
        if(this.radio > c.radio) {
            System.out.println("El circulo con radio "+this.radio+" es mayor");
        } else {
            System.out.println("El circulo con radio "+c.radio+" es mayor");
        }
    }




}
