package com.es.programacion.tema6.proyectoAstros.clases;

public class Astro {

    protected double radioEcuatorial;
    protected double rotacion;
    protected long masa;
    protected double temperaturaMedia;
    protected String nombre;

    public Astro(double radioEcuatorial, double rotacion, long masa, double temperaturaMedia, String nombre) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacion = rotacion;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.nombre = nombre;
    }

    public void muestra() {

        System.out.println("Nombre del astro: "+this.nombre);
        System.out.println("Con un radio de: "+ this.radioEcuatorial);
        System.out.println("Y una temperatura de: "+this.temperaturaMedia);

    }

    public boolean esMayor(Astro a) {
        return this.radioEcuatorial > a.radioEcuatorial;
    }


}
