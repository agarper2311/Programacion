package com.es.programacion.Recuperacion.tema3.multiplicarMatices;

public class MultiplicacionMatrices {
    public static void main(String[] args) {
        // Definir las matrices a multiplicar
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{-1, 8}, {9, 5}, {0, 3}};

        // Calcular el producto de las matrices
        int[][] producto = multiplicarMatrices(a, b);

        // Mostrar el resultado
        System.out.println("Producto de las matrices:");
        for (int i = 0; i < producto.length; i++) {
            for (int j = 0; j < producto[i].length; j++) {
                System.out.print(producto[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplicarMatrices(int[][] a, int[][] b) {
        int filasA = a.length;
        int columnasA = a[0].length;
        int columnasB = b[0].length;

        // Crear una matriz para almacenar el resultado del producto
        int[][] resultado = new int[filasA][columnasB];

        // Realizar la multiplicación de matrices
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return resultado;
    }
}

