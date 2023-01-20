package ejercicio02;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class ClienteNacional extends Cliente {

	private String dni;

	ClienteNacional() {
		super();
		setDni("12457836D");
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		String padre = super.toString();
		return "ClienteNacional [dni=" + dni + "]\n" + padre;
	}

}
