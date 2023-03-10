package main;

import java.time.LocalDate;

import clases.Cuenta;
import clases.hijas.Credito;
import clases.hijas.Debito;
import utils.Filtros;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class mainBanco {

	public static void main(String[] args) {
		try {
			LocalDate fechacad = LocalDate.of(2025, 04, 12);
			Cuenta cuenta = new Cuenta("ES21 1234 1234 1234 1234", "Manuel Fernandez Perez");

			Debito debito = new Debito(LocalDate.of(2025, 02, 12), "ES21 1234 1234 1234 1235",
					"Manuel Fernandez Perez");
			debito.setmCuentaAsociada(cuenta);
			debito.ingresar(1000.00);

			System.out.println("En total hay en la cuenta (DEBITO)" + debito.getSaldo());
			System.out.println("En total hay en la cuenta " + cuenta.getSaldo());

			cuenta.ingresar(2000.00);
			cuenta.retirar(100.00);
			debito.pagoEnEstablecimiento("Bar pepe", 100);
			debito.retirar(20.00);

			System.out.println(cuenta.toString());
			System.out.println("\nEn total hay en la cuenta " + cuenta.getSaldo());

			System.out.println("--------------");

			Cuenta cuenta1 = new Cuenta("ES21 147 147 147 147", "Rosa ruiz Lopez");
			Credito credito = new Credito(fechacad, "sdd", "Maria perez Sousa");

			credito.setmCuentaAsociada(cuenta1);
			credito.setmCredito(5000.00);
			System.out.println("Credito disponible " + credito.crditoDisponible());
			credito.retirar(1000.00);
			credito.liquidar(01, 2023);
			System.out.println("LIQUIDAR= " + credito.toString());
			credito.pagoEnEstablecimiento("Clases de Pole", 40);
			credito.ingresar(500);

			System.out.println(credito.toString());

			Filtros.fechaCorrecta("28/02/2025", "dd/MM/yyyy");
			Filtros.fechaCorrecta("28-02-2025");
			System.out.println("Fechas correctas\nLa siguiente Falla");
			Filtros.fechaCorrecta("28/02/2025", null);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
