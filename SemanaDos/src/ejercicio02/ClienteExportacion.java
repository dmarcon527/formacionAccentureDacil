package ejercicio02;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class ClienteExportacion extends Cliente {

	private String vat;

	ClienteExportacion(String nom, String dir, String email) {
		super(nom, dir, email);
		setVat("asdf");
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	@Override
	public String toString() {
		String padre = super.toString();
		return "ClienteExportacion [vat=" + vat + "]\n" + padre;
	}

}
