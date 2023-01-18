package Ejercicio11;

public class FiltroFechas04 {

	public static void main(String[] args) {
		//int dia = 29;
		//int mes = 2;
		//int anio = 2004;
		int dia = 3;
		int mes = 9;
		int anio = 2004;

		int[] diaMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 31, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (mes > 0 && mes <= 12) {
			if (mes == 2) {
				if (dia > 0 && dia <= 29) {
					int bisiesto = anio % 4;
					int bisiesto1 = anio % 100;
					if (bisiesto == 0 && bisiesto1 != 0 && dia == 29) {
						System.out.println("Año bisiesto " + anio + " día " + dia);
					} else {
						System.err.println("Error el año no es bisiesto no puede tener " + dia + " días");

					}
				} else {
					System.err.println("Error el año es bisiesto por lo que no puede tener más de 29 días ");
				}

			} else {

				if (anio != 0) {
					if (dia > 0 && dia <= diaMes[mes - 1]) {
						System.out.println("Fecha correcta");
					} else {
						System.err.println("Fecha incorrecta");
					}
				}
			}

		} else {
			System.err.println("Mes incorrecto");
		}

	}

}
