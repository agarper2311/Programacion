package com.es.programacion.tema6.proyectoAstros.clases;

public class Satelite extends Astro {
    private double distanciaPlaneta;
    private double orbitaPlanetaria;

    public Satelite(double radioEcuatorial, double rotacion, long masa, double temperaturaMedia, String nombre, double distanciaPlaneta, double orbitaPlanetaria) {
        super(radioEcuatorial, rotacion, masa, temperaturaMedia, nombre);

        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre del satelite: "+this.nombre);
        System.out.println("Con un radio de: "+ this.radioEcuatorial);
        System.out.println("Una temperatura de: "+this.temperaturaMedia);
        System.out.println("Y tarda en darle la vuelta al planeta: "+this.orbitaPlanetaria);
    }
}
