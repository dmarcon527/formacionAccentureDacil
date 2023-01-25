package clases;

import java.time.LocalDate;

import excepciones.LongitudTexto;
import utils.Filtros;

public abstract class Tarjeta {

	protected Cuenta mCuentaAsociada;
	protected LocalDate mFechaDeCaducidad;
	protected String mNumero;
	protected String mTitular;

	public Tarjeta(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) {
		boolean textoCorrecto = Filtros.longitudTexto(mTitular);
		if (textoCorrecto = true) {
			this.mFechaDeCaducidad = mFechaDeCaducidad;
			this.mNumero = mNumero;
			this.mTitular = mTitular;
		} else {
			throw new LongitudTexto();
		}
	}

	public abstract double getSaldo();

	public abstract void ingresar(double x) throws Exception;

	public abstract void pagoEnEstablecimiento(String datos, double x) throws Exception;

	public abstract void retirar(double x) throws Exception;

	public Cuenta getmCuentaAsociada() {
		return mCuentaAsociada;
	}

	public void setmCuentaAsociada(Cuenta mCuentaAsociada) {
		this.mCuentaAsociada = mCuentaAsociada;
	}

	@Override
	public String toString() {
		return "Tarjeta [mCuentaAsociada=" + mCuentaAsociada + ", mFechaDeCaducidad=" + mFechaDeCaducidad + ", mNumero="
				+ mNumero + ", mTitular=" + mTitular + "]";
	}

}
