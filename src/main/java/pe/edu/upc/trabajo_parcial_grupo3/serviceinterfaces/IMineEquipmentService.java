package pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces;

import pe.edu.upc.trabajo_parcial_grupo3.entities.MineEquipment;

import java.util.List;

public interface IMineEquipmentService {
    public void insert(MineEquipment mineEquipment);
    public List<MineEquipment> list();
}
