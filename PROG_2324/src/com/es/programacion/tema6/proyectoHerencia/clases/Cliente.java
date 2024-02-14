package com.es.programacion.tema6.proyectoHerencia.clases;

public class Cliente extends PersonaH {

    private String idCliente;
    private boolean esMoroso;

    public Cliente(String nombre, String dni, String sexo, String idCliente, boolean esMoroso) {
        super(nombre, dni, sexo);

        this.idCliente = idCliente;
        this.esMoroso = esMoroso;
    }


    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void presentacion() {
        System.out.println("____________________");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Dni: "+this.dni);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("IdCliente: "+this.idCliente);
        System.out.println("Es moroso: "+this.esMoroso);
        System.out.println("____________________");
    }
}
