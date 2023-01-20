package agroalimentaria;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Congelados extends Producto {

	private int tempCong;
	private String tipoCongelacion;

	Congelados() {
		super("Congelados");
	}

	/**
	 * Inicializo los datos
	 * 
	 * @param tipoCong
	 */
	Congelados(String tipoCong) {
		super("Congelados");
		setTempCong(-18);
		setTipoCongelacion(tipoCong);
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
		String msjPadre = super.toString();
		return msjPadre + "\nCongelados [tempCong=" + tempCong + ", tipoCongelacion=" + tipoCongelacion + "]";
	}

}
