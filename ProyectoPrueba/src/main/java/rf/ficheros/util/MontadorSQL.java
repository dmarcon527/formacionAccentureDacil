package rf.ficheros.util;

public class MontadorSQL {

	public static String montaSql(String nombreCampo, String nombre, String caracterSeparacion) {
		String cadena = nombreCampo + " = " + "'" + nombre + "'" + caracterSeparacion;
		return cadena;
	}

	public static String montaSql(String nombreCampo1, String nombre1, String nombreCampo2, double valor,
			String caracterSeparacion) {
		String cadena = nombreCampo1 + " = " + "'" + nombre1 + "'" + caracterSeparacion + nombreCampo2 + " = " + valor;
		return cadena;
	}

	public static String montaSql(String nombreCampo, int valor, String caracterSeparacion) {
		String cadena = nombreCampo + " = " + valor + caracterSeparacion;
		return cadena;
	}

	public static String addSalida(String nombreCampo, double valor, String caracterSeparacion) {
		String cadena = nombreCampo + " = " + valor + caracterSeparacion;
		return cadena;
	}

	public static String addSalida(String nombreCampo, long valor, String caracterSeparacion) {
		String cadena = nombreCampo + " = " + valor + caracterSeparacion;
		return cadena;
	}

}
