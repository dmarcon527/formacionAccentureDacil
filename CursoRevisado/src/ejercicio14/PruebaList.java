package ejercicio14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class PruebaList {
	/**
	 * Meter en un ArrayList con unos cuantos elementos y mostrarlos
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>(Arrays.asList("aa", "ee", "Hola", "uu"));

		for (String nom : nombres) {
			if (nom.equals("aa")) {
				System.out.println("Encontamos : " + nom);
			}
			if (nom.contains("ee")) {
				System.out.println("Encontramos : " + nom);
			}

		}
		int pos = nombres.indexOf("Hola");
		System.out.println("Hola se encuentra en la posición: " + pos + 1);
		System.out.println("Hay " + nombres.size() + " nombres");

		for (Iterator<String> it = nombres.iterator(); it.hasNext();) {
			String nom = it.next();
			System.out.println(nom);
			if (nom.equals("ee")) {
				it.remove();
				System.out.println("-----\n" + it);
			}
		}

	}

}
