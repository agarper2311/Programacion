package com.es.programacion.Recuperacion.tema4.proyectoPokemon.classes;


import static com.es.programacion.Recuperacion.tema4.proyectoPokemon.utils.Pokedex.checkEfectividad;

public class Pokemon {

    public String nombre;
    public String lore;
    public Tipo tipo;

    public double vida;
    public Ataque[] ataques;


    public Pokemon(String nombre, double vida, Tipo tipo, String lore){
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo;
        this.lore = lore;
    }

    public void recibirAtk (Ataque a){
        if (a.danio > 0) {
            this.vida = this.vida - a.danio * checkEfectividad(a.tipo, this.tipo, Pokemon.this);
        }else {
            System.out.println();
        }
    }

}
