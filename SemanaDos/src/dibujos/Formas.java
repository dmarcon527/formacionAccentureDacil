package dibujos;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public abstract class Formas {

	private double x;
	private double y;
	private double area;

	public Formas(double x, double y) {
		setX(x);
		setY(y);
	}

	public Formas(double x) {
		setX(x);
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	abstract String dibujar();

	abstract double calcularArea();

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Formas [x=" + x + ", y=" + y + "]";
	}

	

}
