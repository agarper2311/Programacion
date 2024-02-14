package com.es.programacion.tema6.proyectoMascotas;

import com.es.programacion.tema6.proyectoMascotas.clases.*;

public class Main {


    public static void main(String[] args) {

        Perro oreo = new Perro("Oreo", "Schnauzer", false);
        Perro goku = new Perro("Goku", "Yorkshire", false);
        Gato pulga = new Gato("Pulga", "Marron", false);
        Loro pirri = new Loro("Pirri", "Granívoro", true, "Sudamérica");
        Canario muyayo = new Canario("Muyayo", "Granívoro", true, "Amarillo");

        Inventario invent = new Inventario();

        invent.anadirMascota(oreo);
        invent.anadirMascota(goku);
        invent.anadirMascota(pulga);
        invent.anadirMascota(pirri);
        invent.anadirMascota(muyayo);

        invent.mostrarDatosAnimales();

        invent.eliminarMascota("Muyayo");

        System.out.println("--------------");

        invent.mostrarDatosAnimales();

        System.out.println("--------------");

        invent.mostrarTipoYNombreAnimal();

        System.out.println("--------------");


    }

}