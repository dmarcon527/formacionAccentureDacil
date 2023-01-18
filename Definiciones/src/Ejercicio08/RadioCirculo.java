package Ejercicio08;

public class RadioCirculo {
	static final double numPi = Math.PI;
	static final int radio = 23;
	static final int num = 2;

	public static void main(String[] args) {

		double area = numPi * (radio * radio);
		double longitud = num * numPi * radio;

		System.out.println("El area de una circunferencia de" + radio + " es: " + area
				+ "\nLa longitud  de una circunferencia de " + radio + " es: " + longitud);

	}

}
