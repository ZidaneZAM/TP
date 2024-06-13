package pe.edu.upc.trabajo_parcial_grupo3.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "EquipmentType")
public class EquipmentType {
    @Id
    @Column(nullable = false)
    private int typeId;
    @Column(nullable = false)
    private float capacity;
    @Column(nullable = false)
    private String manufacturer;

    @ManyToOne
    @JoinColumn(name ="mine_equitmenId",nullable = false)
    private MineEquipment mineEquipment;

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


    public EquipmentType() {
    }

    public EquipmentType(int typeId, float capacity, String manufacturer) {
        this.typeId = typeId;
        this.capacity = capacity;
        this.manufacturer = manufacturer;

    }
}
