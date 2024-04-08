package com.Programacion.Tema5.proyectoAgenda;

import com.Programacion.Tema5.proyectoAgenda.clases.Persona1;
import com.Programacion.Tema5.proyectoAgenda.clases.Direccion;
import com.Programacion.Tema5.proyectoAgenda.clases.Localidad;
import com.Programacion.Tema5.proyectoAgenda.services.AgendaService;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de AgendaService
        AgendaService agendaService = new AgendaService();

        // Crear una localidad
        Localidad localidad = new Localidad();
        localidad.setMunipio("Sevilla");
        localidad.setProvincia("Sevilla");
        localidad.setCp("41001");

        // Crear una dirección
        Direccion direccion = new Direccion();
        direccion.setCalle("Calle Jazmín");
        direccion.setNumero("123");
        direccion.setPlanta("1");
        direccion.setPuerta("A");
        direccion.setLocalidad(localidad);

        // Crear una persona
        Persona1 persona = new Persona1();
        persona.setNombre("Juan Pérez");
        persona.setDni("12345678A");
        persona.setEdad(30);
        persona.setEmail("juanperez@g.educaand.es");
        persona.setTelefono("123 45 67 89");
        persona.setDireccion(direccion);

        // Añadir persona a la agenda
        boolean added = agendaService.addPersona(persona);
        System.out.println("Persona añadida: " + added);

        // Presentación de la persona
        persona.presentacion();


    }
}
