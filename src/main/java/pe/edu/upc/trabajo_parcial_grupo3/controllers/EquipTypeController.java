package pe.edu.upc.trabajo_parcial_grupo3.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_parcial_grupo3.dtos.EquipmentTypeDTO;
import pe.edu.upc.trabajo_parcial_grupo3.entities.EquipmentType;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IEquipTypeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("Tipo_Equipo")

public class EquipTypeController {
    @Autowired
    private IEquipTypeService mS;

    @PostMapping
    public void registrar(@RequestBody EquipmentTypeDTO dtoM) {
        ModelMapper d = new ModelMapper();
        EquipmentType mo = d.map(dtoM, EquipmentType.class);
        mS.insert(mo);
    }
    @PutMapping()
    public void modificar(@RequestBody EquipmentTypeDTO dto){
        ModelMapper m=new ModelMapper();
        EquipmentType mo=m.map(dto,EquipmentType.class);
        mS.insert(mo);
    }
    @GetMapping
    public List<EquipmentTypeDTO> list() {
        return mS.list().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, EquipmentTypeDTO.class);
        }).collect(Collectors.toList());
    }

}
