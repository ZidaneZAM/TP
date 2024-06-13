package pe.edu.upc.trabajo_parcial_grupo3.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_parcial_grupo3.entities.ProductionMineral;
import pe.edu.upc.trabajo_parcial_grupo3.repositorio.IProduMineral;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IProduMineralService;

import java.util.List;

@Service
public class ProduMineralimplements implements IProduMineralService {
    @Autowired
    private IProduMineral rR;

    @Override
    public void insert(ProductionMineral productionMineral) {
        rR.save(productionMineral);
    }

    @Override
    public List<ProductionMineral> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public ProductionMineral listarId(int idMovie) {
        return rR.findById(idMovie).orElse(new ProductionMineral());
    }
}
