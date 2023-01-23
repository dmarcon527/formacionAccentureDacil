package dibujos;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Circulo extends Formas {

	public Circulo(double x) {
		super(x);
	}


	@Override
	String dibujar() {
		return "Dibujando circulo";
	}

	@Override
	double calcularArea() {
		double calculo = getX() * getX();
		setArea(calculo * Math.PI);
		return getArea();
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nArea del Circulo "+calcularArea()+"\n"+ dibujar();
	}

}
