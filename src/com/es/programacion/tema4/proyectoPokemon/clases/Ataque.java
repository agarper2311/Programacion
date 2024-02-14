package com.es.programacion.tema4.proyectoPokemon.clases;

//          JUAN MANUEL SABORIDO BAENA      1ºDAW

public class Ataque {
    public String nombre_;
    public Tipo tipo_;
    public int danio_;

    public Ataque(String nombre, Tipo tipo, int danio) {

        nombre_ = nombre;
        tipo_ = tipo;
        danio_ = danio;

        if (danio_ < 0) {
            danio_ = 0;
        }

    }

    public String getAtaque() {  //  Obtiene valores de las variables de la clase controlada (Pokemon)
        return nombre_ + " " + danio_;
    }


}
