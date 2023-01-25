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
	final double INGRESAR = 5000.00;
	final double INGRESAR_NEG = -18;
	final double RETIRAR = 1000.00;
	final double RETIRAR2 = INGRESAR;

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
	void testAddMovimiento() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSaldo() {
		fail("Not yet implemented");
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
		fail("Not yet implemented");
	}

	@Test
	void testRetirarDouble_sinExcep() {
		
		Assertions.assertThrows(Exception.class, () -> {
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
		fail("Not yet implemented");
	}

}
