package pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces;

import pe.edu.upc.trabajo_parcial_grupo3.entities.EquipmentMaintenance;

import java.util.List;

public interface IEquipMaintenaceService {
    public void insert(EquipmentMaintenance equipmentMaintenance);
    public List<EquipmentMaintenance> list();
}
