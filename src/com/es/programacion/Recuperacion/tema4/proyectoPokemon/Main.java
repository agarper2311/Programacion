package com.es.programacion.Recuperacion.tema4.proyectoPokemon;

import com.es.programacion.Recuperacion.tema4.proyectoPokemon.classes.Ataque;
import com.es.programacion.Recuperacion.tema4.proyectoPokemon.classes.Pokemon;
import com.es.programacion.Recuperacion.tema4.proyectoPokemon.classes.Tipo;

import java.util.Scanner;

public class Main {
    /**
     *
     */
    public static final String ANSI_BLUE = "\u001B[34m"; // Define un color de texto azul
    public static final String ANSI_RESET = "\u001B[0m"; // Restablece el color de texto por defecto
    public static final String ANSI_GREEN = "\u001B[32m";// Define un color de texto verde
    public static final String ANSI_YELLOW = "\u001B[33m";// Define un color de texto amarillo
    public static final String ANSI_PURPLE = "\u001B[35m";// Define un color de texto morado

    public static void main(String[] args) {
        /**
         * Tipos de pokemons
         */
        Tipo electrico = new Tipo("Electrico");

        Tipo normal = new Tipo("Normal");

        Tipo planta = new Tipo("Planta");

        Tipo fantasma = new Tipo("Fantasma");

        Tipo siniestro = new Tipo("Siniestro");

        Tipo agua = new Tipo("Agua");

        Tipo roca = new Tipo("Roca");

        Tipo hada = new Tipo("Hada");


        /**
         * Ataques de los Pokemons
         */
        //PIKACHU
        Ataque impactrueno = new Ataque("Impactrueno", electrico, 40, 0);
        Ataque ataqueRapido = new Ataque("Ataque Rápido", normal, 40, 0);
        Ataque trueno = new Ataque("Trueno", electrico, 80, 0);
        Ataque atizar = new Ataque("Atizar", normal, 110, 0);

        //SUNFLORA
        Ataque hojaAfilada = new Ataque("Hoja Afilada", planta, 55, 0);
        Ataque recurrente = new Ataque("Recurrente", planta, 10, 0);
        Ataque danzaPetalo = new Ataque("Danza Pétalo", planta, 70, 0);
        Ataque rayoSolar = new Ataque("Rayo Solar", planta, 110, 0);

        //HAUNTER
        Ataque punioSombra = new Ataque("Puño Sombra", fantasma, 60, 0);
        Ataque golpeBajo = new Ataque("Golpe Bajo", siniestro, 70, 0);
        Ataque vendetta = new Ataque("Vendetta", siniestro, 50, 0);
        Ataque bolaSombra = new Ataque("Bola Sombra", fantasma, 80, 0);

        //VAPOREON
        Ataque pistolaAgua = new Ataque("Pistola Agua", agua, 40, 0);
        Ataque acuaAro = new Ataque("Acua Aro", agua, 0, 40);
        Ataque ultimaBaza = new Ataque("Ultima Baza", normal, 140, 0);

        //TOGEPI
        Ataque poderPasado = new Ataque("Poder Pasado", roca, 60, 0);


        //WAILORD
        Ataque ataquePesado = new Ataque("Ataque Pesado", normal, 150, 0);
        Ataque desenrrollar = new Ataque("Desenrrollar", roca, 30, 0);
        Ataque hidropulso = new Ataque("Hidropulso", agua, 60, 0);


        /**
         * Instanciar los pokemons
         */

        Pokemon pikachu = new Pokemon("Pikachu", 250, electrico, "Pikachu es un Pokémon de tipo Eléctrico, conocido como el Pokémon Ratón. Es la forma evolucionada de Pichu, y puede evolucionar a Raichu cuando se expone a una Piedra Trueno. En algunas regiones, como en Alola, Raichu tiene una forma regional cuando evoluciona de un Pikachu.");
        Pokemon sunflora = new Pokemon("Sunflora", 250, planta, "Sunflora es conocido por su naturaleza alegre y su habilidad para convertir la luz solar en energía, lo que le permite moverse con vivacidad.");
        Pokemon haunter = new Pokemon("Haunter", 250, fantasma, "Haunter tiene un cuerpo oscuro y gaseoso con una boca amplia y dientes afilados. Sus manos flotan separadas de su cuerpo principal y tienen tres dedos puntiagudos en cada una.");
        Pokemon vaporeon = new Pokemon("Vaporeon", 250, agua, "Vaporeon tiene la apariencia de un mamífero acuático que combina rasgos de zorros, peces y otros animales acuáticos. Su cuerpo es principalmente azul claro con una aleta dorsal y una cola que se asemeja a la de una sirena. Tiene orejas puntiagudas y ojos grandes y expresivos. Vaporeon tiene la habilidad única de disolverse en el agua, haciéndolo prácticamente invisible mientras está sumergido.");
        Pokemon togepi = new Pokemon("Togepi", 250, hada, "Togepi es un pequeño Pokémon que se asemeja a un huevo. La mayor parte de su cuerpo está encerrado en su cáscara de huevo, que tiene un patrón de triángulos rojos y azules. Solo su cabeza y sus pequeñas manos y pies son visibles. A menudo es representado como un Pokémon alegre y amistoso, que puede emitir una energía positiva que trae buena suerte a quienes están cerca.");
        Pokemon wailord = new Pokemon("Wailord", 350, agua, "Wailord es enormemente grande, con un cuerpo predominantemente azul y manchas claras en su parte inferior. Su tamaño es tan impresionante que su entrada en la Pokédex a menudo destaca su capacidad para saltar fuera del agua a pesar de su gran tamaño. Su diseño parece combinar elementos de varias especies de ballenas, aunque su comportamiento y habilidades recuerdan más a las ballenas azules y jorobadas.");


        /**
         * Ataques para cada pokemon
         */
        // Pikachu
        pikachu.ataques = new Ataque[4];
        pikachu.ataques[0] = impactrueno;
        pikachu.ataques[1] = ataqueRapido;
        pikachu.ataques[2] = trueno;
        pikachu.ataques[3] = atizar;

        // Sunflora
        sunflora.ataques = new Ataque[4];
        sunflora.ataques[0] = hojaAfilada;
        sunflora.ataques[1] = recurrente;
        sunflora.ataques[2] = danzaPetalo;
        sunflora.ataques[3] = rayoSolar;

        // Haunter
        haunter.ataques = new Ataque[4];
        haunter.ataques[0] = punioSombra;
        haunter.ataques[1] = golpeBajo;
        haunter.ataques[2] = vendetta;
        haunter.ataques[3] = bolaSombra;

        // Vaporeon
        vaporeon.ataques = new Ataque[4];
        vaporeon.ataques[0] = ataqueRapido;
        vaporeon.ataques[1] = pistolaAgua;
        vaporeon.ataques[2] = acuaAro;
        vaporeon.ataques[3] = ultimaBaza;

        // Togepi
        togepi.ataques = new Ataque[4];
        togepi.ataques[0] = ultimaBaza;
        togepi.ataques[1] = poderPasado;

        // Wailord
        wailord.ataques = new Ataque[4];
        wailord.ataques[0] = ataquePesado;
        wailord.ataques[1] = desenrrollar;
        wailord.ataques[2] = hidropulso;
        wailord.ataques[3] = pistolaAgua;


        // Menú para elegir a los pokemons
        //En este menú se irán añadiendo al array de cada entrenador hasta tener un máximo de 3 pokemons

        Scanner scan = new Scanner(System.in);
        int elegirPokemon1;
        int elegirPokemon2;

        //El array es de 4 porque usamos  .length -1 más abajo, de lo contrario podría haber puesto 3
        Pokemon entrenador1[] = new Pokemon[4];
        Pokemon entrenador2[] = new Pokemon[4];

        int pokemonTotales1 = 0;
        int pokemonTotales2 = 0;

        System.out.println("Ahora en la liga pokemon, nuestros entrenadores escogerán hasta 3 de estos pokemons.");
        System.out.println("Los pokemons a elegir son: " + ANSI_GREEN +
                "\n 1. Pikachu" +
                "\n 2. Sunflora" +
                "\n 3. Haunter" +
                "\n 4. Vaporeon" +
                "\n 5. Togepi" +
                "\n 6. Wailord" + ANSI_RESET);

        System.out.println("Ash ketchump elige sus pokemones:  ");
        do {


            elegirPokemon1 = scan.nextInt();

            switch (elegirPokemon1) {
                case 1:
                    for (int i = 0; i < entrenador1.length - 1; i++) {
                        if (entrenador1[i] == null) {
                            entrenador1[i] = pikachu;
                            pokemonTotales1++;
                            break;
                        }

                    }
                    break;

                case 2:
                    for (int i = 0; i < entrenador1.length - 1; i++) {
                        if (entrenador1[i] == null) {
                            entrenador1[i] = sunflora;
                            pokemonTotales1++;
                            break;
                        }

                    }
                    break;
                case 3:
                    for (int i = 0; i < entrenador1.length - 1; i++) {
                        if (entrenador1[i] == null) {
                            entrenador1[i] = haunter;
                            pokemonTotales1++;
                            break;
                        }

                    }
                    break;
                case 4:
                    for (int i = 0; i < entrenador1.length - 1; i++) {
                        if (entrenador1[i] == null) {
                            entrenador1[i] = vaporeon;
                            pokemonTotales1++;
                            break;
                        }

                    }
                    break;
                case 5:
                    for (int i = 0; i < entrenador1.length - 1; i++) {
                        if (entrenador1[i] == null) {
                            entrenador1[i] = togepi;
                            pokemonTotales1++;
                            break;
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < entrenador1.length - 1; i++) {
                        if (entrenador1[i] == null) {
                            entrenador1[i] = wailord;
                            pokemonTotales1++;
                            break;
                        }
                    }
                    break;


            }
        } while (pokemonTotales1 < 3);

        System.out.println("Gary Oak elige sus pokemones:  ");
        do {


            elegirPokemon2 = scan.nextInt();

            switch (elegirPokemon2) {
                case 1:
                    for (int i = 0; i < entrenador2.length - 1; i++) {
                        if (entrenador2[i] == null) {
                            entrenador2[i] = pikachu;
                            pokemonTotales2++;
                            break;
                        }

                    }
                    break;

                case 2:
                    for (int i = 0; i < entrenador2.length - 1; i++) {
                        if (entrenador2[i] == null) {
                            entrenador2[i] = sunflora;
                            pokemonTotales2++;
                            break;
                        }

                    }
                    break;
                case 3:
                    for (int i = 0; i < entrenador2.length - 1; i++) {
                        if (entrenador2[i] == null) {
                            entrenador2[i] = haunter;
                            pokemonTotales2++;
                            break;
                        }

                    }
                    break;
                case 4:
                    for (int i = 0; i < entrenador2.length - 1; i++) {
                        if (entrenador2[i] == null) {
                            entrenador2[i] = vaporeon;
                            pokemonTotales2++;
                            break;
                        }

                    }
                    break;
                case 5:
                    for (int i = 0; i < entrenador2.length - 1; i++) {
                        if (entrenador2[i] == null) {
                            entrenador2[i] = togepi;
                            pokemonTotales2++;
                            break;
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < entrenador2.length - 1; i++) {
                        if (entrenador2[i] == null) {
                            entrenador2[i] = wailord;
                            pokemonTotales2++;
                            break;
                        }
                    }
                    break;


            }
        } while (pokemonTotales2 < 3);


        //Aquí comienza la creación del combate Pokemon
        int elegirAtaqueAsh;
        int elegirAtaqueGary;

        int pokAsh = 0;
        int pokGary = 0;

        do {
            System.out.println(ANSI_PURPLE+entrenador1[pokAsh].nombre + ANSI_RESET+" debe elegir qué usar: ");
            for (int i = 0; i < entrenador1[pokAsh].ataques.length && entrenador1[pokAsh].ataques[i] != null; i++) {
                System.out.print(ANSI_BLUE + "\n" + (i + 1) + "." + entrenador1[pokAsh].ataques[i].nombre + "\n" + ANSI_RESET);
            }


            //Este menú es más sencillo, te muestra los nombres de los ataques a elegir y la vida del pokemon al que has atacado
            elegirAtaqueAsh = scan.nextInt();

            switch (elegirAtaqueAsh) {
                case 1:
                    entrenador2[pokGary].recibirAtk(entrenador1[pokAsh].ataques[0]);
                    System.out.println("El pokemon de " + ANSI_GREEN + "Gary, " + ANSI_RESET + entrenador2[pokGary].nombre + " tiene ahora " + ANSI_YELLOW + entrenador2[pokGary].vida + ANSI_RESET);
                    break;
                case 2:
                    entrenador2[pokGary].recibirAtk(entrenador1[pokAsh].ataques[1]);
                    System.out.println("El pokemon de " + ANSI_GREEN + "Gary, " + ANSI_RESET + entrenador2[pokGary].nombre + " tiene ahora " + ANSI_YELLOW + entrenador2[pokGary].vida + ANSI_RESET);
                    break;
                case 3:
                    entrenador2[pokGary].recibirAtk(entrenador1[pokAsh].ataques[2]);
                    System.out.println("El pokemon de " + ANSI_GREEN + "Gary, " + ANSI_RESET + entrenador2[pokGary].nombre + " tiene ahora " + ANSI_YELLOW + entrenador2[pokGary].vida + ANSI_RESET);
                    break;
                case 4:
                    entrenador2[pokGary].recibirAtk(entrenador1[pokAsh].ataques[3]);
                    System.out.println("El pokemon de " + ANSI_GREEN + "Gary, " + ANSI_RESET + entrenador2[pokGary].nombre + " tiene ahora " + ANSI_YELLOW + entrenador2[pokGary].vida + ANSI_RESET);
                    break;
            }
            //Aquí decimos que si un pokemon muere, pase al siguiente
            // Si el Pokémon de Gary es derrotado
            if (entrenador2[pokGary].vida <= 0) {
                System.err.println("El pokemon de Gary, " + entrenador2[pokGary].nombre + " ha caido derrotado.");

                if (pokemonTotales2 - 1 > pokGary) { // Verifica si hay más Pokémon disponibles
                    System.out.println("Gary, selecciona tu próximo Pokémon:");
                    pokGary = mostrarMenuPokemon(entrenador2, pokemonTotales2); // Permite seleccionar otro Pokémon
                } else {
                    System.out.println("Todos los Pokémon de Gary han sido derrotados. Ash gana!");
                    System.exit(0);
                }
            }




            System.out.println(ANSI_PURPLE +entrenador2[pokGary].nombre + ANSI_RESET + " debe elegir qué usar: ");

            for (int i = 0; i < entrenador2[pokGary].ataques.length && entrenador2[pokGary].ataques[i] != null; i++) {
                System.out.print(ANSI_BLUE + "\n" + (i + 1) + "." + entrenador2[pokGary].ataques[i].nombre + "\n" + ANSI_RESET);
            }


            elegirAtaqueGary = scan.nextInt();

            switch (elegirAtaqueGary) {
                case 1:
                    entrenador1[pokAsh].recibirAtk(entrenador2[pokGary].ataques[0]);
                    System.out.println("El pokemon de " + ANSI_GREEN + "Ash, " + ANSI_RESET + entrenador1[pokAsh].nombre + " tiene ahora " + ANSI_YELLOW + entrenador1[pokAsh].vida + ANSI_RESET);
                    break;
                case 2:
                    entrenador1[pokAsh].recibirAtk(entrenador2[pokGary].ataques[1]);
                    System.out.println("El pokemon de " + ANSI_GREEN + "Ash, " + ANSI_RESET + entrenador1[pokAsh].nombre + " tiene ahora " + ANSI_YELLOW + entrenador1[pokAsh].vida + ANSI_RESET);
                    break;
                case 3:
                    entrenador1[pokAsh].recibirAtk(entrenador2[pokGary].ataques[2]);
                    System.out.println("El pokemon de " + ANSI_GREEN + "Ash, " + ANSI_RESET + entrenador1[pokAsh].nombre + " tiene ahora " + ANSI_YELLOW + entrenador1[pokAsh].vida + ANSI_RESET);
                    break;
                case 4:
                    entrenador1[pokAsh].recibirAtk(entrenador2[pokGary].ataques[3]);
                    System.out.println("El pokemon de " + ANSI_GREEN + "Ash, " + ANSI_RESET + entrenador1[pokAsh].nombre + " tiene ahora " + ANSI_YELLOW + entrenador1[pokAsh].vida + ANSI_RESET);
                    break;
            }
            // Si el Pokémon de Gary es derrotado
            if (entrenador2[pokAsh].vida <= 0) {
                System.err.println("El pokemon de Ash, " + entrenador1[pokAsh].nombre + " ha caido derrotado.");

                if (pokemonTotales1 - 1 > pokAsh) { // Verifica si hay más Pokémon disponibles
                    System.out.println("Ash, selecciona tu próximo Pokémon:");
                    pokAsh = mostrarMenuPokemon(entrenador1, pokemonTotales1); // Permite seleccionar otro Pokémon
                } else {
                    System.out.println("Todos los Pokémon de Gary han sido derrotados. Ash gana!");
                    System.exit(0);
                }
            }




        } while (pokAsh < 3 || pokGary < 3);




    }
    public static int mostrarMenuPokemon(Pokemon[] pokemons, int totalPokemons) {
        Scanner scan = new Scanner(System.in);
        int seleccion;

        System.out.println("Selecciona tu próximo Pokémon:");
        for (int i = 0; i < totalPokemons; i++) {
            if (pokemons[i].vida > 0) {
                System.out.println((i + 1) + ". " + pokemons[i].nombre + " - Vida: " + pokemons[i].vida);
            }
        }

        do {
            seleccion = scan.nextInt();
        } while (seleccion < 1 || seleccion > totalPokemons || pokemons[seleccion - 1].vida <= 0);

        return seleccion - 1; // Devuelve el índice del Pokémon seleccionado
    }
}