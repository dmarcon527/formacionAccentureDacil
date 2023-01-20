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

		Triangulo t = new Triangulo(2, 2);

		System.out.println(t.dibujar() + "\nCon Area " + t.calcularArea() + "\n------------");

		Circulo c = new Circulo(15);

		System.out.println(c.dibujar() + "\nCon Area " + c.calcularArea() + "\n------------");

		Rectangulo r = new Rectangulo(2, 2);

		System.out.println(r.dibujar() + "\nCon Area " + r.calcularArea() + "\n------------");

	}
}
