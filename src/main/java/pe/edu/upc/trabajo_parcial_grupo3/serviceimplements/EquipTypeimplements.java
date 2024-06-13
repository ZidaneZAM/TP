package pe.edu.upc.trabajo_parcial_grupo3.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_parcial_grupo3.entities.EquipmentType;
import pe.edu.upc.trabajo_parcial_grupo3.repositorio.IEquipType;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IEquipTypeService;

import java.util.List;

@Service
public class EquipTypeimplements implements IEquipTypeService {

    @Autowired
    private IEquipType rR;

    @Override
    public void insert(EquipmentType type) {
        rR.save(type);
    }

    @Override
    public List<EquipmentType> list() {
        return rR.findAll();
    }
}
