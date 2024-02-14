package com.es.programacion.tema0.introduccion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad2 {
	public static void main(String[] args) {
		Actividad2 act = new Actividad2();
		Scanner scan = new Scanner(System.in);
		int ejer = 1;
		while (ejer != 0) {

			try {
				System.out.print("Por favor, indique un ejercicio del 1 al 10 (0 para exit): ");
				ejer = scan.nextInt();

				switch (ejer) {
				case 1:
					System.out.println("Ejercicio 1. Del 0 al 20");
					act.delCeroAlVeinte();
					break;
				case 2:
					System.out.println("Ejercicio 2. Pares del 1 al 200");
					act.pares();
					break;
				case 3:
					System.out.println("Ejercicio 3. Impares del 1 al 200");
					act.impares();
					break;
				case 4:
					System.out.println("Ejercicio 4. Factorial");
					act.factorial();
					break;
				case 5:
					System.out.println("Ejercicio 5. �Cuantos negativos?");
					act.cuantosNeg();
					break;
				case 6:
					System.out.println("Ejercicio 6. �Cuantos positivos y cuantos negativos?");
					act.cuantosPosNeg();
					break;
				case 7:
					System.out.println("Ejercicio 7. �Cuantos positivos y cuantos negativos hasta que 0?");
					act.cuantosPosNegHQC();
					break;
				case 8:
					System.out.println("Ejercicio 8. Potencias");
					act.potencias();
					break;
				case 9:
					System.out.println("Ejercicio 9. Suma de pares e Impares");
					act.sumParImpar();
					break;
				case 10:
					System.out.println("Ejercicio 10. Los dineros");
					act.elsDiners();
					break;

				default:
					if (ejer != 0) {
						System.out.println("Error, indique numero del 1 al 10 (0 para salir)");
					}
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Fatal Error, deleting all files on your computer...");
				break;
			}
		}

	}

	/*
	 * RESUELVE TUS EJERCICIOS DENTRO DE CADA METODO.
	 */

	/**
	 * Ejercicio 1: Escribe un programa que muestre por pantalla los 20 primeros
	 * numeros enteros naturales. (1, 2, 3 ... 20)
	 *
	 * 0,5 pts
	 */
	private void delCeroAlVeinte() {

	}

	/**
	 * Ejercicio 2: Escribe un programa que muestre los numeros pares comprendidos
	 * entre el 1 y el 200.
	 *
	 * 1 pto
	 */
	private void pares() {

	}

	/**
	 * Ejercicio 3: Escribe un programa que muestre los numeros impares comprendidos
	 * entre el 1 y el 200.
	 *
	 * 1 pto
	 */
	private void impares() {

	}

	/**
	 * Ejercicio 4. Escribe un programa que lea por teclado un numero positivo y
	 * muestre por pantalla el valor factorial de ese numero. (N!) Ej. 0! = 1 1! = 1
	 * 2! = 2 * 1 3! = 3 * 2 * 1 4! = 4 * 3 * 2 * 1 5! = 5 * 4 * 3 * 2 * 1
	 *
	 * N! = N * (N-1) * (N-2) * (N-3) * ... * 1
	 *
	 * 1 pto
	 */
	private void factorial() {

	}

	/**
	 * Ejercicio 5. Escribe un programa que lea 10 valores por teclado. Al final el
	 * programa debe mostrarnos cuantos de esos valores han sido numeros negativos.
	 *
	 * 1 pto
	 */
	private void cuantosNeg() {

	}

	/**
	 * Ejercicio 6. Escribe un programa que lea 10 valores por teclado. Al final el
	 * programa debe mostrarnos cuantos de esos valores han sido numeros negativos y
	 * cuantos positivos.
	 *
	 * 1 pto
	 */
	private void cuantosPosNeg() {

	}

	/**
	 * Ejercicio 7. Escribe un programa que lea valores por teclado. hasta que se
	 * inserte un 0. Al final el programa debe mostrarnos cuantos de esos valores
	 * han sido numeros negativos y cuantos positivos.
	 *
	 * 1 pto
	 */
	private void cuantosPosNegHQC() {

	}

	/**
	 * Ejercicio 8: Escribe un programa que calcule el valor de 2 elevado a un
	 * n�mero que el usuario introducir� por teclado. Este numero que se introduce
	 * por teclado no puede ser mayor que 10. Al final el programa nos mostrara el
	 * resultado de esa potencia. NO SE PUEDE USAR EL OPERADOR DE POTENCIA (^)
	 *
	 * 1 pto
	 */
	private void potencias() {

	}

	/**
	 * Ejercicio 9: Escribe un programa que sume independientemente los pares y los
	 * impares de los n�meros comprendidos entre el 100 y el 200. Al final el
	 * programa nos tiene que mostrar el valor de ambas sumas.
	 *
	 * 1 pto
	 */
	private void sumParImpar() {

	}

	/**
	 * Ejercicio 10: Escribe un programa que dada una cantidad de euros que el
	 * usuario introduce por teclado (m�ltiplo de 5 �) mostrar� los billetes de cada
	 * tipo que ser�n necesarios para alcanzar dicha cantidad (utilizando billetes
	 * de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el m�nimo de billetes
	 * posible. Por ejemplo, si el usuario introduce 145 el programa indicar� que
	 * ser� necesario 1 billete de 100 �, 2 billetes de 20 � y 1 billete de 5 � (no
	 * ser� v�lido por ejemplo 29 billetes de 5, que aunque sume 145 � no es el
	 * m�nimo n�mero de billetes posible).
	 *
	 * 1 pto
	 */
	private void elsDiners() {

	}

	/*
	 * Escribe al principio del documento usando comentarios. Nombre y apellidos
	 * Programacion Actividad 3
	 *
	 * 0,5 pts
	 *
	 */
}
