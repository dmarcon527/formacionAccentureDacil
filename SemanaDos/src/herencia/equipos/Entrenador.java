package herencia.equipos;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Entrenador extends Persona {

	private String idFederacion;

	Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	@Override
	void concentrarse() {
		System.out.println("El entrenador se está concentrando");
	}

	@Override
	void viajar() {
		System.out.println("El entrenador está viajando");
	}

	/**
	 * Método independiente de Entrenador
	 */
	public void dirigirPartido() {
		System.out.println("El entrenador está dirigiendo el partido");
	}

	/**
	 * Método independiente de Entrenador
	 */
	public void dirigirEntrenamiento() {
		System.out.println("El entrenador está dirigiendo el entrenamiento");
	}

	@Override
	public String toString() {
		return super.toString() + "Entrenador [idFederacion=" + idFederacion + "]";
	}

}
