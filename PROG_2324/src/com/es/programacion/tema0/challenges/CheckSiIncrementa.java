package com.es.programacion.tema0.challenges;

public class CheckSiIncrementa {

	public static void main(String[] args) {
		int[] arr1 = {1, 3, 2, 1};
		int[] arr2 = {1, 3, 2};
		int[] arr3 = {1, 2, 1, 2};
		int[] arr4 = {3, 6, 5, 8, 10, 20, 15};
		int[] arr5 = {1, 1, 2, 3, 4, 4};
		int[] arr6 = {1, 4, 10, 4, 2};
		
		System.out.println(checkSiIncrementa(arr1)); //false
		System.out.println(checkSiIncrementa(arr2)); //true
		System.out.println(checkSiIncrementa(arr3)); //false
		System.out.println(checkSiIncrementa(arr4)); //false
		System.out.println(checkSiIncrementa(arr5)); //false
		System.out.println(checkSiIncrementa(arr6)); //false

	}
	
	/**
	 * Dado un array de enteros, comprobar si, quitando no mas de 1 elemento del array, este va de menor a mayor estrictamente.
	 * Es decir, queremos conseguir que quitando 1 elemento del array, este vaya de menor a mayor.
	 * Ejemplo:
	 * [1, 3, 2, 1] -> False. Porque quitando 1 elemento s�lamente, no conseguimos que el array vaya de menor a mayor
	 * [1, 3, 2] -> true. Si quitamos el 2, se queda [1, 3] (estrictamente creciente). Si quitamos el 3, se queda [1, 2] (estrictametne creciente)
	 * @param inputArray array de enteros
	 * @return true si se puede, false si no se puede
	 */
	static boolean checkSiIncrementa(int[] inputArray) {
		boolean solucion = true;
		
		return solucion;
	}

}
