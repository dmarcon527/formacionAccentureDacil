package herencia.equipos;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Futbolista extends Persona {

	private int dorsal;
	private String demarcacion;

	Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	@Override
	void concentrarse() {
		System.out.println("El futbolista se está concentrando");

	}

	@Override
	void viajar() {
		System.out.println("El futbolista está viajando");
	}

	/**
	 * Método independiente de Futbolista
	 */
	public void jugarPartido() {
		System.out.println("El futbolista está jugando el partido");
	}

	/**
	 * Método independiente de Futbolista
	 */
	public void entrenar() {
		System.out.println("El futbolista está entrenando");
	}

	@Override
	public String toString() {
		return super.toString() + "Futbolista [dorsal=" + dorsal + ", demarcación=" + demarcacion + "]";
	}

}
