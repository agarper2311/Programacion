package com.Programacion.Tema3.Control_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        double num1 = 0.0;
        double num2 = 0.0;
        double resultado = 0.0;
        char op;

        Scanner scan = new Scanner(System.in);


        try {

            System.out.println("Introduzca el primer número: ");
            num1 = scan.nextDouble();

            System.out.println("Introduzca el segundo número: ");
            num2 = scan.nextDouble();

            System.out.println("Introduzca el operador: ");
            op = scan.next().charAt(0);

            switch (op){
                case '+' :{
                    resultado = num1+num2;
                    break;
                }
                case '-' :{
                    resultado = num1-num2;
                    break;
                }
                case '*' :{
                    resultado = num1*num2;
                    break;
                }
                case '/' :{
                    resultado = dividir(num1,num2);
                    break;
                }
                case '%' :{
                    resultado = num1%num2;
                    break;
                }
                default:{
                    System.out.println("No se ha introducido un operador correcto");
                }
            }
            System.out.println("El resultado es: "+resultado);
        }catch (InputMismatchException e){
            System.out.println("Error en los datos...");
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir entre 0...");
        }


    }

    public static double dividir(double num1, double num2){
        double resultadoAux = 0.0;
        resultadoAux = num1 / num2;

        return resultadoAux;
    }
}
