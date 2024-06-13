package pe.edu.upc.trabajo_parcial_grupo3.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trabajo_parcial_grupo3.dtos.EmergencyNotificationsDTO;
import pe.edu.upc.trabajo_parcial_grupo3.entities.EmergencyNotifications;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IEmerNotificationService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("Notificaciones")
public class EmerNotificationController {

    @Autowired
    private IEmerNotificationService mS;

    @PostMapping
    public void registrar(@RequestBody EmergencyNotificationsDTO dtoM) {
        ModelMapper d = new ModelMapper();
        EmergencyNotifications emergencyNotifications = d.map(dtoM, EmergencyNotifications.class);
        mS.insert(emergencyNotifications);
    }
    @PutMapping()
    public void modificar(@RequestBody EmergencyNotificationsDTO dto){
        ModelMapper m=new ModelMapper();
        EmergencyNotifications mo=m.map(dto,EmergencyNotifications.class);
        mS.insert(mo);
    }
    @GetMapping
    public List<EmergencyNotificationsDTO> list() {
        return mS.list().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, EmergencyNotificationsDTO.class);
        }).collect(Collectors.toList());
    }

}
