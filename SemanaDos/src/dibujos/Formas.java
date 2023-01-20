package dibujos;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public abstract class Formas {

	private String nombreForma;
	private double area;
	private double x;
	private double y;

	/**
	 * pedimos el nombre de la forma por parámetros
	 * 
	 * @param nombre
	 */
	Formas(String nombre) {
		setNombreForma(nombre);
	}

	abstract String dibujar();

	abstract double calcularArea();

	public String getNombreForma() {
		return nombreForma;
	}

	public void setNombreForma(String nombreForma) {
		this.nombreForma = nombreForma;
	}

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

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
