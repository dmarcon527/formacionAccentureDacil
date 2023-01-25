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
	public void ingresar(double x) throws Exception {
		if(x>0) {
				getmCuentaAsociada().ingresar(x);
		}else {
			throw new Exception("No se puede ingresar una cantidad negativa"); 
		}
	
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		if (x > getSaldo()) {
			throw new Exception("No se puede pagar más de lo que tienes");
		} else {
			getmCuentaAsociada().retirar(datos, x);
		}
		
	}

	@Override
	public void retirar(double x) throws Exception {
		if (x > getSaldo()) {
			throw new Exception("No se puede pagar más de lo que tienes");
		} else {
			getmCuentaAsociada().retirar(x);
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
