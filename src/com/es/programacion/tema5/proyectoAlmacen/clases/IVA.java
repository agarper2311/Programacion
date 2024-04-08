package com.Programacion.Tema5.proyectoAlmacen.clases;

public class IVA {

    private static final double IVAnormal = 1.21;
    private static final double IVAreducido = 1.10;
    private static final double IVAsuperreducido = 1.04;

    /**
     * Método que devuelve el tipo de IVA según el tipo de artículo que
     * se le pase por parámetros.
     * APLICACIÓN A PEQUEÑA ESCALA DEL PATRÓN DE DISEÑO FACTORY
     */

    public static double getIVA(String tipoProducto){
        if (tipoProducto.equals("G")){
            return IVA.IVAnormal;
        } else if (tipoProducto.equals("R")) {
            return IVA.IVAreducido;
        }else if (tipoProducto.equals("SR")){
            return IVA.IVAsuperreducido;
        }else{
            return 1;
        }
    }
}
