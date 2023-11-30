package com.Programacion.Tema3.Control_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticException2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        while (true) {
            try {
                System.out.print("Introduzca el primer número: ");
                 num1 = scanner.nextInt();
                System.out.print("Introduzca el divisor: ");
                 num2 = scanner.nextInt();

                if (num2 == 0) {
                    System.out.println("No se puede dividir por cero PAYAS@");
                } else {
                    System.out.println("La división es: " + (num1 / num2));
                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo de dato incorrecto.");
                scanner.next();
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir por cero PAYAS@");
            }finally {
                num1 = 0;
                num2 = 0;
            }
        }
    }
}
