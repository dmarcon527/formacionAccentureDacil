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
		System.out.println("-------------- Leer Todos --------------");
		List<Country> listCon = cc.leerTodos();
		listarCtr(listCon);
		System.out.println("-------------- Leer Uno --------------");
		System.out.println(cc.leerUno("AR"));
		
		System.out.println("-------------- Insertar Country --------------");
		Country country = new Country(); 
		country.setCountry_id("ES");
		country.setCountry_name("España");
		country.setRegion_id("5");


	}

	public static void listarCtr(List<Country> ctr) {
		ctr.stream().forEach(System.out::println);
	}

}
