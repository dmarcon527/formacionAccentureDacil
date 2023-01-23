package herencia.automovil;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Coche extends Automovil implements Reductora {

	private String color;
	private int numPuertas;
	private String modelo;
	private boolean activarReductor;

	public Coche(int numMarchas, int velocidadMax, int numChasis, int numRuedas, String color, int numPuertas,
			String modelo, boolean activar) {
		super(numMarchas, velocidadMax, numChasis, numRuedas);
		this.color = color;
		this.numPuertas = numPuertas;
		this.modelo = modelo;
		this.activarReductor = activar;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isActivarReductor() {
		return activarReductor;
	}

	public void setActivarReductor(boolean activarReductor) {
		this.activarReductor = activarReductor;
	}

	@Override
	public void activarReductor(boolean activado) {
		setActivarReductor(activado);
	}

	@Override
	public String toString() {
		return super.toString() + "Coche [color=" + color + ", numPuertas=" + numPuertas + ", modelo=" + modelo
				+ ", activarReductor=" + activarReductor + "]";
	}

}
