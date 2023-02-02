package barajaDeCartas;

public class MainBaraja {

	public static void main(String[] args) {
		Paquete paquete = new Paquete();

		Jugador jugador = new Jugador();
		jugador.setNombre("Raul");
		jugador.setEdad(30);

		paquete.repartirCartasJugador(jugador);

	}

}
