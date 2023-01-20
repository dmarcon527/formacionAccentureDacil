package ejercicio02;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Usuario extends Persona {

	private int codUsu;

	/**
	 * Creo un constructor con valores ya inicializados
	 */
	Usuario() {
		super();
		setCodUsu(123);
	}

	public int getCodUsu() {
		return codUsu;
	}

	public void setCodUsu(int codUsu) {
		this.codUsu = codUsu;
	}

	public void autorizar() {
		System.out.println("Usuario autorizado");
	}

	@Override
	public void crear() {
		super.crear();
		System.out.println("Usuario Creado");
	}

	@Override
	String mensajeAbstract() {
		System.out.println(super.toString());
		return "Usuario " + getCodUsu();
	}

}
