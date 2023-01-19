package ejercicio12;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class FiltroFechas02 {
	/**
	 * Controlamos que el día que introduzca sea correspondiente con los días del
	 * mes seleccionado y que el año sea mayor que 0 Además en Febrero que si
	 * introduce el día 29 comprueba que ese año sea bisiesto o no
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int dia = 29;
		int mes = 2;
		int anio = 1995;
		if (anio > 0) {

			switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (dia > 0 && dia <= 31) {
					System.out.println("Día y mes correcto");
				} else {
					System.err.println("Día y mes incorrecto");
				}
				break;
			case 2:
				if (dia > 0 && dia <= 29) {
					int bisiesto = anio % 4;
					int bisiesto1 = anio % 100;
					if (bisiesto == 0 && bisiesto1 != 0 && dia == 29) {
						System.out.println("Año bisiesto " + anio + "día " + dia);
					} else {
						System.err.println("Error el año no es bisiesto no puede tener " + dia + " días");
					}
				} else {
					System.err.println("Día incorrecto");
				}
				break;

			case 4:
			case 6:
			case 9:
			case 11:
				if (dia > 0 && dia <= 30) {
					System.out.println("Día y mes correcto");
				} else {
					System.err.println("Día y mes incorrecto");
				}
				break;
			default:
				System.err.println("Mes incorrecto");

			}

		}
	}
}
