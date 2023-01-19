package ejercicio07;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Contadores {
	/**
	 * asignamos valores a las variables y hacemos modificaciones a la hora de
	 * mostrar y dejamos comentado lo que va a mostrarnos por pantalla antes de
	 * ejecutarlo
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int valor = 0;
		valor = 23;
		valor += 10;

		// 32
		System.out.println("resultado a = " + --valor);
		// 33
		System.out.println("resultado b = " + ++valor);
		// 33
		System.out.println("resultado c = " + valor++);
		// 34
		System.out.println("resultado d = " + valor--);
		// 33
		System.out.println("resultado e = " + valor);

	}

}
