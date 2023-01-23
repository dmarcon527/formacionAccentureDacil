package agroalimentaria;

import java.time.LocalDate;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Frescos extends Producto {

	private String FechEnv;
	private String pais;

	public Frescos(String tipoProducto, String fechaCad, String fechEnv, int pais) {
		super(tipoProducto, fechaCad);
		setFechEnv(fechEnv);
		seleccionarPais(pais);
	}

	public String getFechEnv() {
		return FechEnv;
	}

	private void setFechEnv(String FechEnv) {
		this.FechEnv = FechEnv;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * Dependiendo del número asignará un pais
	 * 
	 * @param num
	 */
	private void seleccionarPais(int num) {
		switch (num) {
		case 1:
			setPais("España");
			break;
		case 2:
			setPais("Alemania");
			break;
		case 3:
			setPais("Portugal");
			break;
		default:
			setPais("Africa");
			break;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\nFrescos [FechEnv=" + FechEnv + ", pais=" + pais + "]";
	}

}
