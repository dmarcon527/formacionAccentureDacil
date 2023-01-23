package agroalimentaria;

import java.time.LocalDate;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Producto {

	private String tipoProducto;
	private String FechaCad;
	private int numLote;
	private static int lote = 1000;

	/**
	 * Constructor con parámetros
	 * 
	 * @param tipoProducto
	 * @param fechaCad
	 * @param numLote
	 */
	public Producto(String tipoProducto, String fechaCad) {
		setTipoProducto(tipoProducto);
		setFechaCad(fechaCad);
		setNumLote(lote++);
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public String getFechaCad() {
		return FechaCad;
	}

	public void setFechaCad(String fechaCad) {
		this.FechaCad = fechaCad;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}

	@Override
	public String toString() {
		return "Producto [tipoProducto=" + tipoProducto + ", FechaCad=" + FechaCad + ", numLote=" + numLote + "]";
	}

}
