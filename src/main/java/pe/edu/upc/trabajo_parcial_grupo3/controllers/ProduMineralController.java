package pe.edu.upc.trabajo_parcial_grupo3.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_parcial_grupo3.dtos.ProductMineralDTO;
import pe.edu.upc.trabajo_parcial_grupo3.entities.ProductionMineral;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IProduMineralService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Produccion Mineral")
public class ProduMineralController {
    @Autowired
    private IProduMineralService mS;

    @PostMapping
    public void registrar(@RequestBody ProductMineralDTO dtoM) {
        ModelMapper d = new ModelMapper();
        ProductionMineral mo = d.map(dtoM, ProductionMineral.class);
        mS.insert(mo);
    }
    @PutMapping()
    public void modificar(@RequestBody ProductMineralDTO dto){
        ModelMapper m=new ModelMapper();
        ProductionMineral mo=m.map(dto,ProductionMineral.class);
        mS.insert(mo);
    }
    @GetMapping
    public List<ProductMineralDTO> list() {
        return mS.list().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, ProductMineralDTO.class);
        }).collect(Collectors.toList());
    }
}
