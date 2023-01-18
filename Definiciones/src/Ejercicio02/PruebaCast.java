package Ejercicio02;

public class PruebaCast {

	public static void main(String[] args) {
		int num1 = 88;
		// cambia valor puesto que lo transforma al valor de ASCII
		char num2 = (char) num1;
		// cambia valor
		float num3 = num1;
		// cambia valor
		double num4 = num1;
		short num5 = (short) num1;
		byte num6 = (byte) num1;

		System.out.println("Valor int = " + num1 + "\n valor Char = " + num2 + "\n valor float = " + num3
				+ "\n valor double = " + num4 + "\n valor short = " + num5 + "\n valor byte = " + num6);

	}

}
