package ejercicioPedirDatos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class PedirDatosGrabar {
	/**
	 * Leemos el fichero que hemos creado y mostramos por pantalla
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		FileWriter fichero = new FileWriter("C:\\AreaTrabajo\\cursowk\\NombrePersona.txt");
		PrintWriter printWriter = new PrintWriter(fichero);
		Scanner teclado = new Scanner(System.in);
		String nombre, apellido;

		System.out.println("Introduce tu nombre");
		nombre = teclado.nextLine();

		System.out.println("Introduce tu apellido");
		apellido = teclado.nextLine();

		System.out.println("Nombre " + nombre + " Apellido " + apellido);

		printWriter.println("NOMBRE=" + nombre);

		printWriter.println("APELLIDO=" + apellido);

		fichero.close();

	}

}
