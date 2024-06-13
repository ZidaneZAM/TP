package pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces;

import pe.edu.upc.trabajo_parcial_grupo3.entities.EmployeeContactDetails;

import java.util.List;

public interface IEmploContactDetailsService {
    public void insert(EmployeeContactDetails employeeContactDetails);
    public List<EmployeeContactDetails> list();
}
