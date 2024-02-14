package com.es.programacion.tema3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraMierder {

    public static void main(String[] args) {

        double num1 = 0.0;
        double num2 = 0.0;
        double resultado = 0.0;
        char op;

        Scanner scan = new Scanner(System.in);

        try{

            System.out.print("Introduzca el primer num: ");
            num1 = scan.nextDouble();

            System.out.print("Introduzca el segundo num: ");
            num2 = scan.nextDouble();

            System.out.print("Introduzca el operador: ");
            op = scan.next().charAt(0);

            switch (op){
                case '+': {

                    resultado = suma(num1, num2);
                    break;
                }
                case '-': {
                    resultado = resta(num1, num2);
                    break;
                }
                case '*': {
                    resultado = mult(num1, num2);
                    break;
                }
                case '/': {
                    resultado = dividir(num1, num2);
                    break;
                }
                case '%': {
                    resultado = resto(num1, num2);
                    break;
                }
                default: {
                    System.out.println("No se ha introducido un operador correcto");
                    break;
                }
            }

            System.out.println("El resultado es "+ resultado);


        } catch (InputMismatchException e){
            System.out.println("Error en los datos... ");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0...");
        }
    }



    public static double dividir(double num1, double num2) throws ArithmeticException {
        
        double resultadoAux = 0.0; // Declaro una variable de tipo double que se llama resultadoAux

        if (num2 == 0.0){
            throw new ArithmeticException();
        }
        resultadoAux = num1 / num2;
        return  resultadoAux;
    }

    public static double resto(double num1, double num2) throws ArithmeticException {

        double resultadoAux = 0.0; // Declaro una variable de tipo double que se llama resultadoAux

        if (num2 == 0.0){
            throw new ArithmeticException();
        }
        resultadoAux = num1 % num2;
        return  resultadoAux;
    }

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double mult(double num1, double num2) {
        return num1 * num2;
    }



}
