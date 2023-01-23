package agroalimentaria;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Congelados extends Producto {

	private int tempCong;
	private String tipoCongelacion;

	public Congelados(String tipoProducto, String fechaCad, int tempCong, String tipoCongelacion) {
		super(tipoProducto, fechaCad);
		setTempCong(tempCong);
		setTipoCongelacion(tipoCongelacion);
	}

	public int getTempCong() {
		return tempCong;
	}

	public void setTempCong(int tempCong) {
		this.tempCong = tempCong;
	}

	public String getTipoCongelacion() {
		return tipoCongelacion;
	}

	public void setTipoCongelacion(String tipoCongelacion) {
		this.tipoCongelacion = tipoCongelacion;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCongelados [tempCong=" + tempCong + ", tipoCongelacion=" + tipoCongelacion + "]";
	}

}
