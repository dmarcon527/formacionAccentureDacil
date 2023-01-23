package ejercicio.clase;


public class Alumno extends Persona {
	private int curso;
	private String nombreCurso;

	public Alumno(String codPersona, String nombre, int edad, String telContacto, String nombreCurso, int curso) {
		super(codPersona, nombre, edad, telContacto);
		setNombreCurso(nombreCurso);
		setCurso(curso);
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		Asignatura asignatura = new Asignatura();
		asignatura.setAsignaturas(nombreCurso);
		this.nombreCurso = nombreCurso;
	}

	@Override
	public String toString() {
		return super.toString() + "Alumno [curso=" + curso + ", nombreCurso=" + nombreCurso + "]";
	}

}
