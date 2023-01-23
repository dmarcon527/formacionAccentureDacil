package agroalimentaria;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Refrigerados extends Producto {

	private int codOrg;

	public Refrigerados(String tipoProducto, String fechaCad, int codOrg) {
		super(tipoProducto, fechaCad);
		setCodOrg(codOrg);
	}

	public int getCodOrg() {
		return codOrg;
	}

	public void setCodOrg(int codOrg) {
		this.codOrg = codOrg;
	}

	@Override
	public String toString() {
		return super.toString() + "\nRefrigerados [codOrg=" + codOrg + "]";
	}

}
