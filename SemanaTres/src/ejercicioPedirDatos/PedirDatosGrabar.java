package ejercicioPedirDatos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PedirDatosGrabar {

	public static void main(String[] args) throws IOException {
		
		FileWriter fichero = new FileWriter("C:\\AreaTrabajo\\cursowk\\NombrePersona.txt");
		PrintWriter printWriter = new PrintWriter(fichero);
		Scanner teclado = new Scanner(System.in);
		String nombreCompleto = new String();
		
		System.out.println("Introduce tu nombre completo");
		nombreCompleto = teclado.nextLine();
	System.out.println("Nombre " + nombreCompleto);
		while (teclado.hasNext()) {
				printWriter.println("nombre " + teclado);
			teclado.hasNext(); 
			printWriter.println("Appellido " + teclado);
		}

	

	}

}
