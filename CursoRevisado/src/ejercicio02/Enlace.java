package ejercicio02;

import java.time.LocalTime;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Enlace {
	/**
	 * No pongo los atributos privados porque de momento no es necesario
	 */
	String url;
	LocalTime hora;
	int indice;
	static int contador = 0;

	/**
	 * Incrementa el contador
	 */
	Enlace() {
		indice = contador++;
	}

	/**
	 * Muestra por pantalla
	 */
	public void modificacion() {
		System.out.println(this);

	}

	/**
	 * Muestra el mensaje de los atributos de la clase
	 */
	@Override
	public String toString() {
		return "Enlace [url=" + url + ", hora=" + hora + ", indice=" + indice + "]";
	}

}
