package pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces;

import pe.edu.upc.trabajo_parcial_grupo3.entities.EquimentRegistry;

import java.util.List;

public interface IEquipRegisterService {
    public void insert(EquimentRegistry registry);
    public List<EquimentRegistry> list();
}
