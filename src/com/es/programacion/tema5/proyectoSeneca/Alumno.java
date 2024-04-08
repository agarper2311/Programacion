package com.Programacion.Tema5.proyectoSeneca;

import java.util.ArrayList;

public class Alumno {
    private String dni;
    private String nombre;
    private String email;
    private ArrayList<Modulo> modulos;


    // Constructor
    public Alumno(String dni, String nombre, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.modulos = new ArrayList<>();
    }


    // Getters and Setters

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(ArrayList<Modulo> modulos) {
        this.modulos = modulos;
    }

    public void anadirModulo(Modulo mod) {
        boolean existe = false;
        for (int i = 0; i < modulos.size(); i++) {
            if (modulos.get(i).equals(mod)) {
                existe = true;
                break;
            }
        }
        if (!existe) modulos.add(mod);
    }

    public double getNumeroHoras() {
        int totalHoras = 0;
        for (int i = 0; i < modulos.size(); i++) {
            totalHoras += modulos.get(i).getHoras();
        }
        return totalHoras;
    }
}