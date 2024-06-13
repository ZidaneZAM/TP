package pe.edu.upc.trabajo_parcial_grupo3.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_parcial_grupo3.entities.EquipmentMaintenance;

import pe.edu.upc.trabajo_parcial_grupo3.repositorio.IEquipMaintenace;

import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IEquipMaintenaceService;

import java.util.List;

@Service
public class EquipMaintenaceimplements implements IEquipMaintenaceService {
    @Autowired
    private IEquipMaintenace rR;

    @Override
    public void insert(EquipmentMaintenance maintenance) {
        rR.save(maintenance);
    }

    @Override
    public List<EquipmentMaintenance> list() {
        return rR.findAll();
    }

}
