package ejercicio13;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */

public class CalcularNumerosPrimos {
	/**
	 * Calcula cuántos números primos hay entre 1 y 100
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int num = 0;
		String numeroPrimo = "";

		for (int i = 1; i <= 100; i++) {
			int contador = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					contador = contador + 1;
				}
			}
			if (contador == 2)
				numeroPrimo = numeroPrimo + i + ", ";
		}

		System.out.println(numeroPrimo);

	}
}
