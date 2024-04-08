package com.Programacion.Tema5.proyectoMRajoy;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    private static final int mayoriaEdad = 18;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        if (validarDNI(dni)) {
            this.dni = dni;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
        } else {
            System.out.println("Error: DNI no válido. Los valores no se han guardado.");
        }
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

    public void imprime() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad + " años");
    }

    public boolean esMayorEdad() {
        return edad >= mayoriaEdad;
    }

    public boolean esJubilado() {
        return edad >= 65;
    }

    public int diferenciaEdad(Persona p) {
        return Math.abs(this.edad - p.getEdad());
    }

    private static boolean validarDNI(String dni) {
        // Validar que el DNI tenga 8 números y una letra
        return dni.matches("\\d{8}[A-Za-z]");
    }
}
