package com.es.programacion.tema6.proyectoEmpresa;

import com.es.programacion.tema6.proyectoEmpresa.classes.impl.Articulo;
import com.es.programacion.tema6.proyectoEmpresa.classes.impl.Proveedor;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Proveedor p1 = new Proveedor("B12326", "Construcciones Diego", "SL", "Calle falsa, 123", "666333000");
        Proveedor p2 = new Proveedor("B12326", "Construcciones Diego", "SL", "Calle falsa, 123", "666333000");


        Articulo vaper = new Articulo("1", "Vaper de melocotón",
                p1, 5, 100);
        Articulo vaper2 = new Articulo("1", "Vaper de melocotón",
                p2, 5, 100);
        Articulo vaper3 = new Articulo("1", "Vaper de melocotón",
                p1, 5, 50);

        System.out.print(vaper.equals(vaper2));

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.equals(p2));


        ArrayList<Articulo> articulos = new ArrayList<>();

        articulos.add(vaper);


        if (articulos.contains(vaper3)){
            articulos.get(articulos.indexOf(vaper3)).setStock(vaper3.getStock());
        }

        // estamos añadiendo un vaper que ya existe
        // Queremos añadir vaper2
        System.out.println(articulos.get(0));
        for (int i=0; i<= articulos.size(); i++) {
            if(vaper2.equals(articulos.get(i))) {
                articulos.get(i).setStock(vaper2.getStock());
                break;
            }
        }
        System.out.println(articulos.get(0));



        System.out.println(articulos.get(0));

        /// Crear 5 Artículos más
        Articulo VaperParaSordos = new Articulo(UUID.randomUUID().toString(), "Vaper Para Sordos", p1, 10, 150);
        Articulo VaperParaCiegos = new Articulo(UUID.randomUUID().toString(), "VaperParaCiegos", p2, 8, 120);
        Articulo TalcualHermano = new Articulo(UUID.randomUUID().toString(), "Vaper Tal cual Hermano", p1, 6, 130);
        Articulo TalCual = new Articulo(UUID.randomUUID().toString(), "Vaper Tal Cual", p2, 9, 140);
        Articulo VaperParaCojos = new Articulo(UUID.randomUUID().toString(), "Vaper Para Cojos", p1, 7, 110);

        // Añadir al arrayList
        articulos.add(VaperParaSordos);
        articulos.add(VaperParaCiegos);
        articulos.add(TalcualHermano);
        articulos.add(TalCual);
        articulos.add(VaperParaCojos);

        // Mostrar la lista de artículos
        for (int i = 0; i < articulos.size(); i++) {
            System.out.println(articulos.get(i));
        }
        // ¿La lista está ordenada?
        // No, pero la voy a ordenar por precio

        // Ordenar la lista de artículos por precio

        Collections.sort(articulos);
        // Mostrar la lista de artículos
        for (int i = 0; i < articulos.size(); i++) {
            System.out.println(articulos.get(i));
        }





    }
}