package es.rf.tienda.exception;

@SuppressWarnings("serial")
public class DAOException extends Exception {

	public DAOException() {
		
	}
	
	public DAOException(String msj) {
		System.out.println(msj);
		//super("DAO: "+msj); 
	}
	
}
