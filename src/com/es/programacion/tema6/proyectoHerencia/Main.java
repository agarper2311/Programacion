package com.es.programacion.tema6.proyectoHerencia;

import com.es.programacion.tema6.proyectoHerencia.clases.Cliente;
import com.es.programacion.tema6.proyectoHerencia.clases.Empleado;
import com.es.programacion.tema6.proyectoHerencia.clases.PersonaH;

public class Main {

    public static void main(String[] args) {

        // Creamos un cliente
        Cliente cl = new Cliente("Diego", "12345678Z", "H", "1", true);
        cl.presentacion();

        // Creamos un empleado
        Empleado em = new Empleado("Pepe", "23456789Z", "H", 1050.0);
        em.presentacion();

        // Creamos una personaH
        PersonaH per = new PersonaH("Manolo", "34567890D", "M");


    }
}
