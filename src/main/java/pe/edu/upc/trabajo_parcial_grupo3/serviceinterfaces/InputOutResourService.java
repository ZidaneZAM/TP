package pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces;

import pe.edu.upc.trabajo_parcial_grupo3.entities.InputOutputResources;

import java.util.List;

public interface InputOutResourService {
    public void insert (InputOutputResources inputOutputResources);
    public List<InputOutputResources> list();

}
