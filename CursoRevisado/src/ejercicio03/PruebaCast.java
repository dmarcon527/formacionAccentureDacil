package ejercicio03;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class PruebaCast {

	/**
	 * Mostrar los valores por pantalla y añadir comentarios indicando lo que hace
	 * cada tipo de variable
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int num1 = 88;
		// cambia valor puesto que lo transforma al valor de ASCII
		char num2 = (char) num1;
		// cambia valor
		float num3 = num1;
		// cambia valor
		double num4 = num1;
		short num5 = (short) num1;
		byte num6 = (byte) num1;

		System.out.println("Valor int = " + num1 + "\nvalor Char = " + num2 + "\nvalor float = " + num3
				+ "\nvalor double = " + num4 + "\nvalor short = " + num5 + "\nvalor byte = " + num6);

	}

}
