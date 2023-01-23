package herencia.equipos;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class MainEquipos {
	/**
	 * Crea una instancia de las clases hijas y las metemos en un ArrayList y en el
	 * for comprobamos el tipo de Persona y mostramos sus datos en concreto
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Futbolista futbolista = new Futbolista(1, "Luis", "Perez Fernandez", 28, 10, "delantero");
		Entrenador entrenador = new Entrenador(2, "Pepe", "Rodriguez Fernandez", 40, "asdfa");
		Masajista masajista = new Masajista(3, "María", "Marco Ruiz", 38, "Fisio Terapeuta", 12);
		List<Persona> lista = new ArrayList<>();
		lista.add(futbolista);
		lista.add(entrenador);
		lista.add(masajista);

		for (Persona persona : lista) {
			System.out.println(persona);
			persona.concentrarse();
			persona.viajar();

			if (persona instanceof Futbolista) {
				((Futbolista) persona).jugarPartido();
				((Futbolista) persona).entrenar();
			} else if (persona instanceof Entrenador) {
				((Entrenador) persona).dirigirPartido();
				((Entrenador) persona).dirigirEntrenamiento();
			} else if (persona instanceof Masajista) {
				((Masajista) persona).darMasaje();
			}
			System.out.println("");
		}

	}

}
