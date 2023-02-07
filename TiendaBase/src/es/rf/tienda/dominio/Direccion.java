package es.rf.tienda.dominio;

import es.rf.tienda.util.Validator;

public class Direccion {

	private String dir_nombre;
	private String dir_direccion;
	private String dir_poblacion;
	private String dir_cPostal;
	private String dir_provincia;
	private String dir_pais;
	private String dir_correoE;

	public Direccion() {

	}

	public String getDir_nombre() {
		return dir_nombre;
	}

	public void setDir_nombre(String dir_nombre) {
		boolean isAlfaNum = Validator.isAlfanumeric(dir_nombre);
		if (isAlfaNum == true) {
			this.dir_nombre = dir_nombre;
		}
	}

	public String getDir_direccion() {
		return dir_direccion;
	}

	public void setDir_direccion(String dir_direccion) {
		boolean isAlfaNum = Validator.isAlfanumeric(dir_direccion);
		if (isAlfaNum == true) {
			this.dir_direccion = dir_direccion;
		}
	}

	public String getDir_poblacion() {
		return dir_poblacion;
	}

	public void setDir_poblacion(String dir_poblacion) {
		boolean isAlfaNum = Validator.isAlfanumeric(dir_poblacion);
		if (isAlfaNum == true) {
			this.dir_poblacion = dir_poblacion;
		}
	}

	public String getDir_cPostal() {
		return dir_cPostal;
	}

	public void setDir_cPostal(String dir_cPostal) {
		boolean isAlfaNum = Validator.isAlfanumeric(dir_cPostal);
		if (isAlfaNum == true) {
			this.dir_cPostal = dir_cPostal;
		}
	}

	public String getDir_provincia() {
		return dir_provincia;
	}

	public void setDir_provincia(String dir_provincia) {
		boolean isAlfaNum = Validator.isAlfanumeric(dir_provincia);
		if (isAlfaNum == true) {
			this.dir_provincia = dir_provincia;
		}
	}

	public String getDir_pais() {
		return dir_pais;
	}

	public void setDir_pais(String dir_pais) {
		boolean isAlfaNum = Validator.isAlfanumeric(dir_pais);
		if (isAlfaNum == true) {
			this.dir_pais = dir_pais;
		}
	}

	public String getDir_correoE() {
		return dir_correoE;
	}

	public void setDir_correoE(String dir_correoE) {
		boolean isAlfaNum = Validator.isAlfanumeric(dir_correoE);
		if (isAlfaNum == true) {
			this.dir_correoE = dir_correoE;
		}
	}

	@Override
	public String toString() {
		return "Direccion [dir_nombre=" + dir_nombre + ", dir_direccion=" + dir_direccion + ", dir_poblacion="
				+ dir_poblacion + ", dir_cPostal=" + dir_cPostal + ", dir_provincia=" + dir_provincia + ", dir_pais="
				+ dir_pais + ", dir_correoE=" + dir_correoE + "]";
	}

}
