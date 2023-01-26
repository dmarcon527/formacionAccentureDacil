package utils;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FiltrosTest {

	final String TITULAR = "123456789101112131415161718";
	final String TITULAR1 = "12345678910111213141516171811111111111111111111111111111111111111111111111111111111111111111";
	final LocalDate FECHA_PRINCIPAL = LocalDate.of(2024, 4, 25);
	final LocalDate FECHA_MIN = LocalDate.of(2020, 4, 25);
	final LocalDate FECHA_MAX = LocalDate.of(2025, 4, 25);
	final LocalDate FECHA_PRINCIPAL1 = LocalDate.of(2031, 4, 25);
	final LocalDate FECHA_PRINCIPAL2 = LocalDate.of(2023, 4, 25);
	final String FECHA_CORRECTA="28-02-2025"; 
	final String FECHA_INCORRECT="28/02/2025";
	final String FECHA_INCORRECT1="28.02.2025";
	final String FECHA_INCORRECT2="28022025";

	@Test
	void testLongitudTexto() {
		assertTrue(Filtros.longitudTexto(TITULAR));
	}

	@Test
	void testLongitudTextoSupera() {
		assertFalse(Filtros.longitudTexto(TITULAR1));
	}

	@Test
	void testIngresosGastos() {
		assertTrue(Filtros.ingresosGastos(9, 99, 10, 100));
	}

	@Test
	void testIngresosGastosTrue() {
		assertTrue(Filtros.ingresosGastos(11, 99, 10, 100));
	}

	@Test
	void fechaVencimiento() {
		assertTrue(Filtros.fechaVencimiento(FECHA_PRINCIPAL, FECHA_MIN, FECHA_MAX));
	}

	@Test
	void fechaVencimientoFalse() {
		assertTrue(Filtros.fechaVencimiento(FECHA_PRINCIPAL1, FECHA_MIN, FECHA_MAX));
	}

	@Test
	void fechaVencimientoFalse1() {
		assertTrue(Filtros.fechaVencimiento(FECHA_PRINCIPAL2, FECHA_MIN, FECHA_MAX));
	}

	@Test
	void fechaVencimiento_null() {
		assertTrue(Filtros.fechaVencimiento(null, FECHA_MIN, FECHA_MAX));
	}
	@Test
	void fechaCorrecta_true() {
		Assertions.assertThrows(Exception.class, () -> {
			Filtros.fechaCorrecta(FECHA_CORRECTA); 
		});
	}
	
	@Test
	void fechaCorrecta_false() {
		Assertions.assertThrows(Exception.class, () -> {
			Filtros.fechaCorrecta(FECHA_INCORRECT); 
		});
	}
	
	@Test
	void fechaCorrecta_false1() {
		Assertions.assertThrows(Exception.class, () -> {
			Filtros.fechaCorrecta(FECHA_INCORRECT1); 
		});
	}
	
	@Test
	void fechaCorrecta_false2() {
		Assertions.assertThrows(Exception.class, () -> {
			Filtros.fechaCorrecta(FECHA_INCORRECT2); 
		});
	}
}
