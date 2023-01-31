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

	@Override
	public void run() {
		// genero un número aleatorio
		Random rn = new Random();
		while (true) {
			buf.setNumero(rn.nextInt());
		}
	}
}
