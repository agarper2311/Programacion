package com.Programacion.Tema5.proyectoPunto;

import java.util.Random;

public class Punto {
    // ATRIBUTOS DE CLASE

    private int x = 0;
    private int y = 0;

    // CONSTRUCTOR DE CLASE

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }


    //MÉTODOS DE CLASE

    public static Punto crearPuntoAleatorio(){


        int aleatorioX = new Random().nextInt(-100, 100);
        int aleatorioY = new Random().nextInt(-100, 100);

        return new Punto(aleatorioX, aleatorioY);
    }

    /**
     * Imprime un punto por pantalla
     */
    public void imprime (){
        System.out.println("("+this.x+", "+this.y+")");
    }

    public void setXY(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public void desplaza(int dx, int dy){
        this.x = this.x + dx; //this.x += dx;
        this.y = this.y + dy; //this.y += dy;
    }

    public int distancia(Punto p){
        int part1 = (int) Math.pow(p.x - this.x, 2);
        int part2 = (int) Math.pow(p.y - this.y, 2);

        int raiz  = (int) Math.sqrt(part1 + part2);
        return raiz;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
