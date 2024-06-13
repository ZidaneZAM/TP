package pe.edu.upc.trabajo_parcial_grupo3.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class MonthlyProducctionReport {
    @Id
    @Column(nullable = false)
    private int reportId;
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private String mineralType;
    @Column(nullable = false)
    private float quantityProduced;
    @Column(nullable = false)
    private int employeeId;

    @ManyToOne
    @JoinColumn(name ="employee_id",nullable = false)

    private  Employee employee;


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

    public MonthlyProducctionReport() {
    }

    public MonthlyProducctionReport(int employeeId, float quantityProduced, String mineralType, LocalDate date, int reportId) {
        this.employeeId = employeeId;
        this.quantityProduced = quantityProduced;
        this.mineralType = mineralType;
        this.date = date;
        this.reportId = reportId;
    }
}
