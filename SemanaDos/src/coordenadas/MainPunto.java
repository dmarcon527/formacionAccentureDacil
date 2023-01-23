package coordenadas;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class MainPunto {
	/**
	 * Creamos un punto y con la clase forma le asignamos el punto invertimos los
	 * valores con el método de la clase punto y mostramos
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Punto punto = new Punto(6, 3);
		Forma forma = new Forma();
		forma.setPuntOrigen(punto);
		forma.getPuntOrigen().invertirPuntos();
		System.out.println(forma.toString());

	}

}
