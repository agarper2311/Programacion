package com.es.programacion.tema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ActividadTeoriaArraysBidi {

    public static void main(String[] args) throws IOException {


        /**
         * Act 1.
         */
        double[] arr = new double[100];

        for(int i=0; i<=arr.length-1; i++){

            arr[i] = Math.random();

        }

        Scanner scan = new Scanner(System.in);
        double numUser = 0.0;

        System.out.print("Introduzca un número real: ");
        numUser = scan.nextDouble();
        int nMayores = 0;

        for (int i=0; i<= arr.length-1; i++){
            if (arr[i]>= numUser){
                nMayores++;
            }
        }

        System.out.println("En el array hay "+nMayores+" elementos mayores o iguales que "+ numUser);


        /**
         * Act.2
         */
        String cadena = "";
        System.out.print("Introduzca la cadena a analizar: ");
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        cadena = br.readLine();
        cadena = scan.next();
        cadena += scan.nextLine();

        System.out.println(cadena);

    }
}
