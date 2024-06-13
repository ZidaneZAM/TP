package pe.edu.upc.trabajo_parcial_grupo3.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "MineEquipment")
public class MineEquipment {
    @Id
    @Column(nullable = false)
    private int mineEquipmentId;
    @Column(nullable = false)
    private LocalDate assigmentDate;
    @Column(nullable = false)
    private String status;
    @ManyToOne
    @JoinColumn(name ="mina_id",nullable = false)

    private  Mine mine;

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



    public MineEquipment() {
    }

    public MineEquipment(int mineEquipmentId, LocalDate assigmentDate, String status) {
        this.mineEquipmentId = mineEquipmentId;
        this.assigmentDate = assigmentDate;
        this.status = status;

    }
}
