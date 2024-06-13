package pe.edu.upc.trabajo_parcial_grupo3.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_parcial_grupo3.entities.Mine;
import pe.edu.upc.trabajo_parcial_grupo3.repositorio.IMine;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IMineService;
import java.util.List;

@Service
public class Mineimplements implements IMineService {
    @Autowired
    private IMine rR;

    @Override
    public void insert(Mine mine) {
        rR.save(mine);
    }

    @Override
    public List<Mine> list() {
        return rR.findAll();
    }
}
