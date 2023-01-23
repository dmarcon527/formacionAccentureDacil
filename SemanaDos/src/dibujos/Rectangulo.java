package dibujos;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Rectangulo extends Formas {

	public Rectangulo(double x, double y) {
		super(x, y);

	}

	@Override
	String dibujar() {

		return "Dibujando rectangulo";
	}

	@Override
	double calcularArea() {
		double calculo = getX() * getY();
		setArea(calculo);
		dibujarForma(calculo);
		return getArea();
	}

	/**
	 * dibuja un rectangulo
	 * 
	 * @param total
	 */
	private void dibujarForma(double total) {
		for (int i = 1; i <= total; i++) {
			for (int a = 1; a <= total; a++) {
				System.out.print("* ");

			}
			System.out.println("");
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nArea del Rectangulo "+calcularArea()+"\n"+ dibujar();
	}


}
