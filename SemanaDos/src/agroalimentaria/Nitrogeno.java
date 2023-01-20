package agroalimentaria;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Nitrogeno extends Congelados {

	private int tiempoSeg;

	/**
	 * Inicializo los datos
	 */
	Nitrogeno() {
		super("Nitrogeno");
		setTiempoSeg(1);
	}

	public int getTiempoSeg() {
		return tiempoSeg;
	}

	public void setTiempoSeg(int tiempoSeg) {
		this.tiempoSeg = tiempoSeg;
	}

	@Override
	public String toString() {
		String msjPadre = super.toString();
		return msjPadre + "\nNitrogeno [tiempoSeg=" + tiempoSeg + " segundo]";
	}

}
