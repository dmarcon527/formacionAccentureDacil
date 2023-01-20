package dibujos;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Rectangulo extends Formas {

	private static final double PI = 3.14;

	/**
	 * 
	 * Inicializamos el nombre de la figura y pedimos la base y la altura
	 */
	Rectangulo(double x, double y) {
		super("Rectangulo");
		super.setX(x);
		super.setY(y);
	}

	@Override
	String dibujar() {
		return "Dibujando un " + super.getNombreForma();
	}

	@Override
	double calcularArea() {
		double calculo = super.getX() * super.getY();
		super.setArea(calculo);
		return calculo;
	}
}
