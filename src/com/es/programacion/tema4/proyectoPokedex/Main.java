package com.es.programacion.tema4.proyectoPokedex;

public class Main {

    public static void main(String[] args) {

        //Pokemon pikachu = new Pokemon("Pikachu", "Electrico", 100.0, 50.0);
        Pokemon squirtle = new Pokemon("Squirtle", "Agua", 100.0, 50.0);
        Pokemon ponyta = new Pokemon("Ponyta", "Fuego", 70.0, 60.0);

        System.out.println("La vida de Squirtle es: "+squirtle.vida); // La vida de Squirtle es 100
        System.out.println("La vida de Ponyta es: "+ponyta.vida); // La vida de Ponyta es 70


        squirtle.recibirAtaque(ponyta);
        System.out.println("Ataca Ponyta a Squirtle");
        System.out.println("La vida de Squirtle es: "+squirtle.vida); // La vida de Squirtle es 40
        System.out.println("La vida de Ponyta es: "+ponyta.vida); // La vida de Ponyta es 70

        ponyta.recibirAtaque(squirtle);
        System.out.println("Ataca Squirtle a Ponyta");
        System.out.println("La vida de Squirtle es: "+squirtle.vida); // La vida de Squirtle es 40
        System.out.println("La vida de Ponyta es: "+ponyta.vida); // La vida de Ponyta es 20

    }
}
