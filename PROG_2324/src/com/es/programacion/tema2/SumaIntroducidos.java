package com.es.programacion.tema2;

import java.util.Scanner;

public class SumaIntroducidos {

    public static void main(String[] args) {

        // Suma de todos los números introducidos hasta negativo (negativo no incluido)
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        int numIntroducido = 0;

        while (numIntroducido >= 0) { // Es decir, mientras el número que introduce el user sea positivo, doy vueltas

            System.out.print("Oye saecio, introduce un número para sumar: ");
            numIntroducido = scan.nextInt();

            if (numIntroducido >= 0) { // NO QUIERO SUMAR EL NÚMERO NEGATIVO. Entonces, pues pongo un if que controle eso.
                suma = suma + numIntroducido;
            }
        }

        System.out.println("La suma es: "+suma);

    }
}
