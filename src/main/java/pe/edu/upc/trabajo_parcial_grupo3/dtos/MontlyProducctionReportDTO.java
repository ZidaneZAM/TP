package pe.edu.upc.trabajo_parcial_grupo3.dtos;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class MontlyProducctionReportDTO {

    private int reportId;

    private LocalDate date;

    private String mineralType;

    private float quantityProduced;

    private int employeeId;

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMineralType() {
        return mineralType;
    }

    public void setMineralType(String mineralType) {
        this.mineralType = mineralType;
    }

    public float getQuantityProduced() {
        return quantityProduced;
    }

    public void setQuantityProduced(float quantityProduced) {
        this.quantityProduced = quantityProduced;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
