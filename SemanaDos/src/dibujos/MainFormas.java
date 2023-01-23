package dibujos;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class MainFormas {
	/**
	 * Instanciamos las tres formas geométricas
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Triangulo triangulo = new Triangulo(15, 12);
		System.out.println(triangulo.toString() + "\n------------");

		Circulo circulo = new Circulo(15);
		System.out.println(circulo.toString() + "\n------------");

		Rectangulo rectangulo = new Rectangulo(2, 2);
		System.out.println(rectangulo.toString() + "\n------------");

	}
}
