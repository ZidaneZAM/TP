package pe.edu.upc.trabajo_parcial_grupo3.dtos;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class EquipmentMaintenaceDTO {
    private int maintenanceId;
    private LocalDate maintenanceDate;
    private String description;
    private float cost;
    private int equipmentTypeTypeId;

    public int getMaintenanceId() {
        return maintenanceId;
    }

    public void setMaintenanceId(int maintenanceId) {
        this.maintenanceId = maintenanceId;
    }

    public LocalDate getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(LocalDate maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getEquipmentTypeTypeId() {
        return equipmentTypeTypeId;
    }

    public void setEquipmentTypeTypeId(int equipmentTypeTypeId) {
        this.equipmentTypeTypeId = equipmentTypeTypeId;
    }

}
