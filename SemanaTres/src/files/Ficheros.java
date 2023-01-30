package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ficheros {

	public static void main(String[] args) throws IOException {
		System.out.println("Copiar Fichero");
		Path ruta = Paths.get("C:\\AreaTrabajo\\cursowk\\fichero.txt"); 
		Path ruta2 = Paths.get("C:\\AreaTrabajo\\cursowk\\ficheroCopia.txt"); 
		Path target = Files.copy(ruta, ruta2,StandardCopyOption.REPLACE_EXISTING); 
		System.out.println(target.getFileName());
		
		System.out.println("Mover Fichero");
		Path origen = Paths.get("C:\\AreaTrabajo\\cursowk\\ficher6.txt"); 
		Path destino = Paths.get("c:\\AreaTrabajo\\ficher6.txt"); 
		Files.move(origen, destino, StandardCopyOption.REPLACE_EXISTING); 
	}

}
