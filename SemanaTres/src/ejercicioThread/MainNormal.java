package ejercicioThread;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class MainNormal {
	/**
	 * Al invocar en la clase Mensaje el Thread el main llama al método run para
	 * ejecutarlo
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		Mensaje mensaje1 = new Mensaje();
		Mensaje mensaje2 = new Mensaje();

		mensaje1.setMensaje("Este mensaje es desde 1");
		mensaje2.setMensaje("Este mensaje es desde 2");

		mensaje1.start();
		mensaje2.start();
		Thread.sleep(5000);
		mensaje2.setMensaje("********");

	}

}
