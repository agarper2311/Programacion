package com.Programacion.Tema4.proyectoArticulo.clase;

public class Articulo {
    // Atributos de clase
    public int id;
    public String nombre;
    public int stock;
    public String descripcion;
    public double precioBase;
    public double precioIVA;
    public String tipo;

    // Método para vender un artículo
    public void venderArticulo() {
        if (stock > 0) {
            this.stock = this.stock - 1;
            System.out.println("Artículo vendido. Stock restante: " + stock);
        } else {
            System.out.println("No hay stock disponible para vender.");
        }
    }

    // Método para calcular el precio
    public void calcularPrecio() {
        if (tipo.equals("1")) {
            // calcular el precio con IVA para el tipo 1
            this.precioIVA = this.precioBase * 1.04; // un 10% de IVA
        } else if (tipo.equals("2")) {
            // calcular el precio con IVA para el tipo 2
            this.precioIVA = this.precioBase * 1.10; // un 15% de IVA
        } else if (tipo.equals("3")) {
            // calcular el precio con IVA para el tipo 3
            this.precioIVA = this.precioBase * 1.21; // un 20% de IVA
        } else {
            // Control de excepción en el caso en que el tipo no sea 1, 2 ni 3
            System.out.println("Tipo no reconocido. No se puede calcular el precio con IVA.");
        }
    }

    // Método para imprimir la información del artículo
    public void imprimirArticulo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Stock: " + stock);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio base: " + precioBase);
        System.out.println("Precio con IVA: " + precioIVA);
        System.out.println("Tipo: " + tipo);
    }

    // Método para añadir stock al artículo
    public void anadirStock(int cantidad) {
        this.stock += cantidad;
        System.out.println("Stock añadido. Nuevo stock: " + stock);
    }

    // Método para obtener el stock actual
    public int obtenerStock() {
        return stock;
    }
}
