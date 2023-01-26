package clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import excepciones.LongitudTexto;

class CuentaTest {

	final String NUM_CUENTA = "12345987545445454";
	final String TITULAR = "Rocio Monte Fernandez";
	final String TITU_ERR = "aass";
	final String CONCEPTO = "Ingresar";
	final double INGRESAR = 5000.00;
	final double INGRESAR_NEG = -18;
	final double RETIRAR = 1000.00;
	final double RETIRAR2 = 6000.00;

	Cuenta cuenta;

	@BeforeEach
	void creacion() {
		cuenta = new Cuenta(NUM_CUENTA, TITULAR);
	
	}

	@Test
	void testCuenta() {
		Assertions.assertThrows(LongitudTexto.class, () -> {
			new Cuenta(NUM_CUENTA, TITU_ERR);
		});
	}

	@Test
	void testIngresarDouble() {
		Assertions.assertThrows(Exception.class, () -> {
			cuenta.ingresar(INGRESAR);
			Assertions.assertEquals(INGRESAR, cuenta.getSaldo());
		});
	}

	@Test
	void testIngresarDouble_NEGATIVE() {
		Assertions.assertThrows(Exception.class, () -> {
			cuenta.ingresar(INGRESAR_NEG);
		});

	}

	@Test
	void testIngresarStringDouble() {
		Assertions.assertThrows(Exception.class, () -> {
			cuenta.ingresar(CONCEPTO, INGRESAR_NEG);
		});
	}

	@Test
	void testRetirarDouble_sinExcep() {
	
		Assertions.assertThrows(Exception.class, () -> {
				cuenta.ingresar(INGRESAR);
				cuenta.retirar(RETIRAR);
		});

	}

	@Test
	void testRetirarDouble_conExcep() {

		Assertions.assertThrows(Exception.class, () -> {
			cuenta.retirar(RETIRAR2);
		});

	}

	@Test
	void testRetirarStringDouble() {
		Assertions.assertThrows(Exception.class, () -> {
			cuenta.retirar(CONCEPTO, RETIRAR);
		});

	}
}
