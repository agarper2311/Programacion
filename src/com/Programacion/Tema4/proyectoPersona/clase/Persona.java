package com.Programacion.Tema4.proyectoPersona.clase;

import java.util.Scanner;

public class Persona {
    Scanner scan = new Scanner(System.in);

    // Atributos de clase
    public String nombre;
    public String DNI;
    public String apellidos;
    public String colorPiel;
    public String colorPelo;
    public String nacionalidad;
    public int edad;
    public double altura;

    public boolean estaTrabajando = false;

    // CONSTRUCTOR DE CLASE
    public Persona(String nombre, String DNI, String apellidos, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.apellidos = apellidos;
        this.edad = edad;

    }

    // Métodos de clase
    public String presentarse() {
        return "\n Hola, mi nombre es: " + this.nombre + this.apellidos +
                "\n Mi DNI es: " + this.DNI +
                "\n Mi nacionalidad es: " + this.nacionalidad;
    }

    public void cumplirAnios() {
        System.out.println("Cumplo años: " + this.edad);
        this.edad = this.edad + 1;
    }

    public void cambiarColorPelo() {
        System.out.println("Tenía el pelo de color " + this.colorPelo);
        System.out.println("Asígname un color de pelo: ");
        String nuevoColorPelo = scan.next();
        this.colorPelo = nuevoColorPelo;
        System.out.println("Y ahora lo tengo del color: " + this.colorPelo);
    }

    public boolean esMayorDeEdad() {

        if (this.edad >= 18){
            return true;
        }else {
            return false;
        }

    }

    /**
     * Método que comprueba si dos personas son iguales
     * El método devuelve un boolean
     */

    public boolean sonIguales(Persona otraPersona) {
        return this.DNI.equals(otraPersona.DNI);
    }

    public void cambiarEstadoTrabajo() {
        this.estaTrabajando = !this.estaTrabajando;
    }
}


