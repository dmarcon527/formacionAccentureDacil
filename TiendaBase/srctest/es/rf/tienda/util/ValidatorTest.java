package es.rf.tienda.util;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class ValidatorTest {

	final String ALFANUMERIC = "28022025";
	final String ALFANUMERIC2 = "AAss";
	final String ALFANUMERIC3 = "AAss123";
	final String ALFANUMERIC4 = "123AAss";
	final String ALFANUMERIC_FALSE = "123A+++Ass";
	final String ALFANUMERIC_FALSE1 = "++::";

	final String TELEFONO = "34645897345";
	final String TELEFONO2 = "34712345678";
	final String TELEFONO_FALSE = "645897";
	final String TELEFONO_FALSE1 = "+64589734";
	final String TELEFONO_FALSE2 = "6458973+";

	final String EMAIL = "asr@dad.com";
	final String EMAIL1 = "r@d.co";
	final String EMAIL_FALSE = "@dad.com";
	final String EMAIL_FALSE1 = "a@.com";
	final String EMAIL_FALSE2 = "a@d.c";

	final String DNI = "49.133.527-F";
	final String DNI_FALSE = "49.133.527-H";
	final String DNI_FALSE1 = "49133527-F";
	final String DNI_FALSE2 = "49133527F";
	final String DNI_FALSE3 = "49 133 527 F";

	final int VALOR = 19;
	final int VALOR1 = 21;
	final int VALOR_MIN = 18;
	final int VALOR_MIN1 = 22;
	final int VALOR_MAX = 20;
	final int VALOR_MAX1 = 20;

	final double VALOR_DOUBLE = 19.01;
	final double VALOR_DOUBLE1 = 21.01;

	final int LONGITUD = 2;
	final int LONGITUD1 = 10;
	final int LONGITUD2 = 8;
	final String TEXTO = "as";
	final String TEXTO1 = "qwertyuio";
	final String TEXTO2 = "qwertyuioqaqswswxewdewdewdwedwedew";

	final int LONGITUD_MAX = 2;
	final int LONGITUD_MAX1 = 10;
	final int LONGITUD_MAX2 = 8;
	final String TEXTO_MAX = "as";
	final String TEXTO_MAX1 = "qwertyuio";
	final String TEXTO_MAX2 = "qwertyuioqaqswswxewdewdewdwedwedew";

	final LocalDate FECHA_INICIAL = LocalDate.now();
	
	final LocalDate FECHA_MIN = LocalDate.of(2023, 12, 31);
	final LocalDate FECHA_MIN1 = LocalDate.of(2022, 12, 31);
	
	final LocalDate FECHA_MAX = LocalDate.of(2022, 12, 31);
	final LocalDate FECHA_MAX1 = LocalDate.of(2023, 12, 31);

	final String FECHA_VALIDA = "01/02/2023";
	final String FECHA_VALIDA1 = "2023/01/02";
	final String FECHA_VALIDA2 = "01-02-2023";
	final String FECHA_VALIDA3 = "01.02.2023";
	final String FECHA_VALIDA4 = "01022023";

	final String PASSWORD = "asS@12*";
	final String PASSWORD1 = "asS@12";
	final String PASSWORD2 = "asS12";
	final String PASSWORD3 = "as12*";
	final String PASSWORD4 = "S12*";
	final String PASSWORD5 = "12*";
	final String PASSWORD6 = "asS*";

	final String VACIO = "";
	final String VACIO1 = null;
	final String VACIO2 = " ";
	final String VACIO3 = "asas";

	@Test
	void testIsAlfanumeric() {
		assertTrue(Validator.isAlfanumeric(ALFANUMERIC));
	}

	@Test
	void testIsAlfanumeric2() {
		assertTrue(Validator.isAlfanumeric(ALFANUMERIC));
	}

	@Test
	void testIsAlfanumeric3() {
		assertTrue(Validator.isAlfanumeric(ALFANUMERIC3));
	}

	@Test
	void testIsAlfanumeric4() {
		assertTrue(Validator.isAlfanumeric(ALFANUMERIC4));
	}

	@Test
	void testIsAlfanumeric_FALSE() {
		assertFalse(Validator.isAlfanumeric(ALFANUMERIC_FALSE));
	}

	@Test
	void testIsAlfanumeric_FALSE1() {
		assertFalse(Validator.isAlfanumeric(ALFANUMERIC_FALSE1));
	}

	@Test
	void testCumplePhoneNumber() {
		assertTrue(Validator.cumplePhoneNumber(TELEFONO));
	}

	@Test
	void testCumplePhoneNumber2() {
		assertTrue(Validator.cumplePhoneNumber(TELEFONO2));
	}

	@Test
	void testCumplePhoneNumber_False() {
		assertFalse(Validator.cumplePhoneNumber(TELEFONO_FALSE));
	}

	@Test
	void testCumplePhoneNumber_False1() {
		assertFalse(Validator.cumplePhoneNumber(TELEFONO_FALSE1));
	}

	@Test
	void testCumplePhoneNumber_False2() {
		assertFalse(Validator.cumplePhoneNumber(TELEFONO_FALSE2));
	}

	@Test
	void testIsEmailValido() {
		assertTrue(Validator.isEmailValido(EMAIL));
	}

	@Test
	void testIsEmailValido1() {
		assertTrue(Validator.isEmailValido(EMAIL1));
	}

	@Test
	void testIsEmailValido_FALSE() {
		assertFalse(Validator.isEmailValido(EMAIL_FALSE));
	}

	@Test
	void testIsEmailValido_FALSE1() {
		assertFalse(Validator.isEmailValido(EMAIL_FALSE1));
	}

	@Test
	void testIsEmailValido_FALSE2() {
		assertFalse(Validator.isEmailValido(EMAIL_FALSE2));
	}

	@Test
	void testCumpleDNI() {
		assertTrue(Validator.cumpleDNI(DNI));
	}

	@Test
	void testCumpleDNI_FALSE() {
		assertFalse(Validator.cumpleDNI(DNI_FALSE));
	}

	@Test
	void testCumpleDNI_FALSE1() {
		assertFalse(Validator.cumpleDNI(DNI_FALSE1));
	}

	@Test
	void testCumpleDNI_FALSE2() {
		assertFalse(Validator.cumpleDNI(DNI_FALSE2));
	}

	@Test
	void testCumpleDNI_FALSE3() {
		assertFalse(Validator.cumpleDNI(DNI_FALSE3));
	}

	@Test
	void testCumpleRangoIntIntInt() {
		assertTrue(Validator.cumpleRango(VALOR, VALOR_MIN, VALOR_MAX));
	}

	@Test
	void testCumpleRangoIntIntInt_FALSE() {
		assertFalse(Validator.cumpleRango(VALOR1, VALOR_MIN1, VALOR_MAX1));
	}

	@Test
	void testCumpleRangoDoubleIntInt() {
		assertTrue(Validator.cumpleRango(VALOR_DOUBLE, VALOR_MIN, VALOR_MAX));
	}

	@Test
	void testCumpleRangoDoubleIntInt_FALSE() {
		assertFalse(Validator.cumpleRango(VALOR_DOUBLE1, VALOR_MIN, VALOR_MAX));
	}

	@Test
	void testCumpleLongitudMin() {
		assertTrue(Validator.cumpleLongitudMin(TEXTO, LONGITUD));
	}

	@Test
	void testCumpleLongitudMin1() {
		assertFalse(Validator.cumpleLongitudMin(TEXTO1, LONGITUD1));
	}

	@Test
	void testCumpleLongitudMin2() {
		assertTrue(Validator.cumpleLongitudMin(TEXTO2, LONGITUD2));
	}

	@Test
	void testCumpleLongitudMax() {
		assertTrue(Validator.cumpleLongitudMax(TEXTO_MAX, LONGITUD_MAX));
	}

	@Test
	void testCumpleLongitudMax1() {
		assertTrue(Validator.cumpleLongitudMax(TEXTO_MAX1, LONGITUD_MAX1));
	}

	@Test
	void testCumpleLongitudMax2() {
		assertFalse(Validator.cumpleLongitudMax(TEXTO_MAX2, LONGITUD_MAX2));
	}

	@Test
	void testCumpleLongitud() {
		assertTrue(Validator.cumpleLongitud(TEXTO_MAX, LONGITUD, LONGITUD_MAX2));
	}

	@Test
	void testCumpleLongitud1() {
		assertFalse(Validator.cumpleLongitud(TEXTO_MAX1, LONGITUD, LONGITUD_MAX2));
	}

	@Test
	void testCumpleLongitud2() {
		assertFalse(Validator.cumpleLongitud(TEXTO_MAX2, LONGITUD, LONGITUD_MAX2));
	}

	@Test
	void testValDateMin() {
		assertTrue(Validator.valDateMin(FECHA_MIN, FECHA_INICIAL));
	}
	
	@Test
	void testValDateMin1() {
		assertFalse(Validator.valDateMin(FECHA_MIN1, FECHA_INICIAL));
	}

	@Test
	void testValDateMax() {
		assertTrue(Validator.valDateMax(FECHA_MAX, FECHA_INICIAL));
	}
	
	@Test
	void testValDateMax1() {
		assertFalse(Validator.valDateMax(FECHA_MAX1, FECHA_INICIAL));
	}

	@Test
	void testEsFechaValida() {
		assertTrue(Validator.esFechaValida(FECHA_VALIDA));
	}

	@Test
	void testEsFechaValida1() {
		assertFalse(Validator.esFechaValida(FECHA_VALIDA1));
	}

	@Test
	void testEsFechaValida2() {
		assertFalse(Validator.esFechaValida(FECHA_VALIDA2));
	}

	@Test
	void testEsFechaValida3() {
		assertFalse(Validator.esFechaValida(FECHA_VALIDA3));
	}

	@Test
	void testEsFechaValida4() {
		assertFalse(Validator.esFechaValida(FECHA_VALIDA4));
	}

	@Test
	void testEsPasswordValida() {
		assertTrue(Validator.esPasswordValida(PASSWORD));
	}

	@Test
	void testEsPasswordValida1() {
		assertTrue(Validator.esPasswordValida(PASSWORD1));
	}

	@Test
	void testEsPasswordValida2() {
		assertFalse(Validator.esPasswordValida(PASSWORD2));
	}

	@Test
	void testEsPasswordValida3() {
		assertFalse(Validator.esPasswordValida(PASSWORD3));
	}

	@Test
	void testEsPasswordValida4() {
		assertFalse(Validator.esPasswordValida(PASSWORD4));
	}

	@Test
	void testEsPasswordValida5() {
		assertFalse(Validator.esPasswordValida(PASSWORD5));
	}

	@Test
	void testEsPasswordValida6() {
		assertFalse(Validator.esPasswordValida(PASSWORD6));
	}

	@Test
	void testIsVacio() {
		assertTrue(Validator.isVacio(VACIO));
	}

	@Test
	void testIsVacio1() {
		assertTrue(Validator.isVacio(VACIO1));
	}

	@Test
	void testIsVacio2() {
		assertFalse(Validator.isVacio(VACIO2));
	}

	@Test
	void testIsVacio3() {
		assertFalse(Validator.isVacio(VACIO3));
	}

}
