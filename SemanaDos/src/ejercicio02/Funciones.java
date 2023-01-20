package ejercicio02;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Funciones {
	/**
	 * comprobamos el objeto que estamos pasando por parámetros para saber si es una
	 * instancia de Usuario o Cliente
	 * 
	 * @param per
	 */
	public static void comprobar(Persona per) {

		if (per instanceof Usuario) {
			Usuario u = (Usuario) per;
			u.mensajeAbstract();
		}

		if (per instanceof Cliente) {
			Cliente c = (Cliente) per;
			c.mensajeAbstract();
		}

	}

}
