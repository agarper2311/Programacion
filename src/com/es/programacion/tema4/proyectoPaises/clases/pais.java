package com.Programacion.Tema4.proyectoPaises.clases;

public class pais {
    public String capital;
    public int nHabitantes;
    public  String tipoClima;


    public static int nPaisesUE;

    public pais (String capital, String clima){
        this.capital = capital;
        this.tipoClima = clima;
    }

    public void darAltaPais(){
        this.nPaisesUE ++;
        this.nHabitantes ++;
    }
}