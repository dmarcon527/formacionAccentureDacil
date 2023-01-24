package clases.hijas;

import java.time.LocalDate;

import clases.Tarjeta;

public class Debito extends Tarjeta {

	public Debito(LocalDate mFechaDeCaducidad, String mNumero, String mTitular) {
		super(mFechaDeCaducidad, mNumero, mTitular);
	}

	@Override
	public double getSaldo() {
		return getmCuentaAsociada().getSaldo();
	}

	@Override
	public void ingresar(double x) {
		getmCuentaAsociada().ingresar(x);
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		getmCuentaAsociada().retirar(datos, x);
	}

	@Override
	public void retirar(double x) throws Exception {
		getmCuentaAsociada().retirar(x);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
