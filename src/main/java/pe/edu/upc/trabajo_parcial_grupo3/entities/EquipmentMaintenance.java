package pe.edu.upc.trabajo_parcial_grupo3.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "EquipmentMaintenance")
public class EquipmentMaintenance {
    @Id
    @Column(nullable = false)
    private int maintenanceId;
    @Column(nullable = false)
    private LocalDate maintenanceDate;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private float cost;
    @ManyToOne
    @JoinColumn(name ="type_id",nullable = false)
    private EquipmentType type;

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

    public EquipmentMaintenance() {
    }

    public EquipmentMaintenance(int maintenanceId, LocalDate maintenanceDate, String description, float cost) {
        this.maintenanceId = maintenanceId;
        this.maintenanceDate = maintenanceDate;
        this.description = description;
        this.cost = cost;

    }
}
