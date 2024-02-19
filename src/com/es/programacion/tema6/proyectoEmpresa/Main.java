package com.es.programacion.tema6.proyectoEmpresa;

import com.es.programacion.tema6.proyectoEmpresa.Articulo;
import com.es.programacion.tema6.proyectoEmpresa.Proveedor;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Proveedor p1 = new Proveedor("B12326", "Construcciones Diego", "SL", "Calle falsa, 123", "666333000");
        Proveedor p2 = new Proveedor("B12326", "Construcciones Diego", "SL", "Calle falsa, 123", "666333000");


        Articulo vaper = new Articulo("1", "Vaper de melocoton",
                p1, 5, 100);
        Articulo vaper2 = new Articulo("1", "Vaper de melocoton",
                p2, 5, 100);

        System.out.print(vaper.equals(vaper2));

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.equals(p2));

    }
}