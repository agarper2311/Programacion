package com.es.programacion.tema4.proyectoPokemon;

import com.es.programacion.tema4.proyectoPokemon.clases.Ataque;
import com.es.programacion.tema4.proyectoPokemon.clases.Pokemon;
import com.es.programacion.tema4.proyectoPokemon.clases.Tipo;
import com.es.programacion.tema4.proyectoPokemon.utils.Pokedex;

import java.util.Arrays;
import java.util.Scanner;

//          JUAN MANUEL SABORIDO BAENA      1ºDAW

public class Main {
    public static void main(String[] args) {

        Tipo Normal = new Tipo("Normal");   // Este Tipo es el pokemon y un ataque
        Tipo Lucha = new Tipo("Lucha");   // Este Tipo es el pokemon y un ataque
        Tipo Electrico = new Tipo("Electrico");   // Este Tipo es el pokemon y un ataque
        Tipo Planta = new Tipo("Planta");   // Este Tipo es el pokemon y un ataque
        Tipo Fuego = new Tipo("Fuego");   // Este Tipo es el pokemon y un ataque
        Tipo Agua = new Tipo("Agua");   // Este Tipo es el pokemon y un ataque
        Tipo Dragon = new Tipo("Dragon");   // Este Tipo es un ataque
        Tipo Siniestro = new Tipo("Siniestro");   // Este Tipo es un ataque


        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();

        jugador1.pokemons[0] = new Pokemon("charmander", 100.0, Fuego);
        jugador1.pokemons[1] = new Pokemon("squirtel", 100.0, Agua);
        jugador1.pokemons[2] = new Pokemon("bulbasur", 100.0, Planta);
        jugador2.pokemons[0] = new Pokemon("pikachu", 100.0, Electrico);
        jugador2.pokemons[1] = new Pokemon("machop", 100.0, Lucha);
        jugador2.pokemons[2] = new Pokemon("rattata", 100.0, Normal);


        Ataque[] ataques1 = new Ataque[3];
        Ataque[] ataques2 = new Ataque[3];
        Ataque[] ataques3 = new Ataque[3];
        Ataque[] ataques4 = new Ataque[3];
        Ataque[] ataques5 = new Ataque[3];
        Ataque[] ataques6 = new Ataque[3];

        //  Ataques de charmander
        ataques1[0] = new Ataque("Lanzallamas", Fuego, 50);
        ataques1[1] = new Ataque("Arañazo", Normal, 55);
        ataques1[2] = new Ataque("Furia Dragon", Dragon, 60);

        //Ataques de squirtle
        ataques2[0] = new Ataque("Pistola Agua", Agua, 64);
        ataques2[1] = new Ataque("Mordisco", Siniestro, 53);
        ataques2[2] = new Ataque("Giro Rapido", Normal, 63);

        //Ataques de bulbasaur
        ataques3[0] = new Ataque("Hoja Afilada", Planta, 64);
        ataques3[1] = new Ataque("Latigo Cepa", Planta, 53);
        ataques3[2] = new Ataque("Derribo", Normal, 63);

        //Ataques de pikachu
        ataques4[0] = new Ataque("Trueno", Electrico, 64);
        ataques4[1] = new Ataque("Ataque Rápido", Normal, 53);
        ataques4[2] = new Ataque("Chispazo", Electrico, 63);

        //Ataques de machop
        ataques5[0] = new Ataque("Puñetazo", Lucha, 64);
        ataques5[1] = new Ataque("Golpe Bis", Dragon, 53);
        ataques5[2] = new Ataque("Sumisión", Lucha, 63);

        //Ataques de rattata
        ataques6[0] = new Ataque("Placaje", Normal, 64);
        ataques6[1] = new Ataque("Mordisco", Siniestro, 53);
        ataques6[2] = new Ataque("Doble Filo", Normal, 63);


        jugador1.pokemons[0].ataques_ = ataques1;
        jugador1.pokemons[1].ataques_ = ataques2;
        jugador1.pokemons[2].ataques_ = ataques3;
        jugador2.pokemons[0].ataques_ = ataques4;
        jugador2.pokemons[1].ataques_ = ataques5;
        jugador2.pokemons[2].ataques_ = ataques6;

        empezarJuego(jugador1, jugador2);

    }

