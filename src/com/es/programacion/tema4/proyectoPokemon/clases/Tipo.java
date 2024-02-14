package com.es.programacion.tema4.proyectoPokemon.clases;

import com.es.programacion.tema4.proyectoPokemon.utils.Pokedex;

//          JUAN MANUEL SABORIDO BAENA      1ºDAW

public class Tipo {
    public String nombre_;

    public Tipo(String nombre) {
        if (Pokedex.checkTipoExiste(nombre)) {  //  Esto permite en el parametro que se diga el nombre del Tipo y saber si existe
            nombre_ = nombre;
        }
    }
}
