package agroalimentaria;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Agua extends Congelados {

	private double cantSal;

	/**
	 * Inicializo los datos
	 */
	Agua() {
		super("Agua");
		setCantSal(2.14);
	}

	public double getCantSal() {
		return cantSal;
	}

	public void setCantSal(double cantSal) {
		this.cantSal = cantSal;
	}

	@Override
	public String toString() {
		String msjPadre = super.toString();
		return msjPadre + "Agua [cantSal=" + cantSal + "]";
	}

}
