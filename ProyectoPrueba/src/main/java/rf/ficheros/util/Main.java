package rf.ficheros.util;

import java.util.List;

import fr.ficheros.modelos.Country;
import rf.ficheros.controller.CountryController;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		CountryController cc = new CountryController();
		List<Country> listCon = cc.leerTodos();
		listarCtr(listCon);
		System.out.println("--------------");
		System.out.println(cc.leerUno("AR"));

	}

	public static void listarCtr(List<Country> ctr) {
		ctr.stream().forEach(System.out::println);
	}

}
