package com.Programacion.Tema4.proyectoArticulo;

import com.Programacion.Tema4.proyectoArticulo.clase.Articulo;

public class Main {
    public static void main(String[] args) {
        Articulo Agua = new Articulo();
        Agua.id = 1;
        Agua.nombre = "Agua Mineral";
        Agua.stock = 10;
        Agua.descripcion = "Agua Mineral en botella";
        Agua.precioBase = 1.5;
        Agua.tipo = "1";

        Agua.imprimirArticulo();

        Agua.venderArticulo();

        Agua.calcularPrecio();

        Agua.anadirStock(5);

        int stockActual = Agua.obtenerStock();
        System.out.println("Stock actual: " + stockActual);
    }
}
