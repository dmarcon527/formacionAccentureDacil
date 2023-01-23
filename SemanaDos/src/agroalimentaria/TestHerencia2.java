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

		Frescos frescos = new Frescos("Pescado", "2020/08/03", "2019/02/10", 1);
		System.out.println(frescos.toString() + "\n -------------------\n");

		Refrigerados refrigerados = new Refrigerados("Frutas", "2025/05/23", 9876);
		System.out.println(refrigerados.toString() + "\n -------------------\n");

		Aire aire = new Aire("Carne", "2029/12/31", -12, "Aire", 1.5, 3.4, 2.1, 1.1);
		System.out.println(aire.toString() + "\n -------------------\n");

		Agua agua = new Agua("Pescado", "2029/07/12", -18, "Agua", 2.28);
		System.out.println(agua.toString() + "\n -------------------\n");

		Nitrogeno nitrogeno = new Nitrogeno("Carne", "2017/11/22", -19, "Nitrogeno", 1); 
		System.out.println(nitrogeno.toString() + "\n -------------------\n");

	}

}
