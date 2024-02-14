package com.es.programacion.tema0.buscaton;

import java.util.Random;

public class ActividadOrdenacion {
	static long iteraciones = 0;
	static long total = 0;
	static int numArrOrdenados = 0;
	static int encontrados = 0;

	static final String nombre = "Diego";

	Random rand = new Random();

	public static void main(String[] args) {

		System.out.println("Empieza");

		ActividadOrdenacion act = new ActividadOrdenacion();

		// Creaci�n e inicializacion de arrays desordenados
		int[] arr1 = act.inicializarArrayOrdenado(10000);
		int[] arr2 = act.inicializarArrayOrdenado(10000);
		int[] arr3 = act.inicializarArrayOrdenado(10000);
		int[] arr4 = act.inicializarArrayOrdenado(10000);
		int[] arr5 = act.inicializarArrayOrdenado(10000);
		int[] arr6 = act.inicializarArrayOrdenado(10000);
		int[] arr7 = act.inicializarArrayOrdenado(10000);
		int[] arr8 = act.inicializarArrayOrdenado(10000);
		int[] arr9 = act.inicializarArrayOrdenado(10000);
		int[] arr10 = act.inicializarArrayOrdenado(10000);
		int[] arr11 = act.inicializarArrayOrdenado(10000);
		int[] arr12 = act.inicializarArrayOrdenado(10000);
		act.desordenarArray(arr1);
		act.desordenarArray(arr2);
		act.desordenarArray(arr3);
		act.desordenarArray(arr4);
		act.desordenarArray(arr5);
		act.desordenarArray(arr6);
		act.desordenarArray(arr7);
		act.desordenarArray(arr8);
		act.desordenarArray(arr9);
		act.desordenarArray(arr10);
		act.desordenarArray(arr11);
		act.desordenarArray(arr12);

		// Creacion e inicializacion de numeros aleatorios
		int num1 = act.numRandom(1000);
		int num2 = act.numRandom(1000);
		int num3 = act.numRandom(1000);
		int num4 = act.numRandom(1000);
		int num5 = act.numRandom(1000);
		int num6 = act.numRandom(1000);
		int num7 = act.numRandom(1000);
		int num8 = act.numRandom(1000);

		// Mensajes de inicio del programa
		act.mostrarCuentaAtras();

		// ****************************************//
		// *Comienzo de la ordenacion de elementos*//
		// ****************************************//
		long start1 = System.nanoTime();

		arr1 = act.algoritmoOrdenacion1(arr1);
		arr2 = act.algoritmoOrdenacion1(arr2);
		arr3 = act.algoritmoOrdenacion1(arr3);
		arr4 = act.algoritmoOrdenacion1(arr4);
		arr5 = act.algoritmoOrdenacion1(arr5);
		arr6 = act.algoritmoOrdenacion1(arr6);
		arr7 = act.algoritmoOrdenacion2(arr7);
		arr8 = act.algoritmoOrdenacion2(arr8);
		arr9 = act.algoritmoOrdenacion2(arr9);
		arr10 = act.algoritmoOrdenacion2(arr10);
		arr11 = act.algoritmoOrdenacion2(arr11);
		arr12 = act.algoritmoOrdenacion2(arr12);

		// Comprobacion de si los arrays estan ordenados o no
		act.esArrayOrdenado(arr1);
		act.esArrayOrdenado(arr2);
		act.esArrayOrdenado(arr3);
		act.esArrayOrdenado(arr4);
		act.esArrayOrdenado(arr5);
		act.esArrayOrdenado(arr6);
		act.esArrayOrdenado(arr7);
		act.esArrayOrdenado(arr8);
		act.esArrayOrdenado(arr9);
		act.esArrayOrdenado(arr10);
		act.esArrayOrdenado(arr11);
		act.esArrayOrdenado(arr12);

		// *************************************//
		// Comienzo de la busqueda de elementos*//
		// *************************************//
		act.busquedaBinaria(num1, arr1);
		act.busquedaBinaria(num1, arr2);
		act.busquedaBinaria(num1, arr3);
		act.busquedaBinaria(num1, arr4);
		act.busquedaBinaria(num1, arr5);
		act.busquedaBinaria(num2, arr1);
		act.busquedaBinaria(num2, arr2);
		act.busquedaBinaria(num2, arr3);
		act.busquedaBinaria(num2, arr4);
		act.busquedaBinaria(num2, arr5);
		act.busquedaBinaria(num3, arr1);
		act.busquedaBinaria(num3, arr2);
		act.busquedaBinaria(num3, arr3);
		act.busquedaBinaria(num3, arr4);
		act.busquedaBinaria(num3, arr5);
		act.busquedaBinaria(num4, arr1);
		act.busquedaBinaria(num4, arr2);
		act.busquedaBinaria(num4, arr3);
		act.busquedaBinaria(num4, arr4);
		act.busquedaBinaria(num4, arr5);
		act.busquedaBinaria(num5, arr1);
		act.busquedaBinaria(num5, arr2);
		act.busquedaBinaria(num5, arr3);
		act.busquedaBinaria(num5, arr4);
		act.busquedaBinaria(num5, arr5);
		act.busquedaBinaria(num6, arr1);
		act.busquedaBinaria(num6, arr2);
		act.busquedaBinaria(num6, arr3);
		act.busquedaBinaria(num6, arr4);
		act.busquedaBinaria(num6, arr5);
		act.busquedaBinaria(num7, arr1);
		act.busquedaBinaria(num7, arr2);
		act.busquedaBinaria(num7, arr3);
		act.busquedaBinaria(num7, arr4);
		act.busquedaBinaria(num7, arr5);
		act.busquedaBinaria(num8, arr1);
		act.busquedaBinaria(num8, arr2);
		act.busquedaBinaria(num8, arr3);
		act.busquedaBinaria(num8, arr4);
		act.busquedaBinaria(num8, arr5);

		// Tiempos finales
		long end1 = System.nanoTime();
		total = end1 - start1;

		act.mostrarBuscando();
		act.mostrarResultados();
		
		//Parte para persistir los datos en un archivo excel
		EscribirExcel e = new EscribirExcel();
		String[] datos = {nombre, total+"", iteraciones+"", encontrados+"", numArrOrdenados+""};
		e.persistirDatosExcel(datos);
	}

