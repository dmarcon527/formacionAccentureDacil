package stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		System.out.println("----Numeros Par----");
	
		int [] numeros = new int [] {1,2,3,4,5,6,7,8,9}; 
		
		int [] numPar = Arrays.stream(numeros)
				.filter(par -> par % 2 == 0)
				.toArray(); 
		
		Arrays.stream(numPar).forEach(System.out:: println);
		System.out.println("----Cuenta numeros par----");
		long contador = Arrays.stream(numeros)
				.filter(s -> s%2==0)
				.count(); 
		System.out.println("Contador = "+contador);
		
		System.out.println("----Genera números ----");
		Stream.iterate(0,  n-> n+1)
		.limit(10)
		.forEach(x -> System.out.println(x));
		
		System.out.println("----Numeros Random----");
		Random rand = new Random(); 

			Stream.generate(()-> rand.nextInt(100))
			.limit(20)
			.forEach(System.out::println); 
		
		
	}

}
