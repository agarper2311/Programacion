package com.Programacion.Tema1.Actividad00;

import java.util.Scanner;

/*
Implemente un programa que pida el día, mes y año de una fecha y
muestre un mensaje diciendo la fecha que es.
Ejemplos:
a. (Introduce) 1, 2 y 2023 -> (Muestra) Es el 1 de febrero de
2023
b. (Introduce) 3, 12, 1990 -> (Muestra) Es el 3 de diciembre
de 1990
c. (Introduce) 30, 2, 2023 -> (Muestra) Error en los datos
d. (Introduce) 1, 1, 2000 -> (Muestra) Es el 1 de enero de
2000
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        //Declaramos las variables dia, mes y anio
        int dia, mes, anio;

        // Creamos el objeto scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);

        // Pedimos al usuario que introduzca el dia, mes y año de nacimiento
        System.out.print("Introduzca el dia de nacimiento: ");

        //Almacenamos la variable dia
        dia = scann.nextInt();

        // Pedimos que introduzca el mes
        System.out.print("Introduzca el mes (1-12): ");

        //Almacenamos la variable mes
        mes = scann.nextInt();

        // Pedimos que introduzca el año
        System.out.print("Introduzca su año de nacimiento: ");

        // Almacenamos la variable año
        anio = scann.nextInt();

        // Verificar la validez del día y mes ingresados
        if (mes >= 1 && mes <= 12) {
            String nombreMes = "";
            if ((mes == 1 ) && (dia >= 1 && dia <= 31)) {
                nombreMes = "enero";
            } else if ((mes == 2 ) && (dia >= 1 && dia <= 28)) {
                nombreMes = "febrero";
            } else if ((mes == 3 ) && (dia >= 1 && dia <= 31)) {
                    nombreMes = "marzo";
                } else if ((mes == 4 ) && (dia >= 1 && dia <= 30)){
                    nombreMes = "abril";
                }else if ((mes == 5 ) && (dia >= 1 && dia <= 30)){
                nombreMes = "mayo";
            }else if ((mes == 6 ) && (dia >= 1 && dia <= 31)){
                nombreMes = "junio";
            }else if ((mes == 7 ) && (dia >= 1 && dia <= 30)){
                nombreMes = "julio";
            }else if ((mes == 8 ) && (dia >= 1 && dia <= 31)){
                nombreMes = "agosto";
            }else if ((mes == 9 ) && (dia >= 1 && dia <= 31)){
                nombreMes = "septiembre";
            }else if ((mes == 10 ) && (dia >= 1 && dia <= 30)){
                nombreMes = "octubre";
            }else if ((mes == 11 ) && (dia >= 1 && dia <= 31)){
                nombreMes = "Noviembre";
            }else if ((mes == 12 ) && (dia >= 1 && dia <= 31)){
                nombreMes = "Diciembre";

            } else {
                System.out.println("Error en los datos. Ingrese una fecha válida.");
                return;
            }
            System.out.println("Es el " + dia + " de " + nombreMes + " de " + anio);
        }

        scann.close();
    }
}
