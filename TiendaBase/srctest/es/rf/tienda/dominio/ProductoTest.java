package es.rf.tienda.dominio;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {
	
	final String ID_PROD = "28022025112";
	static boolean vacio= true; 
	
	Producto producto;

	@BeforeEach
	void creacion() {
		producto = new Producto();
	}

	@Test
	void testSetId_producto() {
		producto.setId_producto(ID_PROD);
		if(producto.getId_producto()!=null) {
			vacio = false; 
		}
		assertFalse(vacio); 
	}

	@Test
	void testSetPro_descripcion() {
	}

	@Test
	void testSetPro_desLarga() {
	}

	@Test
	void testSetPro_precio() {
	}

	@Test
	void testSetPro_stock() {
	}

	@Test
	void testSetPro_fecRepos() {
	}

	@Test
	void testSetPro_fecActi() {
	}

	@Test
	void testSetPro_fecDesacti() {
	}

	@Test
	void testSetPro_uniVenta() {
	}

	@Test
	void testSetPro_cantXUniVenta() {
	}

	@Test
	void testSetPro_uniUltNivel() {
	}

	@Test
	void testSetId_pais() {
	}

	@Test
	void testSetPro_usoRecomendado() {
	}

	@Test
	void testSetId_categoria() {
	}

	@Test
	void testSetPro_stkReservado() {
	}

	@Test
	void testSetPro_nStkAlto() {
	}

	@Test
	void testSetPro_nStkBajo() {
	}

	@Test
	void testSetPro_stat() {
	}

}
