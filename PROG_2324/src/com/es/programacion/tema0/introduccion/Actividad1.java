package com.es.programacion.tema0.introduccion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		Actividad1 act = new Actividad1();
		Scanner scan = new Scanner(System.in);
		int ejer = 1;
		double lng = 2.14;
		int num1 = 0, num2 = 0, num3 = 0;
		while (ejer != 0) {

			try {
				System.out.print("Por favor, indique un ejercicio del 1 al 4 (0 para exit): ");
				ejer = scan.nextInt();

				switch (ejer) {
				case 1:
					System.out.println("Ejercicio 1. Del 0 al N");
					act.delCeroAlEne();
					break;
				case 2:
					System.out.println("Ejercicio 2. Del 0 al N Invertido");
					act.delCeroAlEneInv();
					break;
				case 3:
					System.out.println("Ejercicio 3. Sumatoria");
					act.sumatoria();
					break;
				case 4:
					System.out.println("Ejercicio 4. Hasta negativo");
					act.hastaNegativo();
					break;

				default:
					if (ejer != 0) {
						System.out.println("Error, indique numero del 1 al 4 (0 para salir)");
					}
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Fatal Error, deleting all files on your computer...");
				break;
			}
		}
		scan.close();

	}

	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////// RESUELVE AQU� TUS	////////////////////////////////////////////////////
	////////////////////////    EJERCICIOS      ////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * 1. Escriba un programa que muestre los n�meros de 0 a N, donde N es un valor
	 * le�do de teclado.
	 * 
	 * 1 pts
	 */
	private void delCeroAlEne() {
		// pedirle al usuario que introduzca datos por teclado

		// guardar en una variable lo que el usuario ha introducido por teclado
		// (recordad, scan.nextInt();

		// cread una variable auxiliar con la que iterar�is

		// Crear estructura while con condici�n (aux <= variable usuario N)
		// Dentro de estructura while, mostrar el n�mero que ten�is en vuestra variable
		// aux (recordad... syso)
		// Incrementar esa aux en 1

		// fin

	}

	/**
	 * 2. Escriba un programa similar al anterior pero que muestre los n�meros en
	 * orden inverso
	 * 
	 * 1 pt
	 */
	private void delCeroAlEneInv() {
		// TODO Auto-generated method stub

	}

	/**
	 * 3. Escriba un programa que devuelva la sumatoria de un valor le�do por
	 * teclado (la sumatoria de N es la suma de todos los t�rminos desde 1� N).
	 * 
	 * 2 pts
	 */
	private void sumatoria() {
		// TODO Auto-generated method stub

	}

	/**
	 * 5. Implemente un programa que pida n�meros hasta que se introduzca uno
	 * negativo. Mostrar entonces la media de los valores introducidos.
	 * 
	 * 2 pt
	 */
	private void hastaNegativo() {
		// TODO Auto-generated method stub

	}

	/*
	 * Encima de la declaraci�n de la clase con comentarios multil�nea
	 * 
	 * Vuestro nombre y apellidos Programaci�n. 1er Curso. Tema3. Actividad 1.
	 * 
	 * 0.25 pts
	 * 
	 */
}
