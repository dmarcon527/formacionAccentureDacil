package agroalimentaria;

public class Aire extends Congelados {
	private double nitrogeno;
	private double oxigeno;
	private double dioCarb;
	private double vaporAgua;

	/**
	 * Inicializo los datos
	 */
	Aire() {
		super("Aire");
		setNitrogeno(0.22);
		setOxigeno(0.1);
		setDioCarb(0.02);
		setVaporAgua(1.0);
	}

	public double getNitrogeno() {
		return nitrogeno;
	}

	public void setNitrogeno(double nitrogeno) {
		this.nitrogeno = nitrogeno;
	}

	public double getOxigeno() {
		return oxigeno;
	}

	public void setOxigeno(double oxigeno) {
		this.oxigeno = oxigeno;
	}

	public double getDioCarb() {
		return dioCarb;
	}

	public void setDioCarb(double dioCarb) {
		this.dioCarb = dioCarb;
	}

	public double getVaporAgua() {
		return vaporAgua;
	}

	public void setVaporAgua(double vaporAgua) {
		this.vaporAgua = vaporAgua;
	}

	@Override
	public String toString() {
		String msjPadre = super.toString();
		return msjPadre + "\nAire [nitrogeno=" + nitrogeno + ", oxigeno=" + oxigeno + ", dioCarb=" + dioCarb
				+ ", vaporAgua=" + vaporAgua + "]";
	}

}
