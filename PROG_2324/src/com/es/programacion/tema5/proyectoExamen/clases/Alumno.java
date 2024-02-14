package com.es.programacion.tema5.proyectoExamen.clases;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno {

    private static final String EXP_REG_DNI = "^\\d{8}(-|\\s|\\/)?[a-zA-Z]$";
    private static final String EXP_REG_EMAIL = "^[a-z]{7}\\d{3,4}@g\\.educaand\\.es$";

    private String nombre;
    private String dni;
    private String email;
    private ArrayList<Modulo> modulos;

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(ArrayList<Modulo> modulos) {
        this.modulos = modulos;
    }

    public Alumno(String nombre, String dni, String email) {
        this.nombre = nombre;
        setDni(dni);
        setEmail(email);
        modulos = new ArrayList<Modulo>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {

        Pattern pattern = Pattern.compile(EXP_REG_DNI);
        Matcher matcher = pattern.matcher(dni);
        if (matcher.find()) {
            this.dni = dni;
        } else {
            this.dni = "";
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Pattern pattern = Pattern.compile(EXP_REG_EMAIL);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            this.email = email;
        } else {
            this.email = "";
        }
    }


    public void anadirModulo(Modulo mod) {

        // Recorrer el arraylist de módulos
        boolean moduloRepetido=false;
        for (int i=0; i< modulos.size(); i++) {
            if(modulos.get(i).getNombre().equalsIgnoreCase(mod.getNombre())) {
                moduloRepetido=true;
                break;
            }
        }

        if(!moduloRepetido) {
            modulos.add(mod);
        } else {
            System.out.println("El modulo ya está");
        }

    }


    public double getNumeroHoras() {
        double horasTotales = 0.0;
        for (int i=0; i< modulos.size(); i++) {
            horasTotales += modulos.get(i).getHoras();
        }
        return horasTotales;
    }

}
