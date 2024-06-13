package pe.edu.upc.trabajo_parcial_grupo3.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_parcial_grupo3.entities.InputOutputResources;

import pe.edu.upc.trabajo_parcial_grupo3.repositorio.IInputOutResour;

import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.InputOutResourService;

import java.util.List;

@Service
public class InputOutResourimplements implements InputOutResourService {
    @Autowired
    private IInputOutResour rR;

    @Override
    public void insert(InputOutputResources inputOutputResources) {
        rR.save(inputOutputResources);
    }

    @Override
    public List<InputOutputResources> list() {
        return rR.findAll();
    }


}
