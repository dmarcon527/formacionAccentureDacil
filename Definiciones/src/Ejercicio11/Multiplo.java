package Ejercicio11;

public class Multiplo {

	public static void main(String[] args) {

		comprobarNumeros(10, 20);
		comprobarNumeros(23, 5);
		comprobarNumeros(5.5, 4.3);

	}

	public static void comprobarNumeros(double num1, double num2) {
		if (num1 == num2) {
			System.out.println("Son iguales");
		} else {
			if (num1 > num2) {
				System.out.println(num1 + " es mayor que " + num2);

			} else {
				System.out.println(num2 + " es mayor que " + num1);
			}
		}

		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("Son múltiplos");
		} else {
			System.out.println("No son múltiplos");
		}

	}

}
