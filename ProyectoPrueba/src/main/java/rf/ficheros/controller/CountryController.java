package rf.ficheros.controller;

import java.sql.SQLException;
import java.util.List;

import fr.ficheros.modelos.Country;
import rf.ficheros.dao.CountryDao;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class CountryController {

	private CountryDao cDao;

	public CountryController() throws SQLException {
		cDao = new CountryDao();
	}

	public Country leerUno(String country_id) throws Exception {
		return cDao.leerUno(country_id);
	}

	public List<Country> leerTodos() throws Exception {
		return cDao.leerTodos();
	}

	public int actualizar(Country country) throws Exception {
		return cDao.actualizar(country);
	}

	public int borrar(Country country) throws Exception {
		return cDao.delete(country);

	}

	public int borrar(String country_id) throws Exception {
		return cDao.delete(country_id);

	}

}
