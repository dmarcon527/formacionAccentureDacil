package protocoloHttp;

import java.net.HttpURLConnection;
import java.net.URL;

public class ConexionHttp {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://recursosformacion.com/wordpress");
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			huc.addRequestProperty("User-Agent",
					"Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0");

			for (int i = 1; i <= 8; i++) {
				System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
			}
			huc.disconnect();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
