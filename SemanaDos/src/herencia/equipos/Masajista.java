package herencia.equipos;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Masajista extends Persona {

	private String titulacion;
	private int aniosExperiencia;

	Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;

	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	void concentrarse() {
		System.out.println("El masajista se está concentrando");

	}

	@Override
	void viajar() {
		System.out.println("El masajista está viajando");

	}

	/**
	 * Método independiente de Masajista
	 */
	public void darMasaje() {
		System.out.println("El masajista está dando un masaje");

	}

	@Override
	public String toString() {
		return super.toString() + "Masajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia
				+ "]";
	}

}