	/**
	 * Metodo para mostrar una cuenta atras
	 */
	private void mostrarCuentaAtras() {
		try {
			System.out.print("Comienza la prueba en 3..");
			Thread.sleep(1000);
			System.out.print("2..");
			Thread.sleep(1000);
			System.out.print("1..");
			Thread.sleep(1000);
			System.out.println("�GO!\n");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void mostrarBuscando() {
		try {
			System.out.print("Buscando.");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println(".\n");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void mostrarResultados() {
		System.out.println("Acaba en " + total + " milisegundos.");
		System.out.println("Requiere de " + iteraciones + " iteraciones totales para ordenar");
		System.out.println("Ordena un total de " + numArrOrdenados + "/12");
		System.out.println("Encuentra un total de " + encontrados + " elementos");
	}

	/**
	 * Generador de array de enteros ordenado
	 * 
	 * @param pos nº de posiciones que tendrá el array de enteros
	 * @return
	 */
	private int[] inicializarArrayOrdenado(int pos) {
		int[] a = new int[pos];

		for (int i = 0; i < pos; i++) {
			a[i] = i;
		}

		return a;
	}

	/**
	 * Generador de array de enteros DESordenado
	 * 
	 * @param arr n� de posiciones que tendrá el array de enteros
	 * @return
	 */
	private int[] desordenarArray(int[] arr) {
		Random rand = new Random();
		int n = arr.length;
		int[] arrAux = new int[n];
		arrAux = arr.clone();

		while (n > 1) {
			int k = rand.nextInt(n--); // decrements after using the value
			int temp = arrAux[n];
			arrAux[n] = arrAux[k];
			arrAux[k] = temp;
		}
		return arrAux;
	}

	/**
	 * Generador num random
	 * 
	 * @param pos
	 * @return
	 */
	private int numRandom(int pos) {
		return (1 + rand.nextInt(pos));
	}

	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// /
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// /
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// /
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// /
	/**
	 * Metodo que ordena un array de enteros dado. Se deben implementar al menos 2
	 * de los algoritmos de ordenacion de entre los siguientes:
	 *
	 * BubbleSort InsertionSort SelectionSort
	 *
	 * MergeSort QuickSort
	 *
	 * 6 puntos
	 *
	 * @param arr
	 * @return
	 */
	private int[] algoritmoOrdenacion1(int[] arr) {
		// Tu codigo aqui debajo

		// No modificar este punto
		return arr;
	}

	private int[] algoritmoOrdenacion2(int[] arr) {
		// Tu codigo aqui debajo

		// No modificar este punto
		return arr;
	}

	/**
	 * Algoritmo de busqueda binaria
	 * 1 punto
	 * @param num entero a buscar dentro del array
	 * @param arr array de enteros
	 */
	private void busquedaBinaria(int num, int[] arr) {

	}

	/**
	 * Metodo que imprime por pantalla si un array dado esta correctamente ordenado
	 * de menor a mayor
	 *
	 * Esta incluido en la nota de los dos algoritmos de ordenacion
	 *
	 * @param arr : array de enteros
	 */
	private void esArrayOrdenado(int[] arr) {

		// Imprimir por pantalla: "El array no est� ordenado" si no est� ordenado.
		// o
		// "El array est� correctamente ordenado" en caso de que s� lo est�.

	}
}
