package rf.curso.S4_MiniApi2;

import java.util.List;

import rf.curso.S4_MiniApi2.controller.CountryController;
import rf.curso.S4_MiniApi2.modelos.Country;

public class App {
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
		country.setRegion_id(5);
		cc.actualizar(country);
		System.out.println("Se ha insertado en la base de datos");

	}

	public static void listarCtr(List<Country> ctr) {
		ctr.stream().forEach(System.out::println);
	}
}
