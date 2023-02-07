package rf.curso.S4_MiniApi2.controller;

import java.sql.SQLException;
import java.util.List;

import rf.curso.S4_MiniApi2.dao.CountryDao2;
import rf.curso.S4_MiniApi2.modelos.Country;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class CountryController {

	CountryDao2 cDao;

	public CountryController() throws SQLException {
		cDao = new CountryDao2();
	}

	public Country leerUno(String country_id) throws Exception {
		return cDao.buscar(country_id);
	}

	public List<Country> leerTodos() throws Exception {
		return cDao.obtenerCountry();
	}

	public void actualizar(Country country) throws Exception {
		cDao.editar(country);
	}

	public void borrar(Country country) throws Exception {
		cDao.eliminar(country);

	}

	public void borrar(String country_id) throws Exception {
		cDao.eliminar(country_id);

	}

}
