package com.es.programacion.tema6.proyectoAstros.clases;

public class Planeta extends Astro {

    private double distanciaSol;
    private double orbitaSol;

    private boolean tieneSatelite;

    public Planeta(double radioEcuatorial, double rotacion, long masa, double temperaturaMedia, String nombre, double distanciaSol, double orbitaSol, boolean tieneSatelite) {
        super(radioEcuatorial, rotacion, masa, temperaturaMedia, nombre);

        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelite = tieneSatelite;
    }


    @Override // @override indica que este método muestra() está sobreescribiendo al método muestra() de la clase padre
    public void muestra() {

        System.out.println("Nombre del planeta: "+this.nombre);
        System.out.println("Con un radio de: "+ this.radioEcuatorial);
        System.out.println("Una temperatura de: "+this.temperaturaMedia);
        System.out.println("Y tarda en darle la vuelta al sol: "+this.orbitaSol);
    }

}
