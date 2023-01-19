package ejercicio05;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class MainDatos {
	/**
	 * Llamamos la clase Datos y llamamos a sus métodos
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Datos d = new Datos();
		d.cargarPrecio();
		System.out.println(d.toString());

	}

}
