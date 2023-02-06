package rf.ficheros.dao;

import java.util.List;

import fr.ficheros.modelos.Country;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public interface CountryDaoI {

	public Country leerUno(String country_id) throws Exception;

	public List<Country> leerTodos() throws Exception;

	public int actualizar(Country country) throws Exception;

	public int delete(Country country) throws Exception;

	public int delete(String country_id) throws Exception;

	public Country insert(Country country) throws Exception;
}
