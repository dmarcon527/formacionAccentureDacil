package protocoloHttp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class ConexionURL {

	public static void main(String[] args) {
		try {
			URL url= new URL ("https://recursosformacion.com");
			URLConnection urlcon= url.openConnection(); 
					urlcon.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0"); 
			
					//in = new BufferedReader()
					
			/**InputStream stream = urlcon.getInputStream();
			int i; 
			while((i= stream.read())!=-1) {
				System.out.println(i);
			}*/
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
