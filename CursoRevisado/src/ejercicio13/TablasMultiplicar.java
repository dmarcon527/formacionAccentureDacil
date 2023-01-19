package ejercicio13;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */

public class TablasMultiplicar {
	/**
	 * Muestra las tablas de mútiplicar del 1 al 10
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabla del " + i + "\n---------------------");
			for (int a = 1; a <= 10; a++) {
				System.out.println(i + " x " + a + " = " + i * a);

			}
			System.out.println("");
		}

	}

}
