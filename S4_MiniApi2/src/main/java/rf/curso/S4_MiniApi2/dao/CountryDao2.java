package rf.curso.S4_MiniApi2.dao;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import rf.curso.S4_MiniApi2.modelos.Country;
import rf.curso.S4_MiniApi2.servicios.JPAUtil;

public class CountryDao2 {
	EntityManager manager = JPAUtil.getEntityManager();

	// guardar Categoria
	public void guardar(Country country) {
		manager.getTransaction().begin();
		manager.persist(country);
		manager.getTransaction().commit();
	}

	// editar Categoria
	public void editar(Country country) {
		manager.getTransaction().begin();
		manager.merge(country);
		manager.getTransaction().commit();
	}

	// buscar Categoria
	public Country buscar(String id) {

		Country c = manager.find(Country.class, id);
		return c;
	}

	/// eliminar Categoria
	public void eliminar(String id) {
		Country c = manager.find(Country.class, id);
		manager.getTransaction().begin();
		manager.remove(c);
		manager.getTransaction().commit();
	}

	public void eliminar(Country c) {
		eliminar(c.getCountry_id());
	}

	// obtener todos los Categoria
	public List<Country> obtenerCountry() {
		List<Country> listaCountry = new ArrayList<>();
		Query q = manager.createQuery("SELECT c FROM Categoria c");
		listaCountry = (List<Country>) q.getResultList();
		return listaCountry;
	}
}
