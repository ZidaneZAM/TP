package pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces;

import pe.edu.upc.trabajo_parcial_grupo3.entities.Mine;

import java.util.List;

public interface IMineService {
    public void insert(Mine mine);
    public List<Mine> list();
}
