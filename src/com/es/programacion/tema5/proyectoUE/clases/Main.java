package com.Programacion.Tema5.proyectoUE.clases;

import com.Programacion.Tema5.proyectoUE.Pais;

public class Main {

    public static void main(String[] args) {
        Pais etiopia = new Pais("Etiopia", 40, 20090, true); // Pablo´s suggestion
        Pais filipinas = new Pais("Filipinas", 10780, 10, false); // Angel´s suggestion
        Pais mojacar = new Pais("Mojacar", 1, 6000, true);

        System.out.println("Nº de paises de la Union Europea son "+Pais.numPaisesUE);


        System.out.println("Nombre: "+etiopia.getNombre());
        System.out.println("Nº de provincias: "+etiopia.getnProvincias());
        System.out.println("Nº de habitantes: "+etiopia.getnHabitantes());
        System.out.println("¿Es monarquico?: "+etiopia.isEsMonarquia());
        etiopia.setNombre("Puerto Serrano");
        System.out.println("Ahora el nombre es: "+etiopia.getNombre()+"\n");

        System.out.println("Nombre: "+filipinas.getNombre());
        System.out.println("Nº de provincias: "+filipinas.getnProvincias());
        System.out.println("Nº de habitantes: "+filipinas.getnHabitantes());
        System.out.println("¿Es monarquico?: "+filipinas.isEsMonarquia());
        etiopia.setNombre("Prado del Rey");
        System.out.println("Ahora el nombre es: "+filipinas.getNombre()+"\n");

        System.out.println("Nombre: "+mojacar.getNombre());
        System.out.println("Nº de provincias: "+mojacar.getnProvincias());
        System.out.println("Nº de habitantes: "+mojacar.getnHabitantes());
        System.out.println("¿Es monarquico?: "+mojacar.isEsMonarquia());
        mojacar.setNombre("Marbella");
        System.out.println("Ahora el nombre es: "+mojacar.getNombre()+"\n");


    }

}

