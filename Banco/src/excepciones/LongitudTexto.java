package excepciones;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class LongitudTexto extends RuntimeException {
	/**
	 * Constructor sin parámetros
	 */
	public LongitudTexto() {
		super("La longitud no es adecuada");
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param msj
	 */
	public LongitudTexto(String msj) {
		super(msj);
	}
}
