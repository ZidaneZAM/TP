package pe.edu.upc.trabajo_parcial_grupo3.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_parcial_grupo3.dtos.MineDTO;
import pe.edu.upc.trabajo_parcial_grupo3.entities.Mine;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IMineService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Maquinaria")

public class MineController {
    @Autowired
    private IMineService mS;

    @PostMapping
    public void registrar(@RequestBody MineDTO dtoM) {
        ModelMapper d = new ModelMapper();
        Mine mo = d.map(dtoM, Mine.class);
        mS.insert(mo);
    }
    @PutMapping()
    public void modificar(@RequestBody MineDTO dto){
        ModelMapper m=new ModelMapper();
        Mine mo=m.map(dto,Mine.class);
        mS.insert(mo);
    }
    @GetMapping
    public List<MineDTO> list() {
        return mS.list().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, MineDTO.class);
        }).collect(Collectors.toList());
    }
}
