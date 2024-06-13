package pe.edu.upc.trabajo_parcial_grupo3.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_parcial_grupo3.dtos.EmployeeContactDetailsDTO;
import pe.edu.upc.trabajo_parcial_grupo3.entities.EmployeeContactDetails;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IEmploContactDetailsService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/Contacto_Empleado")
public class EmploContactDetailsController {
    @Autowired
    private IEmploContactDetailsService mS;

    @PostMapping
    public void registrar(@RequestBody EmployeeContactDetailsDTO dtoM) {
        ModelMapper d = new ModelMapper();
        EmployeeContactDetails employeeContactDetails = d.map(dtoM, EmployeeContactDetails.class);
        mS.insert(employeeContactDetails);
    }
    @PutMapping()
    public void modificar(@RequestBody EmployeeContactDetailsDTO dto){
        ModelMapper m=new ModelMapper();
        EmployeeContactDetails mo=m.map(dto,EmployeeContactDetails.class);
        mS.insert(mo);
    }
    @GetMapping
    public List<EmployeeContactDetailsDTO> list() {
        return mS.list().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, EmployeeContactDetailsDTO.class);
        }).collect(Collectors.toList());
    }

}
