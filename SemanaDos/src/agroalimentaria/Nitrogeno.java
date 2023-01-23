package agroalimentaria;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Nitrogeno extends Congelados {

	private int tiempoSeg;

	public Nitrogeno(String tipoProducto, String fechaCad, int tempCong, String tipoCongelacion,
			int tiempoSeg) {
		super(tipoProducto, fechaCad, tempCong, tipoCongelacion);
		setTiempoSeg(tiempoSeg);
	}

	public int getTiempoSeg() {
		return tiempoSeg;
	}

	public void setTiempoSeg(int tiempoSeg) {
		this.tiempoSeg = tiempoSeg;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNitrogeno [tiempoSeg=" + tiempoSeg + " segundo]";
	}

}
