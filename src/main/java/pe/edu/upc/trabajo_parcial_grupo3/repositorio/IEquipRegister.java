package pe.edu.upc.trabajo_parcial_grupo3.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trabajo_parcial_grupo3.entities.EquimentRegistry;
@Repository
public interface IEquipRegister extends JpaRepository<EquimentRegistry, Integer> {
}
