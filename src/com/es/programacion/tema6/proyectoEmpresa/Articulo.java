package com.es.programacion.tema6.proyectoEmpresa;

public class Articulo {

    private String id;
    private String nombre;
    private Proveedor proveedor;
    private double precioSinIVA;
    private double precioConIVA;
    private  int stock;

    // Constructores

    public Articulo(String id, String nombre, Proveedor p, double precioSinIVA, int stock) {
        this.id = id;
        setNombre(nombre);
        setProveedor(p);
        setPrecioSinIVA(precioSinIVA);
        setPrecioConIVA();
        setStock(stock);
    }

    @Override
    public String toString() {
        String cadenaAMostrar = "";
        cadenaAMostrar += "Articulo con id: "+this.id+"\n";
        cadenaAMostrar += "Nombre: "+this.nombre+" precio: "+this.precioConIVA+"€\n";
        cadenaAMostrar += "Stock: "+this.stock;
        return cadenaAMostrar;
    }

    @Override
    public boolean equals(Object art){


        if (art instanceof Articulo){
            Articulo articulo = (Articulo) art;

            if (this.id.equalsIgnoreCase(articulo.id)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }

    }


    // Getters y Setters

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public double getPrecioSinIVA() {
        return precioSinIVA;
    }

    public void setPrecioSinIVA(double precioSinIVA) {
        if (precioSinIVA >= 0){
            this.precioSinIVA = precioSinIVA;
        }
    }

    public double getPrecioConIVA() {
        return precioConIVA;
    }

    public void setPrecioConIVA() {
        this.precioConIVA = this.precioSinIVA * 1.21;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
