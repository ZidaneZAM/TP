package pe.edu.upc.trabajo_parcial_grupo3.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.trabajo_parcial_grupo3.entities.EmployeeContactDetails;
import pe.edu.upc.trabajo_parcial_grupo3.entities.Mine;
import pe.edu.upc.trabajo_parcial_grupo3.repositorio.IEmploContactDetails;
import pe.edu.upc.trabajo_parcial_grupo3.repositorio.IMine;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IEmploContactDetailsService;


import java.util.List;

@Service
public class EmploContactDetailsimplements implements IEmploContactDetailsService {
    @Autowired
    private IEmploContactDetails rR;

    @Override
    public void insert(EmployeeContactDetails contactDetails) {
        rR.save(contactDetails);
    }

    @Override
    public List<EmployeeContactDetails> list() {
        return rR.findAll();
    }

}
