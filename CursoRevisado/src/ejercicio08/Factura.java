package ejercicio08;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Factura {
	/**
	 * asignamos valores a las variables, realizamos modificaciones para generar una
	 * factura y mostramos por pantalla los resultados.
	 * 
	 * IVA la declaramos fuera y final porque es un valor que nunca va a cambiar
	 */

	static final double IVA = 21;

	public static void main(String[] args) {
		int cantidad = 3;
		int unidades = 12;
		double precio = 5.40;
		double importe = cantidad * unidades * precio;
		double iva = importe * IVA / 100;
		int total = (int) (importe + iva);

		double total2 = importe + IVA;

		System.out.println("cantidad\t=" + cantidad + "\nunidades\t=" + unidades + "\nprecio\t=" + precio
				+ "\nImporte\t=" + importe + "\nIva\t=" + iva + "\nTotal\t=" + total + " deberia de ser: " + total2);

	}

}
