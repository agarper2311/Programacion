package com.es.programacion.Recuperacion.tema3.letrasEnLaCadena;

import java.util.Scanner;

public class LetrasEnLaCadena {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String texto = scan.nextLine();

        // Convertir la cadena a minúsculas para simplificar la comparación
        texto = texto.toLowerCase();

        // Inicializar contadores para cada vocal
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        try {
            // Recorrer la cadena de texto y contar las vocales
            for (int i = 0; i < texto.length(); i++) {
                char letra = texto.charAt(i);
                switch (letra) {
                    case 'a':
                        contadorA++;
                        break;
                    case 'e':
                        contadorE++;
                        break;
                    case 'i':
                        contadorI++;
                        break;
                    case 'o':
                        contadorO++;
                        break;
                    case 'u':
                        contadorU++;
                        break;
                }
            }

            // Mostrar el resultado
            System.out.println("a -> " + contadorA + " veces");
            System.out.println("e -> " + contadorE + " veces");
            System.out.println("i -> " + contadorI + " veces");
            System.out.println("o -> " + contadorO + " veces");
            System.out.println("u -> " + contadorU + " veces");
        } catch (IndexOutOfBoundsException e) {
            // Este bloque de captura es más preventivo, ya que usar charAt dentro de un bucle for correctamente limitado no debería causar IndexOutOfBoundsException.
            System.out.println("Se ha producido una excepción: IndexOutOfBoundsException. Intentaste acceder a una posición de la cadena que no existe.");
        }
    }
}

