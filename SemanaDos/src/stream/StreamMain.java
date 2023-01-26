package stream;

import java.util.Arrays;

public class StreamMain {

	public static void main(String[] args) {
	
		int [] numeros = new int [] {1,2,3,4,5,6,7,8,9}; 
		
		int [] numPar = Arrays.stream(numeros)
				.filter(par -> par % 2 == 0)
				.toArray(); 
		
		Arrays.stream(numPar).forEach(System.out:: println);
		
	}

}
