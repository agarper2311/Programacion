package com.es.programacion.tema4.proyectoPokedex;

public class Pokemon {

    public String nombre, tipo;
    public double vida, fuerza;

    Pokedex pokedex;

    // CONSTRUCTOR
    public Pokemon(String nombreNuevo, String tipoNuevo, double vidaNueva, double fuerzaNueva) {
        this.nombre = nombreNuevo;
        this.tipo = tipoNuevo;
        this.vida = vidaNueva;
        this.fuerza = fuerzaNueva;

        pokedex = new Pokedex();
    }

    public void recibirAtaque(Pokemon pokemonAtacante) {
        this.vida = this.vida - pokemonAtacante.fuerza * pokedex.checkEfectividad(pokemonAtacante.tipo, this.tipo);
    }


}
