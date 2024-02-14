package com.es.programacion.tema4.proyectoPersona.clases;

import com.es.programacion.tema4.proyectoPersona.utils.LocalidadValidator;

public class Direccion {

    // Atributos de clase
    public String calle;
    public int numero;
    public String cp;
    public String localidad;
    public String provincia;
    public int puerta;
    public int piso;
    public String tipoVivienda;


    // Constructor de clase
    public Direccion(String calle, int numero, String cp, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;

        LocalidadValidator l = new LocalidadValidator();
        boolean cpYProvinciaCorrectos = l.checkProvincia(provincia, cp);

        if(cpYProvinciaCorrectos) {
            this.cp = cp;
            this.localidad = localidad;
            this.provincia = provincia;
        } else {
            this.cp = "";
            this.localidad = "";
            this.provincia = "";
            throw new IllegalArgumentException("Datos de localidad incorrectos");
        }
    }

}
