package com.es.programacion.tema5.proyectoAgenda.services;

import com.es.programacion.tema5.proyectoAgenda.clases.Persona;

import java.util.ArrayList;

public class AgendaService {

    private static ArrayList<Persona> agenda = new ArrayList<Persona>();

    public boolean addPersona(Persona persona) {
        // Hay que comprobar si esa persona existe, y si no existe, se añade

        try {
            if(!this.checkPersona(persona.getDni())) {
                AgendaService.agenda.add(persona);
                return checkPersona(persona.getDni());
            }
        } catch (NullPointerException e) {
            System.out.println("Error en los datos...");
            return false;
        }
        return false;
    }

    public boolean deletePersona(Persona persona) {

        // Hay que comprobar si esa persona está en el ArrayList, si está, se elimina
        for (int i=0; i<AgendaService.agenda.size(); i++) {
            if(AgendaService.agenda.get(i).getDni().equals(persona.getDni())) {
                AgendaService.agenda.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean checkPersona(String dni) {

        // Comprueba si la persona está en el ArrayList o no
        boolean personaExiste = false;

        for (int i=0; i<AgendaService.agenda.size(); i++) {
            if(AgendaService.agenda.get(i).getDni().equals(dni)) {
                personaExiste = true;
                break;
            }
        }

        return personaExiste;
    }

}
