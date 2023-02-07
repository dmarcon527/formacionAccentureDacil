package es.rf.tienda.dominio;

import java.time.LocalDate;

import es.rf.tienda.util.Validator;

public class Usuario {

	private static final int MIN = 0;
	private static final int MIN_LONG = 5;
	private static final int MIN_LONG1 = 6;
	private static final int MIN_LONG2 = 8;
	private static final int MAX_LONG = 100;
	private static final int MAX_LONG1 = 20;
	private static final int MAX_LONG2 = 12;
	private static final LocalDate FECHA_ACTUAL = LocalDate.now();

	private int id_usuario;
	private String user_nombre;
	private String user_email;
	private String user_pass;
	private int user_tipo;
	private String user_dni;
	private LocalDate user_fecAlta;
	private LocalDate user_fecConfirmacion;

	public Usuario() {

	}

	/**
	 * Comprobamos que los campos obligatorios no estén vacios
	 * 
	 * @return
	 */
	public boolean isValid() {
		return id_usuario > MIN && !Validator.isVacio(user_pass) && !Validator.isVacio(user_email) && user_tipo > MIN;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUser_nombre() {
		return user_nombre;
	}

	public void setUser_nombre(String user_nombre) {
		boolean alfaNum = Validator.isAlfanumeric(user_nombre);
		boolean cumpleLong = Validator.cumpleLongitud(user_nombre, MIN_LONG, MAX_LONG);
		if (alfaNum == true && cumpleLong == true) {
			this.user_nombre = user_nombre;
		}
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		boolean alfaNum = Validator.isAlfanumeric(user_email);
		boolean cumpleLong = Validator.cumpleLongitud(user_email, MIN_LONG1, MAX_LONG);
		if (alfaNum == true && cumpleLong == true) {
			this.user_email = user_email;
		}
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		boolean alfaNum = Validator.isAlfanumeric(user_pass);
		boolean cumpleLong = Validator.cumpleLongitud(user_pass, MIN_LONG2, MAX_LONG1);
		if (alfaNum == true && cumpleLong == true) {
			this.user_pass = user_pass;
		}
	}

	public int getUser_tipo() {
		return user_tipo;
	}

	public void setUser_tipo(int user_tipo) {
		this.user_tipo = user_tipo;
	}

	public String getUser_dni() {
		return user_dni;
	}

	public void setUser_dni(String user_dni) {
		boolean alfaNum = Validator.isAlfanumeric(user_dni);
		boolean cumpleLong = Validator.cumpleLongitud(user_dni, MAX_LONG2, MAX_LONG2);
		boolean dniCorrecto = Validator.cumpleDNI(user_dni);
		if (alfaNum == true && cumpleLong == true && dniCorrecto == true) {
			this.user_dni = user_dni;
		}
	}

	public LocalDate getUser_fecAlta() {
		return user_fecAlta;
	}

	public void setUser_fecAlta(LocalDate user_fecAlta) {
		boolean fechaCorrecta = Validator.valDateIgual(user_fecAlta, FECHA_ACTUAL);
		if (fechaCorrecta == true) {
			this.user_fecAlta = user_fecAlta;
		}
	}

	public LocalDate getUser_fecConfirmacion() {
		return user_fecConfirmacion;
	}

	public void setUser_fecConfirmacion(LocalDate user_fecConfirmacion) {
		boolean fechaCorrecta = Validator.valDateIgual(user_fecConfirmacion, FECHA_ACTUAL);
		if (fechaCorrecta == true) {
			this.user_fecConfirmacion = user_fecConfirmacion;
		}
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", user_nombre=" + user_nombre + ", user_email=" + user_email
				+ ", user_pass=" + user_pass + ", user_tipo=" + user_tipo + ", user_dni=" + user_dni + ", user_fecAlta="
				+ user_fecAlta + ", user_fecConfirmacion=" + user_fecConfirmacion + "]";
	}

}
