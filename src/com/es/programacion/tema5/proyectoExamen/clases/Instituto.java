package com.es.programacion.tema5.proyectoExamen.clases;

import java.util.ArrayList;

public class Instituto {

    private String nombre;
    private ArrayList<Alumno> alumnos;

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Instituto(String nombre) {
        this.nombre = nombre;
        alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void anadirAlumno(Alumno al) {
        // Recorrer el arraylist de alumnos
        boolean alumnoRepetido=false;
        for (int i=0; i< alumnos.size(); i++) {
            if(alumnos.get(i).getDni().equalsIgnoreCase(al.getDni())) {
                alumnoRepetido=true;
                break;
            }
        }

        if(!alumnoRepetido) {
            alumnos.add(al);
        } else {
            System.out.println("El alumno ya está");
        }
    }

    public Alumno buscarAlumno(String dni) {
        Alumno alumnoEncontrado = null;
        for (int i=0; i< alumnos.size(); i++) {
            if(alumnos.get(i).getDni().equalsIgnoreCase(dni)) {
                alumnoEncontrado = alumnos.get(i);
                break;
            }
        }
        return alumnoEncontrado;
    }

    public boolean bajaAlumno(String dni) {
        boolean alumnoEliminado=false;
        for (int i=0; i< alumnos.size(); i++) {
            if(alumnos.get(i).getDni().equalsIgnoreCase(dni)) {
                alumnos.remove(i);
                alumnoEliminado = true;
                break;
            }
        }
        return alumnoEliminado;
    }

    public int getNumeroAlumnos() {
        int nAlumnos = alumnos.size();
        return nAlumnos;
    }

}
