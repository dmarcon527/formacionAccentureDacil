package Ejercicio10;

import javax.swing.event.SwingPropertyChangeSupport;

public class Vuelta {

	public static void main(String[] args) {

		System.out.println("******************* Fase 1 ***********************");
		String salida = "";

		for (String ele : args) {
			salida = salida + ele + " ";
		}

		System.out.println(salida);

		System.out.println("******************* Fase 2 ***********************");
		String[] palabras = salida.split(" ");
		int fin = palabras.length;
		String salida2 = "";

		for (int i = fin - 1; i >= 0; i--) {
			salida2 = salida2 + palabras[i] + " ";
		}

		System.out.println(salida2);

		System.out.println("******************* Fase 3 ***********************");
		int letrasTotal = salida.length();
		String salida3 = "";

		for (int i = letrasTotal - 1; i >= 0; i--) {
			salida3 += salida.charAt(i);
		}
		System.out.println(salida3);

		System.out.println("******************* Fase 4 ***********************");
		int letrasTot = salida.length();
		String salida4 = "";

		for (int i = letrasTot - 1; i >= 0; i--) {

			char letra = salida.charAt(i);
			letra = convert(letra);
			salida4 += letra;

		}
		System.out.println(salida4);
		
		System.out.println("******************* Fase 5 ***********************");
		
		char caracter= salida.charAt(0); 
		String salida5 = "";
		
		for (int i =1; (salida+caracter).charAt(i) !=caracter; i++) {
			salida5= salida.charAt(i)+salida5; 
		}
		System.out.println(salida5);
		
System.out.println("******************* Fase 6 ***********************");
		salida += (char) 0; 
		int pos =0; 
		String salida6 = "";

		while(salida.charAt(pos) != (char) 0) {
			salida6 = salida.charAt(pos++)+salida6; 
		}
		System.out.println(salida6);
	}

	/**
	 * Convierte las vocales en números
	 * 
	 * @param letra
	 * @return
	 */
	public static char convert(char letra) {
		switch (letra) {
		case 'a':
		case 'A':
			letra = '4';
			break;
		case 'e':
		case 'E':
			letra = '3';
			break;
		case 'i':
		case 'I':
			letra = '1';
			break;
		case 'o':
		case 'O':
			letra = '0';
			break;
		case 'u':
		case 'U':
			letra = '9';
			break;
		}
		return letra;
	}

}
