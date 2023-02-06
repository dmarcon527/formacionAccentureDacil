package rf.ficheros.dao;

import java.util.List;

import fr.ficheros.modelos.Employees;

/**
 * 
 * @author Dácil Marco Contreras
 *
 */
public interface EmployeesDaoI {

	public Employees leerUno(String employees_id);

	public List<Employees> leerTodos();

	public int actualizar(Employees employees);

	public int delete(Employees employees);

	public int delete(String employees_id);

	public Employees insert(Employees employees);
}
