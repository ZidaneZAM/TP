package pe.edu.upc.trabajo_parcial_grupo3.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_parcial_grupo3.entities.EquimentRegistry;
import pe.edu.upc.trabajo_parcial_grupo3.repositorio.IEquipRegister;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IEquipRegisterService;
import java.util.List;

@Service
public class EquipRegisterimplements implements IEquipRegisterService {

    @Autowired
    private IEquipRegister rR;

    @Override
    public void insert(EquimentRegistry registry) {
        rR.save(registry);
    }

    @Override
    public List<EquimentRegistry> list() {
        return rR.findAll();
    }
}
