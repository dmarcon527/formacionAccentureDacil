package dibujos;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Triangulo extends Formas {

	public Triangulo(double x, double y) {
		super(x, y);
	}

	@Override
	String dibujar() {
		return "Dibujando triangulo ";
	}

	@Override
	double calcularArea() {
		double calculo = getX() * getY();
		setArea(calculo / 2);
		return getArea();
	}

	@Override
	public String toString() {
		return super.toString() + "\nArea del Triangulo " + calcularArea() + "\n" + dibujar();
	}

}
