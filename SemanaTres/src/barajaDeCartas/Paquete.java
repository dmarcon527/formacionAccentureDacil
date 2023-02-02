package barajaDeCartas;

import java.util.HashSet;
import java.util.Set;

public class Paquete {

	private Set<Carta> baraja = new HashSet<>();
	private static final String[] PALOS = { "Diamantes", "Corazones", "Picas", "Trebol" };

	public Paquete() {
		cargarBaraja();
	}

	public Set<Carta> getBaraja() {
		return baraja;
	}

	/**
	 * creo una instancia de cartas recorro las posiciones de el Array de Palos y le
	 * asigno el número y el palo a la carta y la añado a la baraja
	 */
	public void cargarBaraja() {
		for (String palo : PALOS) {
			for (int i = 1; i <= 13; i++) {
				Carta carta = new Carta();
				carta.setNumero(i);
				carta.setPalo(palo);
				baraja.add(carta);
				System.out.println(carta.toString());
			}
		}
	}

	/**
	 * le asigno cartas a un jugador
	 * 
	 * @param jugador
	 */
	public void repartirCartasJugador(Jugador jugador) {
		int contador = 0;
		for (Carta carta : baraja) {
			if (contador < 5) {
				Carta cartaJugador = new Carta();
				cartaJugador.setNumero(carta.getNumero());
				cartaJugador.setPalo(carta.getPalo());
				jugador.recibirCarta(cartaJugador);
				contador++;
			}
		}
		System.out.println(jugador.toString());

	}
}
