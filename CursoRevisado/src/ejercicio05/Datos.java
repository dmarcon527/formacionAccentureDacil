package ejercicio05;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Datos {

	private int dia = 10;
	private int nDni = 5743322;
	private double precio;
	private static final boolean ACTIVO = true;

	/**
	 * asignamos el precio
	 */
	public void cargarPrecio() {
		precio = 135.12;
	}

	/**
	 * Método que muestra todos los datos de la clase
	 */
	@Override
	public String toString() {
		return "Dia \t " + dia + "\nDni \t" + nDni + "\nPrecio \t" + precio + "\nActivo\t " + ACTIVO;
	}

}
