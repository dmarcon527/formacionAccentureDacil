package ejercicioReloj;

import java.text.DecimalFormat;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Reloj {
	static final int MAX_HORS = 24;
	static final int MAX_MIN_SEG = 59;

	/**
	 * mostramos por pantalla un cronómetro
	 * 
	 * @param args
	 * @throws InterruptedException
	 */

	public static void main(String[] args) throws InterruptedException {
		DecimalFormat formatoHora = new DecimalFormat("00");

		for (int hora = 0; hora < MAX_HORS; hora++) {
			for (int minutos = 0; minutos < MAX_MIN_SEG; minutos++) {
				for (int segundos = 0; segundos < MAX_MIN_SEG; segundos++) {
					System.out.println(formatoHora.format(hora) + ":" + formatoHora.format(minutos) + ":"
							+ formatoHora.format(segundos));
					Thread.sleep(1000);
				}

			}
		}

	}
}
