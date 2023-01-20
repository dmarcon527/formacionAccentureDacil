package ejercicio01;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Intercambio<T> {
	private T cadena1;
	private T cadena2;

	Intercambio(T cad1, T cad2) {
		setCadena1(cad1);
		setCadena2(cad2);
	}

	public T getCadena1() {
		return cadena1;
	}

	public void setCadena1(T cadena1) {
		this.cadena1 = cadena1;
	}

	public T getCadena2() {
		return cadena2;
	}

	public void setCadena2(T cadena2) {
		this.cadena2 = cadena2;
	}

	/**
	 * Este método intercambia los valores de los atributos
	 */
	public void intercambiarCadenas() {
		T cadMod = getCadena1();
		setCadena1(getCadena2());
		setCadena2(cadMod);
		System.out.println("Texto 1 = " + cadena1 + " Texto 2 = " + cadena2);
	}
}
