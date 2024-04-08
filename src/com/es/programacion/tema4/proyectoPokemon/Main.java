package com.Programacion.Tema4.proyectoPokemon;

import com.Programacion.Tema4.proyectoPokemon.Clases.Pokedex;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Verificar existencia de un Pokémon
        String pokemonToCheck = "";
        String PokemonOponente = "";
        boolean pokemonExistente = false;

        while (!pokemonExistente) {
            System.out.println("Introduzca el Nombre del Pokémon que desea usar: ");
            pokemonToCheck = scan.next();

            if (Pokedex.checkPokemon(pokemonToCheck)) {
                System.out.println(pokemonToCheck + " existe en la lista de Pokémon.");
                pokemonExistente = true;
            } else {
                System.out.println(pokemonToCheck + " no existe en la lista de Pokémon. Inténtelo de nuevo.");
            }
        }

        // Verificar existencia del Pokémon al que se va a enfrentar
        boolean PokemonOponenteExistente = false;

        while (!PokemonOponenteExistente) {
            System.out.println("Introduzca el Nombre del Pokémon al que se va a enfrentar:");
            PokemonOponente = scan.next();

            if (Pokedex.checkPokemon(PokemonOponente)) {
                System.out.println(PokemonOponente + " existe en la lista de Pokémon.");
                PokemonOponenteExistente = true;
            } else {
                System.out.println(PokemonOponente + " no existe en la lista de Pokémon. Inténtelo de nuevo.");
            }
        }

        // Verificar efectividad de un ataque entre dos tipos de Pokémon
        String tipoAtacante = "";
        String tipoRecibeAtaque = "";

        System.out.println("Elija el tipo de Pokémon: Fuego, Agua, Planta, Veneno...");
        tipoAtacante = scan.next();

        System.out.println("Elija el tipo del Pokémon que va a recibir el ataque: ");
        tipoRecibeAtaque = scan.next();

        double efectividad = Pokedex.checkEfectividad(tipoAtacante, tipoRecibeAtaque);
        System.out.println("La efectividad entre tipo " + tipoAtacante + " y tipo " + tipoRecibeAtaque + " es: " + efectividad);
    }
}