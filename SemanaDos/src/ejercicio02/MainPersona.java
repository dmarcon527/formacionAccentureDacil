package ejercicio02;

/**
 * 
 * @author Dácil Marco.contreras
 *
 */
public class MainPersona {
	/**
	 * Creamos una instancia de Cliente y Usuario
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Cliente cl = new Cliente();
		Usuario usu = new Usuario();

		System.out.println("Creamos desde cliente 1");
		cl.crear();
		cl.borrar();
		cl.enviarMensaje();
		cl.verFechaAlta();
		System.out.println(cl.mensajeAbstract());
		System.out.println(cl.toString());

		System.out.println("----------------");

		System.out.println("Creamos desde usuario 1");
		usu.borrar();
		usu.enviarMensaje();
		usu.autorizar();
		usu.crear();
		System.out.println(usu.mensajeAbstract());
		System.out.println(usu.toString());

	}

}
