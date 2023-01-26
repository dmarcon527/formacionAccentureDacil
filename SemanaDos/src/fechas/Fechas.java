package fechas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Fechas {
	/**
	 * diferentes formas de utilizar fechas
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Instant base = Instant.now();
		// añado 10 segundos
		Instant min = base.plus(10, ChronoUnit.SECONDS);
		long segundos = base.until(min, ChronoUnit.SECONDS);

		System.out.println("base" + base + "\nmas 10 segundos " + min + "\nmas 10 segundos Until " + segundos);

		LocalDate dia1 = LocalDate.of(2023, 1, 5);
		System.out.println("dia 1= " + dia1);
		LocalDate dia2 = LocalDate.of(2023, Month.OCTOBER, 5);
		System.out.println("dia 2= " + dia2);
		Period p = dia1.until(dia2);
		System.out.println("Periodo = " + p);
		long dia = dia1.until(dia2, ChronoUnit.DAYS);
		System.out.println("Crono= " + dia);

		LocalDate hoy = LocalDate.now();
		System.out.println("¿Es bisiesto? " + hoy.isLeapYear());
		System.out.println("Longitud del mes " +hoy.lengthOfMonth());
		System.out.println("Longitud del año " +hoy.lengthOfYear()); 
		System.out.println("suma dia " +hoy.plusDays(1)); 
		
		//System.out.println("Cambio año " +hoy); 
	}

}
