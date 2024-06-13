package pe.edu.upc.trabajo_parcial_grupo3.dtos;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class EquipmentRegisterDTO {
    private int equimentId;
    private String equimentName;
    private LocalDate entryDate;
    private LocalDate exitDate;
    private String status;
    private int minaMinaId;

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

    public int getMinaMinaId() {
        return minaMinaId;
    }

    public void setMinaMinaId(int minaMinaId) {
        this.minaMinaId = minaMinaId;
    }
}
