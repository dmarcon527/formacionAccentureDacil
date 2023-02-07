package es.rf.tienda.dominio;

import java.time.LocalDate;

import es.rf.tienda.util.Validator;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public class Producto {

	private static final double MIN = 0;
	private static final int MIN_LONG = 5;
	private static final int MIN_LONG1 = 0;
	private static final int MIN_LONG2 = 1;
	private static final int MAX_LONG = 10;
	private static final int MAX_LONG1 = 100;
	private static final int MAX_LONG2 = 101;
	private static final int MAX_LONG3 = 2000;
	private static final LocalDate FECHA_ACTUAL = LocalDate.now();

	private String id_producto;
	private String pro_descripcion;
	private String pro_desLarga;
	private double pro_precio;
	private int pro_stock;
	private LocalDate pro_fecRepos;
	private LocalDate pro_fecActi;
	private LocalDate pro_fecDesacti;
	private String pro_uniVenta;
	private double pro_cantXUniVenta;
	private String pro_uniUltNivel;
	private int id_pais;
	private String pro_usoRecomendado;
	private int id_categoria;
	private int pro_stkReservado;
	private int pro_nStkAlto;
	private int pro_nStkBajo;
	private char pro_stat;

	public Producto() {

	}

	/**
	 * Comprobamos que los campos obligatorios no estén vacios
	 * 
	 * @return
	 */
	public boolean isValid() {
		return !Validator.isVacio(id_producto) && !Validator.isVacio(pro_descripcion) && pro_precio > MIN
				&& !Validator.isVacio(pro_uniVenta) && id_categoria > MIN && id_pais > MIN;
	}

	public String getId_producto() {
		return id_producto;
	}

	public void setId_producto(String id_producto) {
		boolean longitud = Validator.cumpleLongitud(id_producto, MIN_LONG, MIN_LONG);
		boolean alfaNumeric = Validator.isAlfanumeric(id_producto);
		if (longitud == true && alfaNumeric == true) {
			this.id_producto = id_producto.toUpperCase();
		}
	}

	public String getPro_descripcion() {
		return pro_descripcion;
	}

	public void setPro_descripcion(String pro_descripcion) {
		boolean longitud = Validator.cumpleLongitud(pro_descripcion, MIN_LONG, MAX_LONG1);
		boolean alfaNumeric = Validator.isAlfanumeric(pro_descripcion);
		if (longitud == true && alfaNumeric == true) {
			this.pro_descripcion = pro_descripcion;
		}
	}

	public String getPro_desLarga() {
		return pro_desLarga;
	}

	public void setPro_desLarga(String pro_desLarga) {
		boolean longitud = Validator.cumpleLongitud(pro_desLarga, MIN_LONG, MAX_LONG3);
		boolean alfaNumeric = Validator.isAlfanumeric(pro_desLarga);
		if (longitud == true && alfaNumeric == true) {
			this.pro_desLarga = pro_desLarga;
		}
	}

	public double getPro_precio() {
		return pro_precio;
	}

	public void setPro_precio(double pro_precio) {
		boolean rango = Validator.cumpleRango(pro_precio, MIN_LONG1, MAX_LONG2);
		if (rango == true) {
			this.pro_precio = pro_precio;
		}
	}

	public int getPro_stock() {
		return pro_stock;
	}

	public void setPro_stock(int pro_stock) {
		this.pro_stock = pro_stock;
	}

	public LocalDate getPro_fecRepos() {
		return pro_fecRepos;
	}

	public void setPro_fecRepos(LocalDate pro_fecRepos) {
		boolean fechaCorrecta = Validator.valDateMax(pro_fecRepos, FECHA_ACTUAL);
		if (fechaCorrecta == true) {
			this.pro_fecRepos = pro_fecRepos;
		}
	}

	public LocalDate getPro_fecActi() {
		return pro_fecActi;
	}

	public void setPro_fecActi(LocalDate pro_fecActi) {
		boolean fechaCorrecta = Validator.valDateMax(pro_fecActi, FECHA_ACTUAL);
		if (fechaCorrecta == true) {
			this.pro_fecActi = pro_fecActi;
		}

	}

	public LocalDate getPro_fecDesacti() {
		return pro_fecDesacti;
	}

	public void setPro_fecDesacti(LocalDate pro_fecDesacti) {
		boolean fechaMax = Validator.valDateMax(pro_fecDesacti, FECHA_ACTUAL);
		boolean fechaMaxAct = false;
		if (pro_fecActi != null) {
			fechaMaxAct = Validator.valDateMax(pro_fecDesacti, pro_fecActi);
		}
		if (fechaMax == true && fechaMaxAct == true) {
			this.pro_fecDesacti = pro_fecDesacti;
		} else if (fechaMax == true) {
			this.pro_fecDesacti = pro_fecDesacti;
		}
	}

	public String getPro_uniVenta() {
		return pro_uniVenta;
	}

	public void setPro_uniVenta(String pro_uniVenta) {
		boolean longitud = Validator.cumpleLongitud(pro_uniVenta, MIN_LONG2, MAX_LONG);
		boolean alfaNumeric = Validator.isAlfanumeric(pro_uniVenta);
		if (longitud == true && alfaNumeric == true) {
			this.pro_uniVenta = pro_uniVenta;
		}
	}

	public double getPro_cantXUniVenta() {
		return pro_cantXUniVenta;
	}

	public void setPro_cantXUniVenta(double pro_cantXUniVenta) {
		this.pro_cantXUniVenta = pro_cantXUniVenta;
	}

	public String getPro_uniUltNivel() {
		return pro_uniUltNivel;
	}

	public void setPro_uniUltNivel(String pro_uniUltNivel) {
		boolean alfaNumeric = Validator.isAlfanumeric(pro_uniUltNivel);
		if (alfaNumeric == true) {
			this.pro_uniUltNivel = pro_uniUltNivel;
		}
	}

	public int getId_pais() {
		return id_pais;
	}

	public void setId_pais(int id_pais) {
		this.id_pais = id_pais;
	}

	public String getPro_usoRecomendado() {
		return pro_usoRecomendado;
	}

	public void setPro_usoRecomendado(String pro_usoRecomendado) {
		boolean alfaNumeric = Validator.isAlfanumeric(pro_usoRecomendado);
		boolean longitud = Validator.cumpleLongitud(pro_usoRecomendado, MIN_LONG1, MAX_LONG3);
		if (alfaNumeric == true && longitud == true) {
			this.pro_usoRecomendado = pro_usoRecomendado;
		}
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public int getPro_stkReservado() {
		return pro_stkReservado;
	}

	public void setPro_stkReservado(int pro_stkReservado) {
		this.pro_stkReservado = pro_stkReservado;
	}

	public int getPro_nStkAlto() {
		return pro_nStkAlto;
	}

	public void setPro_nStkAlto(int pro_nStkAlto) {
		this.pro_nStkAlto = pro_nStkAlto;
	}

	public int getPro_nStkBajo() {
		return pro_nStkBajo;
	}

	public void setPro_nStkBajo(int pro_nStkBajo) {
		this.pro_nStkBajo = pro_nStkBajo;
	}

	public char getPro_stat() {
		return pro_stat;
	}

	public void setPro_stat(char pro_stat) {
		boolean alfaNumeric = Validator.isAlfanumeric(pro_stat + "");
		boolean longitud = Validator.cumpleLongitud(pro_stat + "", MIN_LONG2, MIN_LONG2);
		if (alfaNumeric == true && longitud == true) {
			if (pro_stat == 'A' || pro_stat == 'B') {
				this.pro_stat = pro_stat;
			}
		}
	}

	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", pro_descripcion=" + pro_descripcion + ", pro_desLarga="
				+ pro_desLarga + ", pro_precio=" + pro_precio + ", pro_stock=" + pro_stock + ", pro_fecRepos="
				+ pro_fecRepos + ", pro_fecActi=" + pro_fecActi + ", pro_fecDesacti=" + pro_fecDesacti
				+ ", pro_uniVenta=" + pro_uniVenta + ", pro_cantXUniVenta=" + pro_cantXUniVenta + ", pro_uniUltNivel="
				+ pro_uniUltNivel + ", id_pais=" + id_pais + ", pro_usoRecomendado=" + pro_usoRecomendado
				+ ", id_categoria=" + id_categoria + ", pro_stkReservado=" + pro_stkReservado + ", pro_nStkAlto="
				+ pro_nStkAlto + ", pro_nStkBajo=" + pro_nStkBajo + ", pro_stat=" + pro_stat + "]";
	}

}
