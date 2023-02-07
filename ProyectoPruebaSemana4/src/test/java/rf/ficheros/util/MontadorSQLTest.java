package rf.ficheros.util;

import junit.framework.TestCase;

public class MontadorSQLTest extends TestCase {

	final String NOMBRE_VARIABLE = "nombre_var";
	final String NOMBRE_VARIABLE1 = "nombre_var1";
	final int VALOR_INT = 10;
	final double VALOR_DOUBLE = 456.12;
	final long VALOR_LONG = 45678;
	final String VALOR_STRING = "Texto";
	final String CARACTER = ",";
	final String CARACTER1 = " ";

	final String SALIDA1 = "nombre_var = 10";
	final String SALIDA2 = "nombre_var = 456.12";
	final String SALIDA3 = "nombre_var = 45678";
	final String SALIDA4 = "nombre_var = 'Texto',";
	final String SALIDA5 = "nombre_var = 'Texto',nombre_var1 = 456.12";
	final String SALIDA6 = "nombre_var = 'Texto',nombre_var1 = 'Texto' ";

	public void testMontaSqlStringStringString() {
		String salida = "";
		salida = MontadorSQL.montaSql(NOMBRE_VARIABLE, VALOR_STRING, CARACTER);
		assertEquals(SALIDA4.trim(), salida.trim());
	}

	public void testMontaSqlStringStringString1() {
		String salida = "";
		salida = MontadorSQL.montaSql(NOMBRE_VARIABLE, VALOR_STRING, CARACTER);
		salida += MontadorSQL.montaSql(NOMBRE_VARIABLE1, VALOR_STRING, CARACTER1);
		assertEquals(SALIDA6.trim(), salida.trim());
	}

	public void testMontaSqlStringDoubleString() {
		String salida = "";
		salida = MontadorSQL.montaSql(NOMBRE_VARIABLE, VALOR_STRING, NOMBRE_VARIABLE1, VALOR_DOUBLE, CARACTER);
		assertEquals(SALIDA5.trim(), salida.trim());
	}

	public void testAddSalidaStringIntString() {
		String salida = "";
		salida = MontadorSQL.montaSql(NOMBRE_VARIABLE, VALOR_INT, CARACTER1);
		assertEquals(SALIDA1.trim(), salida.trim());
	}

	public void testAddSalidaStringDoubleString() {
		String salida = "";
		salida = MontadorSQL.addSalida(NOMBRE_VARIABLE, VALOR_DOUBLE, CARACTER1);
		assertEquals(SALIDA2.trim(), salida.trim());
	}

	public void testAddSalidaStringLongString() {
		String salida = "";
		salida = MontadorSQL.addSalida(NOMBRE_VARIABLE, VALOR_LONG, CARACTER1);
		assertEquals(SALIDA3.trim(), salida.trim());
	}

}
