package barajaDeCartas;

import java.util.ArrayList;
import java.util.List;

public class MainBaraja {

	static List<Jugador> partida = new ArrayList<>();

	public static void main(String[] args) {

		Jugador jugador1 = new Jugador();
		jugador1.setNombre("Raul");
		jugador1.setEdad(30);
		partida.add(jugador1);

		Jugador jugador2 = new Jugador();
		jugador2.setNombre("Pepe");
		jugador2.setEdad(28);
		partida.add(jugador2);

		Jugador jugador3 = new Jugador();
		jugador3.setNombre("Rosa");
		jugador3.setEdad(25);
		partida.add(jugador3);

		Jugador jugador4 = new Jugador();
		jugador4.setNombre("Maria");
		jugador4.setEdad(20);
		partida.add(jugador4);

		repartirCartas();
		
		for (Jugador jugadorPart : partida) {
			System.out.println(jugadorPart.toString());
		}

	}

	static void repartirCartas() {
		Paquete paquete = new Paquete();
		int cartasRepartidas = 0;
		while (cartasRepartidas < 5) {
			for (int i = 0; i < partida.size(); i++) {
				paquete.repartirCartasJugador(partida.get(i));
				
			}
			cartasRepartidas++;
		}
	}

}
