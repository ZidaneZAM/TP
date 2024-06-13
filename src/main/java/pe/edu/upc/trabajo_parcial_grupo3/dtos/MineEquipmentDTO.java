package pe.edu.upc.trabajo_parcial_grupo3.dtos;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class MineEquipmentDTO {

    private int mineEquipmentId;
    private LocalDate assigmentDate;
    private String status;
    private int mineId;
    private int equipmentTypeId;

    public int getMineEquipmentId() {
        return mineEquipmentId;
    }

    public void setMineEquipmentId(int mineEquipmentId) {
        this.mineEquipmentId = mineEquipmentId;
    }

    public LocalDate getAssigmentDate() {
        return assigmentDate;
    }

    public void setAssigmentDate(LocalDate assigmentDate) {
        this.assigmentDate = assigmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMineId() {
        return mineId;
    }

    public void setMineId(int mineId) {
        this.mineId = mineId;
    }

    public int getEquipmentTypeId() {
        return equipmentTypeId;
    }

    public void setEquipmentTypeId(int equipmentTypeId) {
        this.equipmentTypeId = equipmentTypeId;
    }
}
