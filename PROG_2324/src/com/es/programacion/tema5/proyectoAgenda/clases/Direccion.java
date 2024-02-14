package com.es.programacion.tema5.proyectoAgenda.clases;

public class Direccion {

    private String calle;
    private int numero;
    private int planta;
    private String puerta;
    private Localidad localidad;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public void presentacion() {
        System.out.printf("C/ %s, %d", this.calle, this.numero);
        if(this.planta != 0) {
            System.out.printf(", %d (%s)", this.planta, this.puerta);
        }
        System.out.print("\n");
        localidad.presentacion();
    }
}
