package com.es.programacion.tema4.proyectoPersona;

import com.es.programacion.tema4.proyectoPersona.clases.Direccion;
import com.es.programacion.tema4.proyectoPersona.clases.Persona;

public class Main {



    public static void main(String[] args) {

        // Objetos persona y direccion 1 -> Estos datos no se establecen correctamente porque el CP es incorrecto
        Direccion direccionDePersonaDePrueba = new Direccion("Calle Falsa", 123, "11600", "Mojacar", "Almeria");
        Persona personaDePrueba = new Persona("12345678L", "Antonia", "Pérez Pérez", 67, direccionDePersonaDePrueba);

        // Objetos persona y direccion 2
        Direccion direccionDePersonaDePrueba2 = new Direccion("Calle Falsa", 123, "04638", "Mojacar", "Almeria");
        Persona personaDePrueba2 = new Persona("12345678L", "Antonia", "Pérez Pérez", 67, direccionDePersonaDePrueba2);

        // Objetos persona y direccion 3
        Direccion direccionDePersonaDePrueba3 = new Direccion("Calle Falsa", 123, "04003", "Almeria", "Almeria");
        Persona personaDePrueba3 = new Persona("12345678L", "Antonia", "Pérez Pérez", 67, direccionDePersonaDePrueba3);


    }
}
