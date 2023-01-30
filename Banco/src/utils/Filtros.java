package utils;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


import excepciones.FechaErronea;

//import excepciones.LongitudTexto;

/**
 * 
 * @author Dácil Marco Contreras
 * 
 * 
 */

public class Filtros {

	/**
	 * Comprueba la longuitud del texto si cumple la condición devuelve true y si no
	 * false
	 * 
	 * @param texto cadena de caracteres
	 * @param max   máximo de caracteres
	 * @param min   minimo de caracteres
	 * @return
	 */
	public static boolean longitudTexto(String texto, int min, int max) {
		boolean textoCorrecto = false;
		if (texto.length() >= min && texto.length() <= max) {
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
		boolean ingresoCorrecto = false;
		if (ingreso >= min && ingreso <= max) {
			if (gasto >= min && gasto <= max) {
				ingresoCorrecto = true;
			}

		}
		return ingresoCorrecto;
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

	/**
	 * 
	 * @param fecha
	 * @param format
	 * @return
	 */
	public static LocalDate fechaCorrecta(String fecha, String format) {
		try {
		 if (format.equals("dd/MM/yyyy")) {
				DateTimeFormatter formato = DateTimeFormatter.ofPattern(format);
				LocalDate fecha2 = LocalDate.parse(fecha, formato);
				return fecha2;
			}
			return null;
		} catch (DateTimeParseException e) {
			throw new FechaErronea();
		}
	}

	public static LocalDate fechaCorrecta(String fecha) {
		return fechaCorrecta(fecha, "dd-MM-yyyy");
	}

}
