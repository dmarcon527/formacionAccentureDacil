package consola;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class MensajeConsola {

	/**
	 * Pruebas con Scanner 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			int n1, n2;

			System.out.println("Introduce un número");
			n1 = teclado.nextInt();
			// Vacia lo que hay en bufered
			teclado.nextLine();
			System.out.println("Introduce otro número");
			n2 = teclado.nextInt();
			// teclado.nextLine();
			System.out.format("Primer número %d  y segundo número %d", n1, n2);
			// } catch (IOException e) {
			// System.out.println(e);
		} finally {
			teclado.close();
		}
	}

}
