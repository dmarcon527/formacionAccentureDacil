package stream;

import java.util.stream.IntStream;

public class Range {
/**
 * Genera un String con números 
 * @param args
 */
	public static void main(String[] args) {
		IntStream numeros = IntStream.range(1, 20); 
		numeros.forEach(System.out::println); 

	}

}
