package barajaDeCartas;

import java.util.HashSet;
import java.util.Set;

public class Jugador {

	private String nombre;
	private int edad;
	private Set<Carta> manocartas= new HashSet<>();

	public Jugador() {
		
	}

	public Set<Carta> getBaraja() {
		return manocartas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void recibirCarta(Carta carta) {
		manocartas.add(carta);
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", manocartas=" + manocartas + "]";
	}
	
	

}
