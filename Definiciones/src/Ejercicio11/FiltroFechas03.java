package Ejercicio11;

public class FiltroFechas03 {

	public static void main(String[] args) {
		int dia = 3;
		int mes = 8;
		int anio = 1995;

		int[] diaMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 31, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (mes > 0 && mes <= 12) {
			if (anio != 0) {
				if (dia > 0 && dia <= diaMes[mes - 1]) {
					System.out.println("Fecha correcto");
				} else {
					System.err.println("Fecha incorrecta");
				}
			}

		} else {
			System.err.println("Mes incorrecto");
		}

	}

}
