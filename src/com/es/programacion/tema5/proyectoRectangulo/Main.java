package com.Programacion.Tema5.proyectoRectangulo;

import com.Programacion.Tema5.proyectoRectangulo.clases.Rectangulo;

public class Main {
    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(2,2 ,6,5);
        Rectangulo r2 = new Rectangulo(3,5 ,5,2);
        Rectangulo r3 = new Rectangulo(8,2 ,6,5);

        System.out.println("La posición del primer rectangulo es: "+"("+r1.getX1()+","+r1.getY1()+")"+" "+"("+r1.getX2()+","+r1.getY2()+")");
        System.out.println("La posición del segundo rectangulo es: "+"("+r2.getX1()+","+r2.getY1()+")"+" "+"("+r2.getX2()+","+r2.getY2()+")");
        System.out.println("La posición del tercer rectangulo es: "+"("+r3.getX1()+","+r3.getY1()+")"+" "+"("+r3.getX2()+","+r3.getY2()+")");

    }


}
