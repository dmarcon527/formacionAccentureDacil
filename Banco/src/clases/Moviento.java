package clases;

import java.time.LocalDate;

/**
 * 
 * @author Dácil Marco Contreras Sé que la case se tiene que llamar Movimiento
 *         pero cuando me he dado cuenta he intentado hacer un refactor rename
 *         no me ha dejado
 */
public class Moviento {

	private String mConcepto;
	private LocalDate mFecha;
	private double mImporte;

	public Moviento(String mConcepto, double mImporte) {
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
