package utils;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Iterator;

//import excepciones.LongitudTexto;

/**
 * 
 * @author Dácil Marco Contreras
 * 
 * 
 */

public class Filtros {

	final static int TEXTO_MIN = 15;
	final static int TEXTO_MAX = 30;

	/**
	 * Comprueba la longuitud del texto si cumple la condición devuelve true y si no
	 * false
	 * 
	 * @param texto cadena de caracteres
	 * @param max   máximo de caracteres
	 * @param min   minimo de caracteres
	 * @return
	 */
	public static boolean longitudTexto(String texto) {
		boolean textoCorrecto = false;
		if (texto.length() >= TEXTO_MIN && texto.length() <= TEXTO_MAX) {
			textoCorrecto = true;
		} else {
			textoCorrecto = false;
			// throw new LongitudTexto();
		}
		return textoCorrecto;
	}

	/**
	 * concepto textos ingreso y gasto >10 y <100
	 * 
	 * @param ingreso
	 * @param gasto
	 * @param min
	 * @param max
	 * @return
	 */
	public static boolean ingresosGastos(double ingreso, int gasto, int min, int max) {
		boolean textoCorrecto = false;
		if (ingreso >= min && ingreso <= max) {
			if (gasto >= min && gasto <= max) {
				textoCorrecto = true;
			}

		}
		return textoCorrecto;
	}

	/**
	 * Fecha vencimiento>3 y <5años
	 * 
	 * @param fecha
	 * @param fechMin
	 * @param fechMax
	 * @return
	 */
	public static boolean fechaVencimiento(LocalDate fecha, LocalDate fechMin, LocalDate fechMax) {
		boolean fechaCorrecta = false;
		LocalDate min = fechMin.plusYears(3);
		LocalDate max = fechMax.plusYears(5);
		if (fecha.getYear() > min.getYear() && fecha.getYear() < max.getYear()) {
			fechaCorrecta = true;
		}
		return fechaCorrecta;
	}

	public static boolean fechaCorrecta(String fecha) {
		boolean fechaCorrecta = false;
		if (fecha != null) {
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate fecha2 = LocalDate.parse(fecha, formato);
			fechaCorrecta = true;
		}
		return fechaCorrecta;

	}

}
