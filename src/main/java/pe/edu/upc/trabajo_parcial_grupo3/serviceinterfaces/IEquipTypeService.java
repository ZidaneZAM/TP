package pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces;

import pe.edu.upc.trabajo_parcial_grupo3.entities.EquipmentType;

import java.util.List;

public interface IEquipTypeService {
    public void insert(EquipmentType type);
    public List<EquipmentType> list();
}
