package Ejercicio09;

public class ForArray {

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
