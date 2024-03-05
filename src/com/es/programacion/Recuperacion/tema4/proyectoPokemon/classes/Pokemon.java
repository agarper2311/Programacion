package com.es.programacion.Recuperacion.tema4.proyectoPokemon.classes;


import java.util.List;

import static com.es.programacion.Recuperacion.tema4.proyectoPokemon.utils.Pokedex.checkEfectividad;

public class Pokemon {
    /*
    nombre: String
    lore: String
    tipo: Tipo
    vida: double
    ataques: Ataque[]
     */

    public String nombre;
    public String lore;
    public Tipo tipo;

    public double vida;
    public Ataque[] ataques;


    public Pokemon(String nombre, double vida, Tipo tipo){
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo;
    }

    public void recibirAtk (Ataque a){
//this.vida (la vida del pokemon rival) = this.vida (vida pokemon rival) - a.danio (daño del ataque que realiza el pokemon seleccionado) * checkEfectividad (si el tipo del atacante es fuerte o debil contra el tipo que recibe)
        if (a.danio > 0) {
            this.vida = this.vida - a.danio * checkEfectividad(a.tipo, this.tipo, Pokemon.this);
        }else {
            //Pokemon.this = curarVida() + this.vida;
        }
    }

    public double curarVida (){
        // return vida + recVida;
        return  0;
    }

}
