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

	public static void main(String[] args) {

		boolean numeroCorrecto = false;
		int adivinar = (int) (Math.random() * 100);

		try {

			System.out.println("Introduce el número que tiene que adivinar la máquina");
			numAdivinarMaquina = teclado.nextInt();

		} catch (Exception e) {
			System.err.println(e);
			// limpio el scanner
			teclado.nextLine();
		}

		do {
			try {
				int numero = 0;
				if (numeroCorrecto == false) {
					System.out.println("Te toca adivinar: introduce un número");
					numero = teclado.nextInt();

					if (numero < adivinar) {
						System.out.println("Tiene que ser mayor");
					} else if (numero > adivinar) {
						System.out.println("Tiene que ser menor");
					}
				}
				if (maquinaAcerto == false) {
					maquina();
				}

				if (numero == adivinar) {
					numeroCorrecto = true;

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
		System.out.println(
				"Introduce: 1- Si tiene que ser mayor\n" + " 2- si es tiene que ser menor\n" + " 3- si acerté");
		int respuesta = teclado.nextInt();
		switch (respuesta) {
		case 1:
		case 2:
			adivinarMaquina = (int) (Math.random() * numAdivinarMaquina);
			break;
		case 3:
			maquinaAcerto = true;
			break;
		}
		return maquinaAcerto;
	}

}
