package com.es.programacion.tema0.challenges;

public class HacerConsecutivo {

	public static void main(String[] args) {
		int[] arr1 = {6, 2, 3, 8};
		int[] arr2 = {0, 3}; 
		int[] arr3 = {5, 4, 6}; 
		int[] arr4 = {6, 3}; 
		int[] arr5 = {1}; 
		int[] arr6 = {5, 4, 3, 2, 1};

		
		System.out.println(hacerConsecutivo(arr1)); //3
		System.out.println(hacerConsecutivo(arr2)); //2
		System.out.println(hacerConsecutivo(arr3)); //0
		System.out.println(hacerConsecutivo(arr4)); //2
		System.out.println(hacerConsecutivo(arr5)); //0
		System.out.println(hacerConsecutivo(arr6)); //0
	}
	
	/**
	 * Dado un array de enteros POSITIVOS, determinar la 
	 * cantidad de numeros minima que hacen falta para 
	 * hacer a ese array consecutivo. Es decir, que si 
	 * el array se quedara ordenado de menor a mayor, 
	 * cuantos numeros hacen falta
	 * para que no haya ningun hueco entre ellos.
	 * Ejemplo:
	 * Para el array [6, 2, 3, 8] hacen falta 
	 * el 4, el 5 y el 7... es decir, hacen falta 
	 * 3 numeros para hacer al array consecutivo de 
	 * menor a mayor.
	 * @param inputArray array de enteros positivos
	 * @return numero MINIMO de enteros que hacen falta para que el array fuera consecutivo
	 */
	static int hacerConsecutivo(int[] inputArray) {
		int numNecesarios = 0;
		
		
		return numNecesarios;
	}

}
