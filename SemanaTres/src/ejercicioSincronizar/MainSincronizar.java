package ejercicioSincronizar;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class MainSincronizar {
	/**
	 * Llamamos al método run de la clase NoSincro
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		NoSincro noSincro1 = new NoSincro();
		noSincro1.setMensaje("Desde 1 ->");
		Thread th1 = new Thread(noSincro1);

		NoSincro noSincro2 = new NoSincro();
		noSincro2.setMensaje("Desde 2 ->");
		Thread th2 = new Thread(noSincro2);

		th1.start();
		th2.start();
	}

}
