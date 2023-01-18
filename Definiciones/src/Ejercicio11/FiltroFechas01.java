package Ejercicio11;

public class FiltroFechas01 {

	public static void main(String[] args) {
		boolean diaCorrecto= comprobarDia(20); 
		boolean mesCorrecto= comprobarMes(8); 
		boolean anioCorrecto = comprobarAnio(2015); 
		comprobarFecha(diaCorrecto, mesCorrecto,anioCorrecto );
		
		boolean diaCorrect= comprobarDia(5); 
		boolean mesCorrect= comprobarMes(0); 
		boolean anioCorrect = comprobarAnio(2); 
		comprobarFecha(diaCorrect, mesCorrect,anioCorrect); 

	}
	
	public static boolean comprobarDia(int dia) {
		boolean diaCorrecto = false; 
		if(dia>0 && dia <=30) {
			diaCorrecto= true; 
		}else {
			System.err.println("El día está incorrecto");
		}
		
		return diaCorrecto; 
		
	}
	
	public static boolean comprobarMes(int mes) {
		boolean mesCorrecto = false; 
		if(mes>0 && mes <=12) {
			mesCorrecto= true; 
		}else {
			System.err.println("El mes está incorrecto");
		}
		
		return mesCorrecto; 
		
	}
	
	public static boolean comprobarAnio(int anio) {
		boolean anioCorrecto = false; 
		if(anio>0) {
			anioCorrecto= true; 
		}else {
			System.err.println("El año está incorrecto");
		}
		
		return anioCorrecto; 
		
	}
	
	public static void comprobarFecha(boolean diaCorrecto, boolean mesCorrecto, boolean anioCorrecto) {
		if(diaCorrecto== true && mesCorrecto==true && anioCorrecto==true) {
			System.out.println("La fecha introducida es correcta");
		}else {
			System.out.println("La fecha introducida no es correcta");
		}
	}

}
