package com.es.programacion.tema5.proyectoAlmacen.clases;

public class IVA {

    private static final double IVANORMAL = 1.21;
    private static final double IVAREDUCIDO = 1.10;
    private static final double IVASUPERREDUCIDO = 1.04;

    /**
     * Método que devuelve un tipo de IVA según el tipo de artículo que se
     * le pase por parámetros
     *
     * APLICACIÓN A PEQUEÑA ESCALA DEL PATRÓN DE DISEÑO FACTORY
     */
    public static double getIVA(String tipoProducto) {
        if(tipoProducto.equals("G")) {
            return IVA.IVANORMAL;
        } else if(tipoProducto.equals("R")) {
            return IVA.IVAREDUCIDO;
        } else if(tipoProducto.equals("SR")) {
            return IVA.IVASUPERREDUCIDO;
        } else {
            return 1;
        }
    }

}
