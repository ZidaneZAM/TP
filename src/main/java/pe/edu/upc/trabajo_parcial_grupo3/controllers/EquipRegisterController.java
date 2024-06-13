package pe.edu.upc.trabajo_parcial_grupo3.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_parcial_grupo3.dtos.EquipmentMaintenaceDTO;
import pe.edu.upc.trabajo_parcial_grupo3.entities.EquimentRegistry;
import pe.edu.upc.trabajo_parcial_grupo3.entities.EquipmentMaintenance;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IEquipRegisterService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Resistro_Equipo")

public class EquipRegisterController {
    @Autowired
    private IEquipRegisterService mS;

    @PostMapping
    public void registrar(@RequestBody EquipmentMaintenaceDTO dtoM) {
        ModelMapper d = new ModelMapper();
        EquimentRegistry movie = d.map(dtoM, EquimentRegistry.class);
        mS.insert(movie);
    }
    @PutMapping()
    public void modificar(@RequestBody EquipmentMaintenaceDTO dto){
        ModelMapper m=new ModelMapper();
        EquimentRegistry  mo=m.map(dto,EquimentRegistry .class);
        mS.insert(mo);
    }
    @GetMapping
    public List<EquipmentMaintenaceDTO> list() {
        return mS.list().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, EquipmentMaintenaceDTO.class);
        }).collect(Collectors.toList());
    }


}
