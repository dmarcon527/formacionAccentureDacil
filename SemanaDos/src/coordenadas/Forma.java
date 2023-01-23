package coordenadas;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Forma {

	Punto puntOrigen;

	public Punto getPuntOrigen() {
		return puntOrigen;
	}

	public void setPuntOrigen(Punto puntOrigen) {
		this.puntOrigen = puntOrigen;
	}

	@Override
	public String toString() {
		return "Forma [  puntOrigen=" + puntOrigen + "]";
	}

}
