package com.Programacion.ExamenTema1;

import java.util.Scanner;

/*
Escribe un programa que calcula el salario neto semanal de un
trabajador en función del número de horas trabajadas y la tasa
de impuestos de acuerdo a las siguientes hipótesis:
a. La hora trabajada en tarifa normal se paga a 20€.
b. Las primeras 35 horas se pagan a tarifa normal.
c. Las horas que pasen de 35 se pagan a 1,5 veces la tarifa
normal.
d. Las tasas de impuestos son:
• Los primeros 500 euros son libres de impuestos.
• Los siguientes 400 tienen un 25% de impuestos.
• Los restantes un 45% de impuestos
 */
public class EjercicioImpuestos {
    /*
            Nombre: Ángel
            Apellidos: García Pérez
            Nombre Actividad: EjercicioImpuestos
         */
    public static void main(String[] args) {//Inicio del método main

        // Creamos las variables que necesitaremos para el programa
        int horasTrabajadas, horasNormales;
        double tarifaNormal, impuestosLibres, impuestos25, impuestos45, salarioNeto, salarioBruto, impuestos;
        String nombre;

        // Creamos el objeto Scanner para leer la entrada del usuario
        Scanner scann = new Scanner(System.in);


        //Preguntamos por el nombre del trabajador
        System.out.print("Ingrese el nombre del trabajador: ");
        nombre = scann.nextLine();

        // Preguntamos por pantalla el número de horas trabajadas a la semana
        System.out.print("Introduzca el número de horas trabajada a la semana: ");

        // Almacenamos la variable horasTrabajadas
        horasTrabajadas = scann.nextInt();

        // Definimos el valor de las variables
        tarifaNormal = 20;
        horasNormales = 35;
        impuestosLibres = 500;
        impuestos25 = 0.25;
        impuestos45 = 0.45;
        salarioNeto = 0;
        impuestos = 0;

        // Condición para calcular el salario neto semanal
        if (salarioNeto <= horasNormales){
            salarioNeto = horasTrabajadas * tarifaNormal;
        }else {
            salarioNeto = horasNormales * tarifaNormal + (horasTrabajadas - horasNormales) * (1.5 * tarifaNormal);
        }
        if (salarioNeto > impuestosLibres) {
            if (salarioNeto <= impuestosLibres + 400) {
                salarioNeto = impuestosLibres + (salarioNeto - impuestosLibres) * (1 - impuestos25);
            } else {
                salarioNeto = impuestosLibres + 400 * (1 - impuestos25)
                        + (salarioNeto - impuestosLibres - 400) * (1 - impuestos45);
            }
        }
        // Hacemos los cálculos para salarioBruto y salarioNeto
        salarioBruto = salarioNeto + impuestos;
        salarioNeto = salarioNeto - impuestos;

        System.out.println("Nombre del trabajador: " + nombre);
        System.out.println("Salario bruto: " + salarioBruto + "€");
        System.out.println("Tasas: " + impuestos + "€");
        System.out.println("Salario neto: " + salarioNeto + "€");

        scann.close();//Cerramos el objeto scann
    }//Fin del método main
}