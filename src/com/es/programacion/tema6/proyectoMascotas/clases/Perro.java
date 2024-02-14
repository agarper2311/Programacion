package com.es.programacion.tema6.proyectoMascotas.clases;

public class Perro extends Mascota {

    private String raza;
    private boolean pulgas;

    public Perro(String nombre, String raza, boolean pulgas) {
        super(nombre);

        this.raza = raza;
        this.pulgas = pulgas;
    }


    @Override
    public void muestra() {

        super.muestra();

        System.out.print("Soy un perro de raza "+this.raza+" y ");
        if(this.pulgas) {
            System.out.println("tengo pulgas.");
        } else {
            System.out.println("no tengo pulgas.");
        }
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }
}
