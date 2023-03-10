package clases.hijas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import clases.Movimiento;
import clases.Tarjeta;

public class Credito extends Tarjeta {

	private double mCredito;
	private List<Movimiento> mMovimientos = new ArrayList<>();

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
	public void ingresar(double x) throws Exception {
		if (x > 0) {
			Movimiento mov = new Movimiento("Ingreso en cuenta asociada (cajero automático)", x);
			mMovimientos.add(mov);
		} else {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}

	}

	public void liquidar(int mes, int anio) {
		Movimiento mov = new Movimiento();
		mov.setmConcepto("Liquidar");

		int contador = mMovimientos.size();
		double total = 0;

		/**
		 * total = mMovimientos.stream() .filter(mov2 ->
		 * mov.getmFecha().getMonthValue()==mes && mov.getmFecha().getYear()==anio)
		 * .map(mov2-> mov.getmImporte()) .reduce(0d, (subtotal, element)->
		 * subtotal+element);
		 * 
		 * mMovimientos = new List<Movimiento>(mMovimientos.stream() .filter(mov2 ->
		 * !(mov.getmFecha().getMonthValue()==mes && mov.getmFecha().getYear()==anio)) .
		 * System.out.println("Total STREAM = "+total);
		 */
		if (contador > 0) {

			for (Iterator iterator = mMovimientos.iterator(); iterator.hasNext();) {

				Movimiento movimiento = (Movimiento) iterator.next();
				if (movimiento.getmFecha().getMonthValue() == mes && movimiento.getmFecha().getYear() == anio) {
					total += movimiento.getmImporte();
					iterator.remove();
				}
			}
			mov.setmImporte(total);
			if (total != 0) {
				mMovimientos.add(mov);
			}

		}

	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		if (x > getSaldo()) {
			throw new Exception("No se puede pagar más de lo que tienes");
		} else {
			double negativo = x * -1;
			Movimiento mov = new Movimiento(datos, negativo);
			mMovimientos.add(mov);
		}
	}

	@Override
	public void retirar(double x) throws Exception {
		if (x > getSaldo()) {
			throw new Exception("No se puede retirar una cantidad negativa");
		} else {
			double negativo = x * -1;
			Movimiento mov = new Movimiento("Retirar dinero", negativo);
			mMovimientos.add(mov);

		}

	}

	@Override
	public String toString() {
		return super.toString() + "\nCredito [mCredito=" + mCredito + ", mMovimientos=" + mMovimientos + "]";
	}

}
