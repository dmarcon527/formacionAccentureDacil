package sincronizacion;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class PresentaNumero implements Runnable {
	Buffer buf;

	public void setBuf(Buffer buf) {
		this.buf = buf;
	}

	/**
	 * Mostramos el número
	 */
	@Override
	public void run() {
		while (true) {
			// muestro el número
			System.out.println(buf.getNumero());
		}

	}

}
