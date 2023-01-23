package herencia.automovil;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class MainAutomovil {
	/**
	 * Instanciamos las clases hijas, las metemos en un ArrayList y mostramos los
	 * datos
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Coche coche = new Coche(6, 500, 123, 4, "rojo", 4, "Renault", true);
		Camion camion = new Camion(6, 700, 2, 12345678, 1500, 12.000);
		Moto moto = new Moto(5, 500, 12345678, 2, 1);
		List<Automovil> lista = new ArrayList<>();

		lista.add(coche);
		lista.add(camion);
		lista.add(moto);

		for (Automovil automovil : lista) {
			System.out.println(automovil.toString());
		}
	}

}
