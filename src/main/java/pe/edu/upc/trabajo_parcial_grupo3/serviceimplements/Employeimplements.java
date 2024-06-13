package pe.edu.upc.trabajo_parcial_grupo3.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_parcial_grupo3.entities.Employee;
import pe.edu.upc.trabajo_parcial_grupo3.repositorio.IEmployee;

import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IEmployeService;

import java.util.List;

@Service
public class Employeimplements implements IEmployeService {

    @Autowired
    private IEmployee rR;

    @Override
    public void insert(Employee employee) {
        rR.save(employee);
    }

    @Override
    public List<Employee> list() {
        return rR.findAll();
    }

    @Override
    public void delete(Long idEmployee) {
        rR.deleteById(idEmployee);
    }

    @Override
    public Employee listarId(Long idRol) {
        return rR.findById(idRol).orElse(new Employee());
    }

}
