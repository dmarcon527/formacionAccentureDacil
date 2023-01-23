package herencia.automovil;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Camion extends Automovil {

	private double pesoMaximo;
	private double precio;

	public Camion(int numMarchas, int velocidadMax, int numChasis, int numRuedas, double pesoMaximo, double precio) {
		super(numMarchas, velocidadMax, numChasis, numRuedas);
		this.pesoMaximo = pesoMaximo;
		this.precio = precio;
	}

	public double getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return super.toString() + "Camion [pesoMaximo=" + pesoMaximo + ", precio=" + precio + "]";
	}

}
