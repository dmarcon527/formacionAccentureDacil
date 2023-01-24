package ejercicio.clase;

import java.util.HashSet;
import java.util.List;

import herencia.automovil.Automovil;

public class Asignatura {
	private HashSet <String> asignaturas = new HashSet <>();

	public HashSet<String> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String asignatura) {
		this.asignaturas.add(asignatura);
	}

	@Override
	public String toString() {
		return "Asignatura [asignaturas=" + asignaturas + "]";
	}
	
	
	

}
