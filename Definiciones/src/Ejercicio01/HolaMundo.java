package Ejercicio01;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("HOLA MUNDO");
		System.out.println("Pruebas de tipos:");

		char c = 'A';
		double precio = 23.4;
		double iva = 0.16;
		double importeTotal;
		importeTotal = precio * iva + precio;

		System.out.println("Carácter: " + c);
		System.out.println("Equivalencia Unicode: " + (int) c);
		System.out.println("Importe Total: " + importeTotal);
		System.out.println("Primavera \nVerano \nOtoño \nInvierno");
		System.out.println("Lun \tMar \tMie \tJue \tvie");
		System.out.println("Lun \\Mar \\Mie \\Jue \\vie");
		System.out.println("\"Cocodrilo\"");

	}

}
