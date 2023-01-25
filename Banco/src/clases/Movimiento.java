package clases;

import java.time.LocalDate;

/**
 * 
 * @author Dácil Marco Contreras 
 */
public class Movimiento {

	private String mConcepto;
	private LocalDate mFecha;
	private double mImporte;
	
	public Movimiento() {
		this.mFecha = LocalDate.now();
	}

	public Movimiento(String mConcepto, double mImporte) {
		this.mConcepto = mConcepto;
		this.mFecha = LocalDate.now();
		this.mImporte = mImporte;
	}

	public String getmConcepto() {
		return mConcepto;
	}

	public void setmConcepto(String mConcepto) {
		this.mConcepto = mConcepto;
	}

	public LocalDate getmFecha() {
		return mFecha;
	}

	public void setmFecha(LocalDate mFecha) {
		this.mFecha = mFecha;
	}

	public double getmImporte() {
		return mImporte;
	}

	public void setmImporte(double mImporte) {
		this.mImporte = mImporte;
	}

	@Override
	public String toString() {
		return "Moviento [mConcepto=" + mConcepto + ", mFecha=" + mFecha + ", mImporte=" + mImporte + "]\n";
	}

}
