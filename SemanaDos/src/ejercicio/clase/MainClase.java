package ejercicio.clase;

import java.util.HashSet;

import herencia.automovil.Automovil;

public class MainClase {

	public static void main(String[] args) {
		Asignatura asignaturas = new Asignatura();
		
		Alumno alumno= new Alumno("1", "Raul", 12, "632655247", "Lengua", 2); 
		System.out.println(alumno.toString());
		alumno.setNombreCurso("lengua");
		
		Profesor profe = new Profesor("2", "Juan", 30, "632154789", 5, "15/12/2022"); 
		System.out.println(profe.toString());
		 
	//	asignaturas.mostrarAsig(asignaturas); 
		
	}

}
