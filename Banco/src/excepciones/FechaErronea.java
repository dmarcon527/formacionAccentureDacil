package excepciones;

public class FechaErronea extends RuntimeException {
	/**
	 * Constructor sin parámetros
	 */
	public FechaErronea() {
		super("La fecha no es correcta");
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param msj
	 */
	public FechaErronea(String msj) {
		super(msj);
	}
}
