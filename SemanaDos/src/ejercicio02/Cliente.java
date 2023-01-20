package ejercicio02;

import java.time.LocalDate;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Cliente extends Persona {

	private int numeroCliente;
	private LocalDate fechaAlta;

	/**
	 * Creo un constructor con valores ya inicializados
	 */
	Cliente() {
		super();
		setFechaAlta();
		setNumeroCliente(147);
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta() {
		this.fechaAlta = LocalDate.now();
	}

	public void verFechaAlta() {
		System.out.println("Fecha de alta " + getFechaAlta());
	}

	@Override
	String mensajeAbstract() {
		return "Cliente " + getFechaAlta() + getNumeroCliente();
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Cliente [numeroCliente=" + numeroCliente + ", fechaAlta=" + fechaAlta + "]";
	}

}
