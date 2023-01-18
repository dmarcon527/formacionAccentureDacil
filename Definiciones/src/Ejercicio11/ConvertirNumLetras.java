package Ejercicio11;

public class ConvertirNumLetras {

	public static void main(String[] args) {
		int num = 11;

		String[] decenasArr = { " ", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta",
				"ochenta", "noventa" };
		String[] unidadesArr = { " ", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
				"once", "doce", "trece", "catorce", "quince"};

		int unidades = num % 10;
		int decena = num / 10;
		

		if (num < 16) {
			System.out.println(unidadesArr[num]);
		} else {
			
			System.out.println(decenasArr[decena] + " y " + unidadesArr[unidades]);
		}

	}

}
