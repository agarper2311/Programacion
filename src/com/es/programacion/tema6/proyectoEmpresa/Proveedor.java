package com.es.programacion.tema6.proyectoEmpresa;

public class Proveedor {

    private String cif;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;

    // Constructor
    public Proveedor(String cif, String nombre, String apellidos, String direccion, String telefono) {
        setCif(cif);
        setNombre(nombre);
        setApellidos(apellidos);
        setDireccion(direccion);
        setTelefono(telefono);
    }

    // Overrides
    @Override
    public String toString() {
        return "CIF: "+this.cif+"\nRazon Social: "+this.nombre+this.apellidos+"\nDireccion: "+this.direccion+" tlfn: "+this.telefono;
    }

    @Override
    public boolean equals(Object prov) {

        if(prov instanceof Proveedor) {
            Proveedor proveedor = (Proveedor) prov;
            return this.cif.equalsIgnoreCase(proveedor.cif);
        } else {
            return false;
        }

    }

    // Getters and setters
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}