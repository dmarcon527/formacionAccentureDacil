package dibujos;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Triangulo extends Formas {

	private static final double NUM = 2;

	/**
	 * 
	 * Inicializamos el nombre de la figura y pedimos la base y la altura
	 */
	Triangulo(int x, int y) {
		super("Triangulo");
		super.setX(x);
		super.setY(y);
	}

	public double getNUM() {
		return NUM;
	}

	@Override
	String dibujar() {

		return "Dibujando un " + super.getNombreForma();
	}

	@Override
	double calcularArea() {
		double calculo = NUM * super.getX() * super.getY();
		super.setArea(calculo);
		return calculo;
	}

}
