package agroalimentaria;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Agua extends Congelados {

	private double cantSal;

	public Agua(String tipoProducto, String fechaCad, int tempCong, String tipoCongelacion,
			double cantSal) {
		super(tipoProducto, fechaCad, tempCong, tipoCongelacion);
		setCantSal(cantSal);
	}

	public double getCantSal() {
		return cantSal;
	}

	public void setCantSal(double cantSal) {
		this.cantSal = cantSal;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAgua [cantSal=" + cantSal + "]";
	}

}
