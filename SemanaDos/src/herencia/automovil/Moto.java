package herencia.automovil;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Moto extends Automovil {
	private int deposito;

	public Moto(int numMarchas, int velocidadMax, int numChasis, int numRuedas, int deposito) {
		super(numMarchas, velocidadMax, numChasis, numRuedas);
		this.deposito = deposito;
	}

	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	@Override
	public String toString() {
		return super.toString() + "Moto [deposito=" + deposito + "]";
	}

}
