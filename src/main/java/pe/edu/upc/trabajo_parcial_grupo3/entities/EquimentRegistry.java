package pe.edu.upc.trabajo_parcial_grupo3.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "EquipmentRegister")
public class EquimentRegistry {
    @Id
    @Column(nullable = false)
    private int equimentId;
    @Column(nullable = false)
    private String equimentName;
    @Column(nullable = false)
    private LocalDate entryDate;
    @Column(nullable = false)
    private LocalDate exitDate;
    @Column(nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name ="mina_id",nullable = false)
    private Mine mine;

    public int getEquimentId() {
        return equimentId;
    }

    public void setEquimentId(int equimentId) {
        this.equimentId = equimentId;
    }

    public String getEquimentName() {
        return equimentName;
    }

    public void setEquimentName(String equimentName) {
        this.equimentName = equimentName;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDate getExitDate() {
        return exitDate;
    }

    public void setExitDate(LocalDate exitDate) {
        this.exitDate = exitDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EquimentRegistry() {
    }

    public EquimentRegistry(int equimentId, String equimentName, LocalDate entryDate, LocalDate exitDate, String status) {

        this.equimentId = equimentId;
        this.equimentName = equimentName;
        this.entryDate = entryDate;
        this.exitDate = exitDate;
        this.status = status;

    }
}
