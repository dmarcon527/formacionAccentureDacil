package ejercicio.clase;

public class Profesor extends Persona{
	 private float salario; 
	 private String fechContratacion; 

	public Profesor(String codPersona, String nombre, int edad, String telContacto, float salario,String fechContratacion) {
		super(codPersona, nombre, edad, telContacto);
		setSalario(salario);
		setFechContratacion(fechContratacion);
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFechContratacion() {
		return fechContratacion;
	}

	public void setFechContratacion(String fechContratacion) {
		this.fechContratacion = fechContratacion;
	}

	@Override
	public String toString() {
		return super.toString()+"Profesor [salario=" + salario + ", fechContratacion=" + fechContratacion + "]";
	}
	
	
	

}
