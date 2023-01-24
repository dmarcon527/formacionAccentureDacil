package gestionExcepcio01;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class MainExcep {
	/**
	 * Controlamos las exception en este caso de una división por 0
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		int a = 0;
		int b = 300;
		int cociente;
		try {
			cociente = b / a;

		} catch (ArithmeticException e) {
			System.err.println("Se ha producido un error");
			e.printStackTrace();
			// throw (new Exception());
			throw new MiExcepcion("Se ha producido mi Excepción");
		} finally {

			System.err.println("Programa finalizado");
		}
	}

}
