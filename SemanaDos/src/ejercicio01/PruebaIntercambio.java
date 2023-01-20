package ejercicio01;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */

public class PruebaIntercambio {
	/**
	 * Instanciamos la clase Intercambio y utilizamos los métodos
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Intercambio<String> i = new Intercambio<String>("Luis", "Pepe");
		Intercambio<Integer> in = new Intercambio<Integer>(12, 30);

		System.out.println("Antes del intercambio\nTexto 1= " + i.getCadena1() + " Texto 2 = " + i.getCadena2()
				+ "\nDespués del intercambio");
		i.intercambiarCadenas();

		System.out.println("Antes del intercambio\nTexto 1= " + in.getCadena1() + " Texto 2 = " + in.getCadena2()
				+ "\nDespués del intercambio");
		in.intercambiarCadenas();
	}

}
