package es.rf.curso.base;

import java.time.LocalTime;

public class Enlace {

	public String url;
	public LocalTime hora;
	public int indice;
	static int contador = 0;

	Enlace() {
		indice = contador++;
	}

	public void modificacion() {
		System.out.println(this);

	}

	@Override
	public String toString() {
		return "Enlace [url=" + url + ", hora=" + hora + ", indice=" + indice + "]";
	}

}
