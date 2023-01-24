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
		return getmCuentaAsociada().getSaldo();
	}

	@Override
	public void ingresar(double x) {
		getmCuentaAsociada().ingresar("Ingreso en cuenta asociada (cajero automático)", x);
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
		getmCuentaAsociada().retirar(datos, x);
	}

	@Override
	public void retirar(double x) throws Exception {
		double porcentaje = 0.5 * x;
		if (porcentaje > 3) {
			getmCuentaAsociada().retirar("Retirada en cuenta asociada (cajero automático)", porcentaje);
		} else {
			double aniade = x + 3;
			getmCuentaAsociada().retirar("Retirada en cuenta asociada (cajero automático)", aniade);
		}

	}

	@Override
	public String toString() {
		return "Credito [mCredito=" + mCredito + ", mMovimientos=" + mMovimientos + "]";
	}
	
	

}
