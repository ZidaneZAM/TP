package pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces;

import pe.edu.upc.trabajo_parcial_grupo3.entities.ProductionMineral;

import java.util.List;

public interface IProduMineralService {
    public void insert (ProductionMineral productionMineral);
    public List<ProductionMineral> list();
    public void delete(int id);

    public ProductionMineral listarId(int id);

}
