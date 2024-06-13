package pe.edu.upc.trabajo_parcial_grupo3.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_parcial_grupo3.dtos.EmployeeDTO;
import pe.edu.upc.trabajo_parcial_grupo3.entities.Employee;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IEmployeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Empleados")
public class EmployeController {
    @Autowired
    private IEmployeService mS;

    @PostMapping
    public void registrar(@RequestBody EmployeeDTO dtoM) {
        ModelMapper d = new ModelMapper();
        Employee employee = d.map(dtoM, Employee.class);
        mS.insert(employee);
    }
    @PutMapping()
    public void modificar(@RequestBody EmployeeDTO dto){
        ModelMapper m=new ModelMapper();
        Employee mo=m.map(dto,Employee.class);
        mS.insert(mo);
    }
    @GetMapping
    public List<EmployeeDTO> list() {
        return mS.list().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, EmployeeDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        mS.delete(id);
    }

    @GetMapping("/{id}")
    public EmployeeDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        EmployeeDTO dto = m.map(mS.listarId(id), EmployeeDTO.class);
        return dto;
    }


}
