package paths;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class RutaPath {
	/**
	 * Trabajamos con las rutas Path
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Path path = Paths.get("C:\\AreaTrabajo\\cursowk\\fichero6.txt");

		System.out.println("Nombre fichero " + path.getFileName() + "\nnombre carpeta " + path.getName(1)
				+ "\nnombre fichero " + path.getName(2) + "\ncuenta las carpetas " + path.getNameCount()
				+ "\nruta " + path.getParent() + "\nse encuentra en " + path.getRoot() + "\nruta absoluta "
				+ path.toAbsolutePath() + "\nruta del fichero " + path.toFile() + "\n" + path.normalize() + "\n"
				+ path.compareTo(path) + "\nes correcto " + path.endsWith(path) + "\nes igual " + path.endsWith(""));
	}

}
