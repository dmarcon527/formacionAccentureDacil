package herencia.automovil;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Automovil implements Abd {

	private int numMarchas;
	private int velocidadMax;
	private int numChasis;
	private int numRuedas;

	public Automovil(int numMarchas, int velocidadMax, int numChasis, int numRuedas) {
		this.numMarchas = numMarchas;
		this.velocidadMax = velocidadMax;
		this.numChasis = numChasis;
		this.numRuedas = numRuedas;
		AccesoABD dao = new AccesoABD();
		dao.accesoLeer(this);
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public int getNumChasis() {
		return numChasis;
	}

	public void setNumChasis(int numChasis) {
		this.numChasis = numChasis;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	@Override
	public String toString() {
		return "Automovil [numMarchas=" + numMarchas + ", velocidadMax=" + velocidadMax + ", numChasis=" + numChasis
				+ ", numRuedas=" + numRuedas + "]";
	}

	@Override
	public void leer() {
		System.out.println("Leer");
	}

	@Override
	public void grabar() {
		System.out.println("grabar");
	}

}
