package agroalimentaria;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Refrigerados extends Producto {

	private int codOrg;

	Refrigerados() {
		super("Refrigerados");
	}

	/**
	 * Inicializo los datos
	 */
	Refrigerados(int num) {
		super("Refrigerados");
		num = (int) (Math.random() * 100000);
		setCodOrg(num);
	}

	public int getCodOrg() {
		return codOrg;
	}

	/**
	 * Asigno directamente el valor de forma aleatoria
	 */
	public void setCodOrg(int codOrg) {
		this.codOrg = codOrg;
	}

	@Override
	public String toString() {
		String msjPadre = super.toString();
		return msjPadre + "\nRefrigerados [codOrg=" + codOrg + "]";
	}

}
