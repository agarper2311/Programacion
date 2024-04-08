package com.Programacion.Tema4.proyectoCombatePokemon;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tipo tipo1 = new Tipo("agua");
        Tipo tipo2 = new Tipo("fuego");
        Tipo tipo3 = new Tipo("veneno");

        Ataque ataque1 = new Ataque("Burbuja", tipo1, 30);
        Ataque ataque2 = new Ataque("Llamarada", tipo2, 60);
        Ataque ataque3 = new Ataque("Espina Nociva", tipo3, 10);

        Pokemon pokemon1 = new Pokemon(new String[]{"Squirtle"}, new String[]{"El básico"}, new Tipo[]{tipo1}, new int[]{393}, new Ataque[]{ataque1, ataque3});
        Pokemon pokemon2 = new Pokemon(new String[]{"Charmander"}, new String[]{"El rojo"}, new Tipo[]{tipo2}, new int[]{309}, new Ataque[]{ataque2, ataque3});

        Pokedex pokedex = new Pokedex(new String[]{"agua", "fuego", "veneno"});

        System.out.println("Ataques de " + pokemon1.getNombres()[0] + ":");
        Arrays.stream(pokemon1.getAtaques()).forEach(ataque -> System.out.println(ataque.getNombre() + " de tipo " + ataque.getTipo().getNombre()));

        System.out.println("\nAtaques de " + pokemon2.getNombres()[0] + ":");
        Arrays.stream(pokemon2.getAtaques()).forEach(ataque -> System.out.println(ataque.getNombre() + " de tipo " + ataque.getTipo().getNombre()));

        System.out.println("\nEfectividad de ataques:");
        System.out.println("Efectividad de " + ataque1.getNombre() + " contra " + pokemon2.getNombres()[0] + ": " + pokedex.checkEfectividad(ataque1.getTipo(), pokemon2.getTipos()[0]));
        System.out.println("Efectividad de " + ataque2.getNombre() + " contra " + pokemon1.getNombres()[0] + ": " + pokedex.checkEfectividad(ataque2.getTipo(), pokemon1.getTipos()[0]));
    }
}