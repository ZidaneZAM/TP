package pe.edu.upc.trabajo_parcial_grupo3.dtos;

import jakarta.persistence.Column;

public class EquipmentTypeDTO {
    private int typeId;
    private float capacity;
    private String manufacturer;
    private int mineEquipmentId;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getMineEquipmentId() {
        return mineEquipmentId;
    }

    public void setMineEquipmentId(int mineEquipmentId) {
        this.mineEquipmentId = mineEquipmentId;
    }
}
