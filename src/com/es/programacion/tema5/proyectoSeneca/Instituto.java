package com.Programacion.Tema5.proyectoSeneca;

import java.util.ArrayList;

public class Instituto {
    private String nombre;
    private ArrayList<Alumno> alumnos;

    public Instituto(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    // Métodos get y set omitidos por brevedad

    public void anadirAlumno(Alumno al) {
        boolean existe = false;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getDni().equals(al.getDni())) {
                existe = true;
                break;
            }
        }
        if (!existe) alumnos.add(al);
    }

    public Alumno buscarAlumno(String dni) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getDni().equals(dni)) {
                return alumnos.get(i);
            }
        }
        return null;
    }

    public boolean bajaAlumno(String dni) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getDni().equals(dni)) {
                alumnos.remove(i);
                return true;
            }
        }
        return false;
    }

    public int numeroAlumnos() {
        return alumnos.size();
    }
}