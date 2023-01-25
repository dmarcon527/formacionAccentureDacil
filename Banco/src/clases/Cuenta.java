package clases;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.parser.Element;

import clases.hijas.Credito;

public class Cuenta {

	private List<Movimiento> mMovimientos = new ArrayList<>();
	private String mNumero;
	private String mTitular;

	public Cuenta(String mNumero, String mTitular) {
		this.mNumero = mNumero;
		this.mTitular = mTitular;
	}

	public void addMovimiento(Movimiento mMovimientos) {
		this.mMovimientos.add(mMovimientos);
	}

	/**
	 * compruebo que el array no esté vacio y voy mirando el importe que introduce
	 * en las diferentes posiciones y lo voy sumando
	 * 
	 * @return
	 */
	public double getSaldo() {
		double saldo = 0;
		int contador = mMovimientos.size();
		double importe = 0;
		if (contador > 0) {
			for (Movimiento moviento : mMovimientos) {
				importe = moviento.getmImporte();
				saldo += importe;
			}

		}
		/**for (Moviento m : mMovimientos) {
			saldo += m.getmImporte();  
		}*/

		return saldo;
	}

	public void ingresar(double x) {
		Movimiento mov = new Movimiento("Ingreso/Retirada en cajero automático", x);
		addMovimiento(mov);
	}

	public void ingresar(String concepto, double x) {
		Movimiento mov = new Movimiento(concepto, x);
		addMovimiento(mov);
	}

	/**
	 * compruebo que no quiera retirar más dinero del que existe y si es menos del
	 * que existe meto el movimiento en el array
	 * 
	 * @param x
	 */
	public void retirar(double x) throws Exception{
		if (x > getSaldo()) {
			throw new Exception("No se puede retirar una cantidad negativa"); 
		} else {
			double negativo = x * -1;
			Movimiento mov = new Movimiento("Retirar dinero", negativo);
			addMovimiento(mov);
		}
	}

	/**
	 * compruebo que no quiera retirar más dinero del que existe y si es menos del
	 * que existe meto el movimiento en el array
	 * 
	 * @param x
	 */
	public void retirar(String concepto, double x) throws Exception{
		if (x > getSaldo()) {
			throw new Exception("No se puede retirar una cantidad negativa"); 
		} else {
			double negativo = x * -1;
			Movimiento mov = new Movimiento(concepto, negativo);
			addMovimiento(mov);
		}
	}

	@Override
	public String toString() {
		return "Cuenta [mMovimientos=" + mMovimientos + ", mNumero=" + mNumero + ", mTitular=" + mTitular + "]";
	}

}
