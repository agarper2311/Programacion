package com.es.programacion.tema0.challenges;

import java.util.Arrays;

public class PalabrasMayores {

	public static void main(String[] args) {
		String[] arr1 = { "aba", "aa", "ad", "vcd", "aba" };
		String[] arr2 = { "aa" };
		String[] arr3 = { "abc", "eeee", "abcd", "dcd" };
		String[] arr4 = { "a", "abc", "cbd", "zzzzzz", "a", "abcdef", "asasa", "aaaaaa" };
		String[] arr5 = { "enyky", "benyky", "yely", "varennyky" };
		String[] arr6 = { "abacaba", "abacab", "abac", "xxxxxx" };

		System.out.println(Arrays.toString(palabrasMayores(arr1))); // ["aba", "vcd", "aba"]
		System.out.println(Arrays.toString(palabrasMayores(arr2))); // ["aa"]
		System.out.println(Arrays.toString(palabrasMayores(arr3))); // ["eeee", "abcd"]
		System.out.println(Arrays.toString(palabrasMayores(arr4))); // ["zzzzzz", "abcdef", "aaaaaa"]
		System.out.println(Arrays.toString(palabrasMayores(arr5))); // ["varennyky"]
		System.out.println(Arrays.toString(palabrasMayores(arr6))); // ["abacaba"]

	}

	/**
	 * Dado un array de String, devolver otro array de Strings que contenga todas
	 * las palabras mayores. Ejemplo: ["aba", "aa", "ad", "vcd", "aba"] -> El
	 * String[] de salida deberia ser -> ["aba", "vcd", "aba"]
	 * 
	 * @param inputArray
	 * @return
	 */
	static String[] palabrasMayores(String[] inputArray) {

		
		return null;
	}
	

}
