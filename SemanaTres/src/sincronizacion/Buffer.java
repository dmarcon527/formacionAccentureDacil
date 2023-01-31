package sincronizacion;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Buffer {
	private boolean disponible;
	private int numero;

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	/**
	 * si el número no está disponible espero y si lo está lo muestro
	 * 
	 * @return
	 */
	public synchronized int getNumero() {
		while (!this.isDisponible()) {
			System.out.println("Esperando número");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// lo pongo en false y lo notifico
		setDisponible(false);
		this.notifyAll();
		return numero;

	}

	/**
	 * Si el número está disponible espero y si no está lo genero
	 * 
	 * @param numero
	 */
	public synchronized void setNumero(int numero) {
		while (isDisponible()) {
			// si el número está disponible espero
			System.out.println("Esperando espacio...");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// lo pongo a disponible y aviso
		this.numero = numero;
		setDisponible(true);
		notifyAll();
	}

}
