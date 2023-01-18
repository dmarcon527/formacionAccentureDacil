package Ejercicio04;

public class Datos {
	
	private int dia = 10; 
	private  int  nDni = 5743322; 
	private double precio;
	private final boolean ACTIVO = true; 
	
	public void cargarPrecio(){
		precio = 135.12;
	}
	

	@Override
	public String toString() {
		return "Dia \t " + dia + "\nDni \t" + nDni + "\nPrecio \t" + precio + "\nActivo\t "+ ACTIVO;
	}


}
