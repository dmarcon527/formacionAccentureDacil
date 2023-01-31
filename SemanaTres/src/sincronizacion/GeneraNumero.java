package sincronizacion;

import java.util.Random;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class GeneraNumero implements Runnable {
	Buffer buf;

	public void setBuf(Buffer buf) {
		this.buf = buf;
	}

	/**
	 * Generamos un número aleatorio y se lo asignamos al Buffer
	 */
	@Override
	public void run() {
		Random rn = new Random();
		while (true) {
			buf.setNumero(rn.nextInt());
		}
	}
}
