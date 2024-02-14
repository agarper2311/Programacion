package com.es.programacion.tema5.proyectoMRajoy;

import com.es.programacion.tema4.proyectoDNI.clases.VerificadorDNI;

public class Persona {

    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    private static final int MAYORIAEDAD = 21;

    public Persona(String dni, String nombre, String apellidos, int edad) {

        // check dni
        if(VerificadorDNI.comprobarLetra(dni)
                && VerificadorDNI.comprobarLongitud(dni)
                && VerificadorDNI.comprobarParteNumerica(dni)
                && VerificadorDNI.comprobarLetraCorrecta(dni)) {
            this.dni = dni;
        } else {
            this.dni = "";
        }

        this.nombre = nombre;
        this.apellidos = apellidos;

        if(edad >= 0) {
            this.edad = edad;
        }

    }

    public void imprime() {
        System.out.print("El nombre es "+this.nombre+" "+this.apellidos+" con dni "+this.dni);
    }

    public boolean esMayorEdad(){
        return this.edad >= Persona.MAYORIAEDAD;
    }

    public boolean esJubilade(){
        return this.edad >= 65;
    }

    public int diferenciaEdad(Persona p) {
        return Math.abs(this.edad - p.edad);
    }




    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
