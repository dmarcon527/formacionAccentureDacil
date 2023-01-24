package gestionExcepcio01;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class MiExcepcion extends RuntimeException {

	/**
	 * Constructor sin parámetros
	 */
	public MiExcepcion() {
		super("Esto es un error");
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param msj
	 */
	public MiExcepcion(String msj) {
		super(msj);
	}
}
