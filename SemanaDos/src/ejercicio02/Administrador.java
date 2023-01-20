package ejercicio02;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Administrador implements Cosas {

	private int codAut;

	public int getCodAut() {
		Funciones.comprobar(this);
		return codAut;
	}

	public void setCodAut(int codAut) {
		this.codAut = codAut;
	}

	/**
	 * Este método lo usamos desde la interfaz Cosas puesto que al no herdar de
	 * Persona no podemos usar el metodo abstracto
	 */
	@Override
	public String mensajeAbstract() {

		return "defewfiw";
	}

}
