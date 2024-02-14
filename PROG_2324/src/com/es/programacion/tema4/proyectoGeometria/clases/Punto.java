package com.es.programacion.tema4.proyectoGeometria.clases;

public class Punto {

    // Atributos de clase
    public int coorX;
    public int coorY;

    public String nombre;


    // Métodos de clase

    // Constructores
    // Los constructores son publicos (el 99.9% de las veces) -> Ese 0.1% es cuando se aplica el patron singleton
    public Punto(int coorX, int coorY) {
        this.coorX = coorX;
        this.coorY = coorY;
    }

    // Métodos
    /**
     * Método que calcule la distancia entre dos puntos
     * El método devuelve un double (que es la distancia)
     * El método recibe por parámetros otro punto
     */
    public double calcularDistancia(Punto p) {
        // Declarar una variable de tipo double que vaya a almacenar la distancia
        double distancia = 0.0;

        // Aplicamos la formula matemática para el calculo de la distancia
        // d = √((x2 - x1)² + (y2 - y1)²)
        double resta1 = p.coorX - this.coorX;
        double resta2 = p.coorY - this.coorY;
        double cuadrado1 = Math.pow(resta1, 2.0);
        double cuadrado2 = Math.pow(resta2, 2.0);
        distancia = Math.sqrt(cuadrado1 + cuadrado2);

        // Retornamos el valor de la variable distancia
        return distancia;

    }



}
