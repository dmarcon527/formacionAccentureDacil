package rf.ficheros.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.ficheros.modelos.Country;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class OracleJDBC {
	private static Connection conn;
	public final static String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static String URL = "jdbc:oracle:thin:@95.17.8.252:1521:xe";
	public static String DATABASE = "";
	public static String USUARIO = "hr";
	public static String PASSWORD = "hr";
	public final static String SQL_LEER_TODOS = "select * from employees";;

	/**
	 * Conectamos con la BBDD, realizamos consulta SQL y mostramos
	 * 
	 * @param args
	 * @throws SQLException
	 */
	public static Connection abrir() throws SQLException {

		System.out.println("--------- Conectar----------");

		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("Ehere is your driver?");
			e.printStackTrace();
			return null;
		}
		System.out.println("Oracle JDBC Driver registered");

		conn = null;
		try {
			conn = DriverManager.getConnection(URL + DATABASE, USUARIO, PASSWORD);
		} catch (SQLException e) {
			System.out.println("Connection Failed!");
			e.printStackTrace();
			return null;
		}
		conn.setAutoCommit(false);
		return conn;

	}

	public void cerrar() throws SQLException {

		if (conn != null) {
			System.out.println("Conectado");
			conn.rollback();
			conn.close();
		} else {
			System.out.println("No conectado ");
		}
	}

	public static void lecturaEmployee() throws SQLException {
		ResultSet rs = null;
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(SQL_LEER_TODOS);

			while (rs.next()) {
				System.out.println(rs.getString("First_name"));
			}
		} catch (SQLException e) {
			System.err.println(SQL_LEER_TODOS + " " + e.getMessage());
		} finally {
			if (rs != null) {
				rs.close();
			}
		}
	}

}
