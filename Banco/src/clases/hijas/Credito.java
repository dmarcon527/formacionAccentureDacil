package clases.hijas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import clases.Moviento;
import clases.Tarjeta;

public class Credito extends Tarjeta {

	private double mCredito;
	private List<Moviento> mMovimientos = new ArrayList<>();

	public Credito(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) {
		super(mFechaDeCaducidad, mNumero, mTitular);
	}

	public double getmCredito() {
		return mCredito;
	}

	public void setmCredito(double mCredito) {
		this.mCredito = mCredito;
	}

	public double crditoDisponible() {
		return getmCredito();
	}

	@Override
	public double getSaldo() {
		return crditoDisponible();
	}

	@Override
	public void ingresar(double x) {
		Moviento mov = new Moviento("Ingreso en cuenta asociada (cajero automático)", x);
		addMovimiento(mov);
	}

	public void liquidar(int mes, int anio) {
		int contador = mMovimientos.size();
		double total = 0;
		if (contador > 0) {

			for (Iterator iterator = mMovimientos.iterator(); iterator.hasNext();) {
				Moviento movimiento = (Moviento) iterator.next();
				if (movimiento.getmFecha().getMonthValue() == mes && movimiento.getmFecha().getYear() == anio) {
					total += movimiento.getmImporte();
					iterator.remove();
					addMovimiento(movimiento);
				}
			}
			/**
			 * double importe = 0; int i=0; for (Moviento moviento : mMovimientos) { if
			 * (moviento.getmFecha().getMonthValue() == mes &&
			 * moviento.getmFecha().getYear() == anio) { importe = moviento.getmImporte();
			 * total += importe; mMovimientos.remove(i); i++; }else { i++; }
			 * 
			 * }
			 */

		}

	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		if (x > getSaldo()) {
			throw new Exception("No se puede retirar una cantidad negativa"); 
		} else {
			double negativo = x * -1;
			Moviento mov = new Moviento(datos, negativo);
			addMovimiento(mov);
		}
	}

	@Override
	public void retirar(double x) throws Exception {	
		if (x > getSaldo()) {
			throw new Exception("No se puede retirar una cantidad negativa"); 
		} else {
			double negativo = x * -1;
			Moviento mov = new Moviento("Retirar dinero", negativo);
			addMovimiento(mov);
		}

	}
	public void addMovimiento(Moviento mMovimientos) {
		this.mMovimientos.add(mMovimientos);
	}

	@Override
	public String toString() {
		return super.toString()+"\nCredito [mCredito=" + mCredito + ", mMovimientos=" + mMovimientos + "]";
	}
	
	

}
