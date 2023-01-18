package Ejercicio11;

public class ConvertirNumLetras {

	public static void main(String[] args) {
		int num = 99;

		String[] decenasArr = { " ", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta",
				"ochenta", "noventa" };
		String[] unidadesArr = { " ", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
				"once", "doce", "trece", "catorce", "quince" };

		int unidades = num % 10;
		int decena = num / 10;
		String msj = "";
		if (num > 0 && num < 100) {

			if (num < 16) {
				System.out.println(unidadesArr[num]);
			} else {

				if (unidades > 0) {
					boolean entra = false;
					switch (decena) {
					case 1:
						msj = "dieci";
						entra = true;
						break;
					case 2:
						msj = "veinti";
						entra = true;
						break;
					}
					if (entra == true) {
						msj += unidadesArr[unidades];
						System.out.println(msj);
					} else {
						System.out.println(decenasArr[decena] + " y " + unidadesArr[unidades]);
					}
				}

			}
		} else {
			System.err.println("Número invalido");
		}
	}

}
