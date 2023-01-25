package clases.hijas;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.Cuenta;

class CreditoTest {

	final double INGRESAR = 5000.00;
	final double NEG = -18.00;
	final String TITULAR = "Rocio Monte Fernandez";
	final String NUM = "1231126555955";
	final String CONTEXTO = "Compra";
	final double PAGAR = 500.00;
	final double CREDITO = 10000.00;
	final double CREDITO_MAYOR = 20000.00;
	final LocalDate FECHA = LocalDate.now();

	Credito credit;

	@BeforeEach
	void creacion() {
		credit = new Credito(FECHA, NUM, TITULAR);
	}

	@Test
	void testIngresar() {
		Assertions.assertThrows(Exception.class, () -> {
			credit.ingresar(INGRESAR);
		});
	}

	@Test
	void testIngresar_NEG() {
		Assertions.assertThrows(Exception.class, () -> {
			credit.ingresar(NEG);
		});
	}

	@Test
	void testPagoEnEstablecimiento() {
		Assertions.assertThrows(Exception.class, () -> {
			credit.pagoEnEstablecimiento(CONTEXTO, INGRESAR);
		});
	}

	@Test
	void testRetirar() {
		Assertions.assertThrows(Exception.class, () -> {
			credit.retirar(PAGAR);
		});
	}

	@Test
	void testRetirar_NEG() {
		Assertions.assertThrows(Exception.class, () -> {
			credit.retirar(CREDITO_MAYOR);
		});
	}

	@Test
	void testSetmCredito() {
		credit.setmCredito(CREDITO);
	}

}
