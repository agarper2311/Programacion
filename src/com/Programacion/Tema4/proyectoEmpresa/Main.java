package com.Programacion.Tema4.proyectoEmpresa;
import com.Programacion.Tema4.proyectoEmpresa.clases.Articulo;


import java.util.Scanner;
/*
public class Main {

    public static void main(String[] args) {
        // SIMULAR UNA EMPRESA, DONDE SE COMPRAN Y VENDEN PRODUCTOS
        Articulo pantalon = new Articulo();
        pantalon.nombre = "Pantalon Cargo";
        pantalon.descripcion = "Pantalones que son anchos por arriba y cerrados por abajo.\nCon muchos bolsillos";
        pantalon.id = "P24";
        pantalon.stock = 100;
        pantalon.precioBase = 5.0;

        Articulo sudadera = new Articulo();
        sudadera.nombre = "Sudadera";
        sudadera.descripcion = "Sudadera con capucha to flama";
        sudadera.id = "S30";
        sudadera.stock = 200;
        sudadera.precioBase = 10.0;

        Articulo tenis = new Articulo();
        tenis.nombre = "Tenis";
        tenis.descripcion = "Bambas deportivas, zapatos deportivas, deportes";
        tenis.id = "T01";
        tenis.stock = 300;
        tenis.precioBase = 40.0;

        pantalon.tipo = "G";
        sudadera.tipo = "G";
        tenis.tipo = "G";

        pantalon.calcularPrecioConIva();
        sudadera.calcularPrecioConIva();
        tenis.calcularPrecioConIva();

        pantalon.imprimirDatosProducto();
        sudadera.imprimirDatosProducto();
        tenis.imprimirDatosProducto();

        int opc = 0;
        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("Bienvenid@ a gestion de stock");
            System.out.println("1. Anadir stock");
            System.out.println("2. Venta");
            System.out.println("3. Consultar stock");

            System.out.println("0. Salir");
            opc = scan.nextInt();

            if(opc < 0 || opc > 3) {
                System.out.println("Opcion incorrecta");
            }else if(opc == 0) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("1. Pantalon");
                System.out.println("2. Sudadera");
                System.out.println("3. Tenis");
                if(opc == 1) {
                    // Anadir Stock
                    System.out.print("Anadir Stock. Indique el producto: ");
                    int producto = 0;
                    producto = scan.nextInt();

                    System.out.print("Indique la cantidad: ");
                    int cantidad = scan.nextInt();

                    if(producto == 1) {
                        pantalon.reponerStock(cantidad);
                    } else if(producto == 2) {
                        sudadera.reponerStock(cantidad);
                    } else if(producto == 3) {
                        tenis.reponerStock(cantidad);
                    } else {
                        System.out.println("Opcion incorrecta");
                    }
                } else if (opc == 2) {
                    // Venta de producto
                    System.out.print("Venta. Indique el producto:");
                    int producto = 0;
                    producto = scan.nextInt();

                    if(producto == 1) {
                        pantalon.vender();
                    } else if(producto == 2) {
                        sudadera.vender();
                    } else if(producto == 3) {
                        tenis.vender();
                    } else {
                        System.out.println("Opcion incorrecta");
                    }
                } else {
                    // Consultar stock
                    System.out.print("Consulta Stock. Indique el producto:");
                    int producto = 0;
                    producto = scan.nextInt();

                    if(producto == 1) {
                        pantalon.hayStock();
                    } else if(producto == 2) {
                        sudadera.hayStock();
                    } else if(producto == 3) {
                        tenis.hayStock();
                    } else {
                        System.out.println("Opcion incorrecta");
                    }
                }
            }
        } while(opc != 0);
    }
}*/
