package rf.ficheros.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.ficheros.modelos.Country;
import rf.ficheros.util.OracleJDBC;

/**
 * 
 * @author Dácil Marco Contreras
 *
 *         Se encarga de conectar con la bbdd
 */
public class CountryDao implements CountryDaoI {

	private Connection conn;

	private final static String SQL_LEER_TODOS_COUNTRY = "select * from countries";
	private final static String SQL_LEER_COUNTRY_POR_ID = "select * from countries where country_id=";
	private final static String SQL_LEER_COUNTRY_POR_ID2 = "select * from countries where country_id= ?";
	private final static String SQL_UPDATE_COUNTRY = "UPDATE countries set country_name= ?  where country_id= ?";
	private final static String SQL_DELETE_COUNTRY = "Delete countries where country_id= ?";
	private final static String SQL_INSERT_COUNTRY ="Insert into countries (country_id, country_name, region_id ) values (?, ?, ?)"; 
	
	/**
	 * Creamos la conexion a la bbdd
	 * 
	 * @throws SQLException
	 */
	public CountryDao() throws SQLException {
		OracleJDBC oracle = new OracleJDBC();
		conn = oracle.abrir();
	}

	@Override
	public Country leerUno(String country_id) throws Exception {
		ResultSet rs = null;
		try {
			// Statement stm = conn.createStatement();
			// rs = stm.executeQuery(SQL_LEER_COUNTRY_POR_ID + "'" + country_id + "'");

			PreparedStatement ps = conn.prepareStatement(SQL_LEER_COUNTRY_POR_ID2);
			ps.setString(1, country_id);
			rs = ps.executeQuery();

			rs.next();
			return (carga(rs));

		} catch (SQLException e) {
			throw new Exception(SQL_LEER_COUNTRY_POR_ID + " " + e.getMessage());
		}

	}

	/**
	 * si todo va correcto hace la consulta a la bbdd
	 */
	@Override
	public List<Country> leerTodos() throws Exception {

		ResultSet rs = null;
		List<Country> salida = new ArrayList<>();
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(SQL_LEER_TODOS_COUNTRY);

			while (rs.next()) {
				salida.add(carga(rs));
			}

		} catch (SQLException e) {
			throw new Exception(SQL_LEER_TODOS_COUNTRY + " " + e.getMessage());
		} finally {
			if (rs != null) {
				rs.close();
			}

		}
		return salida;

	}

	@Override
	public int actualizar(Country country) throws Exception {
		ResultSet rs = null;
		try {

			PreparedStatement ps = conn.prepareStatement(SQL_UPDATE_COUNTRY);
			ps.setString(1, country.getCountry_name());
			ps.setString(2, country.getCountry_id());
			rs = ps.executeQuery();

			rs.next();
			int total = rs.getRow();
			System.out.println(total+ " fila actualizada.");
			return total;

		} catch (SQLException e) {
			throw new Exception(SQL_UPDATE_COUNTRY + " " + e.getMessage());
		}

	}

	@Override
	public int delete(Country country) throws Exception {
		ResultSet rs = null;
		try {

			PreparedStatement ps = conn.prepareStatement(SQL_DELETE_COUNTRY);
			ps.setString(1, country.getCountry_id());
			rs = ps.executeQuery();

			rs.next();
			int total = rs.getRow();
			System.out.println(total+ " fila eliminada.");
			return total;

		} catch (SQLException e) {
			throw new Exception(SQL_DELETE_COUNTRY + " " + e.getMessage());
		}

	}

	@Override
	public int delete(String country_id) throws Exception {
		ResultSet rs = null;
		try {

			PreparedStatement ps = conn.prepareStatement(SQL_DELETE_COUNTRY);
			ps.setString(1, country_id);
			rs = ps.executeQuery();

			rs.next();
			int total = rs.getRow();
			System.out.println(total+ " fila eliminada.");
			return total;

		} catch (SQLException e) {
			throw new Exception(SQL_DELETE_COUNTRY + " " + e.getMessage());
		}
	}

	@Override
	public Country insert(Country country) throws Exception {
		ResultSet rs = null;
		List<Country> salida = new ArrayList<>();
		try {

			PreparedStatement ps = conn.prepareStatement(SQL_INSERT_COUNTRY);
			ps.setString(1, country.getCountry_id());
			ps.setString(2, country.getCountry_name());
			ps.setString(3, country.getRegion_id());
			rs = ps.executeQuery();

			rs.next();
			while (rs.next()) {
				salida.add(carga(rs));
			}

		} catch (SQLException e) {
			throw new Exception(SQL_DELETE_COUNTRY + " " + e.getMessage());
		}
		return country;

	}

	/**
	 * Crea una nueva instancia de country y lo devuelve
	 * 
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public Country carga(ResultSet rs) throws SQLException {
		Country country = new Country();
		country.setCountry_id(rs.getNString("country_id"));
		country.setCountry_name(rs.getNString("country_name"));
		country.setRegion_id(rs.getNString("region_id"));
		return country;
	}
}
