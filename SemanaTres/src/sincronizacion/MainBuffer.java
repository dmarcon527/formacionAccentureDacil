package sincronizacion;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class MainBuffer {

	static Buffer buf;

	/**
	 * Llamamos a los métodos del Buffer esperando una respuesta asincrona
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		buf = new Buffer();
		buf.setDisponible(false);

		GeneraNumero generaNum = new GeneraNumero();
		generaNum.setBuf(buf);
		PresentaNumero presentNum = new PresentaNumero();
		presentNum.setBuf(buf);

		Thread tgn = new Thread(generaNum);
		Thread tpn = new Thread(presentNum);
		tgn.start();
		tpn.start();

	}

}
