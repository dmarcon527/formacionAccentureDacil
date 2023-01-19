package ejercicio12;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Notas {
	/**
	 * Dependiendo del número que introduzca muestra la nota que tiene
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		notaAlumno(7);
		notaAlumno(3);
		notaAlumno(10);

	}

	public static void notaAlumno(int nota) {
		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("sobresaliente");
			break;
		default:
			System.out.println("No has introducido valores correctos");

		}
	}

}
