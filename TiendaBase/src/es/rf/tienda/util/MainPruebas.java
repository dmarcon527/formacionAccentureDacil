package es.rf.tienda.util;

import java.time.LocalDate;

import es.rf.tienda.dominio.Producto;

public class MainPruebas {

	public static void main(String[] args){
		
		Producto p = new Producto();
		p.setPro_fecActi(LocalDate.of(2024, 3, 1));
		System.out.println(p.getPro_fecActi());
		
		boolean correcto = Validator.isAlfanumeric("ASD 1e"); 
		System.out.println(correcto);
		

	}

}
