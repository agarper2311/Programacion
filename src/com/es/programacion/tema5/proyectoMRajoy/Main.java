package com.Programacion.Tema5.proyectoMRajoy;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Persona
        Persona persona1 = new Persona("12345678A", "Juan", "Gómez", 25);
        Persona persona2 = new Persona("98765432B", "Ana", "López", 30);

        // Imprimir información de las personas
        System.out.println("Información de Persona 1:");
        persona1.imprime();
        System.out.println("Es mayor de edad: " + persona1.esMayorEdad());
        System.out.println("Es jubilado: " + persona1.esJubilado());

        System.out.println("\nInformación de Persona 2:");
        persona2.imprime();
        System.out.println("Es mayor de edad: " + persona2.esMayorEdad());
        System.out.println("Es jubilado: " + persona2.esJubilado());

        // Calcular diferencia de edad entre las dos personas
        int diferenciaEdad = persona1.diferenciaEdad(persona2);
        System.out.println("\nDiferencia de edad entre Persona 1 y Persona 2: " + diferenciaEdad + " años");
    }
}

