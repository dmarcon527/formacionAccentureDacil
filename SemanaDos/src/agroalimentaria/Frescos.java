package agroalimentaria;

import java.time.LocalDate;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Frescos extends Producto {

	private LocalDate FechEnv;
	private String pais;

	Frescos() {
		super("Frescos");
	}

	/**
	 * Constructor ya inicializado
	 * 
	 * @param pais el parámetro es un integer porque he creado un método privado que
	 *             al introducir un número le asigna el pais
	 */
	Frescos(int pais) {
		super("Frescos");
		setFechEnv();
		seleccionarPais(pais);
	}

	public LocalDate getFechEnv() {
		return FechEnv;
	}

	private void setFechEnv() {
		FechEnv = LocalDate.now();
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
		String msjpadre = super.toString();
		return msjpadre + "\nFrescos [FechEnv=" + FechEnv + ", pais=" + pais + "]";
	}

}
