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
		String nombre, apellido; 
		
		System.out.println("Introduce tu nombre");
		nombre = teclado.nextLine();
		
		System.out.println("Introduce tu apellido");
		apellido = teclado.nextLine();
		
	System.out.println("Nombre " + nombre +" Apellido " + nombre);
		for (int i =0; i<=1; i++) {
				if(i==0) {
				printWriter.println("NOMBRE: " + nombre);
				}else {
					printWriter.println("APELLIDO: " + apellido);
				}
		}

		fichero.close();

	}

}
