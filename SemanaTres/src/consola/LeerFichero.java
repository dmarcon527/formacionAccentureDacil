package consola;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class LeerFichero {
	/**
	 * leemos fichero con Scanner leyendo de fichero
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		String carpeta = "C:\\AreaTrabajo\\cursowk\\";
		String archivo = "fichero.txt";
		File fichero = new File(carpeta + archivo);
		try (Scanner leerFichero = new Scanner(fichero)) {

			leerFichero.useDelimiter("\n");
			while (leerFichero.hasNext()) {
				String cadena = leerFichero.next();
				System.out.println(cadena + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
