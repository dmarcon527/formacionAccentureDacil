package sincronizacion;

import java.security.GeneralSecurityException;

public class MainBuffer {

	static Buffer buf;

	public static void main(String[] args) {
		buf = new Buffer();
		buf.setDisponible(false);

		GeneraNumero generaNum = new GeneraNumero();
		generaNum.setBuf(buf);
		PresentaNumero presentNum = new PresentaNumero();
		presentNum.setBuf(buf);

		Thread tgn = new Thread(generaNum);
		Thread tpn = new Thread(presentNum);
		tgn.start();
		tpn.start();

	}

}
