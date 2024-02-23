package Tema6.proyectoFiguras;

import Tema6.proyectoFiguras.api.iFigura2D;
import Tema6.proyectoFiguras.impl.Circulo;
import Tema6.proyectoFiguras.impl.Cuadrado;
import Tema6.proyectoFiguras.impl.Rectangulo;
import Tema6.proyectoFiguras.impl.Triangulo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<iFigura2D> figuras = new ArrayList<>();
        figuras.add(new Cuadrado(4));
        figuras.add(new Rectangulo(2,  3));
        figuras.add(new Triangulo(4,  5));
        figuras.add(new Circulo(3));

        System.out.println("Datos de las figuras:");
        for (int i =  0; i < figuras.size(); i++) {
            iFigura2D figura = figuras.get(i);
            figura.imprimir();
        }

        System.out.println("-------------------");
        System.out.println("Aumentar el tamanio:");
        for (int i =  0; i < figuras.size(); i++) {
            iFigura2D figura = figuras.get(i);
            figura.escalar(2);
            figura.imprimir();
        }

        System.out.println("-------------------");
        System.out.println("Disminuir el tamanio:");
        for (int i =  0; i < figuras.size(); i++) {
            iFigura2D figura = figuras.get(i);
            figura.escalar(0.1);
            figura.imprimir();
        }
    }
}
