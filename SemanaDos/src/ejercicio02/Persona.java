package ejercicio02;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */

public abstract class Persona {

	private String nombre;
	private String direccion;
	private String correoElectronico;

	/**
	 * Creo un constructor con valores ya inicializados
	 */
	Persona() {
		setNombre("Persona");
		setDireccion("Dirección tal");
		setCorreoElectronico("djefd@gmail.com");
	}

	abstract String mensajeAbstract();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public void crear() {
		System.out.println("Persona creada");
	}

	public void borrar() {
		System.out.println("persona borrada");
	}

	public void enviarMensaje() {
		System.out.println("Enviando mensaje desde Persona");
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", correoElectronico=" + correoElectronico
				+ "]";
	}

}
