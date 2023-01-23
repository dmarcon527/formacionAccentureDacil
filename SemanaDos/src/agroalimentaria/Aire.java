package agroalimentaria;

public class Aire extends Congelados {

	private double nitrogeno;
	private double oxigeno;
	private double dioCarb;
	private double vaporAgua;

	public Aire(String tipoProducto, String fechaCad, int tempCong, String tipoCongelacion,
			double nitrogeno, double oxigeno, double dioCarb, double vaporAgua) {
		super(tipoProducto, fechaCad, tempCong, tipoCongelacion);
		setNitrogeno(nitrogeno);
		setOxigeno(oxigeno);
		setDioCarb(dioCarb);
		setVaporAgua(vaporAgua);
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
		return super.toString() + "\nAire [nitrogeno=" + nitrogeno + ", oxigeno=" + oxigeno + ", dioCarb=" + dioCarb
				+ ", vaporAgua=" + vaporAgua + "]";
	}

}
