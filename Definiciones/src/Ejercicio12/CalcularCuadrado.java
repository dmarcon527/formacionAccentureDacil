package Ejercicio12;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */

public class CalcularCuadrado {
	/**
	 * Este programa calcula el cuadrado de los números que recibe por parámetro.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int numSalida;
		int calcularCuadrado;

		for (String ele : args) {
			numSalida = Integer.parseInt(ele);
			calcularCuadrado = numSalida * numSalida;
			System.out.println("El cuadrado del número " + numSalida + " es " + calcularCuadrado);
		}

	}

}
