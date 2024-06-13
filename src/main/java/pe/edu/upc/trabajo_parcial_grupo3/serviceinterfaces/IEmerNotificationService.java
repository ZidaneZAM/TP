package pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces;

import pe.edu.upc.trabajo_parcial_grupo3.entities.EmergencyNotifications;

import java.util.List;

public interface IEmerNotificationService {
    public void insert(EmergencyNotifications emergencyNotifications);
    public List<EmergencyNotifications> list();
}
