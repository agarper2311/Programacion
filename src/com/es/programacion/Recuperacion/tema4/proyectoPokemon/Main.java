package com.es.programacion.Recuperacion.tema4.proyectoPokemon;

import com.es.programacion.Recuperacion.tema4.proyectoPokemon.classes.Ataque;
import com.es.programacion.Recuperacion.tema4.proyectoPokemon.classes.Pokemon;
import com.es.programacion.Recuperacion.tema4.proyectoPokemon.classes.Tipo;

import java.util.Scanner;

public class Main {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    /**
     * -> Crear 6 pokemon
     * -Crear todos los ataques
     * -Crear todos los tipos
     * -> Eleccion Pokemons
     * -> Combate
     */
    public static void main(String[] args) {
        //*******************************************
        //***********Tipos de pokemon****************
        //*******************************************
        Tipo electrico = new Tipo("Electrico");

        Tipo normal = new Tipo("Normal");

        Tipo planta = new Tipo("Planta");

        Tipo fantasma = new Tipo("Fantasma");

        Tipo siniestro = new Tipo("Siniestro");

        Tipo agua = new Tipo("Agua");

        Tipo roca = new Tipo("Roca");

        Tipo hada = new Tipo("Hada");


        //*******************************************
        //***********Ataques de pokemon**************
        //*******************************************
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


        //*******************************************
        //***********Constructor Pokemon*************
        //*******************************************

        Pokemon pikachu = new Pokemon("Pikachu", 250, electrico);
        Pokemon sunflora = new Pokemon("Sunflora", 250, planta);
        Pokemon haunter = new Pokemon("Haunter", 250, fantasma);
        Pokemon vaporeon = new Pokemon("Vaporeon", 250, agua);
        Pokemon togepi = new Pokemon("Togepi", 250, hada);
        Pokemon wailord = new Pokemon("Wailord", 350, agua);

        //*******************************************
        //*************Ataques equipados*************
        //*******************************************


        pikachu.ataques = new Ataque[4];
        pikachu.ataques[0] = impactrueno;
        pikachu.ataques[1] = ataqueRapido;
        pikachu.ataques[2] = trueno;
        pikachu.ataques[3] = atizar;


        sunflora.ataques = new Ataque[4];
        sunflora.ataques[0] = hojaAfilada;
        sunflora.ataques[1] = recurrente;
        sunflora.ataques[2] = danzaPetalo;
        sunflora.ataques[3] = rayoSolar;


        haunter.ataques = new Ataque[4];
        haunter.ataques[0] = punioSombra;
        haunter.ataques[1] = golpeBajo;
        haunter.ataques[2] = vendetta;
        haunter.ataques[3] = bolaSombra;


        vaporeon.ataques = new Ataque[4];
        vaporeon.ataques[0] = ataqueRapido;
        vaporeon.ataques[1] = pistolaAgua;
        vaporeon.ataques[2] = acuaAro;
        vaporeon.ataques[3] = ultimaBaza;


        togepi.ataques = new Ataque[4];
        togepi.ataques[0] = ultimaBaza;
        togepi.ataques[1] = poderPasado;


        wailord.ataques = new Ataque[4];
        wailord.ataques[0] = ataquePesado;
        wailord.ataques[1] = desenrrollar;
        wailord.ataques[2] = hidropulso;
        wailord.ataques[3] = pistolaAgua;


        //Aquí se crea el menú donde los entrenadores eligen a sus pokemons con un do while
        //En este menú se irán añadiendo al arr de cada entrenador hasta 3 pokemons

        Scanner scan = new Scanner(System.in);
        int elegirPokemon1;
        int elegirPokemon2;

        //El arr es de 4 porque luego he puesto .length -1 más abajo, sino podría haber puesto 3
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


        /**
         * Para el combate necesito:
         *      que los pokemon aparezcan en combate
         *      que cada entrenador pueda elegir el ataque que quiero que haga ese pokemon
         *      y que luego le toque al otro entrenador
         *      si un pokemon cae a 0 pasa al siguiente pokemon del entrenador
         *      cuando un entrenador se queda sin pokemons. El entrenador pierde
         *
         */

        //Aquí comienza la creación del combate Pokemon
        int elegirAtaqueAsh;
        int elegirAtaqueGary;

        int pokAsh = 0;
        int pokGary = 0;
/**
 * Vamos a explicar como funciona este menú:
 * Primero creamos un do while que recoja las acciones de Ash y Gary
 * creamos unos int que representen el num del pokemon del arr de Ash y Gary pokAsh, pokGary respectivamente y lo inializamos en 0
 * como ahora pokAsh es 0, si lo colocamos dentro del arr entrenador1[pokAsh] será como colocar 0
 * Creamos un for para movernos por los pokemons de Ash y Gary y escribimos entrenador1[pokAsh].ataques.length
 * para que cuando cambie el pokemon también camien los atk a mostrar
 * Además con && ntrenador1[pokAsh].ataques[i] != null -> nos ayuda a que solo muestre los huecos que no sean null del array de ataques de cada pokemon
 * Dentro del for i+1 -> hace que i que es desde un principio 0 sea 1. para que sea más  intuitivo el menú de selección de ataques
 * i -> es 0 desde un principio y como se mueve a través del array  -> entrenador1[pokAsh].ataques[i].nombre ---> muestra los nombres de los ataques
 */
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
            if (entrenador2[pokGary].vida <= 0) {
                System.err.println("El pokemon de Gary, " + entrenador2[pokGary].nombre + " ha caido derrotado. Saca su siguiente pokemon");
                pokGary++;
                //Da un bug al final cuando todos los pokemon del rival mueren, pero con esto nos salimos del programa antes de que eso ocurra
                if (pokGary >= 3) {
                    System.exit(0);
                }
            }


            //***********

            //Copiamos el mismo menú de arriba pero con parámetros distintos.
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
            if (entrenador1[pokAsh].vida <= 0) {
                System.err.println("El pokemon de Ash, " + entrenador1[pokAsh].nombre + " ha caido derrotado. Saca su siguiente pokemon");
                pokAsh++;
                if (pokAsh >= 3) {
                    System.exit(0);
                }
            }


        } while (pokAsh < 3 || pokGary < 3);

        /*
        Necesito que cuando un pokemon muera, este se pase al siguiente:
            A) Usar if y crear interminables variables
            B) Usar Switch y boolean para cuando un pokemon muera  este sea true. Si true, pokemon ash2 vs pokemon gary1 (Pero y si ahora muere gary1??)
            C) Usar For y que si i =< 0 pase al siguiente pokemon

            for (int i = 0; i < entrenador1.length - 1; i++) {
          do{

                -pokemon Ash[i] if .vidas es <=0 then -> i++

                -
                }
            }
         */


    }
}