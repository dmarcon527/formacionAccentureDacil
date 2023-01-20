package agroalimentaria;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class TestHerencia2 {
	/**
	 * Creamos una instancia de las distintas clases y mostramos los datos
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Frescos p = new Frescos(1);
		System.out.println("Productos Frescos:\n" + p.toString() + "\n -------------------\n");

		Refrigerados r = new Refrigerados();
		System.out.println("Productos Refrigerados:\n" + r.toString() + "\n -------------------\n");

		Aire a = new Aire();
		System.out.println("Productos Congelados por Aire:\n" + a.toString() + "\n -------------------\n");

		Agua ag = new Agua();
		System.out.println("Productos Congelados por Agua:\n" + ag.toString() + "\n -------------------\n");

		Nitrogeno n = new Nitrogeno();
		System.out.println("Productos Congelados por Nitrogeno:\n" + n.toString() + "\n -------------------\n");

	}

}
