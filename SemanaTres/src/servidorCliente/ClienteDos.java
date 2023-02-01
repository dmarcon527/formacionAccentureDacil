package servidorCliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClienteDos {



	public static void main(String[] args) throws IOException {
		try {
			String serverName ="recursosformacion.com"; 
			int port = 443; 
			
			System.out.println("Conectando a " + serverName + " por puerto " + port);
			Socket client = new Socket(serverName, port);

			System.out.println("Conectado a " + client.getRemoteSocketAddress());
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);
			out.writeUTF("Saluditos desde " + client.getLocalSocketAddress());

			InputStream inFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			int lectura = in.read(); 
			while(lectura!=-1) {
				System.out.println(lectura);
				lectura= in.read(); 
			}
			

			client.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
