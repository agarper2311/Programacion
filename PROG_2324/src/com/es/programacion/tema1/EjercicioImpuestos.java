package com.es.programacion.tema1;

import java.util.Scanner;

public class EjercicioImpuestos {

    public static void main(String[] args) {
        int tarifaNormal = 20;
        double salarioBruto;
        double salarioNeto;

        Scanner scan = new Scanner(System.in);
        double horasTrabajadas;
        System.out.println("Introduzca las horas trabajadas: ");
        horasTrabajadas = scan.nextDouble();


        if(horasTrabajadas>0 && horasTrabajadas <= 35){
            salarioBruto = horasTrabajadas * tarifaNormal;
        } else if (horasTrabajadas > 35) {
            salarioBruto = 35 * tarifaNormal;
            horasTrabajadas -= 35;
            salarioBruto += horasTrabajadas * tarifaNormal * 1.5;
        } else {
            System.out.println("Error en los datos");
            return;
        }


        System.out.println("Tu salario bruto es de : "+ salarioBruto);

        if (salarioBruto > 900) {
            salarioNeto = 500 + 400 * 0.75 + ((salarioBruto - 900) * 0.55);
        } else if (salarioBruto > 500) {
            salarioNeto = 500 + ((salarioBruto - 500) * 0.75);
        } else {
            salarioNeto = salarioBruto;
        }


        System.out.println("Tu salario es de : "+ salarioNeto);

    }
}
