package fileWrite;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirFichero {

	public static void main(String[] args) {
		FileWriter fichero = null;
		PrintWriter printWriter = null;

		try {
			fichero = new FileWriter("C:\\AreaTrabajo\\cursowk\\fichero6.txt");
			printWriter = new PrintWriter(fichero);

			for (int i = 0; i < 10; i++) {
				printWriter.println("linea " + i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fichero) {
					fichero.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}

}
