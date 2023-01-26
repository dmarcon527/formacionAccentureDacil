package optional;

import java.util.Optional;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Opcionales {
	/**
	 * si un campo es nulo lo controlo para que no de un NullPointerException
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		String name = null;
		Optional<String> name2 = Optional.ofNullable(name);
		name2.ifPresent(nombre -> System.out.println(name.length()));

		System.out.println(Optional.ofNullable(name).orElse("Pepe"));

	}

}
