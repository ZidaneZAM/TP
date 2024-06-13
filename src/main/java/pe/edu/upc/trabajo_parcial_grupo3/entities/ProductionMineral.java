package pe.edu.upc.trabajo_parcial_grupo3.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class ProductionMineral {
    @Id
    @Column(nullable = false)
    private int productionId;
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private String mineralType;
    @Column(nullable = false)
    private int quantityProduced;
    @ManyToOne
    @JoinColumn(name ="mina_id",nullable = false)
    private  Mine mine;

    public int getProductionId() {
        return productionId;
    }

    public void setProductionId(int productionId) {
        this.productionId = productionId;
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

    public int getQuantityProduced() {
        return quantityProduced;
    }

    public void setQuantityProduced(int quantityProduced) {
        this.quantityProduced = quantityProduced;
    }

    public ProductionMineral() {
    }

    public ProductionMineral(int productionId, LocalDate date, String mineralType, int quantityProduced) {
        this.productionId = productionId;
        this.date = date;
        this.mineralType = mineralType;
        this.quantityProduced = quantityProduced;

    }
}
