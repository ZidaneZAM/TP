package pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces;

import pe.edu.upc.trabajo_parcial_grupo3.entities.Employee;

import java.util.List;

public interface IEmployeService {
    public void insert(Employee employee);
    public List<Employee> list();
    public void delete(Long idEmploye);

    public Employee listarId(Long idRol);


}
