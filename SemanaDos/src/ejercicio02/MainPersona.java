package ejercicio02;

/**
 * 
 * @author Dácil Marco.contreras
 *
 */
public class MainPersona {
	/**
	 * Creamos una instancia de Cliente y Usuario para utilizar los distintos
	 * métodos y comprobar la herencia
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

		System.out.println("----------------\nCreamos desde usuario 1");
		usu.borrar();
		usu.enviarMensaje();
		usu.autorizar();
		usu.crear();
		System.out.println(usu.mensajeAbstract());

		System.out.println("\nCliente Exportación");
		ClienteExportacion ce = new ClienteExportacion("Luis", "Rosa de los vientos", "luis@gmail.com");
		System.out.println(ce.toString());

		System.out.println("-------------\nCliente Nacional");
		ClienteNacional cn = new ClienteNacional();
		System.out.println(cn.toString());

	}

}
