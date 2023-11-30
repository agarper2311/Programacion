package Programacion.src.com.Programacion.Tema3;

public class CheckPalindromo {

	public static void main(String[] args) {
		
		System.out.println(checkPalindromo("aaa"));
		System.out.println(checkPalindromo("abac"));
		System.out.println(checkPalindromo("a"));
		System.out.println(checkPalindromo("az"));
		System.out.println(checkPalindromo("abacaba"));
		System.out.println(checkPalindromo("z"));
		System.out.println(checkPalindromo("aaabaaaa"));
	}
	
	
	
	/**
	 * Dado una cadena de entrada, determina si dicha cadena es un palindromo o no
	 * @param cadena String que entra por parametros
	 * @return true si es palindromo, false si no lo es
	 */
	static boolean checkPalindromo(String cadena) {
		// Comparar caracteres desde ambos extremos de la cadena
		for (int i = 0; i < cadena.length() / 2; i++) {
			if (cadena.charAt(i) != cadena.charAt(cadena.length() - 1 - i)) {
				return false; // Si los caracteres no coinciden, no es un palíndromo
			}
		}
		return true; // Si todos los caracteres coinciden, es un palíndromo
	}
}
