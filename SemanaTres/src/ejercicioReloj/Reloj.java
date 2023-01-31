package ejercicioReloj;

public class Reloj {

	public static void main(String[] args) throws InterruptedException {
		int hora =0;   
		int minutos=0; 
		int segundos=0; 
		int limite=59; 
		
		for (int i=0; i<=limite; i++){
			if(segundos<limite) {
				segundos++; 
					
			}else if(minutos<limite) {
					minutos++; 
				}else {
					hora++; 
					minutos=0;
					i=0; 
				}
				//if(i==limite) {
				//	i=0; 
				//	segundos=0; 
				//}
				if(i<9) {
					System.out.println("0"+hora+":0"+minutos+":0"+segundos);
				}else {
					System.out.println(hora+":"+minutos+":"+segundos);
				}
			
				Thread.sleep(10);
		//Thread.sleep(1000); 

		}
	}
}

