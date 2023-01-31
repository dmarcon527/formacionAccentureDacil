package juego;

import java.util.Scanner;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class AdivinaNumero {
	/**
	 * Pide un número y tienes que adivinarlo entre 0 y 100
	 * 
	 * @param args
	 */
	static final Scanner teclado = new Scanner(System.in);
	static int adivinarMaquina = (int) (Math.random() * 1000);
	static int numAdivinarMaquina;
	static boolean maquinaAcerto;
	static int numero;
	static final int adivinar = (int) (Math.random() * 100);
	static boolean numeroCorrecto;

	public static void main(String[] args) {

		do {
			try {

				if (numeroCorrecto == false) {
					usuario();
					teclado.nextLine();
				}
				if (maquinaAcerto == false) {
					maquina();
					teclado.nextLine();
				}

			} catch (Exception e) {
				System.err.println(e);
				// limpio el scanner
				teclado.nextLine();
			}

		} while (numeroCorrecto == false && maquinaAcerto == false);
		if (numeroCorrecto == true) {
			System.out.println("Me has ganado");
		} else {
			System.out.println("Te he ganado");
		}

	}

	static boolean maquina() {
		System.out.println("Me toca: ¿ el número que estás pensado es " + adivinarMaquina + " ?");
		System.out.println("Introduce:\n" + "1- Si tiene que ser mayor\n" + "2- si es tiene que ser menor\n" + "3- si acerté");
		int respuesta = teclado.nextInt();
		int almacen = adivinarMaquina;
		switch (respuesta) {
		case 1:
		case 2:
			adivinarMaquina = (int) (Math.random() * almacen);
			break;
		case 3:
			maquinaAcerto = true;
			break;
		}
		return maquinaAcerto;
	}

	static boolean usuario() {
		System.out.println("Te toca adivinar: introduce un número");
		numero = teclado.nextInt();

		if (numero < adivinar) {
			System.out.println("Tiene que ser mayor\n");
		} else if (numero > adivinar) {
			System.out.println("Tiene que ser menor\n");
		} else if (numero == adivinar) {
			numeroCorrecto = true;
		}

		return numeroCorrecto;
	}

}
