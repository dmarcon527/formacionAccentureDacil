package ejercicio10;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class ForArray {
	/**
	 * Creamos un array le indicamos las filas y columnas cargamos el array con
	 * ayuda de un bucle y en el siguiente bucle mostramos lo que hay en cada
	 * posición
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int fila = 5;
		int columna = 7;
		int[][] numArray = new int[fila][columna];
		int contador = 0;

		for (int f = 0; f < numArray.length; f++) {
			for (int c = 0; c < numArray[f].length; c++) {
				if (contador < 31) {
					numArray[f][c] = ++contador;
				}
			}
		}

		for (int f1 = 0; f1 < numArray.length; f1++) {
			for (int c1 = 0; c1 < numArray[f1].length; c1++) {
				System.out.println(numArray[f1][c1]);
			}
		}

	}

}