    public static void empezarJuego(Jugador jugador1, Jugador jugador2) {   // Este método estático permite el acceso a métodos y variables de clase
        Scanner scan = new Scanner(System.in);                              //  Sin instanciarun objeto de dicha clase
        int cont1 = 0, cont2 = 0;   // Estos contadores ayudarán ha decir quien es el ganador, ya que habrá un marcador oara saber quien gana
        int jugador = 0;
        Jugador aux;    //  Servirá para el intercambio de jugadores

        System.out.println("\nJugador 1");      //  Información de inicio
        for (int k = 0; k < 3; k++) {
            jugador1.pokemons[k].getPokemon();
            System.out.println("\n");
        }
        System.out.println("\nJugador 2");
        for (int k = 0; k < 3; k++) {
            jugador2.pokemons[k].getPokemon();
            System.out.println("\n");
        }

        System.out.println("¿Qué jugador quieres ser? ");
        jugador = scan.nextInt();
        if (jugador == 2) {     //  Se nos cambian los pokemons para elegir jugador
            aux = jugador1;
            jugador1 = jugador2;
            jugador2 = aux;
        }
        int j = 0;
        int ataque;
        int estadoCombate = 0;
        boolean enCombate = true;
        boolean ganador = false;    // Variable para declarar el ganador

        while (cont1 < 2 && cont2 < 2) {
            if (jugador2.pokemons[j].vida_ > 0 && enCombate) {
                System.out.println("\nJugador 1");
                jugador1.pokemons[j].getPokemon();
                ataque = scan.nextInt() - 1;    //  Para que comience desde 1
                //  El ataque del jugador 2 afecta al jugador 1
                jugador2.pokemons[j].vida_ -= (jugador1.pokemons[j].ataques_[ataque].danio_ * Pokedex.checkEfectividad(jugador1.pokemons[j].ataques_[ataque].tipo_, jugador2.pokemons[j].tipo_));

                if (jugador2.pokemons[j].vida_ <= 0) {  //  No puede ser que la vida de un pokemon sea negativo
                    enCombate = false;
                    estadoCombate = 1;  //  Primer movimiento del jugador
                }
            }

            if (jugador1.pokemons[j].vida_ > 0 && enCombate) {
                System.out.println("\nJugador 2");
                jugador2.pokemons[j].getPokemon();
                ataque = scan.nextInt() - 1;
                jugador1.pokemons[j].vida_ -= (jugador2.pokemons[j].ataques_[ataque].danio_ * Pokedex.checkEfectividad(jugador2.pokemons[j].ataques_[ataque].tipo_, jugador1.pokemons[j].tipo_));
                if (jugador1.pokemons[j].vida_ <= 0) {
                    enCombate = false;
                    estadoCombate = 2;  //Segundo movimiento del Jugador
                }
            }
            if (!enCombate) {
                enCombate = true;
                if (estadoCombate == 1) {  // El 1 del ganador del estado combate será el jugador1
                    cont1++;
                    System.out.println("El Jugador 1 ha ganado este combate");
                    System.out.println("Marcadores: " + cont1 + "-" + cont2);
                    ganador = true;
                }

                if (estadoCombate == 2) {   // El 2 del ganador del estado combate será el jugador2
                    cont2++;
                    System.out.println("El Jugador 2 ha ganado este combate");
                    System.out.println("Marcadores: " + cont1 + "-" + cont2);
                    ganador = true;
                }
            }

            if (ganador) {
                ganador = false;
                j++;
            }
        }
        if (cont1 == 2) {   //  Marcadores de quien ha ganado
            System.out.println("Ha ganado el jugador 1");
        }
        if (cont2 == 2) {
            System.out.println("Ha ganado el jugador 2");
        }
    }
}
