package clases;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {

	final int IMPORTE_1 = 100;
	final String CONCEPTO_1 = "Retirar";
	final LocalDate FECHA_1 = LocalDate.now();
	Movimiento mov;

	@BeforeEach
	void creacion() {
		mov = new Movimiento();
	}

	@Test
	void testGetmConcepto() {
		mov.setmConcepto(CONCEPTO_1);
		assertEquals(CONCEPTO_1, mov.getmConcepto());
	}

	@Test
	void testGetmFecha() {
		mov.setmFecha(FECHA_1);
		assertEquals(FECHA_1, mov.getmFecha());
	}

	@Test
	void testGetmImporte() {
		mov.setmImporte(IMPORTE_1);
		assertEquals(IMPORTE_1, mov.getmImporte());
	}

}
