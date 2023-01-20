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
	public void crear() {
		super.crear();
	}
	@Override
	public void borrar() {
		super.borrar();
	}
	@Override
	public void enviarMensaje() {
		super.enviarMensaje();
	}

	@Override
	String mensajeAbstract() {
		System.out.println(super.toString());
		return "Cliente " + getFechaAlta() + getNumeroCliente();
	}

}
