package com.es.programacion.tema6.proyectoAstros;

import com.es.programacion.tema6.proyectoAstros.clases.Planeta;
import com.es.programacion.tema6.proyectoAstros.clases.Satelite;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Planeta tierra = new Planeta(
            6738.4,23.56, 5975, 17.18, "Tierra",
                150000000, 365.04, true);

        Satelite luna = new Satelite(
                3474.8, 23.56, 7, -96, "Luna",
                384400, 23.56);


        tierra.muestra();
        luna.muestra();

        if (tierra.esMayor(luna)) {
            System.out.println("La tierra es mayor");
        } else {
            System.out.println("La luna es mayor");
        }


        // CREAD EL PLANETA JUPITER Y EL SATELITE EUROPA

        // COMPARAD JUPITER CON LA TIERRA, Y EUROPA CON LA LUNA


        LocalDate fechaNac = LocalDate.of(1989, 12, 19);

        if(fechaNac.getDayOfMonth() == LocalDate.now().getDayOfMonth() && fechaNac.getMonthValue() == LocalDate.now().getMonthValue()) {
            System.out.println("Hoy es tu cumpleaños");
        }




    }
}
