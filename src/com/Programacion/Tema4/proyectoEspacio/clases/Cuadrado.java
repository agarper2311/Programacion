package com.Programacion.Tema4.proyectoEspacio.clases;

public class Cuadrado {

    // Atributos de clase
    public int coorX;
    public int coorY;
    public int lado;
    public double area;

    // Métodos de clase

    // Constructores
    // Los constructores son publicos (el 99,9% de las veces) -> ese 0.1% es cuando se aplica el patron singleton
    public Cuadrado(int coorX, int coorY, int lado){
        this.coorX = coorX;
        this.coorY = coorY;

        if (lado > 0){
            this.lado = lado;

        }else {
            this.lado = 0;
        }
        this.area = this.lado * this.lado;

    }

    /**
     * Método que compare 2 cuadrados y nos diga cual es mayor
     */
    public void compararCuadrados(Cuadrado c){

        if (this.lado > c.lado){
            System.out.println("El cuadrado con lado "+this.lado+" es el mayor");
        }else{

        }

    }
}

