package com.es.programacion.tema6.proyectoComposicion.clases;

public class Wagen {

    private String modelo;
    private String marca;
    private Volk propietario;

    public Wagen(String modelo, String marca, Volk propietario) {
        this.modelo = modelo;
        this.marca = marca;
        this.propietario = propietario;
    }

    public Volk getPropietario() {
        return propietario;
    }

    public void setPropietario(Volk propietario) {
        this.propietario = propietario;
    }
}
