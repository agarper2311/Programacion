package com.es.programacion.tema4.proyectoPokemon.clases;

import com.es.programacion.tema4.proyectoPokemon.clases.Tipo;
import com.es.programacion.tema4.proyectoPokemon.clases.Ataque;

//          JUAN MANUEL SABORIDO BAENA      1ºDAW

public class Pokemon {
    public String nombre_;
    public Tipo tipo_;
    public double vida_;
    public Ataque[] ataques_;

    public Pokemon(String nombre, double vida, Tipo tipo) {
        nombre_ = nombre;
        if(vida >= 0) {
            vida_ = vida;
        }
        tipo_ = tipo;

    }

    public void getPokemon() {
        System.out.println(nombre_ + " " + "\t\tVida: " + vida_);
        for (int i = 0; i < 3; i++) {
            System.out.println(ataques_[i].getAtaque());
        }
    }

}
