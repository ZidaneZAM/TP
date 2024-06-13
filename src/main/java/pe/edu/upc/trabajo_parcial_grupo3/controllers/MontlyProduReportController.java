package pe.edu.upc.trabajo_parcial_grupo3.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_parcial_grupo3.dtos.MontlyProducctionReportDTO;
import pe.edu.upc.trabajo_parcial_grupo3.entities.MonthlyProducctionReport;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IMontlyProduReportService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Reporte de Produccion mensual")
public class MontlyProduReportController {
    @Autowired
    private IMontlyProduReportService mS;

    @PostMapping
    public void registrar(@RequestBody MontlyProducctionReportDTO dtoM) {
        ModelMapper d = new ModelMapper();
        MonthlyProducctionReport mo = d.map(dtoM, MonthlyProducctionReport.class);
        mS.insert(mo);
    }
    @PutMapping()
    public void modificar(@RequestBody MontlyProducctionReportDTO dto){
        ModelMapper m=new ModelMapper();
        MonthlyProducctionReport mo=m.map(dto,MonthlyProducctionReport.class);
        mS.insert(mo);
    }
    @GetMapping
    public List<MontlyProducctionReportDTO> list() {
        return mS.list().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, MontlyProducctionReportDTO.class);
        }).collect(Collectors.toList());
    }
}
