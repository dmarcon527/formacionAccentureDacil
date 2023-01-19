package ejercicio09;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class RadioCirculo {
	/**
	 * Calculamos el area y la longitud de una circunferencia
	 * 
	 * declaramos estas variables en final porque su valor nunca va a cambiar
	 */
	static final double PI = Math.PI;
	static final int RADIO = 23;
	static final int NUM = 2;

	public static void main(String[] args) {

		double area = PI * (RADIO * RADIO);
		double longitud = NUM * PI * RADIO;

		System.out.println("El area de una circunferencia de" + RADIO + " es: " + area
				+ "\nLa longitud  de una circunferencia de " + RADIO + " es: " + longitud);

	}

}
