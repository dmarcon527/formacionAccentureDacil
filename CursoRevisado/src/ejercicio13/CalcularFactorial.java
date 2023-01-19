package ejercicio13;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */

public class CalcularFactorial {
	/**
	 * Calcular el factorial del número 8
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int fact = 8;
		int num = 1;
		int i = 1;
		while (i <= fact) {
			num = num * i;
			i++;
		}
		System.out.println("El factorial del número" + fact + " es " + num);

	}

}
