package dibujos;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Circulo extends Formas {

	private static final double PI = 3.14;

	/**
	 * Inializo el nombre de la figura y le pido el rádio
	 * 
	 * @param x
	 */
	Circulo(double x) {
		super("Circulo");
		super.setX(x);
	}

	@Override
	String dibujar() {
		return "Dibujando un " + super.getNombreForma();

	}

	@Override
	double calcularArea() {
		double calculo = super.getX() * super.getX();
		double res = calculo * PI;
		super.setArea(res);
		return res;
	}

}
