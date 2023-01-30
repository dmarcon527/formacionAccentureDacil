package ejercicioPedirDatos;

import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class LeerFicheroCreado {
	/**
	 * Creamos un fichero pedimos los datos por teclado y lo escribimos en fichero
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String carpeta = "C:\\AreaTrabajo\\cursowk\\";
		String archivo = "NombrePersona.txt";
		File fichero = new File(carpeta + archivo);
		try (Scanner leerFichero = new Scanner(fichero)) {

			leerFichero.useDelimiter("\n");
			while (leerFichero.hasNext()) {
				String cadena = leerFichero.next();
				System.out.println(cadena + " ");
			}
			leerFichero.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
