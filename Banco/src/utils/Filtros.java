package utils;

/**
 * 
 * @author Dácil Marco Contreras
 *
 *         Longitud de texto mayor que 20 y no mayor que 30 Nombre de titular
 *         >20 y <30
 * 
 *         textos de ingreso y gastos que sea gasto>10
 *         
 *          Fecha vencimiento>3 y <5años
 * 
 *         concepto textos ingreso y gasto >10 y <100
 */
public class Filtros {
	/**
	 * Comprueba la longuitud del texto si cumple la condición devuelve true y si no
	 * false
	 * 
	 * @param texto cadena de caracteres
	 * @param max   máximo de caracteres
	 * @param min   minimo de caracteres
	 * @return
	 */
	public static boolean longitudTexto(String texto, int max, int min) {
		boolean textoCorrecto = false;
		if (texto.length() >= min && texto.length() <= max) {
			textoCorrecto = true;
		}
		return textoCorrecto;
	}
	
	public static boolean ingresosGastos(double ingreso, int gasto, int min, int max) {
		boolean textoCorrecto = false;
		if (ingreso >= min && ingreso <= max) {
			textoCorrecto = true;
		}
		return textoCorrecto;
	}
	
	

}
