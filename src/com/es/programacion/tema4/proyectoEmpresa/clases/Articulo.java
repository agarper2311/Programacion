package com.es.programacion.tema4.proyectoEmpresa.clases;

public class Articulo {

    // ATRIBUTOS DE CLASE
    public String id;
    public String nombre;
    public String descripcion;
    public int stock;

    public double precioBase;
    public double precioIVA;

    public String tipo;

    /**
     * Crear constructor personalizado al que se le pase
     * el id, nombre, tipo y precioBase
     *
     * y además, que en base a esos parametros, que calcule el precioConIVA
     */
    public Articulo(String id, String nombre, String tipo, double precioBase){
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioBase = precioBase;

        calcularPrecioConIva();
    }


    /**
     * Vende un producto. Reduce el stock del producto en 1.
     */
    public void vender() {
        if(hayStock()){
            this.stock = this.stock - 1;
            System.out.println("Se ha vendido un "+this.nombre);
        } else {
            System.out.println("No hay stock disponible.");
        }

    }

    /**
     * Método para reponer una cantidad del producto
     * @param cantidad (int) cantidad del producto a reponer
     */
    public void reponerStock(int cantidad) {
        this.stock = this.stock + cantidad;
        System.out.println("Se han repuesto "+cantidad+" items a "+this.nombre);
    }

    /**
     * Método que calcula el precio con iva según el tipo del producto.
     */
    public void calcularPrecioConIva() {

        if(this.tipo.equalsIgnoreCase("SR")){
            this.precioIVA = this.precioBase * 1.04; // Aplicamos el 4% de IVA
        } else if (this.tipo.equalsIgnoreCase("R")) {
            this.precioIVA = this.precioBase * 1.10; // Aplicamos el 10% de IVA
        } else {
            this.precioIVA = this.precioBase * 1.21; // Aplicamos el 21% de IVA
        }

    }

    /**
     * Método que comprueba si hay stock de ese producto
     * @return
     */
    public boolean hayStock() {
        if(this.stock > 0) {
            System.out.println("Hay "+this.stock+" productos");
            return true;
        } else {
            System.out.println("No hay productos de "+this.nombre);
            return false;
        }
    }

    /**
     * Método para imprimir los datos de un producto
     */
    public void imprimirDatosProducto() {

        System.out.print(
                "\nID: "+this.id+
                        "\n\t-Nombre: "+this.nombre+
                        "\n\t-Tipo: "+this.tipo+
                        "\n\t-Descripcion: "+this.descripcion+
                        "\n\t-Cantidad: "+this.stock+
                        "\n\t-Precio Base: "+this.precioBase+
                        "\n\t-Precio con IVA: "+this.precioIVA);
    }




}
