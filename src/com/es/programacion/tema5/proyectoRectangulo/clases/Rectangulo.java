package com.es.programacion.tema5.proyectoRectangulo.clases;

public class Rectangulo {

    /**
     * Coordenadas punto 1
     */
    private int x1, y1;
    /**
     * Coordenadas punto 2
     */
    private int x2, y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {

        // Debemos asegurarnos que la coordenada 1 es la esquina inferior izquierda
        if(x1 < x2 && y1 < y2) {
            this.x1 = x1;
            this.y1 = y1;

            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al instanciar el Rectangulo... deleting all your files on your computer");
        }

    }

    //MÉTODOS DE CLASE
    public void imprimir() {

        int ladoH = this.x2 - this.x1;
        int ladoV = this.y2 - this.y1;

        for(int i = 0; i < ladoH; i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i = 0; i< ladoV-2; i++) {
            System.out.print("* ");
            for(int j = 0; j < ladoH-2; j++){
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for(int i = 0; i < ladoH; i++){
            System.out.print("* ");
        }
    }

    /**
     * Método para realizar el perímetro de un rectángulo
     * @return
     */
    public int getPerimetro() {
        int lado1 = x2 - x1;
        int lado2 = y2 - y1;

        return 2*lado1 + 2*lado2;
    }

    /**
     * Método para realizar el cálculo del area de un rectangulo
     * @return
     */
    public int getArea() {
        int lado1 = x2 - x1;
        int lado2 = y2 - y1;

        return lado1*lado2;
    }


    // GETTERS Y SETTERS
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if(x1 < this.x2) {
            this.x1 = x1;
        }
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setX1Y1(int x1, int y1) {
        setX1(x1);
        setY1(y1);
    }
    public void setX2Y2(int x2, int y2) {
        setX2(x2);
        setY2(y2);
    }

    public void setAll(int x1, int y1, int x2, int y2) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }
}
