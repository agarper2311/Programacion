package com.Programacion.Tema4.proyectoPokemon.Clases;

public class Pokedex {
    // ATRIBUTOS DE CLASE
    private static String[] pokemons = {"Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard",
            "Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree", "Weedle", "Kakuna", "Beedrill",
            "Pidgey", "Pidgeotto", "Pidgeot", "Rattata", "Raticate", "Spearow", "Fearow", "Ekans", "Arbok", "Pikachu",
            "Raichu", "Sandshrew", "Sandslash", "Nidoran+", "Nidorina", "Nidoqueen", "Nidorino", "Nidoran-", "Nidoking",
            "Clefairy", "Clefable", "Vulpix", "Ninetales", "Jigglypuff", "Wigglytuff", "Zubat", "Golbat", "Oddish",
            "Gloom", "Vileplume", "Paras", "Parasect", "Venonat", "Venomoth", "Diglett", "Dugtrio", "Meowth", "Persian",
            "Psyduck", "Golduck", "Mankey", "Primeape", "Growlithe", "Arcanine", "Poliwag", "Poliwhirl", "Poliwrath",
            "Abra", "Kadabra", "Alakazam", "Machop", "Machoke", "Machamp", "Bellsprout", "Weepinbell", "Victreebel",
            "Tentacool", "Tentacruel", "Geodude", "Graveler", "Golem", "Ponyta", "Rapidash", "Slowpoke", "Slowbro",
            "Magnemite", "Magneton", "Farfetch’d", "Doduo", "Dodrio", "Seel", "Dewgong", "Grimer", "Muk", "Shellder",
            "Cloyster", "Gastly", "Haunter", "Gengar", "Onix", "Drowzee", "Hypno", "Krabby", "Kingler", "Voltorb",
            "Electrode", "Exeggcute", "Exeggutor", "Cubone", "Marowak", "Hitmonlee", "Hitmonchan", "Lickitung",
            "Koffing", "Weezing", "Rhyhorn", "Rhydon", "Chansey", "Tangela", "Kangaskhan", "Horsea", "Seadra", "Goldeen",
            "Seaking", "Staryu", "Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Magmar", "Pinsir", "Tauros",
            "Magikarp", "Gyarados", "Lapras", "Ditto", "Eevee", "Vaporeon", "Jolteon", "Flareon", "Porygon", "Omanyte",
            "Omastar", "Kabuto", "Kabutops", "Aerodactyl", "Snorlax", "Articuno", "Zapdos", "Moltres", "Dratini",
            "Dragonair", "Dragonite", "Mewtwo", "Mew"
    };

    // Método para verificar si un Pokémon existe en la lista
    public static boolean checkPokemon(String pokemon) {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i].equalsIgnoreCase(pokemon)) {
                return true;
            }
        }
        return false;
    }


    public static double checkEfectividad(String tipoAtacante, String tipoRecibeAtaque) {

        if (tipoAtacante.equals("Fuego")) {
            if (tipoRecibeAtaque.equals("Agua") || tipoRecibeAtaque.equals("Roca")) {
                return 0.5;
            } else if (tipoRecibeAtaque.equals("Rayo")) {
                return 1;
            }
        } else if (tipoAtacante.equals("Agua")) {
            if (tipoRecibeAtaque.equals("Fuego")) {
                return 1.5;
            } else if (tipoRecibeAtaque.equals("Roca")) {
                return 0.5;
            } else if (tipoRecibeAtaque.equals("Rayo")) {
                return 1;
            }
        } else if (tipoAtacante.equals("Roca")) {
            if (tipoRecibeAtaque.equals("Agua") || tipoRecibeAtaque.equals("Fuego")) {
                return 1.5;
            } else if (tipoRecibeAtaque.equals("Rayo")) {
                return 1;
            }
        } else if (tipoAtacante.equals("Rayo")) {
            if (tipoRecibeAtaque.equals("Agua")) {
                return 1.5;
            } else if (tipoRecibeAtaque.equals("Roca")) {
                return 1;
            } else if (tipoRecibeAtaque.equals("Fuego")) {
                return 1;
            }
        }
        return 1;

    }

    private static boolean esMuyEfectivo(String tipoAtacante, String tipoRecibeAtaque) {
        // Ejemplo: Fuego es muy efectivo contra Planta

        // equalsIgnoreCase para ignorar si las letras es Mayúsculas o Minúscula
        return tipoAtacante.equalsIgnoreCase("Fuego") && tipoRecibeAtaque.equalsIgnoreCase("Planta");
    }

    private static boolean esPocoEfectivo(String tipoAtacante, String tipoRecibeAtaque) {
        // Ejemplo: Agua es poco efectivo contra Fuego
        return tipoAtacante.equalsIgnoreCase("Agua") && tipoRecibeAtaque.equalsIgnoreCase("Fuego");
    }
}