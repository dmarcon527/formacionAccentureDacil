package agroalimentaria;

import java.time.LocalDate;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Producto {

	private String tipoProducto;
	private LocalDate FechaCad;
	private int numLote;

	Producto() {

	}

	/**
	 * Constructor ya inicializado
	 * 
	 * @param nomProd
	 */
	Producto(String nomProd) {
		setTipoProducto(nomProd);
		setFechaCad(LocalDate.ofYearDay(2025, 3));
		setNumLote((int) (Math.random() * 100000));
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public LocalDate getFechaCad() {
		return FechaCad;
	}

	public void setFechaCad(LocalDate fechaCad) {
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
