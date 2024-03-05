package com.es.programacion.Recuperacion.tema4.proyectoPokemon.classes;

public class Ataque {
    public String nombre;
    public Tipo tipo;
    public int danio;
    public double recVida;

    public Ataque (String nombre, Tipo tipo, int danio, int recVida){

        //Establece el nombre del ataque
        // ->No hay restricciones

        //Establece el tipo del ataque
        //  -> No hay que comprobar de nuevo

        //Establece el danio base del ataque
        //-> No exiten  los danios negativos
        //SI el valor es positivo... ok
        //Si no... se setea a 0
        this.danio = danio;
        this.nombre = nombre;
        this.tipo = tipo;
        this.recVida = recVida;

    }
}
