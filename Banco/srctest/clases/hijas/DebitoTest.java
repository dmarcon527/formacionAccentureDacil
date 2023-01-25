package clases.hijas;


import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DebitoTest {
	
	final double INGRESAR = 5000.00;
	final double NEG = -18.00;
	final String TITULAR = "Rocio Monte Fernandez";
	final String NUM = "1231126555955";
	final String CONTEXTO = "Compra";
	final double PAGAR = 500.00;
	final double RETIRAR = 600.00;
	final LocalDate FECHA = LocalDate.now();
	
	Debito debi;

	@BeforeEach
	void creacion() {
		debi = new Debito(FECHA, NUM, TITULAR);
	}

	@Test
	void testIngresar() {
		Assertions.assertThrows(Exception.class, () -> {
			debi.ingresar(INGRESAR);
		});
	}
	@Test
	void testIngresar_NEG() {
		Assertions.assertThrows(Exception.class, () -> {
			debi.ingresar(NEG);
		});
	}

	@Test
	void testPagoEnEstablecimiento() {
		Assertions.assertThrows(Exception.class, () -> {
			debi.pagoEnEstablecimiento(CONTEXTO, INGRESAR);
		});
	}

	@Test
	void testRetirar() {
		Assertions.assertThrows(Exception.class, () -> {
			debi.retirar(PAGAR);
		});
	}
	
	@Test
	void testRetirar_NEG() {
		Assertions.assertThrows(Exception.class, () -> {
			debi.retirar(RETIRAR);
		});
	}

}
