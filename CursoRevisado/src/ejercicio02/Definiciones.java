package ejercicio02;

import java.time.LocalTime;

/**
 * 
 * @author Dácil Marco Contreras
 */

public class Definiciones {

	/**
	 * Prueba de como definir campos Planteamiento por consola
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Enlace e = new Enlace();
		e.modificacion();
		e.url = "http://shdjdhw";
		e.hora = LocalTime.now();
		e.modificacion();

		System.out.println(Enlace.contador);

		Enlace e2 = new Enlace();

		e2.url = "http://shdsdsdswdwdwjdhw";
		e2.hora = LocalTime.now();
		e2.modificacion();

		System.out.println(Enlace.contador);

		Enlace e3 = new Enlace();

		e3.url = "http://shdsdsdswdwdwjdhw";
		e3.hora = LocalTime.now();
		e3.modificacion();

		Enlace.contador = 100;
		System.out.println(e.contador);
		System.out.println(e2.contador);
		System.out.println(e3.contador);
	}

}
