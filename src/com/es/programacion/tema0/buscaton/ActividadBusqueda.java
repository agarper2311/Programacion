package com.es.programacion.tema0.buscaton;

import java.util.Random;

public class ActividadBusqueda {
	static long iteraciones = 0;
	static long total = 0;
	static int encontrados = 0;
	static final String nombre = "Diego";

	public static void main(String[] args) {


		ActividadBusqueda act = new ActividadBusqueda();
		int[] arrO1 = act.inicializarArrayOrdenado(10000);
		int[] arrO2 = act.inicializarArrayOrdenado(10000);
		int[] arrO3 = act.inicializarArrayOrdenado(10000);
		int[] arrO4 = act.inicializarArrayOrdenado(10000);
		int[] arrO5 = act.inicializarArrayOrdenado(10000);
		int[] arrD1 = act.desordenarArray(arrO1);
		int[] arrD2 = act.desordenarArray(arrO2);
		int[] arrD3 = act.desordenarArray(arrO3);
		int[] arrD4 = act.desordenarArray(arrO4);
		int[] arrD5 = act.desordenarArray(arrO5);


		act.mostrarCuentaAtras();

		int num1 = act.numRandom(10000);
		int num2 = act.numRandom(10000);
		int num3 = act.numRandom(10000);
		int num4 = act.numRandom(10000);
		int num5 = act.numRandom(10000);
		int num6 = act.numRandom(10000);
		int num7 = act.numRandom(10000);
		int num8 = act.numRandom(10000);
		int num1b = act.numRandom(10);
		int num2b = act.numRandom(10);
		int num3b = act.numRandom(10);
		int num4b = act.numRandom(10);
		int num5b = act.numRandom(10);
		int num6b = act.numRandom(10);
		int num7b = act.numRandom(10);
		int num8b = act.numRandom(10);

		long start1 = System.nanoTime();

		//Busqueda en arrays ordenados
		act.busquedaBinaria(num1, arrO1);
		act.busquedaBinaria(num1, arrO2);
		act.busquedaBinaria(num1, arrO3);
		act.busquedaBinaria(num1, arrO4);
		act.busquedaBinaria(num1, arrO5);
		act.busquedaBinaria(num2, arrO1);
		act.busquedaBinaria(num2, arrO2);
		act.busquedaBinaria(num2, arrO3);
		act.busquedaBinaria(num2, arrO4);
		act.busquedaBinaria(num2, arrO5);
		act.busquedaBinaria(num3, arrO1);
		act.busquedaBinaria(num3, arrO2);
		act.busquedaBinaria(num3, arrO3);
		act.busquedaBinaria(num3, arrO4);
		act.busquedaBinaria(num3, arrO5);
		act.busquedaBinaria(num4, arrO1);
		act.busquedaBinaria(num4, arrO2);
		act.busquedaBinaria(num4, arrO3);
		act.busquedaBinaria(num4, arrO4);
		act.busquedaBinaria(num4, arrO5);
		act.busquedaBinaria(num5, arrO1);
		act.busquedaBinaria(num5, arrO2);
		act.busquedaBinaria(num5, arrO3);
		act.busquedaBinaria(num5, arrO4);
		act.busquedaBinaria(num5, arrO5);
		act.busquedaBinaria(num6, arrO1);
		act.busquedaBinaria(num6, arrO2);
		act.busquedaBinaria(num6, arrO3);
		act.busquedaBinaria(num6, arrO4);
		act.busquedaBinaria(num6, arrO5);
		act.busquedaBinaria(num7, arrO1);
		act.busquedaBinaria(num7, arrO2);
		act.busquedaBinaria(num7, arrO3);
		act.busquedaBinaria(num7, arrO4);
		act.busquedaBinaria(num7, arrO5);
		act.busquedaBinaria(num8, arrO1);
		act.busquedaBinaria(num8, arrO2);
		act.busquedaBinaria(num8, arrO3);
		act.busquedaBinaria(num8, arrO4);
		act.busquedaBinaria(num8, arrO5);

		//Busqueda en arrays desordenados
		act.busquedaLineal(num1b, arrD1);
		act.busquedaLineal(num1b, arrD2);
		act.busquedaLineal(num1b, arrD3);
		act.busquedaLineal(num1b, arrD4);
		act.busquedaLineal(num1b, arrD5);
		act.busquedaLineal(num2b, arrD1);
		act.busquedaLineal(num2b, arrD2);
		act.busquedaLineal(num2b, arrD3);
		act.busquedaLineal(num2b, arrD4);
		act.busquedaLineal(num2b, arrD5);
		act.busquedaLineal(num3b, arrD1);
		act.busquedaLineal(num3b, arrD2);
		act.busquedaLineal(num3b, arrD3);
		act.busquedaLineal(num3b, arrD4);
		act.busquedaLineal(num3b, arrD5);
		act.busquedaLineal(num4b, arrD1);
		act.busquedaLineal(num4b, arrD2);
		act.busquedaLineal(num4b, arrD3);
		act.busquedaLineal(num4b, arrD4);
		act.busquedaLineal(num4b, arrD5);
		act.busquedaLineal(num5b, arrD1);
		act.busquedaLineal(num5b, arrD2);
		act.busquedaLineal(num5b, arrD3);
		act.busquedaLineal(num5b, arrD4);
		act.busquedaLineal(num5b, arrD5);
		act.busquedaLineal(num6b, arrD1);
		act.busquedaLineal(num6b, arrD2);
		act.busquedaLineal(num6b, arrD3);
		act.busquedaLineal(num6b, arrD4);
		act.busquedaLineal(num6b, arrD5);
		act.busquedaLineal(num7b, arrD1);
		act.busquedaLineal(num7b, arrD2);
		act.busquedaLineal(num7b, arrD3);
		act.busquedaLineal(num7b, arrD4);
		act.busquedaLineal(num7b, arrD5);
		act.busquedaLineal(num8b, arrD1);
		act.busquedaLineal(num8b, arrD2);
		act.busquedaLineal(num8b, arrD3);
		act.busquedaLineal(num8b, arrD4);
		act.busquedaLineal(num8b, arrD5);

		long end2 = System.nanoTime();
		total = end2 - start1;
		act.mostrarBuscando();
		act.mostrarResultados();
		
		//Parte para persistir los datos en un archivo excel
		EscribirExcel e = new EscribirExcel();
		String[] datos = {nombre, total+"", iteraciones+"", encontrados+""};
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
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void mostrarResultados() {
		System.out.println("Acaba en "+total+" milisegundos.");
		System.out.println("Requiere de "+iteraciones+" iteraciones totales");
		System.out.println("Encuentra un total de "+encontrados+" elementos");
	}

	/**
	 * Generador de array de enteros ordenado
	 * @param pos nº de posiciones que tendrá el array de enteros
	 * @return
	 */
	private int[] inicializarArrayOrdenado(int pos) {
		int[] a = new int[pos];

		for(int i=0;i<pos;i++) {
			a[i] = i;
		}

		return a;
	}

	/**
	 * Generador de array de enteros DESordenado
	 * @param arr nº de posiciones que tendrá el array de enteros
	 * @return
	 */
	private int[] desordenarArray(int[] arr) {
		Random rand = new Random();
		int n = arr.length;
		int[] arrAux = new int[n];
		arrAux = arr.clone();

	    while (n > 1) {
	        int k = rand.nextInt(n--); //decrements after using the value
	        int temp = arrAux[n];
	        arrAux[n] = arrAux[k];
	        arrAux[k] = temp;
	    }
	    return arrAux;
	}

	/**
	 * Generador num random
	 * @param pos
	 * @return
	 */
	private int numRandom(int pos) {
		Random rand = new Random();
		return rand.nextInt(pos);
	}


	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
	/**
	 * 
	 * @param num entero a buscar dentro del array
	 * @param arr array de enteros
	 */
	private void busquedaBinaria(int num, int[] arr) {

		int min = 0;
		int max = arr.length-1;
		int med;
		boolean encontrado = false;
		while(!encontrado && max!=min) {
			iteraciones++;
			med = (min + max)/2;
			if(arr[med]==num) {
				encontrado = true;
				encontrados++;
			} else if(arr[med]>num) {
				max = med - 1;
			} else {
				min = med + 1;
			}
			iteraciones++;
		}

	}


	/**
	 * 
	 * @param num entero a buscar dentro del array
	 * @param arr array de enteros
	 */
	private void busquedaLineal(int num, int[] arr) {
		boolean encontrado = false;
		for(int i=0;i<arr.length && !encontrado; i++, ++iteraciones) {
			if(arr[i]==num) {
				encontrado=true;
				encontrados++;
			}
		}
	}

}
