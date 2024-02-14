package com.es.programacion.tema5.proyectoEU;

import com.es.programacion.tema5.proyectoEU.clases.Pais;

public class Main {

    public static void main(String[] args) {

        Pais etiopia = new Pais("Etiopia", 2, 2000, true); // Pablo's suggestion
        Pais filipinas = new Pais("Phillipines", 100, 200000, true);
        Pais mojacar = new Pais("Mojacar", 1, 6000, false);


        System.out.println("Nº de paises de la Union europea son: "+Pais.numPaisesEU);

        System.out.println(etiopia.getNombre());

        // setNombre para cambiar el nombre
        etiopia.setNombre("Ubrique");

        // getNombre para obtener el nombre
        System.out.println(etiopia.getNombre());

        etiopia.setnHabitantes(16000);
        etiopia.setnProvincias(3);
        etiopia.setEsMonarquia(true);



    }
}
