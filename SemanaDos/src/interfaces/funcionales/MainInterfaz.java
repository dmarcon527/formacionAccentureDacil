package interfaces.funcionales;

/**
 * 
 * @authorDácil Marco Contreras
 *
 */
public class MainInterfaz {
	/**
	 * Implementamos la interfaz funcional
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Interface1 objeto = (a, b) -> a + b;

		System.out.println(objeto.cuenta(2, 3));
		System.out.println(objeto.resuelto(2));
		System.out.println(objeto.saluda());

	}

}
