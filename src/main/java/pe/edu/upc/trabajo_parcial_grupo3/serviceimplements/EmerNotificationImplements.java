package pe.edu.upc.trabajo_parcial_grupo3.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_parcial_grupo3.entities.EmergencyNotifications;
import pe.edu.upc.trabajo_parcial_grupo3.entities.Mine;
import pe.edu.upc.trabajo_parcial_grupo3.repositorio.IEmerNotification;
import pe.edu.upc.trabajo_parcial_grupo3.repositorio.IMine;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IEmerNotificationService;

import java.util.List;

@Service
public class EmerNotificationImplements implements IEmerNotificationService {
    @Autowired
    private IEmerNotification rR;

    @Override
    public void insert(EmergencyNotifications emergencyNotifications) {
        rR.save(emergencyNotifications);
    }

    @Override
    public List<EmergencyNotifications> list() {
        return rR.findAll();
    }
}
