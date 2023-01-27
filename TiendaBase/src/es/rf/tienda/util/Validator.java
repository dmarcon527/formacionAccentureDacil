package es.rf.tienda.util;

import java.time.LocalDate;
import java.util.regex.Pattern;

/********************************************************************************************
 * NOMBRE: Validator.java
 * 
 * DESCRIPCION: Clase auxiliar para validar los datos que sean introducidos en
 * la aplicaci�n.
 * 
 * @version 30/01/2023
 * @author Miguel Garcia
 * 
 ******************************************************************************************/
public class Validator {

	private static final String ALFANUMERIC_PATTERN = "^[a-zA-Z0-9]*$";

	private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
	/**
	 * Patr�n para validar el email, evitando puntos finales antes de la @ y que
	 * solo contenga car�cteres alfanum�ricos
	 */
	private final static String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+{1,20})*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+{1,20})*(\\.[A-Za-z]{2,5})$";

	/**
	 * Permite verificar que un DNI cumple con el patr�n XX.XXX.XXX-L
	 */
	private final static String DNI_PATTERN = "\\d{2}\\.\\d{3}\\.\\d{3}-[a-zA-Z]";

	/**
	 * Permite validar un tel�fono, el cual debe contener de 10 a 20 d�gitos y donde
	 * los espacios est�n permitidos
	 */
	private final static String PHONE_PATTERN = "[\\d ]{10,20}";

	/**
	 * Orden de las letras con las cuales se comprobar� la validez del DNI
	 */
	private final static String LETRA_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

	/**
	 * Longitud que debe tener todo DNI pasado a la aplicaci�n.
	 */
	private final static int LONGITUD_DNI = 12;

	/*
	 * *****************************************************************************
	 * ********** NOMBRE: isAlfanumeric *
	 * 
	 * DESCRIPCI�N:
	 *//**
		 * Permite verificar que el texto pasado solo contiene caracters alfanum�ricos
		 * 
		 * @param texto String a verificar que solo tenga car�cteres alfanum�ricos
		 * 
		 * @return true, si cumple solo contiene caracters alfanum�ricos. <br>
		 *         false en caso contrario FECHA: Enero 2023
		 * 
		 *         AUTOR: Dácil Marco - Sevilla
		 * 
		 **************************************************************************************/
	public static boolean isAlfanumeric(String texto) {
		boolean alfaNum = Pattern.matches(ALFANUMERIC_PATTERN, texto);
		return alfaNum;
	}

	/*
	 * *****************************************************************************
	 * ********** NOMBRE: cumplePhoneNumber *
	 * 
	 * DESCRIPCI�N:
	 *//**
		 * El phone number debe tener un total de entre 10 y 20, contando d�gitos y
		 * espacios. M�nimo aceptable son 10 d�gitos.
		 * 
		 * @param phoneNumber String con el n�mero de telefono de entre 10 y 20 d�gitos.
		 *                    Puede tener espacios, pero siempre con 10 d�gitos como
		 *                    m�nimo.
		 * 
		 * @return true, si cumple todas las condiciones
		 *
		 *         FECHA: Enero 2023 AUTOR: Dacil Marco
		 * 
		 **************************************************************************************/
	public static boolean cumplePhoneNumber(String phoneNumber) {
		boolean telefono = Pattern.matches(PHONE_PATTERN, phoneNumber);
		return telefono;
	}

	/*
	 * *****************************************************************************
	 * ********** NOMBRE: isEmailValido *
	 * 
	 * DESCRIPCI�N:
	 *//**
		 * Comprueba si el email tiene un formato que pueda ser v�lido.
		 * 
		 * @param email String a comprobar
		 * 
		 * @return true, en caso que el formato sea v�lido FECHA: Enero 2023
		 * 
		 *         AUTOR: Dácil Marco
		 * 
		 **************************************************************************************/
	public static boolean isEmailValido(String email) {
		boolean correo = Pattern.matches(EMAIL_PATTERN, email);
		return correo;
	}

	/*
	 * *****************************************************************************
	 * ********** NOMBRE: cumpleDNI *
	 * 
	 * DESCRIPCI�N:
	 *//**
		 * Esta funci�n verifica que el DNI cumple el siguiente formato: xx.xxx.xxx-L
		 *
		 * El DNI ha de tener longitud 12
		 * 
		 * @param dni String con DNI a ser validado
		 * 
		 * @return true, si el DNI cumple el estandar nacional. FECHA: Enero 2023 AUTOR:
		 *         FECHA: Enero 2023 AUTOR: Dácil Marco
		 * 
		 **************************************************************************************/
	public static boolean cumpleDNI(String dni) {
		boolean dniCorrecto = false;
		boolean DNI = Pattern.matches(DNI_PATTERN, dni);
		if (DNI == true) {
			String punto = ".";
			String guion = "-";
			String numeroDni = "";
			int valor = dni.length();
			valor -= 2;
			for (int i = 0; i <= valor; i++) {
				String res = dni.charAt(i) + "";
				if (punto.equals(res) || guion.equals(res)) {
					// quito los puntos y los guiones para que en el else se quede solo los números
				} else {
					numeroDni += dni.charAt(i) + "";
				}
			}
			int resultado = Integer.parseInt(numeroDni);
			int resto = resultado % 23;

			char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
					'H', 'L', 'C', 'K', 'E', 'T' };
			char letra = letras[resto];
			char res = dni.charAt(11);
			if (letra == res) {
				dniCorrecto = true;
			}

		}

		return dniCorrecto;

	}

	/**
	 * ***************************************************************************************
	 * NOMBRE: cumpleRango *
	 * 
	 * DESCRIPCI�N:
	 */
	/**
	 * Comprueba que un N�mero se necuentra entre 2 valores
	 * 
	 * @param valor       (int)/(double) N�mero a comprobar
	 * @param valorMinimo (int) N�mero valor aceptable
	 * @param valorMaximo (int) M�N�mero valor aceptable
	 * 
	 * @return true si valorMinimo < valor < valorMaximo FECHA: Enero 2023
	 *         AUTOR:Dácil Marco
	 * 
	 **************************************************************************************/
	public static boolean cumpleRango(int valor, int valorMinimo, int valorMaximo) {
		boolean cumpleRango = false;
		if (valorMinimo < valor && valor < valorMaximo) {
			cumpleRango = true;
		}
		return cumpleRango;

	}

	/**
	 * Comprueba que un Número se necuentra entre 2 valores
	 * 
	 * @param valor
	 * @param valorMinimo
	 * @param valorMaximo
	 * @return true si valorMinimo < valor < valorMaximo FECHA: Enero 2023
	 *         AUTOR:Dácil Marco
	 */
	public static boolean cumpleRango(double valor, int valorMinimo, int valorMaximo) {
		boolean cumpleRango = false;
		if (valorMinimo < valor && valor < valorMaximo) {
			cumpleRango = true;
		}
		return cumpleRango;
	}

	/*
	 * *****************************************************************************
	 * ********** NOMBRE: cumpleLongitudMin *
	 * 
	 * DESCRIPCI�N:
	 *//**
		 * Comprobar que el texto pasado tiene una longitud de al menos x caracteres,
		 * siendo x el entero pasado como par�metro
		 * 
		 * @param texto          String texto a comprobar
		 * @param longitudMinima int que indique longitud m�nima.
		 * 
		 * @return cierto, si la longitud del texto es mayor o igual que longitudMinima
		 *         FECHA: Enero 2023 AUTOR: Dácil Marco
		 * 
		 **************************************************************************************/
	public static boolean cumpleLongitudMin(String texto, int longitudMinima) {
		boolean cumpleLongitud = false;
		if (texto.length() >= longitudMinima) {
			cumpleLongitud = true;
		}
		return cumpleLongitud;
	}

	/*
	 * *****************************************************************************
	 * ********** NOMBRE: cumpleLongitudMax *
	 * 
	 * DESCRIPCI�N:
	 *//**
		 * Comprobar que el texto pasado tiene una longitud de, como mucho, x
		 * caracteres, siendo x el entero pasado como par�metro
		 * 
		 * @param texto          String con el texto a comprobar
		 * @param longitudMaxima int con la longitud m�xima del texto
		 * 
		 * @return true, si el texto es menor o igual que la longitud m�xima. FECHA:
		 *         Enero 2023 AUTOR: Dácil Marco
		 * 
		 **************************************************************************************/
	public static boolean cumpleLongitudMax(String texto, int longitudMaxima) {
		boolean cumpleLongitud = false;
		if (texto.length() <= longitudMaxima) {
			cumpleLongitud = true;
		}
		return cumpleLongitud;
	}

	/****************************************************************************************
	 * NOMBRE: cumpleLongitud *
	 * 
	 * DESCRIPCI�N:
	 */
	/**
	 * Comprobar que la longitud de un texto se encuentra entre unos valores m�ximos
	 * y m�nimos
	 * 
	 * @param texto          String con el texto que a validar
	 * @param longitudMinima (int) M�nima longitud del texto
	 * @param longitudMaxima (int) M�xima longitud v�lida para el texo
	 * 
	 * @return true, si la longitud del texto cumple: longitudMinima <=
	 *         longitudTexto <=longitudMaxima FECHA: Enero 2023 
	 *         AUTOR: Dácil Marco
	 *         - Sevilla
	 * 
	 **************************************************************************************/
	public static boolean cumpleLongitud(String texto, int longitudMinima, int longitudMaxima) {
		boolean cumpleLongitud = false;
		if (texto.length() <= longitudMinima && texto.length() <= longitudMaxima ) {
			cumpleLongitud = true;
		}
		return cumpleLongitud;
	}

	/**
	 * Valida una fecha calendar con m�nimo min
	 * 
	 * @param fecha
	 * @param min
	 * @return
	 */

	public static boolean valDateMin(LocalDate fecha, LocalDate min) {
		
		return  true; 
	}

	/**
	 * Valida una fecha calendar con m�ximo max
	 * 
	 * @param fecha
	 * @param max
	 * @return
	 */
	public static boolean valDateMax(LocalDate fecha, LocalDate max) {
		return true;

	}

	/**
	 * esFechaValida Recibe una string con formato fecha dd/mm/aaaa y comprueba el
	 * formato
	 * 
	 * @param fecha
	 * @return
	 */
	public static boolean esFechaValida(String fecha) {
		return true;

	}

	/**
	 * Nombre esPasswordValida Descripcion Comprueba que la cadena recibida cumpla
	 * con lasnormas de contrase�a
	 * 
	 * @param password string con la contrase�a introducida
	 * @return true si cumple con las especificaciones
	 */
	public static boolean esPasswordValida(String password) {
		return true;

	}
	/**
	 * Comprueba que una cadena no introducen en null o vacia 
	 * @param prueba
	 * @return
	 * AUTOR: Dácil Marco
	 */
	public static boolean isVacio(String prueba) {
		boolean isVacio= false; 
		if(prueba==null || prueba.isEmpty() ) {
			isVacio = true; 
		}
		return isVacio; 
	}
	
}
