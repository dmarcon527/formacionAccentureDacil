package Ejercicio06;

public class Contadores {

	public static void main(String[] args) {
		int valor = 0;
		valor = 23;
		valor += 10;
		System.out.println("resultado a = " + --valor);// 32
		System.out.println("resultado b = " + ++valor);// 33
		System.out.println("resultado c = " + valor++);// 33
		System.out.println("resultado d = " + valor--);// 34
		System.out.println("resultado e = " + valor);// 33

	}

}
